import java.util.Stack;

public class PushStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Red");
        stack.push("Green");
        stack.push("Blue");

        System.out.println("Stack after pushing: " + stack);
    }
}
