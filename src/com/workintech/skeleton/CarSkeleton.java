package com.workintech.skeleton;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {
        System.out.println("Class Name - " + getClass().getSimpleName());
        return getName() + " is driving";
    }

    public String drive() {
        runEngine(this);
        return getName() + " is driving";
    }

    public void runEngine(CarSkeleton carSkeleton) {
        if(carSkeleton instanceof GasPoweredCar) {
            System.out.println("The car engine is starting with gas.");
        } else if(carSkeleton instanceof HybridCar) {
            System.out.println("The car engine is starting with both gas and electric.");
        } else if(carSkeleton instanceof ElectricCar) {
            ((ElectricCar) carSkeleton).getAvgKmPerCharge();
            System.out.println("The car engine is starting with electric.");
        } else {
            System.out.println("This type is not valid.");
        }
    }

}
