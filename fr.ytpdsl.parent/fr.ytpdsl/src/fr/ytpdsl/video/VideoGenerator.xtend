package fr.ytpdsl.video

import fr.ytpdsl.ytpDsl.VideoLibrary
import fr.ytpdsl.ytpDsl.YtpModel
import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.List
import java.util.concurrent.TimeUnit
import java.util.stream.Collectors
import net.bramp.ffmpeg.FFmpeg
import net.bramp.ffmpeg.FFprobe
import net.bramp.ffmpeg.builder.FFmpegBuilder
import java.util.UUID

class VideoGenerator {

	public var FFprobe ffprobe
	public var FFmpeg ffmpeg

	var List<Path> mediaList

	var String destinationFolder

	var String video

	new(YtpModel root, String destinationDirectory) {
		ffprobe = new FFprobe(root.information.ffprobe)
		ffmpeg = new FFmpeg(root.information.ffmpeg)
		mediaList = loadLibraries(root.information.library)

		destinationFolder = destinationDirectory
	}


	def duration() {
		ffprobe.probe(video).format.duration * TimeUnit.SECONDS.toNanos(1)
	}

	def concat() {
		
	}

	def build() {
		var builder = new FFmpegBuilder()
		builder.input = destinationFolder + "/pl.list"
		builder.format = "concat"
		builder.addExtraArgs("-safe", "0")
		builder.addOutput(destinationFolder + "/sortie.mp4")
//		video = mediaList.get((Math.random * mediaList.length) as int).toString
//	
//		val du = duration()
//		var builder = new FFmpegBuilder();
//		builder.input = video
//
//		builder.setStartOffset( (du as int )/ 2 as long, TimeUnit.NANOSECONDS)
//		println("total duration " + du)
//		println( (du as int )/ 2 as long + " ns from start for 5s")
//		builder.addOutput(destinationFolder + "/" + UUID.randomUUID + ".mp4").setDuration(5, TimeUnit.SECONDS)
	}

	private def loadLibraries(List<VideoLibrary> libraries) {
		libraries.map[lib|scanLibrary(lib)].stream.flatMap[l|l.stream].collect(Collectors.toList)
	}

	private def scanLibrary(VideoLibrary lib) {
		val folder = new File(lib.folder)
		println("Scanning " + folder + " ")
		val res = Files.find(Paths.get(folder.toURI), Integer.MAX_VALUE, [ path, attr |
			lib.extension.stream.anyMatch(ext|path.fileName.toString.endsWith(ext))
		]).collect(Collectors.toList)

		res
	}

	override toString() {
		var debugString = ffmpeg.version + "\n" + ffprobe.version + "\n"
		debugString += mediaList.size + " videos indexed"
		debugString
	}

}
