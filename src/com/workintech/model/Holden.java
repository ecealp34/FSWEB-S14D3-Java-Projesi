package com.workintech.model;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        super.startEngine();
        return getName() + " " + "engine is starting";
    }

    public String accelerate() {
        super.accelerate();
        return getName() + " " + "is accelerating";
    }

    public String brake() {
        super.brake();
        return getName() + " " + "is braking";
    }
}
