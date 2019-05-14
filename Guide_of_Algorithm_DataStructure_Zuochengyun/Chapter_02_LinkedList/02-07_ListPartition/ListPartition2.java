import java.util.*;

public class ListPartition2 {
    public static void main(String[] args) {
        int[] arr = {7, 9, 1, 8, 5, 2, 5};
        Node head = arrayToNode(arr);

        System.out.println("Initial linkedlist is:");
        displayNode(head);
        System.out.println();

        int pivot = 5;
        head = listPartition2(head, pivot);
        System.out.println("After partition: ");
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

    public static Node listPartition2(Node head, int pivot) {
        if (head == null) {
            return head;
        }

        Node sH = null; //small part head
        Node sT = null; //small part tail
        Node eH = null; //equal part head
        Node eT = null; //equal part tail
        Node bH = null; //big   part head
        Node bT = null; //big   part tail
        Node next = null; // save next node

        // divide all nodes into three list
        while (head != null) {
            next = head.next;
            head.next = null;
            if (head.value < pivot) {
                if (sH == null) {
                    sH = head;
                    sT = head;
                } else {
                    sT.next = head;
                    sT = head;
                }
            } else if (head.value == pivot) {
                if (eH == null) {
                    eH = head;
                    eT = head;
                } else {
                    eT.next = head;
                    eT = head;
                }
            } else {
                if (bH == null) {
                    bH = head;
                    bT = head;
                } else {
                    bT.next = head;
                    bT = head;
                }
            }
            head = next;
        }

        // connect the small and equal parts
        if (sT != null) {
            sT.next = eH;
            eT = eT == null ? sT : eT;
        }

        // connect all
        if (eT != null) {
            eT.next = bH;
        }

        return sH != null ? sH : eH != null ? eH : bH;
    }
}
