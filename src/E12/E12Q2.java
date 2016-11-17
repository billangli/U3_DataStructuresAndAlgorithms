/*
 E12Q2

 Created by Bill Li on 2016-11-08.
 */

package E12;

import java.awt.*;

public class E12Q2 {
    public static void main(String[] args) {
        Matrix<BankAccount> matrix = new Matrix<>(2, 3);
        matrix.set(new BankAccount("LeBron"), 0, 1);
        System.out.println(matrix.getItem(new Point(1, 0)).getName());
        matrix.transpose();
        System.out.println(matrix.getItem(new Point(0, 1)).getName());
    }
}
