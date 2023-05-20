package oop.inheritance.impl.animal.cat;

import oop.inheritance.interfaces.Animal;

public class Cat implements Animal {
    @Override
    public void run() {
        System.out.println("A cat can run");
    }

    @Override
    public void sound() {
        System.out.println("cat meow");
    }

    @Override
    public void sleep() {
        System.out.println("A cat sleeps");
    }

    public void jumps()
    {
        System.out.println(" cat jumps");
    }
}
