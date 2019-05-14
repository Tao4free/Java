import java.util.*;

public class CopyListWithRand2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        NodeRand head = arrayToNodeRand(arr);
        head = makeRand(head);

        System.out.println("Initial linkedlist is:");
        displayNodeRand(head);
        System.out.println();

        NodeRand cp = copyListWithRand2(head);
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

    public static NodeRand copyListWithRand2(NodeRand head) {
        if (head == null) {
            return null;
        }

        NodeRand cur = head;
        NodeRand next = null;

        // copy and link to original node
        while (cur != null) {
            next = cur.next;
            cur.next = new NodeRand(cur.value);
            cur.next.next = next;
            cur = next;
        }

        cur = head;
        NodeRand curCopy = null;
        // set rand pointer for copied node
        while (cur != null) {
            next = cur.next.next;
            curCopy = cur.next;
            curCopy.rand = cur.rand != null ? cur.rand.next : null;
            cur = next;
        }

        NodeRand res = head.next;
        cur = head;
        // divide list
        while (cur != null) {
            next = cur.next.next;
            curCopy = cur.next;
            curCopy.next = next != null ? next.next : null;
            cur = next;
        }
        return res;
    }
}
