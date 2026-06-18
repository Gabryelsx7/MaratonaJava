package MaratonaJava.maratonajava.javacore.Wio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\User\\IdeaProjects\\MaratonaJava\\file.txt");
        System.out.println(p1.getFileName());
    }
}
