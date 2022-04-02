package code.homework0104;

import java.util.ArrayList;

public class Main {

    public static boolean compareTwoNumbers(int a, int b) {
        return (a > b) ? true : false;
    }


    public static void main(String[] args) {
        System.out.println("Task 1");
      /*  int a = 10;
        int b = 3;

        boolean isAmoreThenB = compareTwoNumbers(a, b);
        System.out.println("A is bigger then B: " + isAmoreThenB);*/


        System.out.println("Task 3");


        Laptop laptop1 = new Laptop("Lenovo", "RTX", 13.3, 16,
                new Core("AMD Sempron", 1.6, 27.5));

        Laptop laptop2 = new Laptop("Apple", "Radeon", 15, 16,
                new Core("Intel Pentium 4", 3, 30));

        Laptop laptop3 = new Laptop("Asus", "RTX", 13.3, 16,
                new Core("AMD Athlon 64 X2", 2, 29.5));

        Laptop laptop4 = new Laptop("Samsung", "RTX 2080 ", 13.3, 11,
                new Core("AMD Sempron", 2.6, 27.5));

        Laptop laptop5 = new Laptop("Lenovo", "GTX 1080 Ti", 14.3, 11,
                new Core("Intel Pentium D", 3.6, 25.5));

        Laptop laptop6 = new Laptop("Huawei", "RTX 2070", 14.3, 8,
                new Core("AMD Sempron", 4, 27.5));

        Laptop laptop7 = new Laptop("Apple", "RTX", 13.3, 16,
                new Core("Intel Pentium 4", 4.2, 24.5));

        Laptop laptop8 = new Laptop("Samsung", "GTX 1080 Ti", 13.3, 11,
                new Core("AMD Sempron", 1.8, 27.5));

        Laptop laptop9 = new Laptop("Asus", "Radeon", 13, 16,
                new Core("Intel Pentium 4", 3.6, 23));

        Laptop laptop10 = new Laptop("Lenovo", "RTX", 13.3, 16,
                new Core("Intel Celeron", 2.6, 27.5));

        Laptop laptop11 = new Laptop("Huawei", "RX Vega 56", 15.3, 8,
                new Core("AMD Sempron", 2.6, 27.5));

        Laptop laptop12 = new Laptop("Lenovo", "RTX 2060 Super", 16.3, 8,
                new Core("Intel Celeron", 4.4, 30));

        Laptop laptop13 = new Laptop("Lenovo", "GTX 1080 Ti", 16, 11,
                new Core("AMD Athlon 64 X2", 3.8, 25));

        Laptop laptop14 = new Laptop("Huawei", "GTX 1060", 13.3, 6,
                new Core("AMD Sempron", 1.9, 26));

        Laptop laptop15 = new Laptop("Asus", "RTX", 13.3, 16,
                new Core("Intel Pentium 4", 4.2, 28));

        ArrayList<Laptop> laptops = new ArrayList<>();

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
        laptops.add(laptop7);
        laptops.add(laptop8);
        laptops.add(laptop9);
        laptops.add(laptop10);
        laptops.add(laptop11);
        laptops.add(laptop12);
        laptops.add(laptop13);
        laptops.add(laptop14);
        laptops.add(laptop15);

        System.out.println("Choice due to interface");
        ArrayList <Laptop> chosenLaptops1 = new ArrayList<>();
        LaptopChoice.i(laptops, new LaptopChoice1(),chosenLaptops1);
        ArrayList <Laptop> chosenLaptops2 = new ArrayList<>();
        LaptopChoice.i(laptops, new LaptopChoice2(),chosenLaptops2);
        ArrayList <Laptop> chosenLaptops3 = new ArrayList<>();
        LaptopChoice.i(laptops, new LaptopChoice3(),chosenLaptops3);

        System.out.println("///////////////////////////////");
        System.out.println("///////////////////////////////");
        System.out.println("///////////////////////////////");
        System.out.println("Choice due to if-else");



        int i = 0;


        for (Laptop laptop : laptops) {

            if (laptop.getCore().getBrand().equals("AMD Sempron")) {
                i++;
                System.out.println(i + ")" + laptop.toString());
            }
        }

        i = 0;
        System.out.println("///////////////////////////////");

        for (Laptop laptop : laptops) {
            if (laptop.getCore().getBrand().equals("Intel Pentium 4") & laptop.getDiagonal() > 14) {
                i++;
                System.out.println(i + ")" + laptop.toString());
            }
        }

        i = 0;
        System.out.println("///////////////////////////////");

        for (Laptop laptop : laptops) {
            if (laptop.getCore().getClockRate() > 2 & laptop.getMemoryVolume() > 3) {
                i++;
                System.out.println(i + ")" + laptop.toString());
            }
        }


    }

}
