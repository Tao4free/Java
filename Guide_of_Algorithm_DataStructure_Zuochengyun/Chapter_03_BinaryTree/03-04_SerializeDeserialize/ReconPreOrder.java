import java.util.*;

public class ReconPreOrder {
    public static void main(String[] arg) {
        String preStr = "12!3!#!#!#!";
        Node head = reconByPreString(preStr);

        printPre(head);
        System.out.println();
    }

    public static Node reconByPreString(String preStr) {
        String[] values = preStr.split("!");
        Queue<String> queue = new LinkedList<String>();
        for (int i = 0; i != values.length; i++) {
            queue.offer(values[i]);
        }
        return reconPreOrder(queue);
    }

    public static Node reconPreOrder(Queue<String> queue) {
        String value = queue.poll();
        if (value.equals("#")) {
            return null;
        }
        Node head = new Node(Integer.valueOf(value));
        head.left = reconPreOrder(queue);
        head.right = reconPreOrder(queue);
        return head;
    }

    public static void printPre(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.value + " ");
        printPre(head.left);
        printPre(head.right);
    }
}
