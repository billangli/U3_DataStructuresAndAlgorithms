/*
 Node.java

 Created by Bill Li on 2016-11-10.
 */

package E12;

public class Node<I> {
    private Node previous;
    private Node next;
    private I item;

    public Node(I item) {
        this.item = item;
        this.next = null;
    }

    public Node(I item, Node next) {
        this.item = item;
        this.next = next;
    }

    public Node(I item, Node previous, Node next) {
        this.item = item;
        this.previous = previous;
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public I getItem() {
        return item;
    }

    public void setItem(I item) {
        this.item = item;
    }

    public int compareTo(Object item) {
        if (item instanceof String) {
            return ((String) this.getItem()).compareTo((String) item);
        } else if (item instanceof Integer) {
//            return (int) this.getItem() - (int) item;
        }
        return 0;
    }

    // Swapping the item in the node
    public void swap(I nextItem) {
        I tempItem = this.getItem();
        this.setItem(nextItem);
        this.getNext().setItem(tempItem);
    }

    // Swapping the order of items by swapping nodes
    public void swapNode() {
        Node tempNode = this.getNext();
        this.setNext(this.getNext().getNext());
        tempNode.setNext(this.getNext().getNext());
        this.getNext().setNext(tempNode);
    }
}
