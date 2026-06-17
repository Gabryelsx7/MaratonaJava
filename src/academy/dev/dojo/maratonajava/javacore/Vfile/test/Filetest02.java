package academy.dev.dojo.maratonajava.javacore.Vfile.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filetest02 {
    static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("O Diretorio esta criado: " +isDiretorioCreated);

        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean newFile = fileArquivoDiretorio.createNewFile();
        System.out.println("O Arquivo esta criado: " +newFile);

        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("O Arquivo foi renomeado: "+isRenamed);

        File diretorioRenamed =  new File("pasta2");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("O diretorio foi renomeado: " +isDiretorioRenamed);


    }
}
