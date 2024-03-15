package edu.sdsu.cs160l.datastructure.queue;

import jdk.javadoc.internal.tool.JavadocTodo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * In class explanation + demonstration
 * Note a queue in java is implemented as a {@link java.util.LinkedList}
 */
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // add an element - takes O(1)
        queue.add(1);
        queue.offer(2);

        //check top most element takes O(1) time
        Integer top = queue.peek();

        //remove element take O(1) time
        Integer ele = queue.poll();

        queue.clear();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(6);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // TODO - Create a queue of students 5 students
        // TODO - initialise 5 students and add them to the queue
        // TODO - remove the first two students and add 1 student
        // TODO - print the final queue
    }
}
