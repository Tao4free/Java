public class ReverseList_singlePart {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 6, 8, 9};
        Node head = arrayToNode(arr);

        System.out.println("Initial linkedlist is:");
        displayNode(head);
        System.out.println();

        int from = 2;
        int to = 5;
        head = reverseListPart(head, from, to);
        System.out.println("After Partreversion:");
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

    public static Node reverseListPart(Node head, int from, int to) {
        int len = 0;
        Node cur = head;
        Node pre = null;
        Node pos = null;
        while (cur != null) {
            len++;
            pre = len == from - 1 ? cur : pre;
            pos = len == to   + 1 ? cur : pos;
            cur = cur.next;
        }

        if (from > to || from < 1 || to > len) {
            return head;
        }

        Node next = null; 
        cur = pre.next;
        for (int i = from; i <= to; i++) {
            next = cur.next;
            cur.next = pos;
            pos = cur;
            cur = next;
        }

        pre.next = pos;

        return head;
    }
}
