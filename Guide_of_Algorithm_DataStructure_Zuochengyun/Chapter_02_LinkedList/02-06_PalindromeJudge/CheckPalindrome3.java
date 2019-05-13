public class CheckPalindrome3 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 3, 5, 1};
        Node head = arrayToNode(arr);

        System.out.println("Initial linkedlist is:");
        displayNode(head);
        System.out.println();

        boolean res = isPalindrome3(head);
        System.out.println("Judge of palindrome: ");
        System.out.println(res);
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

    public static boolean isPalindrome3(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node n1 = head;
        Node n2 = head;
        while (n1.next != null && n2.next.next != null) { // find middle ndoe
            n1 = n1.next; // n1 ->  middle node
            n2 = n2.next.next; // n2 -> end of linkedlist
        }

        n2 = n1.next; // n2 -> node right to the middle
        n1.next = null; // mid.next -> null
        Node n3 = null;
        while (n2 != null ) { // reverse right part
            n3 = n2.next; // n3 -> save next
            n2.next = n1; // relink current one to previous one
            n1 = n2; // update the previous with current one
            n2 = n3; // update the current one with next one
        }

        n3 = n1; // save the last node
        n2 = head; // relink to the head
        boolean res = true;
        while (n1 != null && n2 != null) { // check palindrome
            if (n1.value != n2.value) {
                res = false;
                break;
            }
            n1 = n1.next; // right to mid
            n2 = n2.next; // left to mid
        }

        n1 = n3.next; // asign the previous node to the end
        n3.next = null;
        while (n1 != null) { // restore linkedlist
            n2 = n1.next; // save the previous one
            n1.next = n3; // relink the current to the next
            n3 = n1; // update the next with the current
            n1 = n2; // update the current with the previous
        }

        return res;
    }
}
