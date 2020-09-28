/*  Arrays 1.2 Locate the Smallest Window to be sorted
    Given an array of integers that are out of order, determine the bounds of the smallest window that must
    be sorted in order for the entire array to be sorted. For example, givn [3, 7, 5, 6, 9], you
    should return (1, 3).

    This solution is O(n^2), and therefore is not efficient
*/
import java.util.Random;
public class Array2_1 {
    public static void main(String[] args) {

        //create an array of length 5
        int[] inputArray = new int[5];

        //fill the array with random numbers
        fillArray(inputArray);

        //display numbers in array
        for(int i : inputArray) {
            System.out.println(i);
        }

        //create final indexes with default values of -1, and a variable to break the loops
        int bottomIndex = -1;
        int topIndex = -1;
        boolean found = false;

        //iterate over the array comparing each index to every other in the array, if the index
        //is greater than any subsequent element, set the bottom index equal to the current position, and break the loop
        for(int i = 0; i < inputArray.length && found==false; i++) {
            for(int j = 1; j < inputArray.length && found==false; j++) {
                if(inputArray[i] > inputArray[j]) {
                    bottomIndex = i;
                    found = true;
                }
            }
        }
        //reset the breaking variable
        found = false;

        //iterate over the array from the other direction comparing each index to every other in the array, if the index
        //is less than any preceeding element, then set the top index equal to the current position, and break the loop
        for(int i=inputArray.length-1; i >= 0 && found==false; i--) {
            for (int j = inputArray.length-2; j >= 0 && found==false; j--) {
                if(inputArray[i] < inputArray[j]) {
                    topIndex = i;
                    found = true;
                }
            }
        }

        //pring out the results
        System.out.println("(" + bottomIndex + "," + topIndex + ")" );
    }

    //fill array with random numbers 1-5
    public static void fillArray(int[] array) {
        Random gen = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = gen.nextInt(5)+1;
        }
    }
}
