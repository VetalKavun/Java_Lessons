package code.oop;

public class Car {
    private String mark;
    public static double maxSpeed;
    private byte amountDoor;
    public int o;
    Car(){};
    Car(double maxSpeed,byte amountDoor,int o,String mark ){
        this.maxSpeed = maxSpeed ;
        this.amountDoor = amountDoor ;
        this.o = o;
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public byte getAmountDoor() {
        return amountDoor;
    }

    public void setAmountDoor(byte amountDoor) {
        this.amountDoor = amountDoor;
    }

    public static double ipo(double p){
    maxSpeed = 10;

        return 1;

    }












    }
