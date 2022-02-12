package code.hometasks;

public class Phone {

    private String number;
    private String model;
    private double weight;

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


}
