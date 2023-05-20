package oop.inheritance.interfaces;

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
