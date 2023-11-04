package homeWork6.task1;
import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private Node head;

    private Node tail;

    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node getHead() {
        return head;
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
    public class ListIterator implements java.util.ListIterator<Integer> {

        private Node current;

        private Node lastAccessed;

        private int currentIndex;

        public ListIterator(Node current, int currentIndex) {
            this.current = current;
            this.lastAccessed = null;
            this.currentIndex = currentIndex;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            } else {
                int data = lastAccessed.data;
                lastAccessed = current;
                current = current.next;
                currentIndex++;
                return data;
            }
        }

        @Override
        public boolean hasPrevious() {
            return current.prev != null;
        }

        @Override
        public Integer previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            } else {
                int data = current.data;
                lastAccessed = current;
                current = current.prev;
                currentIndex--;
                return data;
            }
        }

        @Override
        public int nextIndex() {
            return currentIndex;
        }

        @Override
        public int previousIndex() {
            return currentIndex - 1;
        }

        @Override
        public void remove() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            lastAccessed = null;
            current = current.prev;
            currentIndex--;
        }

        @Override
        public void set(Integer integer) {
            if (lastAccessed == null) {
                throw new IllegalStateException();
            }
            lastAccessed.data = integer;
        }

        @Override
        public void add(Integer integer) {
            Node newNode = new Node(integer);
            if (current == null) {
                if (size == 0) {
                    head = newNode;
                    tail = newNode;
                } else {
                    throw new IllegalStateException();
                }
            } else if (current.next != null) {
                newNode.next = current.next;
                current.next.prev = newNode;
            } else {
                tail = newNode;
            }
            newNode.prev = current;
            current.next = newNode;
            current = newNode;
            lastAccessed = null;
            size++;
            currentIndex++;
        }
    }
}
