import java.util.*; 

public class CrossHalfList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Node head = arrayToNode(arr);

        System.out.println("Initial linKedlist is:");
        displayNode(head);
        System.out.println();

        head = crossHalfList(head);
        System.out.println("After merge: ");
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

    public static Node crossHalfList(Node head) {
        Node left = head;
        Node mid = head;
        Node right = head;
        Node nl = null;
        Node nr = null;

        if (left.next == null || left.next.next == null) {
            return head;
        }

        while (right.next != null && right.next.next != null) {
            mid = mid.next;
            right = right.next.next;
        }
        System.out.println(mid.value);

        mid = right.next == null ? mid : mid.next;
        right = mid;
        while (left.next != mid) {
            nl = left.next;
            nr = right.next;
            left.next = right;
            right.next = nl;
            left = nl;
            right = nr;
        }
        left.next = right;

        return head;
    }
}
