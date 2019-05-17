import java.util.*; 

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 1, 3, 5, 9, 7};
        Node head = arrayToNode(arr);

        System.out.println("Initial linKedlist is:");
        displayNode(head);
        System.out.println();

        head = selectionSort(head);
        System.out.println("After selection sort: ");
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

    public static Node selectionSort(Node head) {
        Node tail = null; // tail of sorted part
        Node cur  = head; // head of unsorted part
        Node smallPre  = null; // previous node of the smallest node
        Node small = null;

        while (cur != null) {
            small = cur;
            smallPre = getSmallestPreNode(cur);
            if (smallPre != null) {
                small = smallPre.next;
                smallPre.next = small.next;
            }
            cur = cur == small ? cur.next : cur;
            if (tail == null) {
                head = small;
            } else {
                tail.next = small;
            }
            tail = small;
        }
        return head;
    }

    public static Node getSmallestPreNode(Node head) {
        Node smallPre = null;
        Node small = head;
        Node pre = head;
        Node cur = head.next;

        while (cur != null) {
            if (cur.value < small.value) {
                smallPre = pre;
                small = cur;
            }
            pre = cur;
            cur = cur.next;
        }
        return smallPre;
    }
}
