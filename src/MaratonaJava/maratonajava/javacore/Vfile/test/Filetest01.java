package MaratonaJava.maratonajava.javacore.Vfile.test;

import java.io.File;
import java.time.Instant;
import java.time.ZoneId;

public class Filetest01 {
    static void main(String[] args) {
        File file = new File("file.text");
        try {

            boolean isCreated = file.createNewFile();
            System.out.println("Created "+isCreated);
            System.out.println("path "+ file.getPath());
            System.out.println("path Absolute "+ file.getAbsolutePath());
            System.out.println("is directory "+ file.isDirectory());
            System.out.println("is file "+ file.isFile());
            System.out.println("is hiden "+file.isHidden());
            System.out.println("last modific"+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean isExists = file.exists();

            if (isExists){
                System.out.println("Deleted "+file.delete());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
