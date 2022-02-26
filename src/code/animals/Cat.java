package code.animals;

public class Cat extends Animal {
    private String colour;
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat make noise");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }


    @Override
    public void sleep() {
        System.out.println("Cat sleep");
    }


}
