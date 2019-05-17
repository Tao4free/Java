import java.util.*; 

public class StrangeRemoveNode {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 1, 3, 5, 9, 7};
        Node head = arrayToNode(arr);

        System.out.println("Initial linKedlist is:");
        displayNode(head);
        System.out.println();

        Node del = head.next.next;

        strangeRemoveNode(del);
        System.out.println("After remove: ");
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

    public static void strangeRemoveNode(Node del) {
        if (del == null) {
            return;
        }

        Node cur = del;
        Node next = del.next;

        if (next == null) {
            throw new RuntimeException("can not remove last node.");
        }
        cur.value = next.value;
        cur.next = next.next;


    }
}
