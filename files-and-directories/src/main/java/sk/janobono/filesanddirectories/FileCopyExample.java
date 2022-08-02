package sk.janobono.filesanddirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileCopyExample {

    public static void main(String[] args) {
        Path source = Paths.get("./example.txt");
        Path dest = Paths.get("./new.txt");
        try {
            Files.copy(source, dest, REPLACE_EXISTING);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
