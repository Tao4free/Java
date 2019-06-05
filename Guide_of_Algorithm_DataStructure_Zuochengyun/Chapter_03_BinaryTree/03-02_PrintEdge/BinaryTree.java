import java.util.*;

public class BinaryTree {
    // Root of Binary Tree
    Node root;
    Node cur;

    BinaryTree(int value) {
        root = new Node(value);
    }

    BinaryTree() {
        root = null;
    }

    public void add(int parent, int value, int side) {
        //Node cur = null;

        if (root == null) {
            root = new Node(value);
            return;
        } else {
            cur = preOrderRecur(root, parent, value);
        }
        if (cur == null) {
            return;
        }
        //System.out.println("Cur = " + cur.value);

        if (side == 1 && cur.left == null) {
            cur.left = new Node(value);
            //System.out.println("Cur = " + cur.value + " cur.left " + cur.left.value);
        }
        if (side == 2 && cur.right == null) {
            cur.right = new Node (value);
            //System.out.println("Cur = " + cur.value + " cur.right " + cur.right.value);
        }
    }

    private Node preOrderRecur(Node root, int parent, int value) {
        //Node cur = null;

        if (root == null) {
            return null;
        } else if (root.value == parent) {
            cur = root;
            //System.out.println("parent is " + cur.value);
        }
        //System.out.println("Test: ");// + cur.value);

        preOrderRecur(root.left, parent, value);
        preOrderRecur(root.right, parent, value);

        // Method with stack
        //if (root == null) {
        //    return null;
        //}

        //Stack<Node> stack = new Stack<Node>();
        //stack.add(root);
        //while ( !stack.isEmpty() ) {
        //    root = stack.pop();
        //    if (root.value == value) {
        //        cur = null;
        //        break;
        //    }
        //    if (root.value == parent) {
        //        cur = root;
        //        //System.out.println("parent is " + cur.value);
        //        break;
        //    }

        //    if (root.right != null) {
        //        stack.push(root.right);
        //    }
        //    if (root.left != null) {
        //        stack.push(root.left);
        //    }
        //}

        return cur;
    }
}
