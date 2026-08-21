public class CircularLinkedListSearch {
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

    static boolean search(Node head, int target) {
        if (head == null) {
            return false;
        }

        Node current = head;
        do {
            if (current.data == target) {
                return true;
            }
            current = current.next;
        } while (current != head);

        return false;
    }

    public static void main(String[] args) {
        Node head = null;
        head = add(head, 10);
        head = add(head, 20);
        head = add(head, 30);

        int target = 20;
        System.out.println(target + (search(head, target) ? " was found." : " was not found."));
    }
}