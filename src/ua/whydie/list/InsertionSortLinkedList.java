package ua.whydie.list;

public class InsertionSortLinkedList {

    public static Node insertionSort(Node head) {
        Node sorted = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            sorted = sortedInsert(sorted, current);
            current = nextNode;
        }

        return sorted;
    }

    private static Node sortedInsert(Node sorted, Node newNode) {
        if (sorted == null || sorted.data >= newNode.data) {
            newNode.next = sorted;
            return newNode;
        }

        Node current = sorted;
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;

        return sorted;
    }
}
