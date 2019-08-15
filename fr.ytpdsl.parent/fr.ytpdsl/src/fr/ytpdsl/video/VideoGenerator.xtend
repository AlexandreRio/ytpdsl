package fr.ytpdsl.video

import fr.ytpdsl.ytpDsl.VideoLibrary
import fr.ytpdsl.ytpDsl.YtpModel
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.util.List
import java.util.stream.Collectors
import net.bramp.ffmpeg.FFmpeg
import net.bramp.ffmpeg.FFprobe

class VideoGenerator {

	/*these should be stored in a generator instance and exposed so the ui can display important stuff  */
	var static FFprobe ffprobe
	var static FFmpeg ffmpeg

	def static generate(YtpModel root) {
		ffprobe = new FFprobe(root.information.ffprobe)
		ffmpeg = new FFmpeg(root.information.ffmpeg)
		var debugString = ffmpeg.version + "\n" + ffprobe.version
		println(debugString)

		val mediaList = loadLibraries(root.information.library)
		mediaList.forEach[video | println(video + " " + ffprobe.probe(video.toString).format.duration) ]
	}

	def static loadLibraries(List<VideoLibrary> libraries) {
		libraries.map[lib | scanLibrary(lib)].stream.flatMap[l | l.stream].collect(Collectors.toList)
	}

	def static scanLibrary(VideoLibrary lib) {
		val folder = new File(lib.folder)
		print("Scanning " + folder + " ")
		val res = Files.find(Paths.get(folder.toURI),
			Integer.MAX_VALUE,
			[path, attr | lib.extension.stream.anyMatch(ext | path.fileName.toString.endsWith(ext))])
		.collect(Collectors.toList)

		res
	}

}