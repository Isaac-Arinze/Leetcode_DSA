package org.example;

import static java.util.Collections.swap;
import static org.example.Sum.withdraw;

public class StringSwap {
    //wriite a program to swap "Hi" amd "Hello"
    public static void main(String[] args) {

        String str1 = "Hi";
        String str2 = "Hello";

        String temp = new String("");
        swap(str1, str2);
        temp = str1;
        str1 = str2;
        str2 = temp;
        System.out.println(str1);
        System.out.println(str2);

    }

    private static void swap(String str1, String str2) {
    }


}