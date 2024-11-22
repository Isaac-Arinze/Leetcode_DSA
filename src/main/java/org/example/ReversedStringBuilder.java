package org.example;


//we are to reverse some set of characters such that all letters within characters are reversed, except for other
// numbers and punctitation
public class ReversedStringBuilder {

    public static String sbReversedLetter(String s) {
        //convert to charArray
        char[] chars = s.toCharArray();
        // check while left < right

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetter(chars[left])) {
                left++;
            }
            while (left < right && !Character.isLetter(chars[right])) {
                right--;

            }

            if (left < right) {
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
        String s1 = "gabby";
        String s2 = "po-ob-i";

        System.out.println(sbReversedLetter(s1));
        System.out.println(sbReversedLetter(s2));
    }


}




