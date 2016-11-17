/*
 Calculator using Postfix

 Created by Bill Li on 2016-11-15.
 */

package E14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class E14Q4 {
    public static void main(String[] args) {
        // Reading operation
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        System.out.println("Enter line of operation");
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Breaking down operations
        StringTokenizer st = new StringTokenizer(str);
        ArrayList<String> input = new ArrayList<>();
        while (st.hasMoreTokens()) {
            input.add(st.nextToken());
        }

        // Operating
        Stack<Double> s = new Stack<>();
        int counter = 0;
        while (counter < input.size()) {
            if (input.get(counter).equals("+")) {
                s.push(s.pop() + s.pop());
            } else if (input.get(counter).equals("-")) {
                Double num1 = s.pop();
                Double num2 = s.pop();
                s.push(num2 - num1);
            } else if (input.get(counter).equals("*")) {
                s.push(s.pop() * s.pop());
            } else if (input.get(counter).equals("/")) {
                Double num1 = s.pop();
                Double num2 = s.pop();
                s.push(num2 / num1);
            } else {
                s.push(Double.parseDouble(input.get(counter)));
            }
            counter ++;
        }

        // Output answer
        System.out.println(s.pop());
    }
}
