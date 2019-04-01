import java.util.*;

public class StackDemo {
    static void showpush(Stack st, int 1) {
        st.push(new Integer(1));
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
    }
}
