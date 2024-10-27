package org.example;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        char [] arr = {'a', 'b', 'c', 'd'};
        System.out.println(arr);

        String[] name = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul"};

        int[] num = new int[5];

        num[0] = 2;

        int[][] numb = {{0, 1, 2}, {1, 4, 9}, {3, 8, 9}};

        for (int i = 0; i < numb.length; i++) {
            System.out.println(Arrays.toString(numb[i]));

        }

        String str = new String();

        String str1 = "efgh";

       String str2 = new String(arr);
        System.out.println(str2.length());
        System.out.println(str1.concat(str2));
        System.out.println(str1.indexOf(str));

        StringBuffer strB = new StringBuffer("Sunny");
        System.out.println(strB.append(" Mondau+"));

    }
}