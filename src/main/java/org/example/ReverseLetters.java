package org.example;

//Given a String S, return the "reversed" string where all characters
// that are not a letter stay in the same place and all letters reversed
// their positions
//
//Example 1
//input  "ab-cd"
//output: "dc-ba"
//
//Example 2
//input "a-bC-dEf=ghIj!!"
//output: "j-Ih-gfE=dCba!!"

public class ReverseLetters {

    public static String reverseLetters (String s){
//
//        StringBuilder sb = new StringBuilder(s);
//                  or
        char[] chars = s.toCharArray();

        int left = 0; int right = s.length() - 1;

        while (left < right){
            while (left < right && !Character.isLetter(chars[left])){
                left++;
            }

            while (left < right && !Character.isLetter(chars[right])){
                right--;
            }

            if (left < right){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {

        String s1 = "ab-cd;";
        String s2 = "a-bC-dEf=ghIj!!";
        System.out.println(reverseLetters(s1));
        System.out.println(reverseLetters(s2));

    }
}
