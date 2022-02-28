package com.company.vehicles;

public class SportCar extends Car {
    private int marginalSpeed;
    protected int g;

    public int getMarginalSpeed() {
        return marginalSpeed;
    }

    public void setMarginalSpeed(int marginalSpeed) {
        this.marginalSpeed = marginalSpeed;
    }

    public void toStringMarginalSpeed() {
        System.out.println("Sport car marginal speed:" + getMarginalSpeed());
    }

}
