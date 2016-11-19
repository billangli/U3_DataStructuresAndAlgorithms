/*
 E14Q3

 Created by Bill Li on 2016-11-15.
 */

package E13;

public class E14Q3 {
    public static void main(String[] args){
        Queue<String> q = new Queue<>();
        q.enqueue("a");
        q.enqueue("b");
        System.out.println(q.isEmpty());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty() + "\n");


        PriorityQueue<String> pq = new PriorityQueue<>();
        System.out.println(pq.enqueue("a", 0));
        System.out.println(pq.enqueue("b", 20));
        System.out.println(pq.isEmpty());
        System.out.println(pq.dequeue());
        System.out.println(pq.dequeue());
        System.out.println(pq.isEmpty());
    }
}