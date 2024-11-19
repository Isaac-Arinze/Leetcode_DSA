package org.example;

/*For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

        Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.



        Example 1:

        Input: str1 = "ABCABC", str2 = "ABC"
        Output: "ABC"
        Example 2:

        Input: str1 = "ABABAB", str2 = "ABAB"
        Output: "AB"
        Example 3:

        Input: str1 = "LEET", str2 = "CODE"
        Output: ""


        Constraints:

        1 <= str1.length, str2.length <= 1000
        str1 and str2 consist of English uppercase let
*/
public class GreatestComonDivisor {

    public static void main(String[] args) {
        GreatestComonDivisor gcp = new GreatestComonDivisor();

        // Test cases
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcp.gcdOfString(str1, str2)); // Expected out[ut": "ABC"

//        String str1 = "ABCD";
//        String str2 = "ABC";
//        System.out.println(gcp.gcdOfString(str1, str2));


    }


    public String gcdOfString(String str1, String str2){

        if (str1.length() < str2.length()){
            return gcdOfString(str2, str1);

        } else if (!str1.startsWith(str2)) {
            return "";

        } else if (str2.isEmpty()) {
            return str1;
        } else {
            return gcdOfString(str1.substring(str2.length()), str2);

        }


    }

}
