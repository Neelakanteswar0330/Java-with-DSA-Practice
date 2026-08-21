class Traversal {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static void traverse(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        System.out.print("Forward Traversal: ");

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");

        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }

        System.out.print("Reverse Traversal: ");

        while (tail != null) {
            System.out.print(tail.data + " <-> ");
            tail = tail.prev;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(40);

        head.next = new Node(10);
        head.next.prev = head;

        head.next.next = new Node(50);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(20);
        head.next.next.next.prev = head.next.next;

        head.next.next.next.next = new Node(30);
        head.next.next.next.next.prev = head.next.next.next;

        traverse(head);
    }
}