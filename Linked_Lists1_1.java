/*
    Given the head of a singly linked list, reverse it in place
    
    This solution is O(n) 
*/

import java.util.*;
public class Linked_Lists1_1 {
    public static void main(String[] args) {
        //create a new linked list of type Integer, and then fill it with some values
        LinkedList<Integer> startList = new LinkedList<Integer>();
        startList.add(1);
        startList.add(2);
        startList.add(3);
        startList.add(4);
        System.out.println(startList);
        reverseIt(startList);
        System.out.println(startList);
    }
    
    /*  reverse it method starts at the second to last element, removes it and adds it to the end then does the third
        from last until it reaches the element at position 0
    */
    public static void reverseIt(LinkedList<Integer> list) {
        for(int i = list.size()-1; i >= 0; i--) {
            list.add(list.remove(i));
        }
    }
}
