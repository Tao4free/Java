// https://www.baeldung.com/java-binary-tree
// https://www.geeksforgeeks.org/print-level-order-traversal-line-line/
import java.util.*; 

public class PrintVisual {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        // add(parent, value, direction:1-left_2-right)
        bt.add(1,1,1);
        bt.add(1,2,1);
        bt.add(2,4,1);
        bt.add(4,7,2);
        bt.add(1,3,2);
        bt.add(3,5,1);
        bt.add(3,6,2);

        Node head = bt.root;

        System.out.println("Breadth-First Search queue:");
        levelOrderQueue(head);
        System.out.println();
    }

    public static int heightOfTree(Node root) {
        if (null == root)
            return 0;
        int hLeftSub = heightOfTree(root.left);
        int hRightSub = heightOfTree(root.right);
        int max = Math.max(hLeftSub, hRightSub) + 1;
        return max;
    }

    public static void levelOrderQueue(Node root) {
        int h = heightOfTree(root);
        char id = 'o';
        Queue<Node> q = new LinkedList<Node>();
        if (root == null)
            return;
        q.add(root);
        while (true) {
            int nodeCount = q.size();
            if (nodeCount == 0) {
                break;
            }

            //while (!q.isEmpty()) {
            while (nodeCount > 0) {
                Node n = (Node) q.remove();
                //System.out.print(id + "-" + n.value + " ");
                System.out.print(" " + n.value + " ");

                //if (n.left != null) {
                //    if (n.right != null) {
                //        id = 'o';
                //    } else {
                //        id = 'l';
                //    }
                //} else if (n.right == null) {
                //    id = 'r';
                //}

                if (n.left != null)
                    q.add(n.left);
                if (n.right != null)
                    q.add(n.right);

                nodeCount--;
                }
            System.out.println();
            }

        }

}
