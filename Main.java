package Homework;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = new String[]{"mike", "sugar", "pete"};
        dog.haveAsPet = true;
        dog.quantity = 4;
        dog.sound = "Woof";
        dog.printAnimalName();
        dog.printAnimalSound();

        Animal cat = new Animal();
        cat.name = new String[]{"angelo", "leo", "kevin"};
        cat.haveAsPet = true;
        cat.quantity = 3;
        cat.sound = "Meow";
        cat.printAnimalName();
        cat.printAnimalSound();


        Animal pig = new Animal();
        pig.name = new String[]{"Bella", "Nikki", "Ricky", "Dicky", "Dawn"};
        pig.haveAsPet = false;
        pig.quantity = 5;
        pig.sound = "oink";
        pig.printAnimalName();
        pig.printAnimalSound();

    }
}
