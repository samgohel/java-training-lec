package oop.methods.overriding;

import oop.methods.Bmw;
import oop.methods.Car;
import oop.methods.Vehicle;

public class BMWX6 extends Bmw implements Vehicle, Car {
    /**
     *
     */
    @Override
    public void playMusic() {
        System.out.println("X6 Playing Music");
    }

    /**
     *
     */
    @Override
    public void consumeFuel() {
        System.out.println("X6 Consume Fuel");
    }

    /**
     *
     */
    @Override
    public void changeGear() {
        System.out.println("BMW X6 Switching Gear");
    }
}
