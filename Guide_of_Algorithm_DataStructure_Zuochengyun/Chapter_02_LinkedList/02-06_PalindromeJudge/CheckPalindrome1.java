import java.util.*;

public class CheckPalindrome1 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 3, 5, 1};
        Node head = arrayToNode(arr);

        System.out.println("Initial linkedlist is:");
        displayNode(head);
        System.out.println();

        boolean res = isPalindrome1(head);
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

    public static boolean isPalindrome1(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node cur = head;
        Stack<Node> stack = new Stack<Node>();
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }

        while (head != null) {
            if (head.value != stack.pop().value) {
                return false;
            }
            head = head.next;
        }

        return true;
    }
}
