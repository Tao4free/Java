import java.util.*;

public class GetMaxLength {
    public static void main(String[] arg) {
        Node head = new Node(-3);
        head.left = new Node(3);
        head.left.left = new Node(1);
        head.left.right = new Node(0);
        head.left.left.left = null;
        head.left.left.right = null;
        head.left.right.left = new Node(1);
        head.left.right.right = new Node(6);
        head.left.right.left.left = null;
        head.left.right.left.right = null;
        head.left.right.right.left = null;
        head.left.right.right.right = null;

        head.right = new Node(-9);
        head.right.left = new Node(2);
        head.right.right = new Node(1);
        head.right.left.left = null;
        head.right.left.right = null;
        head.right.right.left = null;
        head.right.right.right = null;

        System.out.println("Initial binary tree(PreOrder) is");
        printPre(head);
        System.out.println("\n");

        int sum = -9;
        int maxLen = getMaxLength(head, sum);
        System.out.println("Max length of Sum " + sum + " is " + maxLen);
    }


    public static void printPre(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.value + " ");
        printPre(head.left);
        printPre(head.right);
    }

    public static int getMaxLength(Node head, int sum) {
        HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
        sumMap.put(0, 0); // IMPORTANT
        return preOrder(head, sum, 0, 1, 0, sumMap);
    }

    public static int preOrder(Node head, int sum, int preSum, int level, int maxLen, HashMap<Integer, Integer> sumMap) {
        if (head == null) {
            return maxLen;
        }
        int curSum = preSum + head.value;
        if (!sumMap.containsKey(curSum)) {
            sumMap.put(curSum, level);
        }
        if (sumMap.containsKey(curSum - sum)) {
            maxLen = Math.max(level - sumMap.get(curSum - sum), maxLen);
        }
        maxLen = preOrder(head.left, sum, curSum, level + 1, maxLen, sumMap);
        maxLen = preOrder(head.right, sum, curSum, level + 1, maxLen, sumMap);
        if (level == sumMap.get(curSum)) {
            sumMap.remove(curSum);
        }
        return maxLen;
    }
}
