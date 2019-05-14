import java.util.*;

public class AddListNumeric1 {
    public static void main(String[] args) {
        int[] arr1 = {9, 3, 7};
        int[] arr2 = {6, 3};
        Node head1 = arrayToNode(arr1);
        Node head2 = arrayToNode(arr2);

        System.out.println("Initial linkedlist is:");
        displayNode(head1);
        displayNode(head2);
        System.out.println();

        Node head3 = addListNumeric1(head1, head2);
        System.out.println("After addition: ");
        displayNode(head3);
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

    public static Node addListNumeric1(Node head1, Node head2) {
        // Declare new stack and create new instance
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        // Push linkedlist to stack
        while (head1 != null) {
            s1.push(head1.value);
            head1 = head1.next;
        }
        while (head2 != null) {
            s2.push(head2.value);
            head2 = head2.next;
        }

        int ca = 0; // carry
        int n1 = 0; // one digit
        int n2 = 0; // another digit
        int n = 0;  // addition digit

        // Do the addition
        Node node = null;
        Node pre = null;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            n1 = s1.isEmpty() ? 0 : s1.pop();
            n2 = s2.isEmpty() ? 0 : s2.pop();
            n = n1 + n2 + ca;
            pre = node;
            node = new Node(n % 10);
            node.next = pre;
            ca = n / 10;
        }
        // If there is carry make a new node for it
        if (ca == 1) {
            pre = node;
            node = new Node(1);
            node.next = pre;
        }
        return node;
    }
}
