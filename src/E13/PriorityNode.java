/*
 PriorityNode
 It is a subclass of Node

 Created by Bill Li on 2016-11-15.
 */

package E13;

import E12.Node;

public class PriorityNode<I> extends Node<I> {
    private int priority;
    
    public PriorityNode(I item) {
        super(item);
    }

    public PriorityNode(I item, int priority) {
        super(item);
        this.priority = priority;
    }

    public PriorityNode(I item, Node next) {
        super(item, next);
    }

    public PriorityNode(I item, int priority, Node next) {
        super(item, next);
        this.priority = priority;
    }

    public PriorityNode(I item, int priority, Node previous, Node next) {
        super(item, previous, next);
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
