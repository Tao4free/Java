import java.util.*;

public class RemoveLastKthNode_single {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 11, 3, 7};
        //Arrays.sort(arr);

        Node head = arrayToNode(arr);

        System.out.println("Initial LinkedList:");
        displayNode(head);

        System.out.println();
        int lastKth = 7;
        head = removeLastKthNode(head, lastKth);
        System.out.println("After remove last" + lastKth + "th" + " LinkedList:");
        displayNode(head);
    }

    // refer https://www.jianshu.com/p/0d0dbfcbc1c3
    public static Node arrayToNode(int[] arr) {
        Node head = new Node(arr[0]);
        Node other = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            other.next = temp;
            other = other.next;
        }
        return head;
    }

    public static void displayNode(Node head) {
        while(head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node removeLastKthNode(Node head, int lastKth) {
        if (head == null || lastKth < 1) {
            return head;
        }

        Node cur = head;
        while (cur != null) {
            lastKth --;
            cur = cur.next;
        }

        if (lastKth == 0) {
            head = head.next;
        }

        if (lastKth < 0) {
            cur = head;
            while (++lastKth != 0) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }

            //System.out.println(head.value + " YES ");
        return head;
    }
}
