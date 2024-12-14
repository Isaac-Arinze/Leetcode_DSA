package org.example;

public class AbstractClass {
    public static void main(String[] args) {

}
    abstract class Vehicle {
        abstract void start ();

    }

    class Bike extends Vehicle {
        void start() {
            ride();
        }
    }

    void ride() {
        System.out.println("Riding the bike");

    }

}