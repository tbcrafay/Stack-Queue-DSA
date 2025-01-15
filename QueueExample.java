import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); 

        // Add elements to the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // Remove elements from the queue
        System.out.println("Removed element: " + queue.poll()); // Outputs: 10
        System.out.println("Front element: " + queue.peek());   // Outputs: 20

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); 
    }
}
