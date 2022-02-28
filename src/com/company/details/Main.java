package com.company.details;

import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

import java.sql.Driver;

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


       /* Car h = new Car();
        SportCar d = new SportCar();
        Engine r = new Engine();
        Lorry i = new Lorry();

        int [] cd = {1,2,3,4,5};
        int [] mi = {10,20};
        mi = cd;
        for(int y:mi){
            System.out.println(y);
        }*/


    }
}
