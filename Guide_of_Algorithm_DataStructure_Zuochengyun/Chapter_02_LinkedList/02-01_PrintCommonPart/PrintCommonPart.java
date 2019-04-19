import java.util.*;

public class PrintCommonPart {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6,  8, 11,  3, 7};
        int[] arr2 = {5, 9, 3, 10,  1, 13, 4};
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        Node head1 = arrayToNode(arr1);
        Node head2 = arrayToNode(arr2);

        System.out.println("First LinkedList:");
        displayNode(head1);
        System.out.println("Second LinkedList:");
        displayNode(head2);

        System.out.println();
        printCommonPart(head1, head2);
    }

    public static Node arrayToNode(int[] arr) {
        Node head = new Node(arr[0]);
        Node other = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            other.next = temp;
            other = temp;
        }
        return head;
    }

    public static void displayNode(Node head) {
        while(head.next != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void printCommonPart(Node head1, Node head2) {
        System.out.print("Common Part: ");
        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                head1 = head1.next;
            } else if (head1.value > head2.value) {
                head2 = head2.next;
            } else {
                System.out.print(head1.value + " ");
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        System.out.println();
    }
}
