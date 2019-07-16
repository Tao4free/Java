import java.util.*;

public class SerialByLevel {
    public static void main(String[] arg) {
        Node head = new Node(1);

        head.left = new Node(2);
        head.left.left = new Node(4);
        head.left.right = null;
        head.left.left.left = null;
        head.left.left.right = null;

        head.right = new Node(3);
        head.right.left = null;
        head.right.right = new Node(5);
        head.right.right.left = null;
        head.right.right.right = null;

        printLevel(head);
        System.out.println();

        String res = serialByLevel(head);
        System.out.println(res);
    }

    public static void printLevel(Node head) {
        if (head == null) {
            return;
        }
        //System.out.print(head.value + " ");
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(head);
        while (!queue.isEmpty()) {
            head = queue.poll();
            System.out.print(head.value + " ");
            if (head.left != null)
                queue.offer(head.left);
            if (head.right != null) 
                queue.offer(head.right);
        }
    }

    public static String serialByLevel(Node head) {
        if (head == null) {
            return "#!";
        }
        String res = head.value + "!";
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(head);
        while (!queue.isEmpty()) {
            head = queue.poll();
            if (head.left != null) {
                res += head.left.value + "!";
                queue.offer(head.left);
            } else {
                res += "#!";
            }
            if (head.right != null) {
                res += head.right.value + "!";
                queue.offer(head.right);
            } else {
                res += "#!";
            }
        }
        return res;
    }
}
