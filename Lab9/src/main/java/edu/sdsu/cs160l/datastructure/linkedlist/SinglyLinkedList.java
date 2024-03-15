package edu.sdsu.cs160l.datastructure.linkedlist;

public class SinglyLinkedList {

    Node head;
    static class Node {

        String studentName;
        Node next;

        // Constructor
        Node(String d)
        {
            studentName = d;
            next = null;
        }
    }

    // Inserting a new node
    public static SinglyLinkedList insert(SinglyLinkedList list,
                                    String data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(SinglyLinkedList list)
    {
        Node currNode = list.head;
        System.out.print("Student Enrolled are: ");
        // Traversing through the LinkedList
        while (currNode != null) {
            System.out.print(currNode.studentName + " ");
            currNode = currNode.next;
        }

        System.out.println();
    }

    //deleting a node
    public static SinglyLinkedList deleteByKey(SinglyLinkedList list, String key)
    {
        Node currNode = list.head, prev = null;

        if (currNode != null && currNode.studentName.equals(key)) {
            list.head = currNode.next; // Changed head

            // Display the message
            System.out.println(key + " found and deleted");

            // Return the updated List
            return list;
        }

        while (currNode != null && !(currNode.studentName).equals(key)) {
            prev = currNode;
            currNode = currNode.next;
        }

        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println(key + " found and deleted");
        }

        // If key was not present in linked list
        if (currNode == null) {
            System.out.println(key + " not found");
        }

        // return the List
        return list;
    }


    public static void main(String[] args)
    {
        //Creating a singly linkedlist
        SinglyLinkedList list = new SinglyLinkedList();

        // Insert the values
        list = insert(list, "Aditi");
        list = insert(list, "John");
        list = insert(list, "Abdul");
        list = insert(list, "Meeta");

        // Print the LinkedList
        printList(list);

        //Deleting based on key value
        deleteByKey(list, "Meeta");

        // Print the LinkedList
        printList(list);

        /* TODO: Create a singly linked list to store course names and perform the following tasks
            1. Insert course names CS150, CS160, CS210
            2. Delete CS150, CS160
            3. Add CS150L, CS160L
            4. Iterate through the linkedlist and print all the courses
         */

    }
}
