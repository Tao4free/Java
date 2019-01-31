//Source:https://www.hackerrank.com/challenges/reverse-a-linked-list/forum
//       https://www.geeksforgeeks.org/reverse-a-linked-list/
//       https://www.journaldev.com/23035/reverse-a-linked-list

class LinkedList { 
  
    static Node head; 
  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 

    //Node Reverse(Node head) {
    //
    //    if (head == null || head.next == null) {  
    //        return head;  
    //    }
    //    
    //    Node remaining = Reverse(head.next);
    //    
    //    head.next.next = head; 
    //    
    //    head.next = null;  
    //    
    //    return remaining; 
    //}


    //// prints content of double linked list 
    //void printList(Node node) { 
    //    while (node != null) { 
    //        System.out.print(node.data + " "); 
    //        node = node.next; 
    //    } 
    //} 

    public static void main(String[] args) { 
        LinkedList list = new LinkedList(); 
        list.head = new Node(1); 
        list.head.next = new Node(2); 
        list.head.next.next = new Node(3); 
        list.head.next.next.next = new Node(4); 
        list.head.next.next.next.next = new Node(5); 
        list.head.next.next.next.next.next = new Node(6); 
        list.head.next.next.next.next.next.next = new Node(7); 
        list.head.next.next.next.next.next.next.next = new Node(8); 
  
        System.out.println("Original Linked list "); 
        //list.printList(head); 
        //Node res = list.Reverse(head); 
        //System.out.println(""); 
        //System.out.println(""); 
        //System.out.println("Reversed linked list "); 
        //list.printList(res); 
    }
} 
