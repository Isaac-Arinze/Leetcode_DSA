package org.example;

public class Reverse {

    public static String name = "Hello";


    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder(name);
        builder.reverse();
        String reversedName = builder.toString();
        System.out.println(reversedName);

    }

}


