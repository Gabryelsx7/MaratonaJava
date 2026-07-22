package academy.dev.dojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.dev.dojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParamentoTest03 {
    private static final List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1988), new Car("Red", 2019));

    static void main(String[] args) {
        // List<Car> green = filter(cars, new CarroPredicate() {
        //     @Override
        //     public boolean vouarrumar(Car car) {
        //         return car.getColor().equals("green");
        //     }
        // });
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCaRS = filter(cars, car -> car.getColor().equals("Red"));
        List<Car> yearBefore = filter(cars, car -> car.getYear() < 2000);
        System.out.println(greenCars);
        System.out.println(redCaRS);
        System.out.println(yearBefore);
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>(); //Cria uma lista vazia para guardar os elementos aprovados.
        for (T e : list) { //for (T e : list)
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
