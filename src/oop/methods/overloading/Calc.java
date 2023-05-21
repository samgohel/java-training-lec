package oop.methods.overloading;

public class Calc {
    public static void main(String[] args) {
        System.out.println(sum(5,5));
        System.out.println(sum(5.2,5.8));
        System.out.println(sum("S", "S"));
        System.out.println(mul(5,5));
    }

    public static int sum(int a, int b){
        System.out.println("From Int");
        return a + b;
    }

    public static double sum(double a, double b){
        System.out.println("From Double");
        return a + b;
    }

    public static String sum(String a, String b){
        System.out.println("From String");
        return a + b;
    }

    public static int mul(int a, int b){
        return a * b;
    }
}
