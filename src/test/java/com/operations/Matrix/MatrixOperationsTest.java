package com.operations.Matrix;

import static org.junit.Assert.*;
import org.junit.Test;

public class MatrixOperationsTest {

    @Test
    public void testAdd() {
        double[][] dataA = {
            {1, 2},
            {3, 4}
        };
        double[][] dataB = {
            {5, 6},
            {7, 8}
        };
        Matrix a = new Matrix(dataA);
        Matrix b = new Matrix(dataB);

        double[][] expectedData = {
            {6, 8},
            {10, 12}
        };
        Matrix expected = new Matrix(expectedData);

        Matrix result = MatrixOperations.add(a, b);
        assertArrayEquals(expected.getData(), result.getData());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDifferentDimensions() {
        double[][] dataA = {
            {1, 2},
            {3, 4}
        };
        double[][] dataB = {
            {5, 6, 7},
            {8, 9, 10}
        };
        Matrix a = new Matrix(dataA);
        Matrix b = new Matrix(dataB);

        MatrixOperations.add(a, b); // Should throw IllegalArgumentException
    }

    @Test
    public void testSubtract() {
        double[][] dataA = {
            {5, 6},
            {7, 8}
        };
        double[][] dataB = {
            {1, 2},
            {3, 4}
        };
        Matrix a = new Matrix(dataA);
        Matrix b = new Matrix(dataB);

        double[][] expectedData = {
            {4, 4},
            {4, 4}
        };
        Matrix expected = new Matrix(expectedData);

        Matrix result = MatrixOperations.subtract(a, b);
        assertArrayEquals(expected.getData(), result.getData());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtractDifferentDimensions() {
        double[][] dataA = {
            {1, 2},
            {3, 4}
        };
        double[][] dataB = {
            {5, 6, 7},
            {8, 9, 10}
        };
        Matrix a = new Matrix(dataA);
        Matrix b = new Matrix(dataB);

        MatrixOperations.subtract(a, b); // Should throw IllegalArgumentException
    }

    @Test
    public void testMultiply() {
        double[][] dataA = {
            {1, 2},
            {3, 4}
        };
        double[][] dataB = {
            {2, 0},
            {1, 2}
        };
        Matrix a = new Matrix(dataA);
        Matrix b = new Matrix(dataB);

        double[][] expectedData = {
            {4, 4},
            {10, 8}
        };
        Matrix expected = new Matrix(expectedData);

        Matrix result = MatrixOperations.multiply(a, b);
        assertArrayEquals(expected.getData(), result.getData());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyInvalidDimensions() {
        double[][] dataA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        double[][] dataB = {
            {1, 2},
            {3, 4}
        };
        Matrix a = new Matrix(dataA);
        Matrix b = new Matrix(dataB);

        MatrixOperations.multiply(a, b); // Should throw IllegalArgumentException
    }

    @Test
    public void testTranspose() {
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6}
        };
        Matrix matrix = new Matrix(data);

        double[][] expectedData = {
            {1, 4},
            {2, 5},
            {3, 6}
        };
        Matrix expected = new Matrix(expectedData);

        Matrix result = MatrixOperations.transpose(matrix);
        assertArrayEquals(expected.getData(), result.getData());
    }

    @Test
    public void testScalarMultiply() {
        double[][] data = {
            {1, 2},
            {3, 4}
        };
        Matrix matrix = new Matrix(data);

        double[][] expectedData = {
            {2, 4},
            {6, 8}
        };
        Matrix expected = new Matrix(expectedData);

        Matrix result = MatrixOperations.scalarMultiply(matrix, 2);
        assertArrayEquals(expected.getData(), result.getData());
    }
}
