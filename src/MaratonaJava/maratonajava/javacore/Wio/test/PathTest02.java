package MaratonaJava.maratonajava.javacore.Wio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    static void main(String[] args) throws IOException {

        Path pastaPaths = Paths.get("pasta");
        if (Files.notExists(pastaPaths)) {
        Path pastaDiretory = Files.createDirectory(pastaPaths);
     }
        Path subPastaPayth = Paths.get("pasta/subpasta/subsubpasta");
        Path subPastaDiretory = Files.createDirectories(subPastaPayth);
        Path filePath = Paths.get(subPastaPayth.toString(),"file.txt");
        if (Files.notExists(filePath)) {
            Path filePath1 = Files.createFile(filePath);

        }

        Path source = filePath;
        Path target = Paths.get(filePath.toString(), "file_renamead.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
