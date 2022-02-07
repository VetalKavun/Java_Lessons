package first;

public class Calculator {
    public static double add(double a,double b){
        return a + b;
    }

    public static double sub(double a,double b){
        return a - b;
    }

    public static double multiple(double a,double b){
        return a * b;
    }

    public static double division(double a,double b){
        if(b != 0){ return a / b;}
        System.out.println("Division by zero");
       return 0;
    }

      int sl[]={23,42,757};




}
