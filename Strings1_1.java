/* Given a word w and a string s, find all indices in s which are the starting locations of anagrams of w.
    For example, given w is ab and s is abxaba, return [0, 3, 4]

    This solution first creates the only other anagram of w, and parses over the string looking at each substring window
    that is the same size as the word, checking if it is w or an anagram.
    This solution is
 */

import java.util.*;
public class Strings1_1 {
    public static void main(String[] args) {
        //create a solution array, and instantiate/declare String variables including the anagram of w
        ArrayList<Integer> solutionArray = new ArrayList<>();
        String s = "abxaba";
        String w = "ab";
        String anagramW = "ba";

        /*for every element of the string from the beginning to the length minus the word length, check to see
        if it is an anagram of w, if it is add the starting index to the solution array*/
        for(int i = 0; i <= s.length()-w.length(); i++) {
            String temp = s.substring(i, i+w.length());
            if(temp.equals(w) || temp.equals(anagramW)) {
                solutionArray.add(i);
            }
        }

        for(int i : solutionArray) {
            System.out.println(i);
        }
    }
}
