package MaratonaJava.maratonajava.javacore.ZZDopitional.repositorio;

import MaratonaJava.maratonajava.javacore.ZZDopitional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepositorio {
        private static List<Manga> mangas = List.of(
                new Manga(1, "Boku no Hero", 50),
                new Manga(2, "OverLord", 25)
        );

        public static Optional<Manga> findById(Integer id) {
            return findBy(manga -> manga.getId().equals(id));

        }

        public static Optional<Manga> findByTitulo(String titulo) {
            return findBy(manga -> manga.getTitulo().equals(titulo));
        }
    public static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;

        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
                break;
            }
        }

        return Optional.ofNullable(found);
    }
    }