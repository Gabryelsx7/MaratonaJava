package MaratonaJava.maratonajava.javacore.ZZBcomportamento.test;

import MaratonaJava.maratonajava.javacore.ZZBcomportamento.Interface.CarroPredicate;
import MaratonaJava.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParamentoTest02 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1988), new Car("Red", 2019));

    static void main(String[] args) {
       // List<Car> green = filter(cars, new CarroPredicate() {
       //     @Override
       //     public boolean test(Car car) {
       //         return car.getColor().equals("green");
       //     }
       // });
        List<Car> greenCars = filter(cars, car-> car.getColor().equals("green"));
        List<Car> redCaRS = filter(cars, car-> car.getColor().equals("Red"));
        List<Car> yearBefore = filter(cars, car-> car.getYear() < 2000);
            System.out.println(greenCars);
            System.out.println(redCaRS);
            System.out.println(yearBefore);

        }
        private static List<Car> filter(List<Car> cars, CarroPredicate carroPredicate) {
            List<Car> filterCar = new ArrayList<>();
            for (Car car : cars) {
                if (carroPredicate.test(car)) {
                    filterCar.add(car);
                }
            }
            return filterCar;
        }

    }
