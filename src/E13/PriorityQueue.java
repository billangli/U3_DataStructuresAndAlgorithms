/*
 PriorityQueue

 Created by Bill Li on 2016-11-15.
 */

package E13;

public class PriorityQueue<I> {
    PriorityNode<I> head = new PriorityNode(null);

    // Checks if the queue is empty
    boolean isEmpty() {
        return (this.head.getNext() == null);
    }

    // Enqueues an item
    void enqueue(I item) {
        PriorityNode temp = this.head;
        boolean repeat = true;

        // Traversing to the end
        while (repeat) {
            repeat = false;
            if (temp.getNext() != null) {
                temp = (PriorityNode) temp.getNext();
                repeat = true;
            }
        }

        PriorityNode nextNode = new PriorityNode(item);
        nextNode.setPrevious(temp);
        temp.setNext(nextNode);
    }

    // Dequeues an item
    I dequeue() {
        PriorityNode<I> temp = this.head;
        boolean repeat = true;
        I item = null;

        // Traversing to the end
        while (repeat) {
            repeat = false;
            if (temp.getNext() != null) {
                temp = (PriorityNode) temp.getNext();
                repeat = true;
            } else {
                item = temp.getItem();
                temp.getPrevious().setNext(null);
            }
        }

        return item;
    }

    // Enqueues an item
    boolean enqueue(I item, int priority) {
        PriorityNode<I> temp = this.head;
        boolean repeat = true;

        // If the queue is empty
        if (temp.getNext() == null) {
            // Insert the node to the one before
            PriorityNode<I> newNode = new PriorityNode<I>(item, priority);
            newNode.setPrevious(temp);
            temp.setNext(newNode);
            return true;
        }

        // Traversing to the end
        while (repeat) {
            repeat = false;
            if (temp.getNext() != null) {
                // Comparing priority
                if (((PriorityNode) temp.getNext()).getPriority() > priority) {
                    // Insert the node to the one before
                    PriorityNode<I> newNode = new PriorityNode<I>(item, priority, temp.getNext());
                    temp.setNext(newNode);
                    return true;
                }

                temp = (PriorityNode) temp.getNext();
                repeat = true;
            }
        }

        // Adding node at the front of queue
        PriorityNode<I> newNode = new PriorityNode<I>(item, priority);
        newNode.setPrevious(temp);
        temp.setNext(newNode);
        return true;
    }
}
