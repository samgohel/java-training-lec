package oop.methods.overriding;

import oop.methods.Bmw;
import oop.methods.Car;
import oop.methods.Vehicle;

public class BMWX5 extends Bmw implements Vehicle, Car {
    /**
     * from Car class
     */
    @Override
    public void playMusic() {
        System.out.println("X5 Playing Music");
    }

    /**
     * from vehicle class
     */
    @Override
    public void consumeFuel() {
        System.out.println("X5 Consume Fuel");
    }

    /**
     * from BMW class
     */
    @Override
    public void changeGear() {
        System.out.println("BMW X5 Switching Gear");
    }
}
