package day44_Abstraction.animalTask;

import java.awt.*;
class Tesk{
    public static void main(String[] args) {
        System.out.println(new Tesk().getClass().getSimpleName());// get only the simple name "Tesk"=
        System.out.println(new Tesk().getClass().getName());// get the whole name : day44_Abstraction.animalTask.Tesk
    }
}
public abstract class Animal {

    private String name;
    private  final String breed;
    private final char gender;
    private  int age;
    private String size;
    private  final String color;
    public final static boolean canBreath;
    static {
        canBreath=true;
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setSize(name);
        this.breed = breed;
        if (!(gender=='M'|| gender=='F')){
            throw new RuntimeException("Invalid gender: "+gender);
        }
        this.gender=gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()){
            throw new RuntimeException("Invalid name");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            throw new RuntimeException("Invalid age: "+age);
        }
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }
    public final void drink(){
        System.out.println(name+" is drinking water");
    }
    public abstract void eat();

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}