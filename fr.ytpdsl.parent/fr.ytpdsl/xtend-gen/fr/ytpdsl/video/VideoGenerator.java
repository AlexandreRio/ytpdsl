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
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class VideoGenerator {
  public static void generate(final YtpModel root) {
    VideoGenerator.loadLibraries(root.getInformation().getLibrary());
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
        final long res = Files.find(Paths.get(folder.toURI()), 
          Integer.MAX_VALUE, _function).count();
        String _plus = (Long.valueOf(res) + " files found");
        _xblockexpression = InputOutput.<String>println(_plus);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Object recursiveScan(final File f) {
    return null;
  }
}
