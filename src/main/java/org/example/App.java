package org.example;

import java.time.LocalDate;

public class App {
    public static void main( String[] args ) {
        Car car = new Car(10, 6, LocalDate.of(2021, 3, 15));
        System.out.println(car);
        System.out.println(car.admittedToOperation());
        System.out.println(car.canDrive());
        System.out.println(car.distance());
    }
}
