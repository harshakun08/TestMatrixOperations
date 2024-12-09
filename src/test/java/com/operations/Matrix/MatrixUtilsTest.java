package com.operations.Matrix;

import static org.junit.Assert.*;
import org.junit.Test;

public class MatrixUtilsTest {

    @Test
    public void testGenerateRandomMatrix() {
        int rows = 3;
        int cols = 4;
        int minValue = 1;
        int maxValue = 10;

        Matrix randomMatrix = MatrixUtils.generateRandomMatrix(rows, cols, minValue, maxValue,12345L);

        // Verify dimensions
        assertEquals(rows, randomMatrix.getRows());
        assertEquals(cols, randomMatrix.getCols());

        // Verify values are within range
        double[][] data = randomMatrix.getData();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                assertTrue(data[i][j] >= minValue && data[i][j] <= maxValue);
            }
        }
    }

    @Test
    public void testCompareEqualMatrices() {
        double[][] data1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        double[][] data2 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        Matrix matrixA = new Matrix(data1);
        Matrix matrixB = new Matrix(data2);

        assertTrue(MatrixUtils.compare(matrixA, matrixB, 0.0001));
    }

    @Test
    public void testCompareUnequalMatrices() {
        double[][] data1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        double[][] data2 = {
            {1, 2, 3},
            {4, 5, 7} // One element is different
        };
        Matrix matrixA = new Matrix(data1);
        Matrix matrixB = new Matrix(data2);

        assertFalse(MatrixUtils.compare(matrixA, matrixB, 0.0001));
    }

    @Test
    public void testCompareDifferentDimensions() {
        double[][] data1 = {
            {1, 2, 3}
        };
        double[][] data2 = {
            {1, 2},
            {3, 4}
        };
        Matrix matrixA = new Matrix(data1);
        Matrix matrixB = new Matrix(data2);

        assertFalse(MatrixUtils.compare(matrixA, matrixB, 0.0001));
    }

    @Test
    public void testFrobeniusNorm() {
        double[][] data = {
            {1, 2},
            {3, 4}
        };
        Matrix matrix = new Matrix(data);

        double expectedNorm = Math.sqrt(1 * 1 + 2 * 2 + 3 * 3 + 4 * 4);
        double result = MatrixUtils.frobeniusNorm(matrix);

        assertEquals(expectedNorm, result, 0.0001);
    }

    @Test
    public void testIsSquareTrue() {
        double[][] data = {
            {1, 2},
            {3, 4}
        };
        Matrix matrix = new Matrix(data);

        assertTrue(MatrixUtils.isSquare(matrix));
    }

    @Test
    public void testIsSquareFalse() {
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6}
        };
        Matrix matrix = new Matrix(data);

        assertFalse(MatrixUtils.isSquare(matrix));
    }

    @Test
    public void testIsSymmetricTrue() {
        double[][] data = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        Matrix matrix = new Matrix(data);

        assertTrue(MatrixUtils.isSymmetric(matrix));
    }

    @Test
    public void testIsSymmetricFalseNonSquare() {
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6}
        };
        Matrix matrix = new Matrix(data);

        assertFalse(MatrixUtils.isSymmetric(matrix));
    }

    @Test
    public void testIsSymmetricFalseNotSymmetric() {
        double[][] data = {
            {1, 2, 3},
            {2, 4, 5},
            {4, 5, 6} // Not symmetric
        };
        Matrix matrix = new Matrix(data);

        assertFalse(MatrixUtils.isSymmetric(matrix));
    }
}
