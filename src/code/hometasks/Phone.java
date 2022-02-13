package code.hometasks;

public class Phone {

    private String number;
    private String model;
    private double weight;
    private static double g;

    public Phone(String number, String model, double weight) {

        this.model = model;
        this.number = number;
        this.weight = weight;

    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

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

            public int getI1() {
                return i1;
            }

            public void setI1(int i1) {
                this.i1 = i1;
            }

            public int getI2() {
                return i2;
            }

            public void setI2(int i2) {
                this.i2 = i2;
            }

            public int getI3() {
                return i3;
            }

            public void setI3(int i3) {
                this.i3 = i3;
            }

            public int getPp1() {
                return pp1;
            }

            public void setPp1(int pp1) {
                this.pp1 = pp1;
            }

            public int getPp2() {
                return pp2;
            }

            public void setPp2(int pp2) {
                this.pp2 = pp2;
            }
        }

        return 1;
    }


}
