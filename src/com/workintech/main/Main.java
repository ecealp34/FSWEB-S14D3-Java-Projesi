package com.workintech.main;

import com.workintech.model.Car;
import com.workintech.model.Ford;
import com.workintech.model.Holden;
import com.workintech.model.Mitsubishi;
import com.workintech.skeleton.CarSkeleton;
import com.workintech.skeleton.ElectricCar;
import com.workintech.skeleton.GasPoweredCar;



public class Main {
    public static void main(String[] args) {
        System.out.println("Car******");

        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());

        System.out.println("CarSkeleton******");

        CarSkeleton car1 = new ElectricCar("X", "Y", 80, 40);

        CarSkeleton car2 = new GasPoweredCar("B", "C", 20, 4);

        car1.drive();

        car2.drive();

        car1.startEngine();

        car2.startEngine();
    }
}