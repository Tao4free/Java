import java.util.*; 

public class SelectionSort_self {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 1, 3, 5, 9, 7};
        Node head = arrayToNode(arr);

        System.out.println("Initial linKedlist is:");
        displayNode(head);
        System.out.println();

        head = selectionSort_self(head);
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

    public static Node selectionSort_self(Node head) {
        Node cur = head;
        Node pre = null;
        Node next = null;
        Node small = null;
        Node smallPre = null;

        // It is important here that when you get the smallest node
        // you should cur it from the list 
        // and add to the tail of sorted part.
        // It's a bad idea to rearrange the whole list
        // Divide problem into small parts!
        while (cur != null) {
            next = cur.next;
            smallPre = getSmallestPreNode(cur);
            small = smallPre == null ? cur : smallPre.next; 
            //System.out.print("small: " + small.value + " | ");
            //System.out.println(small.value);
            head = pre == null ? small : head;

            if (smallPre != null) {
                smallPre.next = small.next;
                small.next = cur;
            }

            if (pre != null) {
                pre.next = small;
            }

            pre = small;
            cur = cur == small ? next : cur;
            //displayNode(cur);
        }

        return head;
    }

    public static Node getSmallestPreNode(Node head) {
        Node cur = head;
        Node pre = null;
        Node smallPre = null;
        int s = head.value;

        while(cur != null) {
            if (cur.value < s) {
                s = cur.value;
                smallPre = pre;
            }
            pre = cur;
            cur = cur.next;
        }

        return smallPre;
    }
}
