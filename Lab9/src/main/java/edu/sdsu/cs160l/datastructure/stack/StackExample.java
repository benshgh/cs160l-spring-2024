package edu.sdsu.cs160l.datastructure.stack;

import java.util.Stack;

/**
 * In class explanation + demonstration
 * A stack is a last in first out structure
 */
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // add an element - similar to list takes O(n) time to copy elements to new array
        stack.add(1);
        stack.push(2);

        //check top most element takes O(1) time
        int top = stack.peek();

        //remove element take O(1) time
        int ele = stack.pop();

        stack.clear(); // empties the collection

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
