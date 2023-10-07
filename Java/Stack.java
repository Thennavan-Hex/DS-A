import java.util.Stack;
public class Stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>(); // creating Stack

        // Pushing items in Stack
        stack.push("minecraft");
        stack.push("csgo");
        stack.push("gtav");
        System.out.println(stack);

        // Poping item from Stack
        stack.pop();
        stack.pop();
        System.out.println(stack);

        stack.push("csgo");
        stack.push("gtav");

        // Searching from Stack
        System.out.println(stack.search("minecraft"));

        // To check the Stack is Empty return in boolean
        System.out.println(stack.empty());

        // to check the top of the stack
        System.out.println(stack.peek());
    }
}
