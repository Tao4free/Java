import java.util.*;

public class StackDemo {
    static void showpush(Stack st, int a) {
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    static void showpop(Stack st) {
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println("stack: " + st);
        showpush(st, 42);
        System.out.print('\n');
        showpush(st, 66);
        System.out.print('\n');
        showpush(st, 99);
        System.out.print('\n');
        showpop(st);
        System.out.print('\n');
        showpop(st);
        System.out.print('\n');
        showpop(st);
        System.out.print('\n');
        try {
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
}
