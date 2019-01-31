package com.joncarlson;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(int brain, int body, int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        // super calls constructor of parent class or class inheriting from
        // Similar to 'this'
        super(brain, body, 1, 1, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {

        System.out.println("Dog.eat() called");
        chew();
        super.eat();

    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
        //move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        super.move(speed);
    }
}
