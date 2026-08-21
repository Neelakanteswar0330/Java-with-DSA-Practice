public class CircularLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insertAtEnd(Node head, int data) {
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

    static Node delete(Node head, int data) {
        if (head == null) {
            return null;
        }

        Node current = head;
        Node previous = null;

        do {
            if (current.data == data) {
                if (current == head && current.next == head) {
                    return null;
                }

                if (current == head) {
                    Node last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    previous.next = current.next;
                }
                return head;
            }

            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println(data + " was not found.");
        return head;
    }

    static void printList(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
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
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);

        System.out.print("After insertion: ");
        printList(head);

        head = delete(head, 10);
        System.out.print("After deleting 10: ");
        printList(head);
    }
}