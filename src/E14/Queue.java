/*
 Queue

 Created by Bill Li on 2016-11-15.
 */

package E14;

import E12.Node;

public class Queue<I> {
    Node<I> head = new Node(null);

    // Checks if the queue is empty
    boolean isEmpty() {
        return (this.head.getNext() == null);
    }

    // Enqueues an item
    void enqueue(I item) {
        Node temp = this.head;
        boolean repeat = true;

        // Traversing to the end
        while (repeat) {
            repeat = false;
            if (temp.getNext() != null) {
                temp = temp.getNext();
                repeat = true;
            }
        }

        Node nextNode = new Node(item);
        nextNode.setPrevious(temp);
        temp.setNext(nextNode);
    }

    // Dequeues an item
    I dequeue() {
        Node<I> temp = this.head;
        boolean repeat = true;
        I item = null;

        // Traversing to the end
        while (repeat) {
            repeat = false;
            if (temp.getNext() != null) {
                temp = temp.getNext();
                repeat = true;
            } else {
                item = (I)temp.getItem();
                temp.getPrevious().setNext(null);
            }
        }

        return item;
    }
}
