package code.lesson_classes;

import code.inheritance.Transport;

import java.util.ArrayList;

public class Main {

    public void r() {
        System.out.println("wiwmvi");
    }


    static void sortApples(ArrayList<Apple> apples, SortApples sortApples) {
        for (Apple apple : apples) {
            if (sortApples.sortApples(apple)) {
                System.out.println(apple.toString());
            }
        }
    }

    public static void main(String[] args) {



        Apple a1 = new Apple(0.155, "blue");
        Apple a2 = new Apple(0.2, "red");
        Apple a3 = new Apple(0.7, "green");
        Apple a4 = new Apple(0.5, "green");
        Apple a5 = new Apple(0.23, "yellow");

        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(a1);
        apples.add(a2);
        apples.add(a3);
        apples.add(a4);
        apples.add(a5);




        sortApples(apples, new ColourRedSortApples());
        System.out.println("//////");
        sortApples(apples, new BigApples());
        System.out.println("//////");
        sortApples(apples, new SomeImplementation());


        /*ArrayList<Apple> chosenApples = new ArrayList<>();

        for (Apple apple : apples) {
            if (apple.getWeight() < 0.4) {
                chosenApples.add(apple);
                System.out.println(apple.toString());
            }

        }


        System.out.println("//////");
        ArrayList<Apple> chosenApples1 = new ArrayList<>();

        for (Apple apple : apples) {
            if (apple.getWeight() > 0.1 & apple.getWeight() < 0.4) {
                chosenApples1.add(apple);
                System.out.println(apple.toString());

            }
        }


        System.out.println("//////");

        ArrayList<Apple> chosenApples2 = new ArrayList<>();

        for (Apple apple : apples) {

            if (apple.getColour().equals("red") && apple.getWeight() < 0.3) {

                chosenApples2.add(apple);
                System.out.println(apple.toString());

            }

        }*/


    }


}
