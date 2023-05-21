package oop.methods.overriding;

import oop.methods.Car;
import oop.methods.Vehicle;

public class Demo {
    public static void main(String[] args) {
        BMWX5 bmwx5 = new BMWX5();
        bmwx5.playMusic();
        bmwx5.consumeFuel();
        bmwx5.changeGear();

        BMWX6 bmwx6 = new BMWX6();
        bmwx6.playMusic();
        bmwx6.consumeFuel();
        bmwx6.changeGear();

        Car car = new BMWX5();
        car.playMusic();
        System.out.println(car);

        Vehicle vehicle = new BMWX6();
        vehicle.consumeFuel();
    }
}
