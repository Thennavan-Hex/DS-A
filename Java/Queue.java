import java.util.Queue;
import java.util.LinkedList;
public class Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();  // Creating a queue

        // Adding element in queue
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        System.out.println(queue);

        // View the first element of queue
        System.out.println(queue.peek());

        // pop element from queue
        
        queue.poll();
        System.out.println(queue);

        // Size of queue 
        System.out.println(queue.size());
        
        // To find the element is present or not 
        System.out.println(queue.contains("C"));

    }
}
