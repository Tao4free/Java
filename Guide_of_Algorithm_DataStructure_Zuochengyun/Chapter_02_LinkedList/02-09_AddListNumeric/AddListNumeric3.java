import java.util.*;

public class AddListNumeric3 {
    public static void main(String[] args) {
        int[] arr1 = {9, 3, 7};
        int[] arr2 = {6, 3};
        Node head1 = arrayToNode(arr1);
        Node head2 = arrayToNode(arr2);

        System.out.println("Initial linkedlist is:");
        displayNode(head1);
        displayNode(head2);
        System.out.println();

        Node head3 = addListNumeric3(head1, head2);
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

    public static Node addListNumeric3(Node head1, Node head2) {
        Node node = null;
        String s1 = "";
        String s2 = "";
        String s = "";
        int n1 = 0; 
        int n2 = 0; 
        int n = 0;

        while (head1 != null) {
            s1 = s1 + String.valueOf(head1.value);
            head1 = head1.next;
        }

        while (head2 != null) {
            s2 = s2 + String.valueOf(head2.value);
            head2 = head2.next;
        }

        n1 = Integer.valueOf(s1);
        n2 = Integer.valueOf(s2);
        n = n1 + n2;
        s = String.valueOf(n);

        String[] charArr = s.split("");
        //System.out.println(charArr.length);

        node = new Node(Integer.valueOf(charArr[0]));
        Node cur = node;
        for (int i = 1; i < charArr.length; i++) {
            cur.next = new Node(Integer.valueOf(charArr[i]));
            cur = cur.next;
        }
        cur.next = null;

        return node;
    }
}
