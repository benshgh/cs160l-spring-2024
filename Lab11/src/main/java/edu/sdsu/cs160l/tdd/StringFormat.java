package edu.sdsu.cs160l.tdd;

/**
 * Write a function phone number formatter with the following requirement
 * takes a string input
 * if input is null or not of 10 length throw an IllegalArgumentException
 * else format input XXXXXXXXX as +1 (XXX) XXX-XXXX
 *
 */
public class StringFormat {
    public String phoneNumberFormat(String input){
        if(input==null || input.length()!=10){
            throw new IllegalArgumentException("phone number cannot be null and must have only 10 characters");
        }
        String first = input.substring(0,3);
        String second = input.substring(3,6);
        String third = input.substring(6,10);

        return "+1 ("+first+") "+second+"-"+third;
    }
}
