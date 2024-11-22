package org.example;

public class Palindrome {
    public static void main(String[] args) {
        int x = 121;
        if (isPalindrome(x)) {
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int x) {
        // Handle negative numbers and numbers with trailing zeros
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // If the number has an odd number of digits, we can ignore the middle digit
        return x == reversedHalf || x == reversedHalf / 10;
    }
}

