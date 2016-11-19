/*
 Queue
 Created by Bill Li on 2016-11-15.
 */

package E13;

import E12.Node;

public class Queue<I> {
    Node<I> head;

    // Checks if the queue is empty
    boolean isEmpty() {
        return (this.head == null);
    }

    // Enqueues an item
    boolean enqueue(I item) {
        Node temp = this.head;
        boolean repeat = true;

        // If head is null
        if (this.head == null) {
            this.head = new Node<I>(item);
            return true;
        }

        // Traversing to the end
        while (repeat) {
            repeat = false;
            if (temp.getNext() != null) {
                temp = temp.getNext();
                repeat = true;
            }
        }

        Node nextNode = new Node<I>(item);
        nextNode.setPrevious(temp);
        temp.setNext(nextNode);
        return true;
    }

    // Dequeues an item
    I dequeue() {
        Node<I> temp = this.head;
        this.head = temp.getNext();
        return temp.getItem();
    }
}