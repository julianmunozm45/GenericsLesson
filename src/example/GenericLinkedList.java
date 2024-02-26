package example;/*
*
* LinkedList:
            head
              |
              |
             \|/
            +----+------+     +----+------+     +----+------+
            | 1  |  o-------->| 2  |  o-------->| 3  | null |
            +----+------+     +----+------+     +----+------+
* */

public class GenericLinkedList<T> {
    private Node<T> head;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Example usage
    public static void main(String[] args) {
        GenericLinkedList<Integer> intList = new GenericLinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.printList();

        GenericLinkedList<String> stringList = new GenericLinkedList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Generics");
        stringList.printList();
    }
}
