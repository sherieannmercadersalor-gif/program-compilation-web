import java.util.LinkedList;
import java.util.Queue;

public class RemQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println("Queue before remove: " + queue);

        queue.remove();
        System.out.println("Queue after remove: " + queue);

        queue.remove();
        System.out.println("Queue after another remove: " + queue);
    }
}