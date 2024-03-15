package edu.sdsu.cs160l.datastructure.array;

public class ArrayExample {
    public static void main(String[] args) {
        //Arrays are of the Random Access model which is good for accessing elements, and bad for inserting or removing
        int[] intArray = new int[6];

        // Contiguous allocation: Array elements are stored in sequentially adjacent memory locations
        // Random Access: Since elements are contiguously allocated, they can be accessed almost instantaneously with O(1) time complexity.
        // This is because we know the exact index where the element resides in memory.
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;

        // Fast Access: Directly access elements by their index in O(1) time complexity.
        int accessedElement = intArray[2];

        // BAD for insertion or removal: Array size is fixed, so inserting or removing elements
        // This requires creating a new array with a different size and then copying over data, is an O(n) time complexity operation.
            //Note O(N) means if you have N elements in the array, you may need to perform up to N operations to complete the operation
        int[] newArray = new int[6];

        // Example inserting an element in the middle of the above array
        for (int i = 0; i < 2; i++) {
            newArray[i] = intArray[i];
        }
        // Insert the new element
        newArray[2] = 10000;
        for (int i = 3; i < newArray.length; i++) {
            newArray[i] = intArray[i - 1];
        }
        //All in all we had to iterate over all N elements in our array aka O(N) time complexity

        //Example: remove an element from our newly created array
        // Removing an element is also an O(N) time complexity operation with having to copy over all the elements
        for (int i = 0; i < 4; i++) {
            newArray[i] = newArray[i];
        }
        //Note: We skip over index 4, effectively removing the element at this index
        for (int i = 4; i < newArray.length - 1; i++) {
            newArray[i] = newArray[i + 1];
        }

        //Print out the elements in the new array after inserting and removal
        System.out.println("New array after insertion/removal:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }

        //TODO: Find the index of the element 30 in the newArray and print it using a linear search algorithm Hint O(N) complexity
    }
}
