package com.company.vehicles;

public class Lorry extends Car{
    private int tonnage;

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public void toStringTonnage(){
        System.out.println("Lorry tonnage:" + getTonnage());
    }

}
