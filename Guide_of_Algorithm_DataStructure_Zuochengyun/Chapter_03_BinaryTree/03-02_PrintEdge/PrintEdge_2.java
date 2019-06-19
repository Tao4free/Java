// https://www.baeldung.com/java-binary-tree
import java.util.*; 

public class PrintEdge_2 {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        // add(parent, value, direction:1-left_2-right)
        bt.add(1,1,1);
        bt.add(1,2,1);
        bt.add(2,4,2);
        bt.add(4,7,1);
        bt.add(4,8,2);
        bt.add(8,11,2);
        bt.add(11,13,1);
        bt.add(11,14,2);
        bt.add(1,3,2);
        bt.add(3,5,1);
        bt.add(3,6,2);
        bt.add(5,9,1);
        bt.add(5,10,2);
        bt.add(9,12,1);
        bt.add(12,15,1);
        bt.add(12,16,2);

        Node head = bt.root;

        System.out.println("Pre-Order recursive:");
        preOrderRecur(head);
        System.out.println();

        System.out.println("Print edge by rule 2:");
        printEdge_2(head);
        System.out.println();

        //System.out.println("In-Order recursive:");
        //inOrderRecur(head);
        //System.out.println();
        //
        //System.out.println("Post-Order recursive:");
        //postOrderRecur(head);
        //System.out.println();
    }

    public static void preOrderRecur(Node head) {
        if (head == null) {
            return;
        }

        System.out.print(head.value + " ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }

    public static void inOrderRecur(Node head) {
        if (head == null) {
            return;
        }

        inOrderRecur(head.left);
        System.out.print(head.value + " ");
        inOrderRecur(head.right);
    }

    public static void postOrderRecur(Node head) {
        if (head == null) {
            return;
        }

        postOrderRecur(head.left);
        postOrderRecur(head.right);
        System.out.print(head.value + " ");
    }

    public static void printEdge_2(Node head) {
        if (head == null) {
            return;
        }

        System.out.print(head.value + " ");
        if (head.left != null && head.right != null) {
            printLeftEdge(head.left, true);
            printRightEdge(head.right, true);
        } else {
            printEdge_2(head.left != null ? head.left : head.right);
        }
        System.out.println();
    }

    public static void printLeftEdge(Node h, boolean print) {
        if (h == null) {
            return;
        }
        if (print || (h.left == null && h.right == null)) {
            System.out.print(h.value + " ");
        }
        printLeftEdge(h.left, print);
        printLeftEdge(h.right, print && h.left == null ? true : false);
    }

    public static void printRightEdge(Node h, boolean print) {
        if (h == null) {
            return;
        }
        printRightEdge(h.left, print && h.right == null ? true : false);
        printRightEdge(h.left, print);
        if (print || (h.left == null && h.right == null)) {
            System.out.print(h.value + " ");
        }
    }
}
