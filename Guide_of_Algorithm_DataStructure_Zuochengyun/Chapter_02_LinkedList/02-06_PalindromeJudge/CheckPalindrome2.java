import java.util.*;

public class CheckPalindrome2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, 3, 5, 1};
        Node head = arrayToNode(arr);

        System.out.println("Initial linkedlist is:");
        displayNode(head);
        System.out.println();

        boolean res = isPalindrome2(head);
        System.out.println("Judge of palindrome: ");
        System.out.println(res);
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

    public static boolean isPalindrome2(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node cur = head;
        Node right = head.next;
        while (cur.next != null && cur.next.next != null) {
            right = right.next;
            cur = cur.next.next;
        }

        Stack<Node> stack = new Stack<Node>();
        while (right != null) {
            stack.push(right);
            right = right.next;
        }

        while (!stack.isEmpty()) {
            if (head.value != stack.pop().value) {
                return false;
            }
            head = head.next;
        }

        return true;
    }
}
