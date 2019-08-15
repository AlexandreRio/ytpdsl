package fr.ytpdsl.video;

import fr.ytpdsl.ytpDsl.VideoLibrary;
import fr.ytpdsl.ytpDsl.YtpModel;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.bramp.ffmpeg.FFmpeg;
import net.bramp.ffmpeg.FFprobe;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class VideoGenerator {
  /**
   * these should be stored in a generator instance and exposed so the ui can display important stuff
   */
  private static FFprobe ffprobe;
  
  private static FFmpeg ffmpeg;
  
  public static List<Path> generate(final YtpModel root) {
    try {
      List<Path> _xblockexpression = null;
      {
        String _ffprobe = root.getInformation().getFfprobe();
        FFprobe _fFprobe = new FFprobe(_ffprobe);
        VideoGenerator.ffprobe = _fFprobe;
        String _ffmpeg = root.getInformation().getFfmpeg();
        FFmpeg _fFmpeg = new FFmpeg(_ffmpeg);
        VideoGenerator.ffmpeg = _fFmpeg;
        String _version = VideoGenerator.ffmpeg.version();
        String _plus = (_version + "\n");
        String _version_1 = VideoGenerator.ffprobe.version();
        String debugString = (_plus + _version_1);
        InputOutput.<String>println(debugString);
        _xblockexpression = VideoGenerator.loadLibraries(root.getInformation().getLibrary());
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static List<Path> loadLibraries(final List<VideoLibrary> libraries) {
    final Function1<VideoLibrary, List<Path>> _function = (VideoLibrary lib) -> {
      return VideoGenerator.scanLibrary(lib);
    };
    final Function<List<Path>, Stream<Path>> _function_1 = (List<Path> l) -> {
      return l.stream();
    };
    return ListExtensions.<VideoLibrary, List<Path>>map(libraries, _function).stream().<Path>flatMap(_function_1).collect(Collectors.<Path>toList());
  }
  
  public static List<Path> scanLibrary(final VideoLibrary lib) {
    try {
      List<Path> _xblockexpression = null;
      {
        String _folder = lib.getFolder();
        final File folder = new File(_folder);
        InputOutput.<String>print((("Scanning " + folder) + " "));
        final BiPredicate<Path, BasicFileAttributes> _function = (Path path, BasicFileAttributes attr) -> {
          final Predicate<String> _function_1 = (String ext) -> {
            return path.getFileName().toString().endsWith(ext);
          };
          return lib.getExtension().stream().anyMatch(_function_1);
        };
        final List<Path> res = Files.find(Paths.get(folder.toURI()), 
          Integer.MAX_VALUE, _function).collect(Collectors.<Path>toList());
        final Consumer<Path> _function_1 = (Path video) -> {
          try {
            String _plus = (video + " ");
            String _plus_1 = (_plus + Double.valueOf(VideoGenerator.ffprobe.probe(video.toString()).format.duration));
            InputOutput.<String>println(_plus_1);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        res.forEach(_function_1);
        int _size = res.size();
        String _plus = (Integer.valueOf(_size) + " files found");
        InputOutput.<String>println(_plus);
        _xblockexpression = res;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
