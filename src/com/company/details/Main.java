package com.company.details;

import com.company.vehicles.Car;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        SportCar car = new SportCar();
        car.setBrand("Toyota");
        car.setAutoclass("Offroader");
        car.setWeight(5000);
        car.setDrivingTerm(12);
        car.setDrivingName("Dima");
        car.setEnginePower(200);
        car.setEngineProducer("Japan");

        car.toString();
        car.setMarginalSpeed(300);
        car.toStringMarginalSpeed();


    }
}
