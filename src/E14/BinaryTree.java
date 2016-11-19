/*
 BinaryTree

 Created by Bill Li on 2016-11-17.
 */

package E14;

public class BinaryTree<I extends Comparable> {
    TreeNode<I> root;

    // Checking if a tree contains a certain item
    boolean contains(I item) {
        return contains(this.getRoot(), item);
    }

    private boolean contains(TreeNode temp, I item) {
        boolean condition = false;
        if (temp.getLeftChild() != null) {
            condition = contains(temp.getLeftChild(), item);
        }
        if (temp.getRightChild() != null) {
            condition = contains(temp.getRightChild(), item);
        }
        return (temp.getItem().equals(item)) || (condition);
    }

    // Checking the size of a tree
    int size() {
        int counter = 0;

        if (this.root == null) {
            // If tree is empty
            return 0;
        } else {
            return size(this.root, counter + 1);
        }
    }

    private int size(TreeNode<I> temp, int counter) {
        if (temp.getLeftChild() != null) {
            counter = size(temp.getLeftChild(), counter + 1);
        }
        if (temp.getRightChild() != null) {
            counter = size(temp.getRightChild(), counter + 1);
        }
        return counter;
    }

    // Adding an item to the tree
    boolean add(I item) {
        TreeNode<I> newNode = new TreeNode(item);

        // If the tree is empty
        if (this.isEmpty()) {
            this.root = newNode;
            return true;
        }

        // Recursively comparing items to see where to add it
        return add(this.root, newNode);
    }

    boolean add(TreeNode<I> tempNode, TreeNode<I> newNode) {
        if (tempNode.getNumChildren() == 2) {
            // The temp node has two children
            if (tempNode.compareTo(newNode.getItem()) >= 0) {
                // The new node is smaller/equal to the temp node, go left
                return add(tempNode.getLeftChild(), newNode);
            } else if (tempNode.compareTo(newNode.getItem()) < 0) {
                // The new node is larger than the temp node, go right
                return add(tempNode.getRightChild(), newNode);
            }
            return false;
        } else if (tempNode.getNumChildren() == 1) {
            // The temp node only has one child
            if (tempNode.getLeftChild() != null) {
                // Temp node only has left child
                if (tempNode.compareTo(newNode.getItem()) > 0) {
                    // New < Temp
                    return add(tempNode.getLeftChild(), newNode);
                } else if (tempNode.compareTo(newNode.getItem()) <= 0) {
                    // New >= Temp
                    tempNode.setRightChild(newNode);
                    return true;
                }
            } else if (tempNode.getRightChild() != null) {
                // Temp node only has right child
                if (tempNode.compareTo(newNode.getItem()) < 0) {
                    // New > temp
                    return add(tempNode.getRightChild(), newNode);
                } else if (tempNode.compareTo(newNode.getItem()) >= 0) {
                    // New <= temp
                    tempNode.setRightChild(newNode);
                    return true;
                }
            }
            return false;
        } else if (tempNode.isLeaf()) {
            // Temp node is leaf
            if (tempNode.compareTo(newNode.getItem()) >= 0) {
                // Temp is greater/equal to new
                tempNode.setLeftChild(newNode);
                return true;
            } else if (tempNode.compareTo(newNode.getItem()) < 0) {
                // Temp is smaller than new
                tempNode.setRightChild(newNode);
                return true;
            }
        }
        return false;
    }

//    // Removing a node from the tree
//    boolean remove(I item) {
//
//    }

    // Checking if the tree is empty
    boolean isEmpty() {
        return (this.root == null);
    }

    // Getting the head
    TreeNode<I> getRoot() {
        return this.root;
    }
}
