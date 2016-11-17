/*
 LambdaTest.java
 Tests the lambda concept

 Created by Bill Li on 2016-11-12.
 */

package E12;

import java.util.ArrayList;

public class LambdaTest {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        long startTime;
        long endTime;

        fillList(num);

        startTime = System.nanoTime();
        System.out.println(num.stream().reduce(0, (num1, num2) -> num1 + num2));
        endTime = System.nanoTime();

        System.out.println("Time in milliseconds for imperative: " + (endTime - startTime) / 1000000);

        startTime = System.nanoTime();
        System.out.println(num.parallelStream().reduce(0, (num1, num2) -> num1 + num2));
        endTime = System.nanoTime();

        System.out.println("Time in milliseconds for functional: " + (endTime - startTime) / 1000000);
    }

    private static void fillList(ArrayList<Integer> num){
        num.add(9);
        num.add(18);
        num.add(27);
        num.add(36);
        num.add(9);
        num.add(18);
        num.add(27);
        num.add(36);
        num.add(9);
        num.add(18);
        num.add(27);
        num.add(36);
        num.add(9);
        num.add(18);
        num.add(27);
        num.add(36);
        num.add(9);
        num.add(18);
        num.add(27);
        num.add(36);
        num.add(9);
        num.add(18);
        num.add(27);
        num.add(36);
        num.add(9);
        num.add(18);
        num.add(27);
        num.add(36);
        num.add(9);
        num.add(18);
        num.add(27);
        num.add(36);
    }
}
