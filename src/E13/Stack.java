/*
 Stack

 Created by Bill Li on 2016-11-15.
 */

package E13;

import E12.Node;

public class Stack<I> {
    private Node<I> head = new Node<I>(null);

    public void push(I item) {
        Node temp = this.head.getNext();
        Node<I> newNode = new Node<I>(item, temp);
        this.head.setNext(newNode);
    }

    public I pop() {
        Node<I> temp = this.head.getNext();
        this.head.setNext(temp.getNext());
        return temp.getItem();
    }
}