import java.util.*;

public class TestReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println("Initial stack is " + stack);
        System.out.println();

        ReverseStack revstack = new ReverseStack();

        revstack.reverse(stack);
        System.out.println("Reversed stack is " + stack);
    }
}
