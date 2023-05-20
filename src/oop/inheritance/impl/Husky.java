package oop.inheritance.impl;

public class Husky extends Dog{

    /**
     *
     */
    @Override
    public void play() {
        System.out.println("A Husky Play");
    }

    @Override
    public void run() {
        System.out.println("A dog can run");
    }

    @Override
    public void sound() {
        System.out.println("A dog barks");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }
}
