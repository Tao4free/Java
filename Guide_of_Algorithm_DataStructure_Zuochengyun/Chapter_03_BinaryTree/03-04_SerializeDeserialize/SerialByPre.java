import java.util.*;

public class SerialByPre {
    public static void main(String[] arg) {
        Node head = new Node(12);
        head.left = new Node(3);
        head.right = null;
        head.left.left = null;
        head.left.right = null;

        printPre(head);
        System.out.println();

        String res = serialByPre(head);
        System.out.println(res);
    }

    public static void printPre(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.value + " ");
        printPre(head.left);
        printPre(head.right);
    }

    public static String serialByPre(Node head) {
        if (head == null) {
            return "#!";
        }
        String res = head.value + "!";
        res += serialByPre(head.left);
        res += serialByPre(head.right);
        return res;
    }
}
