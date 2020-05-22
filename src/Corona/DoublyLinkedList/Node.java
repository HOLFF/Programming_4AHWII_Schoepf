package Corona.DoublyLinkedList;

public class Node {
    private int value;
    private Node next = null;
    private Node last = null;

    public Node(int value) {
        this.value = value;
    }

    public boolean hasNext() {
        return next != null;
    }

    public Node next() {
        return this.next;
    }

    public boolean hasLast() {
        return last != null;
    }

    public Node last() {
        return this.last;
    }


    public void setNext(Node next) {
        this.next = next;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
