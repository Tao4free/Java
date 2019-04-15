import java.util.*;

public class SortStackByStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 1; i < 6; i++) {
            stack.push(i);
        }
        System.out.println("Initial stack: " + stack);

        sort(stack);
        System.out.println("Sorted stack: " + stack);
    }

    public static void sort(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<Integer>();
    
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek() > cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }
    
        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
    }
}
