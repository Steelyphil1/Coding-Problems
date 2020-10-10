/*
    Cut Brick Wall
    A wall consists of several rows of bricks of various integer lengths and uniform height.
    Your goal is to find a vertical line going from the top to the bottom of the wall that cuts through
    the fewest number of bricks. If the line goes through the edge between two bricks, this does not count as a cut.
    For example, suppose the input is as follows: where values in each row represents the lengths of bricks in that row:
    [3, 5, 1, 1]
    [2, 3, 3, 2]
    [5, 5]
    [4, 4, 2]
    [1, 3, 3, 3]
    [1, 1, 6, 1 ,1]

 */

import java.util.HashMap;
import java.util.Map;

public class HashTables2_1 {
    public static void main(String[] args) {

        //create each row of the wall
        int[] row1 = new int[]{3, 5, 1, 1};
        int[] row2 = new int[]{2, 3, 3, 2};
        int[] row3 = new int[]{5, 5};
        int[] row4 = new int[]{4, 4, 2};
        int[] row5 = new int[]{1, 3, 3, 3};
        int[] row6 = new int[]{1, 1, 6, 1, 1};

        //create a hashmap to hold keys(sums), and values(number of times the wall has rows that add up to that sum)
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        //iterate over a row, each time a sum is reached replace the value at key sum, with an incremented value
        int sum = 0;
        for (int i = 0; i < row1.length - 1; i++) {

            sum += row1[i];
            if (hashMap.containsKey(sum)) {
                int var = hashMap.get(sum) + 1;
                hashMap.replace(sum, var);
            } else {
                hashMap.put(sum, 1);
            }
        }
        //print out the contents of the keySet, which sums have been reached, and the values aka how many times each sum has been reached
        System.out.println("Sums Reached and how many times respectively:");
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println("------------------------");

        //Do this for every row in the wall
        sum = 0;
        for(int i = 0; i < row2.length-1; i++) {

            sum += row2[i];
            if(hashMap.containsKey(sum)) {
                int var = hashMap.get(sum)+1;
                hashMap.replace(sum, var);
            } else {
                hashMap.put(sum, 1);
            }
        }
        System.out.println("Sums Reached and how many times respectively:");
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println("------------------------");

        sum = 0;
        for(int i = 0; i < row3.length-1; i++) {

            sum += row3[i];
            if(hashMap.containsKey(sum)) {
                int var = hashMap.get(sum)+1;
                hashMap.replace(sum, var);
            } else {
                hashMap.put(sum, 1);
            }
        }
        System.out.println("Sums Reached and how many times respectively:");
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println("------------------------");

        sum = 0;
        for(int i = 0; i < row4.length-1; i++) {

            sum += row4[i];
            if(hashMap.containsKey(sum)) {
                int var = hashMap.get(sum)+1;
                hashMap.replace(sum, var);
            } else {
                hashMap.put(sum, 1);
            }
        }
        System.out.println("Sums Reached and how many times respectively:");
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println("------------------------");

        sum = 0;
        for(int i = 0; i < row5.length-1; i++) {

            sum += row5[i];
            if(hashMap.containsKey(sum)) {
                int var = hashMap.get(sum)+1;
                hashMap.replace(sum, var);
            } else {
                hashMap.put(sum, 1);
            }
        }
        System.out.println("Sums Reached and how many times respectively:");
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println("------------------------");

        sum = 0;
        for(int i = 0; i < row6.length-1; i++) {

            sum += row6[i];
            if(hashMap.containsKey(sum)) {
                int var = hashMap.get(sum)+1;
                hashMap.replace(sum, var);
            } else {
                hashMap.put(sum, 1);
            }
        }
        System.out.println("Sums Reached and how many times respectively:");
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println("------------------------");

        //now that every row has been covered, the key associated with the highest value will be where you should make your cut
        System.out.println("To cut through the least amount of bricks, you should make the cut at: ");
        int max = 0;
        for(int i : hashMap.values()) {
            if(i > max) {
                max = i;
            }
        }
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() == max) {
                System.out.println(entry.getKey());
            }
        }
        //and the # of bricks to cut through will be the amount of rows minus how many times the sum was reached
        System.out.println("The least amount of rows to cut through is ");
        System.out.println(6 - max);

    }
}
