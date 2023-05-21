package oop.inheritance.impl;

import oop.inheritance.impl.animal.dog.Jojo;

public class Demo {
    public static void main(String[] args) {
        Jojo j = new Jojo();
        j.bark();
        j.play();
        j.run();
        j.sound();
        j.sleep();
        System.out.println(j.sayAnimal());

    }
}
