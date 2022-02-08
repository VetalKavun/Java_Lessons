package code.oop;

public class Car {
    private String mark;
    private double maxSpeed;
    private byte amountDoor;

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

//    @Override
//    public String toString() {
//        return "Car{" +
//                "mark='" + mark + '\'' +
//                ", maxSpeed=" + maxSpeed +
//                ", amountDoor=" + amountDoor +
//                '}';
//    }
}
