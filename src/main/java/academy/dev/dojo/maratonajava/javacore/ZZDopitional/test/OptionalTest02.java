package academy.dev.dojo.maratonajava.javacore.ZZDopitional.test;


import academy.dev.dojo.maratonajava.javacore.ZZDopitional.dominio.Manga;
import academy.dev.dojo.maratonajava.javacore.ZZDopitional.repositorio.MangaRepositorio;

import java.util.Optional;

public class OptionalTest02 {
    static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepositorio.findByTitulo("Boku no Hero");
        mangaByTitle.ifPresent(manga -> manga.setTitulo("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        Optional<Manga> byId = MangaRepositorio.findById(2);
        byId.orElseThrow(IllegalArgumentException::new);
        System.out.println(byId);

        Manga newManga = MangaRepositorio.findByTitulo("Driffets")
                .orElseGet(() -> new Manga(3, "Driffets", 25));


        System.out.println(newManga);
    }
}
