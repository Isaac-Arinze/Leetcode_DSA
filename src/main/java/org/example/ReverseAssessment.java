package org.example;

public class ReverseAssessment {
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;


        //2 pointer approach to reverse d array inplace
        while (left < right) {
            // swap charaters at left and right indices

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // move pointer towards the centre
            left++;
            right--;
        }
    }


    public static void main(String[] args) {

        char[]  reverse = {'h', 'e', 'l', 'l', 'o'};
        reverseString(reverse);
        System.out.println(reverse);

        char[] sky = {'t', 'r', 'y'};
        reverseString(sky);
        System.out.println(sky);

    }
}