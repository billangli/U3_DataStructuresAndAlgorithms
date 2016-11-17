/*
 This tests the linked list

 Created by Bill Li on 2016-11-10.
 */

package E12;

public class NodeTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("c");
        list.add("b");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.indexOf("c"));
        System.out.println(list.add("a"));
        System.out.println(list.size());
        list.sort();
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i ++) {
            System.out.println(list.get(i));
        }
    }
}
