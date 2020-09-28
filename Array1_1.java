/*  Array 1.1 Get product of all other elements

    Given an array of integers, return a new array such that each element at index i of the new array
    is the product of all the numbers in the original array, except the one at i.

    This solution is O(n^2), and therefore not that efficient
*/

import java.util.Random;

public class Array1_1 {
    public static void main(String[] args) {

        //Create arrays to be used
        int[] inputArray = new int[5];
        int[] outputArray = new int[5];

        //fill the input array with random numbers
        fillArray(inputArray);

        //display original numbers
        for(int i : inputArray) {
            System.out.println(i);
        }

        //for each element of the output array mult-equal itself with every element of the input array except where
        //the indexes are the same
        for(int i = 0; i < outputArray.length; i++) {
            int num = 1;
            for(int j = 0; j < inputArray.length; j++) {
                if(i != j) {
                    num *= inputArray[j];
                }
            }
            outputArray[i] = num;
        }

        //display the output array
        for(int i : outputArray) {
            System.out.println(i);
        }

    }

    //uses a the Random class to generate random integers with a bound of 1-5
    public static int[] fillArray(int[] array) {
        Random generator = new Random();
        for(int i = 0; i < 5; i++) {
            array[i] = generator.nextInt(5)+1;
        }
        return array;
    }
}
