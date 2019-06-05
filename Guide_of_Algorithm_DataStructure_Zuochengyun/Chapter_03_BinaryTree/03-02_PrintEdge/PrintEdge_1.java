// https://www.baeldung.com/java-binary-tree
import java.util.*; 

public class PrintEdge_1 {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
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
        //System.out.println(head.left.value);

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
