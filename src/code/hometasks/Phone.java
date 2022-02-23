package code.hometasks;

public class Phone {
    Auxiliary k = new Auxiliary();
    private String number;
    private String model;
    private double weight;
    private static double g;
    public int p = 24;
    public static int w = 0;

    static {
        Phone k = new Phone();

        w = 100;
        Auxiliary l = new Auxiliary();
        l.t1 = 10;
        w += l.t1;

    }

    Phone(int p) {
        w = 10;
    }


    public Phone(String number, String model, double weight) {
        Auxiliary u = new Auxiliary();
        u.t1 = 20;
        this.model = model;
        this.number = number;
        this.weight = weight + u.t1;

    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;

    }

    public int kl(int y) {

        return Auxiliary.o + y;
    }

    public Phone() {

    }

    public int we(Auxiliary j) {
        j.t1 = 10;
        return 1;

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String caller) {

        System.out.println("Звонит: " + caller);

    }

    public void sendMessage(String... numbers) {

        for (String num : numbers) {
            System.out.println(num);
        }
    }

    public double r(double g) {
        Auxiliary o = new Auxiliary();

        class K {
            public int i1;
            public int i2;
            public int i3;
            private int pp1;
            private int pp2;

            class L {
                public int ii1;
                public int i2;
                public int i3;
                private int pp1;
                private int pp2;

            }

        }

        K j = new K();
        j.i2 = 10;


        //K.L u = new K();
        //l.ii1 = 30;


        return 1;
    }


}
