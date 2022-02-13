package code.hometasks;

public class Main {
    public static void main(String args[]) {

        Phone phone1 = new Phone("+38030", "Sumsung", 0.2);
        Phone phone2 = new Phone("184", "Nokia", 0.234);
        Phone phone3 = new Phone("1234", "Apple", 0.32122);
        System.out.println(phone1.getNumber() + "  " + phone1.getModel() + "  " + phone1.getWeight());
        System.out.println(phone2.getNumber() + "  " + phone2.getModel() + "  " + phone2.getWeight());
        System.out.println(phone3.getNumber() + "  " + phone3.getModel() + "  " + phone3.getWeight());
        phone1.receiveCall("Bob");
        phone2.receiveCall("Jack");
        phone3.receiveCall("Henry");


       new Phone("20849", "Xiaomi");
        phone2 = new Phone("+984", "Meizu");
        phone3 = new Phone("2", "woi");

        String string[] = new String[]{"bsvihv","shuogu","ebuowf"};
        phone1.sendMessage("252", "178498", "7", "+14891");


        phone1.r(1);


    }


}
