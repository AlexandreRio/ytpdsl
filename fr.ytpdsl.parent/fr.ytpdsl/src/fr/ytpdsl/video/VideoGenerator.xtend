package fr.ytpdsl.video

import fr.ytpdsl.ytpDsl.Folder
import fr.ytpdsl.ytpDsl.Media
import fr.ytpdsl.ytpDsl.VideoLibrary
import fr.ytpdsl.ytpDsl.YtpModel
import java.io.File
import java.io.PrintWriter
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.time.Duration
import java.util.ArrayList
import java.util.Collections
import java.util.List
import java.util.UUID
import java.util.concurrent.TimeUnit
import java.util.stream.Collectors
import net.bramp.ffmpeg.FFmpeg
import net.bramp.ffmpeg.FFmpegExecutor
import net.bramp.ffmpeg.FFprobe
import net.bramp.ffmpeg.builder.FFmpegBuilder
import net.bramp.ffmpeg.builder.FFmpegBuilder.Verbosity

class VideoGenerator {

	public var FFprobe ffprobe
	public var FFmpeg ffmpeg

	var List<Path> mediaList
	var List<String> shorterVideoList
	var String destinationFolder

	/** Playlist for ffmpeg */
	val PLAYLIST_FILE = "pl.list"

	FFmpegExecutor executor

	new(YtpModel root, String destinationDirectory) {
		ffprobe = new FFprobe(root.information.ffprobe)
		ffmpeg = new FFmpeg(root.information.ffmpeg)
		mediaList = loadLibrary(root.information.library)

		shorterVideoList = new ArrayList
		destinationFolder = destinationDirectory
	}

	/**
	 * Load Folder and specific Moments
	 */
	def loadLibrary(List<VideoLibrary> vl) {
		vl.map[l|
			if (l instanceof Folder) {
				loadFolder(l)
			} else if (l instanceof Media) {
				loadMedia(l)
			}
		].stream
		.flatMap[l|l.stream]
		.collect(Collectors.toList)

	}

	private def loadFolder(Folder folder) {
		scanLibrary(folder).stream.collect(Collectors.toList)
	}

	/**
	 * Load Media in order to extract specific moments in it
	 */
	private def loadMedia(Media media) {
		media.name
		media.moment.path
		media.moment.moments.map[moment|
			moment.start
			moment.end
			moment.duration
			moment.toString
		]
		return Collections.EMPTY_LIST
	}

	private def scanLibrary(Folder lib) {
		val folder = new File(lib.folder)
		print("Scanning " + folder + " ")
		val res = Files.find(Paths.get(folder.toURI), Integer.MAX_VALUE, [ path, attr |
			lib.extension.stream.anyMatch(ext|path.fileName.toString.endsWith(ext))
		]).collect(Collectors.toList)
		println(res.size + " elements founds")
		res
	}

	/**
	 * Duration of media designed by path in seconds
	 */
	def duration(String path) {
		ffprobe.probe(path).format.duration
	}

	/**
	 * ok this shouldn't be used now
	 */
	@Deprecated
	def duration() {
		1.0
	}

	/**
	 * Concatenate videos all videos from playlist file {@link VideoGenerator#PLAYLIST_FILE}
	 */
	def concat() {
//		Files.list(Paths.get(destinationFolder)).filter(v|v.endsWith(".mp4"))
		var builder = new FFmpegBuilder()
		builder.addExtraArgs("-accurate_seek").setInput(destinationFolder + "/" + PLAYLIST_FILE)
		builder.format = "concat"
		builder.addExtraArgs("-safe", "0")
		builder.addOutput(destinationFolder + "/sortie.mp4").done
	}

	def generateShortVideo() {
		executor = new FFmpegExecutor(ffmpeg, ffprobe);

		val video = mediaList.get((Math.random * mediaList.length) as int).toString

		println("picking " + video)
		val totalDuration = duration(video)

		var long offset = (totalDuration as int ) / 2 as long
		val outName = UUID.randomUUID + ".mp4"

		println(" offset " + durationToTimeCode(offset) + " " + outName)

		// this should be computed from the model of course
		val durationOfClip = ((Math.random * 5) + 2) as int

		var builder = new FFmpegBuilder()
		builder.verbosity = Verbosity.QUIET
		builder.addExtraArgs("-noaccurate_seek").setInput(video).setStartOffset(offset, TimeUnit.SECONDS)

		builder.addOutput(destinationFolder + "/" + outName).setStrict(FFmpegBuilder.Strict.NORMAL).setDuration(
			durationOfClip, TimeUnit.SECONDS).setFormat("mp4").disableSubtitle().setAudioChannels(1).
			setAudioCodec("aac").setAudioSampleRate(48000).setAudioBitRate(32768).setVideoCodec("libx264").
			setVideoFrameRate(24, 1).setVideoResolution(640, 480) // who needs HD for a poop?
			.done

		shorterVideoList.add(outName)
		executor.createJob(builder).run()
	}

	def build(YtpModel model) {
		for (var i = 0; i < 10; i++) {
			generateShortVideo()
		}
		val playlistAsPath = Paths.get(destinationFolder, PLAYLIST_FILE)
		val writer = new PrintWriter(Files.newBufferedWriter(playlistAsPath))

		val playlist = shorterVideoList.map[f|'file \'' + f + '\''].stream.collect(Collectors.joining("\n"))
		println(playlist)
		writer.write(playlist)
		writer.flush
		concat
	}



	override toString() {
		var debugString = ffmpeg.version + "\n" + ffprobe.version + "\n"
		debugString += mediaList.size + " videos indexed"
		debugString
	}

	/** utils, ok I'll move that to a dedicated file */
	/**
	 * @param offset duration in seconds
	 */
	def durationToTimeCode(long offset) {
		val d = Duration.ofSeconds(offset)
		d.toMinutes + ":" + (d.seconds % 60)
	}
}
