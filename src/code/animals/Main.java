package code.animals;

public class Main {
    public static void main(String[] args) {


        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal horse = new Horse();

        dog.setFood("Bone");
        dog.setLocation("flat");
        cat.setFood("fish");
        cat.setLocation("box");
        horse.setFood("gross");
        horse.setLocation("zoo");

        Animal animals[] = new Animal[3];
        animals[0] = dog;
        animals[1] = cat;
        animals[2] = horse;

        Veterinarian veterinarian = new Veterinarian();

for(int i = 0;i < 3; i++){


    veterinarian.treatAnimal(animals[i]);

}









    }
}