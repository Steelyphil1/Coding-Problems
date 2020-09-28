/*  Array 1.1 Get product of all other elements

    Given an array of integers, return a new array such that each element at index i of the new array
    is the product of all the numbers in the original array, except the one at i.

    This solution is O(n)
*/


import java.util.Random;

public class Array1_2 {
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

        //Find the product of all elements of original array
        int product = 1;
        for(int i : inputArray) {
            product *= i;
        }

        //Divide the product by each element of inputArray and assign it to the elements of the output array
        for(int i = 0; i < outputArray.length; i++) {
            outputArray[i] = product / inputArray[i];
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
