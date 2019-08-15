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
import java.nio.file.Path

class VideoGenerator {

	var FFprobe ffprobe
	var FFmpeg ffmpeg

	var List<Path> mediaList

	new(YtpModel root) {
		ffprobe = new FFprobe(root.information.ffprobe)
		ffmpeg = new FFmpeg(root.information.ffmpeg)
		mediaList = loadLibraries(root.information.library)
	}

	private def generate() {
		mediaList.forEach[video | println(video + " " + ffprobe.probe(video.toString).format.duration) ]
	}

	private def loadLibraries(List<VideoLibrary> libraries) {
		libraries.map[lib | scanLibrary(lib)].stream.flatMap[l | l.stream].collect(Collectors.toList)
	}

	private def scanLibrary(VideoLibrary lib) {
		val folder = new File(lib.folder)
		print("Scanning " + folder + " ")
		val res = Files.find(Paths.get(folder.toURI),
			Integer.MAX_VALUE,
			[path, attr | lib.extension.stream.anyMatch(ext | path.fileName.toString.endsWith(ext))])
		.collect(Collectors.toList)

		res
	}

	override toString() {
		var debugString = ffmpeg.version + "\n" + ffprobe.version + "\n"
		debugString += mediaList.size + " videos indexed"
		debugString	
	}
	
}