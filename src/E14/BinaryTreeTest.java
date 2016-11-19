/*
 This tests the binary tree

 Created by Bill Li on 2016-11-17.
 */

package E14;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree<String> bt = new BinaryTree<>();

        System.out.println("Adding " + bt.add("d"));
        System.out.println("Adding " + bt.add("b"));
        System.out.println("Adding " + bt.add("f"));
        System.out.println("Adding " + bt.add("a"));
        System.out.println("Adding " + bt.add("e"));
        System.out.println("Adding " + bt.add("c"));
        System.out.println("Adding " + bt.add("g"));
        System.out.println(bt.size());
        System.out.println(bt.getRoot().getItem());
        System.out.println(bt.getRoot().getLeftChild().getItem());
        System.out.println(bt.getRoot().getRightChild().getItem());
        System.out.println(bt.getRoot().getLeftChild().getLeftChild().getItem());
        System.out.println(bt.getRoot().getLeftChild().getRightChild().getItem());
        System.out.println(bt.getRoot().getRightChild().getLeftChild().getItem());
        System.out.println(bt.getRoot().getRightChild().getRightChild().getItem());
        System.out.println(bt.contains("g"));
        System.out.println(bt.contains("abc"));
    }
}
