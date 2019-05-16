import java.util.*; 

public class BinTreeToDoubleList1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 2, 1};
        Node head = arrayToNode(arr);

        System.out.println("Initial linKedlist is:");
        displayNode(head);
        System.out.println();

        int rmV = 4;
        head = binTreeToDoubleList1(head, rmV);
        System.out.println("After reverse: ");
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

    public static Node binTreeToDoubleList1(Node head, int rmV) {
        if (head == null) {
            return head;
        }

        Node cur = head;
        Node pre = head;
        Node next = null;
        while (cur != null) {
            next = cur.next;
            if (cur.value == rmV) {
                if (cur == head) {
                    head = next;
                    pre = head;
                } else {
                    pre.next = next;
                }
            } else {
                pre = cur;
            }
            cur = next;
        }

        return head;
    }
}
