/*  Given an array of numbers, find the maximum sum of any contiguous subarray of the array. For example,
given the array [34, -50, 42, 14, -5, 86], the maximum sum would be 137, since we would take elements 42, 14, -5, and 86.
Given the array [-5, -1, -8, -9] the maximum sum would be 0, since we would choose not to take any elements.

Do this in O(n) time.

This was done in O(n) time using Kadane's Algorithm
 */

public class Array3_1 {
    public static void main(String[] args) {
        //Create the array and fill with the numbers
        int[] a = new int[]{35, -50, 42, 14, -5, 86};
        //Method call with array
        System.out.println("The Maximum Sum is: " + findMaxSub(a));
    }

    //method returns the maximum subarray
    public static int findMaxSub(int[] array) {
        //create two variables used to keep track of the maximums
        int maxEndingHere = 0;
        int maxSoFar = 0;

        //iterate over the array. one variable keeps track of the maximum sum, while the other changes with each element.
        //if the variable changing with each element falls below 0 its replaced with 0 (so that we choose no elements if
        //all are 0). If the the changing variable becomes greater than the current maximum sum, the max sum is replaced
        for(int i = 0; i < array.length; i++) {
            maxEndingHere += array[i];
            if(maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }
            if(maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }
}
