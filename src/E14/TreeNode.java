/*
 This creates a node for a tree

 Created by Bill Li on 2016-11-17.
 */

package E14;

public class TreeNode<I> {
    private TreeNode parent;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private I item;

    // Constructors
    TreeNode() {
        this.item = null;
        this.leftChild = null;
        this.rightChild = null;
    }

    TreeNode(I item) {
        this.item = item;
        this.leftChild = null;
        this.rightChild = null;
    }

    TreeNode(I item, TreeNode leftChild, TreeNode rightChild) {
        this.item = item;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    // Getters and Setters
    public TreeNode getLeftChild() {
        return this.leftChild;
    }

    void setLeftChild(TreeNode child) {
        this.leftChild = child;
    }

    public TreeNode getRightChild() {
        return this.rightChild;
    }

    void setRightChild(TreeNode child) {
        this.rightChild = child;
    }

    I getItem() {
        return this.item;
    }

    void setItem(I item) {
        this.item = item;
    }

    // Checking if node is a leaf
    boolean isLeaf() {
        return ((this.leftChild == null) && (this.rightChild == null));
    }

    // Checking how many children it has
    int getNumChildren() {
        if (isLeaf()) {
            return 0;
        } else if ((getLeftChild() != null) ^ (getRightChild() != null)) {
            return 1;
        } else {
            return 2;
        }
    }

    // Comparing objects
    int compareTo(I item) {
        if (item instanceof String) {
            return ((String) this.getItem()).compareTo((String) item);
        }
        return 0;
    }
}