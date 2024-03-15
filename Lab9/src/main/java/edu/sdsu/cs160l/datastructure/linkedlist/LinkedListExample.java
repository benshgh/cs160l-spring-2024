package edu.sdsu.cs160l.datastructure.linkedlist;
import edu.sdsu.cs160l.student.Student;
import edu.sdsu.cs160l.student.StudentLevel;
import edu.sdsu.cs160l.student.StudentMajor;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        //Creating a linkedlist of Students
        LinkedList<Student> list=new LinkedList<Student>();

        Student john = new Student(1L, "John", 4.0, StudentLevel.FRESHMAN, StudentMajor.COMPUTER_SCIENCE);
        Student jane = new Student(2L, "Jane", 4.0, StudentLevel.JUNIOR, StudentMajor.COMPUTER_ENGINEERING);
        Student tron = new Student(3L, "Jack", 4.0, StudentLevel.FRESHMAN, StudentMajor.COMPUTER_SCIENCE);
        Student janice = new Student(4L, "Janice", 4.0, StudentLevel.FRESHMAN, StudentMajor.COMPUTER_ENGINEERING);

        //Adding Values to linkedlist
        list.add(john);
        list.add(jane);
        list.add(tron);

        //adding at the start
        list.add(0, janice);
        // TODO: can you think of any other way of adding a new element at the start of the list

        //Accessing elements from the linkedlist
        System.out.println("List of students added to the class are - ");
        for(Student b:list){
            System.out.println(b.getRedId()+" "+b.getName()+" "+b.getGpa()+" "+b.getLevel()+" "+b.getMajor());
        }

        //removing elements from the linkedlist
        list.remove(0);
        // TODO: can you think of any other way of removing the first element

        System.out.println("Updated list of students - ");
        //Accessing elements from the linkedlist
        for(Student b:list){
            System.out.println(b.getRedId()+" "+b.getName()+" "+b.getGpa()+" "+b.getLevel()+" "+b.getMajor());
        }

        // Accessing last element from the list
        // getLast(), getFirst(), addFirst(), addLast() -> main benefits of using LinkedList
        System.out.println(list.getLast());

        // TODO: Write your code to add janice to the list in place of jane

    }

}
