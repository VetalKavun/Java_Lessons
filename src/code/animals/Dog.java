package code.animals;

public class Dog extends Animal{

private String breed;


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    public void makeNoise(){
        System.out.println("Dog make noise");
    }

    public void eat(){
        System.out.println("Dog eat");
    }

    public void sleep(){
        System.out.println("Dog sleep");
    }








}
