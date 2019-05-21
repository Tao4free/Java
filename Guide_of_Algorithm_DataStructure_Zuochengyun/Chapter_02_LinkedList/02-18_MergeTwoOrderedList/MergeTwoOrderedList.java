import java.util.*; 

public class MergeTwoOrderedList {
    public static void main(String[] args) {
        int[] arr1 = {0, 2, 3, 7};
        int[] arr2 = {1, 3, 5, 7, 9};
        Node head1 = arrayToNodeCircle(arr1);
        Node head2 = arrayToNodeCircle(arr2);

        System.out.println("Initial linKedlist is:");
        displayNodeCirle(head1);
        displayNodeCirle(head2);
        System.out.println();

        //head = mergeTwoOrderedList(head1, head2);
        //System.out.println("After merge: ");
        //displayNodeCirle(head);
    }

    public static Node arrayToNodeCircle(int[] arr) {
        Node head = new Node(arr[0]);
        Node cur = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            cur.next = temp;
            cur = cur.next;
        }
        cur.next = head;
        return head;
    }

    public static void displayNodeCirle(Node head) {
        Node cur = head;
        System.out.print(cur.value + " ");
        cur = cur.next;
        while (cur != head) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static Node mergeTwoOrderedList(Node head, int num) {

        Node cur = head;
        Node temp = null;
        Node node = new Node(num);
        Node tail = null;

        if (head == null) {
            node.next = node;
            return node;
        }

        cur = cur.next;
        while (cur != head) {
            tail = cur;
            cur = cur.next;
        }

        if (cur.value > num) {
            temp = head;
            head = node;
            head.next = temp;
            tail.next = head;
        }

        if (tail.value < num) {
            tail.next = node;
            node.next = head;
        }

        cur = head.next;
        while (cur != head && cur.next != head) {
            if (cur.value < num && cur.next.value > num) {
                temp = cur.next;
                cur.next = node;
                node.next = temp;
            }
            cur = cur.next;
        }

        return head;
    }
}
