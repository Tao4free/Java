import java.util.*;

public class RemoveMidNode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Node head = arrayToNode(arr);
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

    public static Node removeMidNode(Node head) {
        if (head == null || head.next == null ) {
            return head;
        }
    }
}
