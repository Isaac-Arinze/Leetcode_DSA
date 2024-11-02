package org.example;

public class MergeAlternately {
    public static String mergeAlternately (String word1, String word2){
        StringBuilder ans = new StringBuilder("");

        int m = word1.length();
        int n = word2.length();

        int i = 0;
        int j = 0;

        while (i<m && j<n){
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(j));
            i++;
            j++;
        }

        while(i<m){
            ans.append(word1.charAt(i));
            i++;
        }
        while (j<n) {
            ans.append(word2.charAt(j));
            j++;
        }
        return ans.toString();
    }

    public static void main(String[] args) {

        String result1 = mergeAlternately("abc", "pq");
        String result2 = mergeAlternately("ab", "pqrs");
        String result3 = mergeAlternately("abc", "pqr");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
