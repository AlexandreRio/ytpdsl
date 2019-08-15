package fr.ytpdsl.video

import fr.ytpdsl.ytpDsl.VideoLibrary
import fr.ytpdsl.ytpDsl.YtpModel
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.util.List
import java.util.stream.Collectors
import net.bramp.ffmpeg.FFprobe

class VideoGenerator {

	var static FFprobe ffprobe

	def static generate(YtpModel root) {
		ffprobe = new FFprobe("/path/to/ffprobe");
		loadLibraries(root.information.library)
	}

	def static loadLibraries(List<VideoLibrary> libraries) {
		libraries.forEach[lib|scanLibrary(lib)]
	}

	def static scanLibrary(VideoLibrary lib) {
		val folder = new File(lib.folder)
		print("Scanning " + folder + " ")
		val res = Files.find(Paths.get(folder.toURI),
			Integer.MAX_VALUE,
			[path, attr | lib.extension.stream.anyMatch(ext | path.fileName.toString.endsWith(ext))])
		.collect(Collectors.toList)

		res.forEach[video | ]
		println(res.size + " files found")

	}

}