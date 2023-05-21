package oop.inheritance.impl;

import oop.inheritance.impl.animal.cat.Cat;
import oop.inheritance.impl.animal.dog.Dog;
import oop.inheritance.impl.animal.dog.Husky;
import oop.inheritance.interfaces.Animal;

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal catObj1 = new Cat();
        catObj1.run();
        catObj1.sound();
        catObj1.sleep();
        doPamper(catObj1);

        Cat catObj2 = new Cat();
        catObj2.run();
        catObj2.sound();
        catObj2.sleep();
        catObj2.jumps();
        doPamper(catObj2);

        Animal dogObj1 = new Husky();
        dogObj1.run();
        dogObj1.sound();
        dogObj1.sleep();
        doPamper(catObj1);

        Dog dogObj2 = new Husky();
        dogObj2.run();
        dogObj2.sound();
        dogObj2.sleep();
        doPamper(dogObj2);

        doPamperGeneric(catObj1);
        doPamperGeneric(catObj2);
        doPamperGeneric(dogObj1);
        doPamperGeneric(dogObj2);
    }

    public static void doPamper(Animal animal) {
        System.out.println("Pampering " + animal);
    }
   /* public static void doPamper(Cat cat){
        System.out.println("Pampering " + cat);
    }

    public static void doPamper(Dog dog){
        System.out.println("Pampering " + dog);
    }*/

    public static void doPamperGeneric(Animal animal) {
        System.out.println("Pampering " + animal);
    }
}
