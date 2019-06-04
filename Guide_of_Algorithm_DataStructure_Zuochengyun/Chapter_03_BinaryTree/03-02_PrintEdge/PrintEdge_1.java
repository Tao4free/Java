// https://www.baeldung.com/java-binary-tree
import java.util.*; 

public class PrintEdge_1 {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        for (int i = 1; i <= 16; i++) {
            bt.add(i);
        }

        Node head = bt.root;
        System.out.println(head.right.value);

        //BinaryTree head = new BinaryTree(1);
        //head.left = new BinaryTree(2);
        //head.left.left = new BinaryTree(4);
        //head.left.right = new BinaryTree(5);
        //head.right = new BinaryTree(3);
        //head.right.left = new BinaryTree(6);
        //head.right.right = new BinaryTree(7);

        System.out.println("Pre-Order recursive:");
        preOrderRecur(head);
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

    //public static void inOrderRecur(Node head) {
    //    if (head == null) {
    //        return;
    //    }

    //    inOrderRecur(head.left);
    //    System.out.print(head.value + " ");
    //    inOrderRecur(head.right);
    //}

    //public static void postOrderRecur(Node head) {
    //    if (head == null) {
    //        return;
    //    }

    //    postOrderRecur(head.left);
    //    postOrderRecur(head.right);
    //    System.out.print(head.value + " ");
    //}
}
