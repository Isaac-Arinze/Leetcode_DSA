package org.example;

public class FindMissingNumber {

    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;

        // Sum of the first n numbers
        int expectedSum = n * (n + 1) / 2;

        // Sum of elements in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        // The missing number is the difference
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 7, 1, 2, 8, 4, 5};
        System.out.println("Missing Number: " + findMissingNumber(nums));  // Output: 6
    }
}

