package code.animals;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(AnimalFactory.getAnimal("dog"));
        animals.add(AnimalFactory.getAnimal("cat"));
        animals.add(AnimalFactory.getAnimal("dog"));
        animals.add(AnimalFactory.getAnimal("pig"));
        animals.add(AnimalFactory.getAnimal("cat"));

        for (Animal animal : animals) {
            if(animal != null){animal.makeNoise();};
        }












    }
}