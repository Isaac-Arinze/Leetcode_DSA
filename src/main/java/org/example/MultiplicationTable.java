package org.example;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Input the number for which you need to multiply:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Multiplication table for " + n + ":");

    for (int i = 0; i<=12; i++){
        System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
