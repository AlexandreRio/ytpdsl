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
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.bramp.ffmpeg.FFprobe;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class VideoGenerator {
  private static FFprobe ffprobe;
  
  public static void generate(final YtpModel root) {
    try {
      FFprobe _fFprobe = new FFprobe("/path/to/ffprobe");
      VideoGenerator.ffprobe = _fFprobe;
      VideoGenerator.loadLibraries(root.getInformation().getLibrary());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void loadLibraries(final List<VideoLibrary> libraries) {
    final Consumer<VideoLibrary> _function = (VideoLibrary lib) -> {
      VideoGenerator.scanLibrary(lib);
    };
    libraries.forEach(_function);
  }
  
  public static String scanLibrary(final VideoLibrary lib) {
    try {
      String _xblockexpression = null;
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
        };
        res.forEach(_function_1);
        int _size = res.size();
        String _plus = (Integer.valueOf(_size) + " files found");
        _xblockexpression = InputOutput.<String>println(_plus);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
