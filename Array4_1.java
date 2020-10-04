/*
Given an array of integers, return a new array where each element in the new array is the number
of smaller elements to the right of that element in the original input array.
For Example; given the array [3, 4, 9, 6, 1], return [1, 1, 2, 1, 0]

My first solutino is O(n^2), I will try to increase the efficiency by passing over the list
once to make it O(n) or O(n log(n))
 */

public class Array4_1 {

    public static void main(String[] args) {
        //Create original array and array that will hold the number of smaller elements to the right
        int[] array = new int[]{3, 4, 9, 6, 1};
        int[] smallerArray = new int[5];

        //for every element iterate over the remaining elements incrememnting the counter each time an element is smaller
        for(int i = 0; i < array.length; i++) {
            int counter = 0;
            for(int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    counter++;
                }
            }
            //set the respective element of smallerArray to the final result of the counter
            smallerArray[i] = counter;
        }
        //iterate over the smaller elements array and print the result
        for(int i : smallerArray) {
            System.out.println(i);
        }

    }
}
