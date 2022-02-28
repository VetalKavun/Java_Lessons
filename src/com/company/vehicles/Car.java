package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    public int jj;
    public static int vvv;
    protected String brand;
    private String autoClass;
    private int weight;
    public Driver driver = new Driver();
    public Engine engine = new Engine();

    public void setDrivingTerm(int drivingTerm) {
        driver.setDrivingTerm(drivingTerm);
    }

    public void setDrivingName(String name) {
        driver.setName(name);
    }

    public int getDrivingTerm() {
        return driver.getDrivingTerm();
    }

    public String getDrivingName() {
        return driver.getName();
    }

    public void setEnginePower(int power) {
        engine.setPower(power);
    }

    public void setEngineProducer(String producer) {
        engine.setProducer(producer);
    }

    public int getEnginePower() {
        return engine.getPower();
    }

    public String getEngineProducer() {
        return engine.getProducer();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAutoclass() {
        return autoClass;
    }

    public void setAutoclass(String autoclass) {
        this.autoClass = autoclass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }


    public String toString() {


        System.out.println("Full information about car" + "\n\n" +
                "Brand:" + getBrand() + "\n" +
                "Class:" + getAutoclass() + "\n" +
                "Weight:" + getWeight() + "\n" +
                "Driver name:" + getDrivingName() + "\n" +
                "Driving term:" + getDrivingTerm() + "\n" +
                "Engine power:" + getEnginePower() + "\n" +
                "Engine producer:" + getEngineProducer());

        return "";
    }


}
