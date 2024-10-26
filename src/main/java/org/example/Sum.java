package org.example;

public class Sum {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void announce (){
        System.out.println("Announcement");
    }

    public static String bark(String woo){
                return woo;
    }

    public static double withdraw (double amount){
        return amount;
    }

    public static void main(String[] args) {
        System.out.println(sum(6, 2));
        announce();
        System.out.println(bark("Barking continously"));;

        System.out.println("**************************************");
        System.out.print("You have successfully transferred the sum of");
        System.out.print(withdraw(2000));

    }
}
