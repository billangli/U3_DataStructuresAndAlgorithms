/*
 Matrix.java
 Stores a matrix

 Created by Bill Li on 2016-11-08.
 */

package E12;

import java.awt.Point;

public class Matrix<T> {
    private T[][] m;

    // Default constructor
    Matrix(int row, int col) {
        m = (T[][]) new Object[row][col];
    }

    // Get the total size of the matrix
    int getSize() {
        return m.length * m[0].length;
    }

    // Get the row size
    int getRowSize() {
        return m.length;
    }

    // Get the column size
    int getColSize() {
        return m[0].length;
    }

    // Get the item at the point
    T getItem(Point p) {
        return m[p.y][p.x];
    }

    // Get index of the object
    Point indexOf(T t) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == t) {
                    return new Point(j, i);
                }
            }
        }
        return new Point();
    }

    // Checks if a slot in the matrix is empty
    boolean isEmpty(Point p) {
        return !(m[p.y][p.x] == null);
    }

    // Removes an object by its point
    void remove(Point p) {
        m[p.y][p.x] = null;
    }

    // Removes an object by the object
    void remove(T t) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == t) {
                    m[i][j] = null;
                }
            }
        }
    }

    // Checks if the matrix contains a certain object
    boolean check(T t) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == t) {
                    return true;
                }
            }
        }
        return false;
    }

    // Setting a slot to an object
    void set(T t, int row, int col) {
        m[row][col] = t;
    }

    // Get an entire row
    T[] getRow(int row) {
        return m[row];
    }

    // Get an entire column
    T[] getCol(int col) {
        T[] column = (T[]) new Object[m[col].length];
        System.arraycopy(m[col], 0, column, 0, m[col].length);
        return column;
    }

    // Transpose the matrix
    void transpose() {
        T[][] transposed = (T[][]) new Object[m[0].length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                transposed[j][i] = m[i][j];
            }
        }
        m = transposed;
    }
}
