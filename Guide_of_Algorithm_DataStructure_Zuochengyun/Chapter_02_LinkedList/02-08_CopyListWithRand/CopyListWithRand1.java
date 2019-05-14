import java.util.*;

public class CopyListWithRand1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        NodeRand head = arrayToNodeRand(arr);
        head = makeRand(head);

        System.out.println("Initial linkedlist is:");
        displayNodeRand(head);
        System.out.println();

        NodeRand cp = copyListWithRand1(head);
        System.out.println("After copy: ");
        displayNodeRand(cp);
        //System.out.println(cp.next.next.rand.value);
    }

    public static NodeRand arrayToNodeRand(int[] arr) {
        NodeRand head = new NodeRand(arr[0]);
        NodeRand cur = head;
        for (int i = 1; i < arr.length; i++) {
            NodeRand temp = new NodeRand(arr[i]);
            cur.next = temp;
            cur = cur.next;
        }
        return head;
    }

    public static NodeRand makeRand(NodeRand head) {
        NodeRand cur = head;
        int i = 0;
        while (cur != null) {
            i++;
            if (i == 1) {
                cur.rand = cur.next.next;
            } else if (i == 2) {
                cur.rand = null;
            } else {
                cur.rand = head;
            }
            cur = cur.next;
        }
        return head;
    }

    public static void displayNodeRand(NodeRand head) {
        NodeRand cur = head;
        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static NodeRand copyListWithRand1(NodeRand head) {
        HashMap<NodeRand, NodeRand> map = new HashMap<NodeRand, NodeRand>();
        NodeRand cur = head;
        while (cur != null) {
            map.put(cur, new NodeRand(cur.value));
            cur = cur.next;
        }

        cur = head;
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).rand = map.get(cur.rand);
            cur = cur.next;
        }
        return map.get(head);
    }
}
