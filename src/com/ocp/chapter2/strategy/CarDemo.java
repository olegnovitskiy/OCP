package com.ocp.chapter2.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CarDemo {
    static List<Car> findCompactCars(List<Car> cars) {
        List<Car> compactCars = new ArrayList<>();
        for (Car car : cars) {
//            if (car.getType().equals(CarType.COMPACT)) {
//                compactCars.add(car);
//            }
            // Differs only if condition
            if (car.getCostUSD() > 20000) {
                compactCars.add(car);
            }
        }
        return compactCars;
    }

    static List<Car> findCars(List<Car> cars, Searchable s) {
        List<Car> searchableCars = new ArrayList<>();
        for (Car car: cars) {
            if (s.test(car)) {
                searchableCars.add(car);
            }
        }
        return searchableCars;
    }

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("bmw", 30000, CarType.SEDAN));
        cars.add(new Car("open", 25000, CarType.COMPACT));
        cars.add(new Car("citroen", 8000, CarType.COMPACT));
        cars.add(new Car("ford fiesta", 10000, CarType.HATCHBACK));

        List<Car> compactCars = findCompactCars(cars);

        assert compactCars != null;
        compactCars.forEach(System.out::println);
        System.out.println();

        // Strategy approach
        List<Car> twentyKCars = findCars(cars, new TwentyKCarSearch());
        if (twentyKCars != null) {
            twentyKCars.forEach(System.out::println);
        }

        // Lambda example
        Searchable s = (Car c) -> c.getCostUSD() > 20000;

        List<String> list = Arrays.asList("Hello","all");
        //list.add("student");
        System.out.println(list);
    }
}
