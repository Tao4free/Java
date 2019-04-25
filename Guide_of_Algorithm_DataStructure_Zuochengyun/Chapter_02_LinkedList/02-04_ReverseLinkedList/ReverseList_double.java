public class ReverseList_double {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 6, 8};
        DoubleNode head = arrayToNode(arr);

        System.out.println("Initial linkedlist is:");
        displayNode(head);
        System.out.println();

        head = reverseList(head);
        System.out.println("After reversion:");
        displayNode(head);
    }

    public static DoubleNode arrayToNode(int[] arr) {
        DoubleNode head = new DoubleNode(arr[0]);
        DoubleNode cur  = head;
        DoubleNode last = null;
        for (int i = 1; i < arr.length; i++) {
            DoubleNode temp = new DoubleNode(arr[i]);
            cur.last = last;
            last = cur;
            cur.next = temp;
            cur = cur.next;
        }
        return head;
    }

    public static void displayNode(DoubleNode head) {
       DoubleNode cur = head;
        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static DoubleNode reverseList(DoubleNode head) {
        DoubleNode pre = null;
        DoubleNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }

        return pre;
    }
}
