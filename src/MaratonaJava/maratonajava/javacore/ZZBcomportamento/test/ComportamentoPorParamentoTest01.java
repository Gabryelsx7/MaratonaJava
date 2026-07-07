package MaratonaJava.maratonajava.javacore.ZZBcomportamento.test;

import MaratonaJava.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComportamentoPorParamentoTest01 {
   private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1988),
            new Car("Red", 2019));
    static void main(String[] args) {

        System.out.println(filterGreenCarr(cars));
        System.out.println("---------------");

        System.out.println(filterRedCarr(cars));
        System.out.println("---------------");

        System.out.println(filterRedCarr(cars));
        System.out.println("---------------");

        System.out.println(filterByColor(cars,"green"));

        System.out.println("---------------");
        System.out.println(filterAge(cars,2000));
    }
        public static List<Car> filterGreenCarr(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }
    public static List<Car> filterRedCarr(List<Car> cars) {
        List<Car> redCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Red")) {
                redCars.add(car);
            }
        }
        return redCars;
    }
    public static List<Car> filterByColor(List<Car> cars, String cor) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
    public static List<Car> filterAge(List<Car> cars, int year) {
        List<Car> oldCaryear = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                oldCaryear  .add(car);
            }
        }
        return oldCaryear;
    }
}
