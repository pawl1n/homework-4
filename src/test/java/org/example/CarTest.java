package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void shouldDrive() {
        // given
        LocalDate dateOfInspection = LocalDate.of(2021, 3, 15);
        Car car = new Car(10, 6, dateOfInspection);

        // when
        boolean canDrive = car.canDrive();

        // then
        assertTrue(canDrive);
    }

    @Test
    void shouldNotDrive() {
        // given
        LocalDate dateOfInspection = LocalDate.of(2021, 3, 15);
        Car car = new Car(0, 6, dateOfInspection);

        // when
        boolean canDrive = car.canDrive();

        // then
        assertFalse(canDrive);
    }

    @Test
    void shouldBeAdmittedToOperation() {
        // given
        LocalDate dateOfInspection = LocalDate.of(2021, 3, 15);
        Car car = new Car(10, 6, dateOfInspection);

        // when
        boolean admittedToOperation = car.admittedToOperation();

        // then
        assertTrue(admittedToOperation);
    }

    @Test
    void shouldNotBeAdmittedToOperation() {
        // given
        LocalDate dateOfInspection = LocalDate.of(2020, 3, 15);
        Car car = new Car(10, 6, dateOfInspection);

        // when
        boolean admittedToOperation = car.admittedToOperation();

        // then
        assertFalse(admittedToOperation);
    }

    @Test
    void shouldGetDistance() {
        // given
        LocalDate dateOfInspection = LocalDate.of(2021, 3, 15);
        Car car = new Car(10, 5, dateOfInspection);

        // when
        double distance = car.distance();

        // then
        assertEquals(200, distance);
    }
}