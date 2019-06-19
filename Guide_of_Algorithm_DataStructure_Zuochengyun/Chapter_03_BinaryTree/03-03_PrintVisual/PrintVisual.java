// https://www.baeldung.com/java-binary-tree
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

        System.out.println("Pre-Order recursive:");
        preOrderRecur(head);
        System.out.println();

        System.out.println("Print edge by rule 1:");
        printVisual(head);
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

    public static void printVisual(Node head) {
        if (head == null) {
            return;
        }

        // get the height of binary tree
        //int height = getHeight(head, 0);
        int height = heightOfTree(head);
        //System.out.println("height is " + height);

        // set edge map store left and right nodes
        Node [][] edgeMap = new Node[height][2];
        setEdgeMap(head, 0, edgeMap);
        //for (int i = 0; i < height; i ++) {
        //    System.out.println("height = " + i + " " + edgeMap[i][0].value + " " + edgeMap[i][1].value);
        //}

        // print left edge
        for (int i = 0; i != edgeMap.length; i++) {
            System.out.print(edgeMap[i][0].value + " ");
        }

        // print leaf node exclude left and right edges
        printLeafNotInMap(head, 0, edgeMap);

        // print right edge exclude left edges
        for (int i = edgeMap.length - 1; i != -1; i--) {
            if (edgeMap[i][0] != edgeMap[i][1]) {
                System.out.print(edgeMap[i][1].value + " ");
            }
        }
        System.out.println();
    }

    public static int getHeight(Node h, int l) {
        if (h == null) {
            return l;
        }
        return Math.max(getHeight(h.left, l + 1), getHeight(h.right, l + 1));
    }

	public static int heightOfTree(Node root) {
		if (null == root)
			return 0;
		int hLeftSub = heightOfTree(root.left);
		int hRightSub = heightOfTree(root.right);
        //System.out.println("root : " + root.value +  " hLeftSub : " + hLeftSub + " hRightSub : " + hRightSub);
        int max = Math.max(hLeftSub, hRightSub) + 1;
		return max;
    }

    public static void setEdgeMap(Node h, int l, Node[][] edgeMap) {
        if (h == null) {
            return;
        }
        edgeMap[l][0] = edgeMap[l][0] == null ? h : edgeMap[l][0];
        edgeMap[l][1] = h;
        setEdgeMap(h.left, l + 1, edgeMap);
        setEdgeMap(h.right, l + 1, edgeMap);
    }

    public static void printLeafNotInMap(Node h, int l, Node[][] m) {
        if (h == null) {
            return;
        }

        if (h.left == null && h.right == null && h != m[l][0] && h != m[l][1]) {
            System.out.print(h.value + " ");
        }
        printLeafNotInMap(h.left, l + 1, m);
        printLeafNotInMap(h.right, l + 1, m);
    }
}
