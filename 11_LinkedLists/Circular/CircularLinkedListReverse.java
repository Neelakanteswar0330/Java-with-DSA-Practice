public class CircularLinkedListReverse {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node add(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = head;
        return head;
    }

    static Node reverse(Node head) {
        if (head == null || head.next == head) {
            return head;
        }

        Node previous = null;
        Node current = head;
        Node next;

        do {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        } while (current != head);

        head.next = previous;
        return previous;
    }

    static void printList(Node head) {
        if (head == null) {
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("back to head");
    }

    public static void main(String[] args) {
        Node head = null;
        head = add(head, 10);
        head = add(head, 20);
        head = add(head, 30);

        System.out.print("Before reverse: ");
        printList(head);
        head = reverse(head);
        System.out.print("After reverse: ");
        printList(head);
    }
}