package code.oop;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double length){
        this.width = 2 * length;
        this.length = length;
    }

    public double countSquare(){
        return length * width;
    }



    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static double countSquare(double length ,double width){
        return length * width;
    }



}
