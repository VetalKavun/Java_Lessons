package code.animals;

public class Horse extends Animal {
    private double speed;
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse make noise");
    }

    @Override
    public void eat() {
        System.out.println("Horse eat");
    }


    @Override
    public void sleep() {
        System.out.println("Horse sleep");
    }
}
