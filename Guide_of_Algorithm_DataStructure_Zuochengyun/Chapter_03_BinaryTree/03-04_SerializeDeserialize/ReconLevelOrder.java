import java.util.*;

public class ReconLevelOrder {
    public static void main(String[] arg) {
        String preStr = "1!2!3!4!#!#!5!#!#!#!#";
        Node head = reconByLevelString(preStr);

        printLevel(head);
        System.out.println();
    }

    public static Node reconByLevelString(String preStr) {
        String[] values = preStr.split("!");
        int index = 0;
        Node head = generateNodeByString(values[index++]);
        Queue<Node> queue = new LinkedList<Node>();
        if (head != null) {
            queue.offer(head);
        }
        Node node = null;
        while (!queue.isEmpty()) {
            node = queue.poll();
            node.left = generateNodeByString(values[index++]);
            node.right = generateNodeByString(values[index++]);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return head;
    }

    public static Node generateNodeByString(String val) {
        if (val.equals("#")) {
            return null;
        }
        return new Node(Integer.valueOf(val));
    }

    public static void printLevel(Node head) {
        if (head == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(head);
        while (!queue.isEmpty()) {
            head = queue.poll();
            System.out.print(head.value + " ");
            if (head.left != null) {
                queue.offer(head.left);
            }
            if (head.right != null) {
                queue.offer(head.right);
            }
        }
    }
}
