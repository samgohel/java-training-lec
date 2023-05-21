package oop.inheritance.interfaces;

import oop.inheritance.impl.animal.dog.Husky;

import java.io.IOException;

public interface Animal {
    public abstract void run();
    void sound();
    void sleep();

    static String sayAnimalName(){
        return "saying animal";
    }

    default String sayAnimal(){
        return "I'm a Animal";
    }
}
