package org.example;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Car {
    private double fuelLevel;
    private double consumption;
    private LocalDate dateOfInspection;

    public boolean canDrive() {
        return fuelLevel != 0;
    }

    public boolean admittedToOperation() {
        return dateOfInspection.compareTo(LocalDate.now().minusYears(2)) >= 0;
    }

    public double distance() {
        return fuelLevel / consumption * 100;
    }
}
