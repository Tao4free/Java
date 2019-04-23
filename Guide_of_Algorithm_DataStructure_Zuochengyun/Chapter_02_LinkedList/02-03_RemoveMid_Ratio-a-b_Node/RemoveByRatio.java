import java.util.*;

public class RemoveByRatio {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Node head = arrayToNode(arr);
        displayNode(head);

        head = removeByRatio(head,1,5);
        displayNode(head);
    }

    public static Node arrayToNode(int[] arr) {
        Node head = new Node(arr[0]);
        Node cur = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            cur.next = temp;
            cur = cur.next;
        }
        return head;
    }

    public static void displayNode(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static Node removeByRatio(Node head, int a, int b) {
        if (a < 1 || a > b ) {
            return head;
        }

        int n = 0;
        Node cur = head;
        while (cur != null) {
            n++;
            cur = cur.next;
        }

        n = (int) Math.ceil((double) (a * n) / (double) b);
        if (n == 1) {
            head = head.next;
        }

        if (n > 1) {
            cur = head;
            while (--n != 1) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }
}
