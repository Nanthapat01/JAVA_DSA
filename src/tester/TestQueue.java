package tester;

import linear.LinearQueue;

public class TestQueue {
    public static void main(String[] args) {
        LinearQueue<Integer> queue = new LinearQueue<>(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek()); // Output: 10
        System.out.println("Queue size: " + queue.size());   // Output: 3

        System.out.println("Dequeue: " + queue.dequeue());  // Output: 10
        System.out.println("Front element after dequeue: " + queue.peek()); // Output: 20
        System.out.println("Queue size after dequeue: " + queue.size());   // Output: 2

        queue.dequeue();
        queue.dequeue();
        queue.dequeue(); // Output: Error: Queue is empty!
    }
}
