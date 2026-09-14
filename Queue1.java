import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println("Queue: " + queue);

        System.out.println("First element: " + queue.peek());

        System.out.println("Removed: " + queue.remove());
        System.out.println("Queue after remove: " + queue);

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}