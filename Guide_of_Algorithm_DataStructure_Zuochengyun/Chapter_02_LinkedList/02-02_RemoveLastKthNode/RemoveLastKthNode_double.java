import java.util.*;

public class RemoveLastKthNode_double {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 11, 3, 7};
        //Arrays.sort(arr);

        DoubleNode head = arrayToNode_double(arr);

        System.out.println("Initial LinkedList:");
        displayNode(head);

        System.out.println();
        int lastKth = 7;
        head = removeLastKthNode(head, lastKth);
        System.out.println("After remove last" + lastKth + "th" + " LinkedList:");
        displayNode(head);
    }

    // refer https://www.jianshu.com/p/0d0dbfcbc1c3
    public static DoubleNode arrayToNode_double(int[] arr) {
        DoubleNode head = new DoubleNode(arr[0]);
        DoubleNode other = head;
        DoubleNode last  = head;
        for (int i = 1; i < arr.length; i++) {
            DoubleNode temp = new DoubleNode(arr[i]);
            other.next = temp;
            other = other.next;
            other.last = last;
            last = temp;
        }
        return head;
    }

    public static void displayNode(DoubleNode head) {
        while(head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static DoubleNode removeLastKthNode(DoubleNode head, int lastKth) {
        if (head == null || lastKth < 1) {
            return head;
        }

        DoubleNode cur = head;
        while (cur != null) {
            lastKth --;
            cur = cur.next;
        }

        if (lastKth == 0) {
            head = head.next;
            head.last = null;
        }

        if (lastKth < 0) {
            cur = head;
            while (++lastKth != 0) {
                cur = cur.next;
            }
            DoubleNode newNext = cur.next.next;
            cur.next = newNext;

            if (newNext != null) {
                newNext.last = cur;
            }
        }

        return head;
    }
}
