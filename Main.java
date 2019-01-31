package com.joncarlson;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal(1,1,5,5,"Animal");
        Dog dog = new Dog(8,20,2,4,"Cocker",2,4,1,20,"Long blonde");
        System.out.println("Dog type is " + dog.getName());
        dog.eat();
        dog.walk();
        dog.run();

        Fish angel = new Fish(1,1,1,1, "Angel", 2, 2, 4);
        angel.swim(2);

    }
}
