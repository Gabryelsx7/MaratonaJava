package academy.dev.dojo.maratonajava.javacore.ZZJcrud.service;

import academy.dev.dojo.maratonajava.javacore.ZZJcrud.dominio.Anime;
import academy.dev.dojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.dev.dojo.maratonajava.javacore.ZZJcrud.repositor.AnimeRepository;

import java.util.Optional;
import java.util.Scanner;

public class AnimeService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1 -> findByname();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
            default -> throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void findByname() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();

        AnimeRepository.findByName(name)
                .forEach(a -> System.out.printf("[%d] - Name: %s | Episodes: %d | Producer: %s%n",
                        a.getId(), a.getName(), a.getEpisodes(),
                        a.getProducer() != null ? a.getProducer().getName() : "N/A"));
    }

    private static void delete() {
        System.out.println("Type the id of the anime you want to delete");
        findByname();
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("Y".equalsIgnoreCase(choice)) {
            AnimeRepository.delete(id);
        }
    }

    private static void save() {
        System.out.println("Type the name of the anime");
        String name = SCANNER.nextLine();
        System.out.println("Type the number of the episodes");
        int episodes = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Type the id of the producer");
        Integer producerId = Integer.parseInt(SCANNER.nextLine());

        Anime anime = Anime.builder()
                .episodes(episodes)
                .name(name)
                .producer(Producer.builder().id(producerId).build())
                .build();
        AnimeRepository.save(anime);
    }

    private static void update() {
        System.out.println("Type the id of object you want to update");
        int id = Integer.parseInt(SCANNER.nextLine());
        Optional<Anime> animeOptional = AnimeRepository.findByID(id);

        // CORRIGIDO: Se estiver VAZIO, imprime que não encontrou
        if (animeOptional.isEmpty()) {
            System.out.println("Anime not found");
            return;
        }

        Anime animeFromDb = animeOptional.get();
        System.out.println("Anime found: " + animeFromDb);

        System.out.println("Type the new name or enter to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? animeFromDb.getName() : name;

        System.out.println("Type the new number of episodes or enter to keep the same");
        String episodesInput = SCANNER.nextLine();
        // CORRIGIDO: Trata a tecla ENTER para manter a quantidade antiga
        int episodes = episodesInput.isEmpty() ? animeFromDb.getEpisodes() : Integer.parseInt(episodesInput);

        System.out.println("Type the new producer id or enter to keep the same");
        String producerIdInput = SCANNER.nextLine();
        Integer producerId = producerIdInput.isEmpty() ? animeFromDb.getProducer().getId() : Integer.parseInt(producerIdInput);

        Anime animeToUpdate = Anime.builder()
                .id(animeFromDb.getId())
                .episodes(episodes)
                .producer(Producer.builder().id(producerId).build())
                .name(name)
                .build();

        AnimeRepository.update(animeToUpdate);
    }
}