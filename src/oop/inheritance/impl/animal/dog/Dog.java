package oop.inheritance.impl.animal.dog;

import oop.inheritance.interfaces.Animal;

public abstract class Dog implements Animal {
    public abstract void play();

    public void bark(){
        System.out.println("bow bow bow !!!!");
    }

    private void youCantTouchMe(){
        System.out.println("FO");
    }
}
