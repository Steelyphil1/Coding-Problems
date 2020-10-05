/*
    Implement a stack that has the following methods:
        Push(val): push value onto the stack
        Pop: pop off and return the topmost element of the stack. If there are no elements in the stack, throw an exception
        Max: return the maximum value in the stack. If there are no elements in the stack, throw an error

        each method should run in constant time

        I implemented this solution with an ArrayList instead of using Stack<> because I wanted to practice a harder solution,
        though it seemed it just made getting the last element a little more challenging. This solution is O(1) for all
        methods

*/

import java.util.*;
public class StacksAndQueues1_1 {
    ArrayList<Integer> stack;
    ArrayList<Integer> maxStack;

    public StacksAndQueues1_1(){
        this.stack = new ArrayList<Integer>();
        this.maxStack = new ArrayList<Integer>();
        maxStack.add(0);
    }

    //add the value to the stack, and for the max stack, if the value is greater than the current max add the value
    //if it isnt then add another of the current max. this will allow for maintaining the previous max
    public void push(int val) {
        this.stack.add(val);
        if(val > maxStack.get(maxStack.size()-1)) {
            maxStack.add(val);
        } else {
            maxStack.add(maxStack.get(maxStack.size()-1));
        }

    }

    //if the stack is null throw an exception, if not remove an element from the end of both lists
    public int pop() {
        if (stack.equals(null)) {
            throw new NullPointerException();
        } else {
            maxStack.remove(maxStack.size()-1);
            return stack.remove(stack.size()-1);
        }
    }
    public int max() {
        return this.maxStack.get(maxStack.size()-1);
    }

    //overrode the toString method so I didnt have to keep writing code to iterate over the stack
    @Override
    public String toString() {
        String s = "[";
        for(int i =0; i < stack.size()-1; i++) {
            s += stack.get(i) + ", ";
        }
            s += stack.get(stack.size()-1);
        return s + "]";
    }







    public static void main(String[] args) {
        StacksAndQueues1_1 stack = new StacksAndQueues1_1();
        stack.push(1);
        System.out.println(stack);
        System.out.println("Max is: " + stack.max());
        stack.push(2);
        System.out.println(stack);
        System.out.println("Max is: " + stack.max());
        stack.pop();
        System.out.println(stack);
        System.out.println("Max is: " + stack.max());
        stack.push(9);
        System.out.println(stack);
        System.out.println("Max is: " + stack.max());
        stack.push(4);
        System.out.println(stack);
        System.out.println("Max is: " + stack.max());
        stack.push(13);
        System.out.println(stack);
        System.out.println("Max is: " + stack.max());
        stack.pop();
        System.out.println(stack);
        System.out.println("Max is: " + stack.max());

    }
}
