import java.util.*;

public class ReverseSetK2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        Node head = arrayToNode(arr);

        System.out.println("Initial linKedlist is:");
        displayNode(head);
        System.out.println();

        int K = 3;
        head = reverseSetK2(head, K);
        System.out.println("After reverse: ");
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

    public static Node reverseSetK2(Node head, int K) {
        if (K < 2) {
            return head;
        }

        Node cur = head;
        Node start = null;
        Node pre = null;
        Node next = null;
        Node last = null;
        int count = 1;
        while (cur != null) {
            next = cur.next;
            if (count == K) {
                last = start == null ? head : start;
                start = pre == null ? head : pre;
                head = pre == null ? cur : head;
                pre = cur.next;
                System.out.println(start.value + " " + next.value);
                resign2(start, next, last, cur);
                count = 0;
                //break;
            }
            count++;
            cur = next;
        }

        return head;
    }

    public static void resign2(Node start, Node next, Node last, Node cur) {
        Node pre = next;
        Node pos = null;
        while (start != next) {
            pos = start.next;
            start.next = pre;
            pre = start;
            start = pos;
        }
        last.next = cur;
    }
}
