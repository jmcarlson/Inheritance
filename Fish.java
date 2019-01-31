package com.joncarlson;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(int brain, int body, int size, int weight, String name, int gills, int eyes, int fins) {
        super(brain, body, size, weight, name);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {
        System.out.println("Fish.rest() called");
    }

    public void swim(int speed) {
        System.out.println("Fish.swim() called");
        // Calls method in super/Animal class
        move(speed);
    }

}
