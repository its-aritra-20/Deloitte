package com.deloitte.core.stack_queue;
import java.util.LinkedList;
import java.util.Queue;

public class QueueImp {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.offer(40);
        System.out.println("Queue elements: " + queue);

        System.out.println("Dequeued: " + queue.remove()); // throws exception if empty
        System.out.println("Dequeued: " + queue.poll());   // returns null if empty

        System.out.println("Front element (peek): " + queue.peek());

        System.out.println("Is queue empty? " + queue.isEmpty());

        System.out.println("Queue after operations: " + queue);
    }
}
