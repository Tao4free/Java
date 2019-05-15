import java.util.*;

public class ReverseSetK1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        Node head = arrayToNode(arr);

        System.out.println("Initial linKedlist is:");
        displayNode(head);
        System.out.println();

        int K = 3;
        head = reverseSetK1(head, K);
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

    public static Node reverseSetK1(Node head, int K) {
        if (K < 2) {
            return head;
        }

        Stack<Node> stack = new Stack<Node>();
        Node newHead = head;
        Node cur = head;
        Node pre = null;
        Node next = null;
        while (cur != null) {
            next = cur.next;
            stack.push(cur);
            if (stack.size() == K) {
                pre = resign1(stack, pre, next);
                newHead = newHead == head ? cur : newHead;
            }
            cur = next;
        }

        return newHead;
    }

    public static Node resign1(Stack<Node> stack, Node left, Node right) {
        Node cur = stack.pop();
        if (left != null) {
            left.next = cur;
        }
        Node next = null;
        while (!stack.isEmpty()) {
            next = stack.pop();
            cur.next = next;
            cur = next;
        }
        cur.next = right;
        return cur;
    }
}
