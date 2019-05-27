import java.util.*; 

public class TreeTraversal_Recursive {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);
        head.right = new TreeNode(3);
        head.right.left = new TreeNode(6);
        head.right.right = new TreeNode(7);

        System.out.println("Pre-Order recursive:");
        preOrderRecur(head);
        System.out.println();

        System.out.println("In-Order recursive:");
        inOrderRecur(head);
        System.out.println();
        
        System.out.println("Post-Order recursive:");
        postOrderRecur(head);
        System.out.println();

        //head = crossHalfList(head);
        //System.out.println("After merge: ");
        //displayTreeNode(head);
    }


    public static void preOrderRecur(TreeNode head) {
        if (head == null) {
            return;
        }

        System.out.print(head.value + " ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }

    public static void inOrderRecur(TreeNode head) {
        if (head == null) {
            return;
        }

        inOrderRecur(head.left);
        System.out.print(head.value + " ");
        inOrderRecur(head.right);
    }

    public static void postOrderRecur(TreeNode head) {
        if (head == null) {
            return;
        }

        postOrderRecur(head.left);
        postOrderRecur(head.right);
        System.out.print(head.value + " ");
    }
}
