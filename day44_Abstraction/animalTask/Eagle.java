package day44_Abstraction.animalTask;

import jdk.swing.interop.SwingInterOpUtils;

public class Eagle extends Animal implements WildAnimal, Flyable{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating snake");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hungting rat");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" can fly really high");
    }
}
