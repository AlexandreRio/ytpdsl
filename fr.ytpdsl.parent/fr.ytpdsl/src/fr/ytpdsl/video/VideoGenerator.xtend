package fr.ytpdsl.video

import fr.ytpdsl.ytpDsl.VideoLibrary
import fr.ytpdsl.ytpDsl.YtpModel
import java.io.File
import java.io.PrintWriter
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.ArrayList
import java.util.List
import java.util.UUID
import java.util.concurrent.TimeUnit
import java.util.stream.Collectors
import net.bramp.ffmpeg.FFmpeg
import net.bramp.ffmpeg.FFmpegExecutor
import net.bramp.ffmpeg.FFprobe
import net.bramp.ffmpeg.builder.FFmpegBuilder
import java.nio.charset.Charset
import java.nio.file.StandardOpenOption

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
		mediaList = loadLibraries(root.information.library)

		shorterVideoList = new ArrayList
		destinationFolder = destinationDirectory
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
		builder.input = destinationFolder + "/" + PLAYLIST_FILE
		builder.format = "concat"
		builder.addExtraArgs("-safe", "0")
		builder.addOutput(destinationFolder + "/sortie.mp4").done
	}

	def generateShortVideo() {
		executor = new FFmpegExecutor(ffmpeg, ffprobe);

		val video = mediaList.get((Math.random * mediaList.length) as int).toString

		println("picking " + video)
		val totalDuration = duration(video)

		var builder = new FFmpegBuilder()
		builder.input = video

		var offset = (totalDuration as int ) / 2 as long
		builder.setStartOffset(offset, TimeUnit.NANOSECONDS)
		val outName = UUID.randomUUID + ".mp4"

		println("total duration " + totalDuration + " offset " + offset + " " + outName)
		shorterVideoList.add(outName)

		println((totalDuration as int ) / 2 as long + " ns from start for 5s")
		builder.addOutput(destinationFolder + "/" + outName).setDuration(2, TimeUnit.SECONDS).done
		executor.createJob(builder).run()
	}

	def build() {
		for (var i = 0; i < 10; i++) {
			generateShortVideo()
		}
		val playlistAsPath = Paths.get(destinationFolder, PLAYLIST_FILE)
		val writer = new PrintWriter(Files.newBufferedWriter(playlistAsPath))

		val playlist = shorterVideoList.map[f | 'file \'' + f + '\''].stream.collect(Collectors.joining("\n"))
		println(playlist)
		writer.write(playlist)
		writer.flush
		concat
	}

	private def loadLibraries(List<VideoLibrary> libraries) {
		libraries.map[lib|scanLibrary(lib)].stream.flatMap[l|l.stream].collect(Collectors.toList)
	}

	private def scanLibrary(VideoLibrary lib) {
		val folder = new File(lib.folder)
		print("Scanning " + folder + " ")
		val res = Files.find(Paths.get(folder.toURI), Integer.MAX_VALUE, [ path, attr |
			lib.extension.stream.anyMatch(ext|path.fileName.toString.endsWith(ext))
		]).collect(Collectors.toList)
		println(res.size + " elements founds")
		res
	}

	override toString() {
		var debugString = ffmpeg.version + "\n" + ffprobe.version + "\n"
		debugString += mediaList.size + " videos indexed"
		debugString
	}

}
