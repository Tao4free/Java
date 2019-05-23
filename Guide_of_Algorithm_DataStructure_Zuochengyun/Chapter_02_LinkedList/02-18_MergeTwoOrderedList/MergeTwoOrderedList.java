import java.util.*; 

public class MergeTwoOrderedList {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 7};
        int[] arr2 = {0, 3, 5, 7, 9};
        Node head1 = arrayToNode(arr1);
        Node head2 = arrayToNode(arr2);

        System.out.println("Initial linKedlist is:");
        displayNode(head1);
        displayNode(head2);
        System.out.println();

        head1 = mergeTwoOrderedList(head1, head2);
        System.out.println("After merge: ");
        displayNode(head1);
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

    public static Node mergeTwoOrderedList(Node head1, Node head2) {

        Node cur1 = head1;
        Node cur2 = head2;
        Node pre = null;
        Node next = null;

        if (cur1 == null || cur2 == null) {
            return cur1 == null ? cur2 : cur1;
        }

        while (cur1 != null || cur2 != null) {
            if (cur1 == null) {
                pre.next = cur2;
                return head1;
            }
            if (cur2 == null) {
                return head1;
            }

           if (cur1.value <= cur2.value) {
               pre = cur1;
               cur1 = cur1.next;
           } else {
               pre = pre == null ? cur2 : pre;
               next = cur2.next;
               cur2.next = cur1;
               pre.next = cur2 == head2 ? cur1 : cur2 ;
               cur2 = next;
           }
           //System.out.println("pre : " + pre.value + " cur2 : " + cur2.value + " cur1 : " + cur1.value); 
        }

        return head1;
    }
}
