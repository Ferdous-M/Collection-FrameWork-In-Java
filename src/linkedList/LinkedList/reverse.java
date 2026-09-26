package linkedList.LinkedList;

public class reverse {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverse(Node head) {

        Node prev = null;
        Node current = head;

        while (current != null) {

           Node next = current.next;
           current.next = prev;
              prev = current;
              current = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        // Create nodes
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Reverse linked list
        head = reverse(head);

        // Print linked list
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}