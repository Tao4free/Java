import java.util.*; 

public class InsertNodeToCircle_book {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9};
        Node head = arrayToNodeCircle_book(arr);

        System.out.println("Initial linKedlist is:");
        displayNodeCirle(head);
        System.out.println();

        int num = 0;
        head = insertNodeToCircle_book(head, num);
        System.out.println("After insertion: ");
        displayNodeCirle(head);
    }

    public static Node arrayToNodeCircle_book(int[] arr) {
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

    public static Node insertNodeToCircle_book(Node head, int num) {
        Node node = new Node(num);
        if (head == null) {
            node.next = node;
            return node;
        }

        Node pre = head;
        Node cur = head.next;
        while(cur != head) {
            if (pre.value <= num && cur.value >= num) {
                break;
            }
            pre = cur;
            cur = cur.next;
        }
        pre.next = node;
        node.next = cur;
        return head.value < num ? head : node;
    }
}
