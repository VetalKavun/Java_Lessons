package code.hometasks;

/*import code.two.E;
import code.two.Two;*/


import code.inheritance.Inheritant1;
import code.inheritance.Inheritant2;
import code.inheritance.Inheritant3;
import code.inheritance.Parent;
import code.two.First;
import code.two.Three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {


        ArrayList<Integer> parent = new ArrayList<>();

        parent.ensureCapacity(10);

        parent.add(10);
        parent.add(20);
        parent.add(30);
        parent.add(40);
        parent.add(50);


        Integer p[] = new Integer[5];

        parent.toArray(p);

        for (int y : parent) {
            System.out.println(y);
        }

        System.out.println("//////");

        for (int y : p) {
            System.out.println(y);
        }
        parent.add(1, 100);
        parent.add(2, 200);
        System.out.println("//////");

        for (int y : parent) {
            System.out.println(y);
        }
        Integer pp[] = new Integer[7];
        parent.toArray(p);

        System.out.println("//////");

        for (int y : p) {
            System.out.println(y);
        }
        ArrayList<First> first = new ArrayList<>();
        first.add(new Three());
        first.add(new Three());
        first.add(new Three());

        System.out.println(first.size());
        first.get(0).r(3);


    }
}