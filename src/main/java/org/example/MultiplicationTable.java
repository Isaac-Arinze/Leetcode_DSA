package org.example;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("input the number till where you need to the multiplication table ");

        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        for (int j =1; j <= n; j++) {
            System.out.println("Multiplication table for: " + j);

            for (int i = 0; i<=12; i++){
                System.out.println(j + " x " + j + " = " + (j*i));
            }

        }


    }
}
