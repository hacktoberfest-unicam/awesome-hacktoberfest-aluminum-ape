import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * This class will replace all the whitespaces in files names with a given separator.
 * @author Enrico Ulissi
 */

public class FileRenamer {
    private final char separator;

    public FileRenamer(char separator) {
        this.separator = requireNonWhiteSpace(separator);
    }

    private char requireNonWhiteSpace(char c) {
        if(Character.isWhitespace(c)) {
            throw new IllegalArgumentException("The separator cannot be a whitespace");
        }
        return c;
    }

    public void renameAll(Path directory) {
        if(!Files.isDirectory(directory)) {
            throw new IllegalArgumentException("The given path is not a directory");
        }
        for(File f: Objects.requireNonNull(directory.toFile().listFiles())) {
            rename(f);
        }
    }

    private void rename(File file) {
        String fileNewName = file.getName().replace(' ', separator);
        File newName = new File(file.getParent(), fileNewName);
        if(!file.renameTo(newName)) throw new RuntimeException("Could not rename file");
    }
}
