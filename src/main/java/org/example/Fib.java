package org.example;

public class Fib {

    public static int fib(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fib(n -1) + fib(n -2); // recursive calculation
    }

    public static void run() {
        // lets print d 1st 10 Fibonacci numbers

        for (int i = 0; i < 10; i++) {
            System.out.println(fib(i) + " ");
        }
        System.out.println("*********************");

    }

    public static void main(String[] args) {
        run();

    }
}
