/*
 LinkedList.java

 Created by Bill Li on 2016-11-10.
 */

package E12;

public class LinkedList<I extends Comparable> {
    private Node head;

    public boolean add(I item) {
        Node tempNode = this.head;

        if (this.head == null) {
            this.head = new Node(null, new Node<>(item));
            return true;
        }

        while (tempNode.getNext() != null) {
            tempNode = tempNode.getNext();
        }

        Node newNode = new Node<>(item);
        tempNode.setNext(newNode);
        return true;
    }

    // Getting the item from index
    public I get(int index) {
        Node temp = this.head;

        for (int i = -1; i < index; i++) {
            temp = temp.getNext();
        }
        return (I) temp.getItem();
    }

    // Getting the index of an item
    public int indexOf(I item) {
        Node temp = this.head;
        int counter = -1;

        do {
            if (temp.getItem() == item) {
                return counter;
            } else {
                counter++;
                if (temp.getNext() != null) {
                    temp = temp.getNext();
                }
            }
        } while (temp.getNext() != null);

        return -1;
    }

    // Removing an item from the list by index
    public boolean remove(int index) {
        Node temp = this.head;
        int counter = -1;

        if ((index == -1)) {
            this.head = null;
            return true;
        }

        while ((counter < index) && (temp.getNext() != null)) {
            if (index == counter + 1) {
                temp.setNext(temp.getNext().getNext());
                temp.setNext(null);
                return true;
            } else {
                temp = temp.getNext();
            }
        }

        return false;
    }

    // Removing an item from the list by object
    public boolean remove(I item) {
        Node temp = this.head;

        while (temp.getNext() != null) {
            if (temp.getNext() == item) {
                temp.setNext(temp.getNext().getNext());
                temp.setNext(null);
                return true;
            } else {
                temp = temp.getNext();
            }
        }

        return false;
    }

    // Clearing the list
    public void clear() {
        this.head = null;
    }

    // Getting the size of list
    public int size() {
        Node temp = this.head;
        int counter = 0;

        if (temp.getNext() == null) {
            return 0;
        }

        while (temp.getNext() != null) {
            temp = temp.getNext();
            counter++;
        }

        return counter;
    }

    // Sorting the list by alphabetical order if it is all int
    public boolean sort() {
        boolean repeat = true;

        while (repeat) {
            Node temp = this.head;
            repeat = false;

            if (temp.getNext() == null) {
                return false;
            }
            temp = temp.getNext();

            for (int i = 0; i < this.size() - 1; i ++) {
                if ((temp.getNext() != null)) {
                    if (temp.compareTo(temp.getNext().getItem()) > 0 ) {
                        temp.swap(temp.getNext().getItem());
                        temp = temp.getNext();
                        repeat = true;
                    }
                }
            }
        }
        return true;
    }
}