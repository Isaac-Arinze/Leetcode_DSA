package org.example;

public class Recursion {

    public static void recursive (int n){
        n--;
        System.out.println(n);
        if (n > 0){
            recursive(n);
        }

    }
    public static void main(String[] args) {
        int n = 20;
        recursive(n);
    }
}
