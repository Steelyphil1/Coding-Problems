/*
Given an array of integers, return a new array where each element in the new array is the number
of smaller elements to the right of that element in the original input array.
For Example; given the array [3, 4, 9, 6, 1], return [1, 1, 2, 1, 0]

My first solution is O(n^2), I will try to increase the efficiency by passing over the list
once to make it O(n) or O(n log(n))

My second solution was completely my own as the solution in the book used a python specific bijection solution. Because I had
to continually sort the list it is O(n log n)
 */

import java.util.*;
public class Array4_1 {

    public static void main(String[] args) {

        /* SOLUTION #1 o(n^2) time
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
    */
        
        /*Solution #2
        Initialize the list with the numbers in the example and the array i will use to solution array
        As well as an ArrayList that I will use Collections to continually sort as I add (I cant just sort the whole
        array once as I need to know the index of the element after I add it moving backwards*/
        int[] array = new int[]{3,4,9,6,1};
        int[] outputArray = new int[5];
        ArrayList<Integer> sortedArray = new ArrayList<>();

        //for each element in array moving backwards, create a counter, add the element to the sorted array, sort it,
        //then find out the index of the new element. Because we are moving from right to left this will give us how
        //many elemnts to the right of it are smaller. add that to counter and then add counter to the solution array
        for(int i = array.length-1; i >= 0; i--) {
            int counter = 0;
            sortedArray.add(array[i]);
            Collections.sort(sortedArray);
            counter = sortedArray.indexOf(array[i]);

            outputArray[i]=counter;
        }
        System.out.println("--");
        for(int i : outputArray) {
            System.out.println(i);
        }
    }
}
