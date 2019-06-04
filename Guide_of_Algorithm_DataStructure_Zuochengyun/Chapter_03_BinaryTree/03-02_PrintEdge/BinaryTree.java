public class BinaryTree {
    // Root of Binary Tree
    Node root;

    BinaryTree(int value) {
        root = new Node(value);
    }

    BinaryTree() {
        root = null;
    }

    private Node addRecursive(Node cur, int value) {
        if (cur == null) {
            return new Node(value);
        }

        if (value < cur.value) {
            cur.left = addRecursive(cur.left, value);
        } else if (value > cur.value) {
            cur.right = addRecursive(cur.right, value);
        } else {
            // value already exists
            return cur;
        }

        return cur;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }
}
