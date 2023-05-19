package homeWork6.task1;

public class DoublyLinkedList {

    private Node head;

    private Node tail;

    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void remove(int data) {
        Node current = head;
        while(current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                size--;
                break;
            }
            current = current.next;
        }
    }

    public boolean contains(int data) {
        Node current = head;
        while(current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void display() {
        Node current = head;
        System.out.print("[ ");
        while(current != null) {
            if (current.next == null) {
                System.out.println(current.data + " ]");
                break;
            }
            System.out.print(current.data + ", ");
            current = current.next;
        }
    }
}
