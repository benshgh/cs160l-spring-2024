package edu.sdsu.cs160l.university.lab7.exam;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * Our Exam manager is a publisher that publishes certain messages
 * interested parties can subscribe to those and get notified of changes
 *
 */
public class ExamManager {
    private final Set<ExamObserver> observers;

    public ExamManager() {
        this.observers = new HashSet<>();
    }

    public void subscribeToResults(ExamObserver observer) {
        observers.add(observer);
    }

    public void unsubscribeFromResults(ExamObserver observer) {
        observers.remove(observer);
    }

    public void publishResults(String labName) {
        //some code that posts grade to canvas
        for (ExamObserver observer : observers) {
            observer.onResultPublished("Results for " + labName + " published");
        }
    }

}
