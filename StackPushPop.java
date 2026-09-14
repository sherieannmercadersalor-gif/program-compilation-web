import java.util.Stack;

public class StackPushPop {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        System.out.println("After pushing: " + stack);

        System.out.println("Popped: " + stack.pop());
        System.out.println("After popping: " + stack);

        System.out.println("Popped: " + stack.pop());
        System.out.println("After popping: " + stack);
    }
}