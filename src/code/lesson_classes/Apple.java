package code.lesson_classes;

public class Apple {
    private String colour;
    private double weight;


    Apple(double weight, String colour) {
        this.colour = colour;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "colour='" + colour + '\'' +
                ", weight=" + weight +
                '}';
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
