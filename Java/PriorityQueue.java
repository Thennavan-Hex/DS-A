import java.util.*;
public class PriorityQueue {
    public static void main(String[] args){
        Queue<String> queue= new PriorityQueue<>(); // Creating  a Priority Queue

        queue.offer("Z");
        queue.offer("A");
        queue.offer("T");
        queue.offer("V");
        queue.offer("P");

        // printing all the  Queue elements
        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }

    }
}
