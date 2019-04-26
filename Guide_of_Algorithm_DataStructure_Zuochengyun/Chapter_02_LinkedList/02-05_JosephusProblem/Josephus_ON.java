public class Josephus_ON {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Node head = arrayToNode(arr);
        System.out.println("Initial linkedlist is:");
        displayNode(head);
        System.out.println();

        int num = getNum(head);
        System.out.println("Number of linkedlist: " + num);
        System.out.println();

        int m = 3;
        Node survivor = josephus(head, m);
        System.out.println("The survivor: ");
        System.out.println(survivor.value);
    }

    public static Node arrayToNode(int[] arr) {
        Node head = new Node(arr[0]);
        Node cur = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            cur.next = temp;
            cur = cur.next;
        }
        return head;
    }

    public static void displayNode(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static int getNum(Node head) {
        Node cur = head;
        int n = 0;
        while (cur != null) {
            n++;
            cur = cur.next;
        }
        return n;
    }

    public static Node josephus(Node head, int m) {
        if (head == null || head.next == null || m < 1) {
            return head;
        }

        int i = getNum(head);
        int livenum = getLive(i, m);
        //System.out.println("The survivor number is " + i);

        while (--livenum != 0) {
            head = head.next;
        }
        head.next = head;

        return head;
    }

    public static int getLive(int i, int m) {
        if (i == 1) {
            return 1;
        }
        return (getLive(i - 1, m) + m - 1) % i + 1;
    }
}
