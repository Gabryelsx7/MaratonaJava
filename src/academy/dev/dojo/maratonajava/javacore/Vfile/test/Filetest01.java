package academy.dev.dojo.maratonajava.javacore.Vfile.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class Filetest01 {
    static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created " +isCreated);
            System.out.println("path " +file.getPath());
            System.out.println("path Absolute " +file.getAbsolutePath());
            System.out.println("is directory " +file.isFile());
            System.out.println("is hidden " +file.isHidden());
            System.out.println("last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
