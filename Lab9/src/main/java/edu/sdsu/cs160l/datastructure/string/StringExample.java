package edu.sdsu.cs160l.datastructure.string;

/**
 * In class explanation + demonstration
 */
public class StringExample {
    public static void main(String[] args) {
        // string is just a sequence of characters
        String s = "Hey this is a string";

        // charAt - O(1)

        char c = s.charAt(5); //h

        //loop over each string a print all character

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println("Char at index :: " + i + " is :: " + ch);
        }

    }
}
