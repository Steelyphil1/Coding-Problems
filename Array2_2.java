/*  Arrays 1.2 Locate the Smallest Window to be sorted
    Given an array of integers that are out of order, determine the bounds of the smallest window that must
    be sorted in order for the entire array to be sorted. For example, givn [3, 7, 5, 6, 9], you
    should return (1, 3).

    This is in O(nlogn) because we made a copy of the original array
*/
import java.util.*;
public class Array2_2 {
    public static void main(String[] args) {

        //create an array of length 5
        ArrayList<Integer> inputArray = new ArrayList<>();

        //fill the array with random numbers
        fillArray(inputArray);

        //display numbers in array pre sort
        for(int i : inputArray) {
            System.out.println(i);
        }
        System.out.println("------------");

        //copy array
        ArrayList<Integer> copyArray = new ArrayList<Integer>(inputArray);

        //sort the array
        Collections.sort(inputArray);

        //display numbers in array post sort
        for(int i : inputArray) {
            System.out.println(i);
        }

        //create final indexes with default values of -1, and a variable to break the loops
        int bottomIndex = -1;
        int topIndex = -1;

        for(int i = 0; i < inputArray.size(); i++) {
            if (copyArray.get(i) != inputArray.get(i)) {
                bottomIndex = i;
                break;
            }
        }
        for(int i = inputArray.size()-1; i >= 0; i--) {
            if(copyArray.get(i) != inputArray.get(i)) {
                topIndex = i;
                break;
            }
        }

        //pring out the results
        System.out.println("(" + bottomIndex + "," + topIndex + ")" );
    }

    //fill array with random numbers 1-5
    public static void fillArray(ArrayList<Integer> array) {
        Random gen = new Random();
        for(int i = 0; i < 5; i++) {
            array.add(gen.nextInt(5)+1);
        }
    }
}
