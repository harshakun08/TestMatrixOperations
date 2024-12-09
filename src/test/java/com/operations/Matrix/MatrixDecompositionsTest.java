package com.operations.Matrix;

import static org.junit.Assert.*;
import org.junit.Test;

public class MatrixDecompositionsTest {

    @Test
    public void testLUDecomposition() {
        double[][] data = {
            {4, 3},
            {6, 3}
        };
        Matrix matrix = new Matrix(data);

        // Perform LU decomposition
        Matrix[] lu = MatrixDecompositions.luDecomposition(matrix);
        Matrix lower = lu[0];
        Matrix upper = lu[1];

        // Expected Lower matrix
        double[][] expectedLowerData = {
            {1, 0},
            {1.5, 1}
        };
        Matrix expectedLower = new Matrix(expectedLowerData);

        // Expected Upper matrix
        double[][] expectedUpperData = {
            {4, 3},
            {0, -1.5}
        };
        Matrix expectedUpper = new Matrix(expectedUpperData);

        // Validate Lower and Upper matrices
        assertArrayEquals(expectedLower.getData(), lower.getData());
        assertArrayEquals(expectedUpper.getData(), upper.getData());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLUDecompositionNonSquareMatrix() {
        double[][] data = {
            {4, 3, 1},
            {6, 3, 2}
        };
        Matrix matrix = new Matrix(data);

        // Should throw IllegalArgumentException for non-square matrix
        MatrixDecompositions.luDecomposition(matrix);
    }

    @Test
    public void testCholeskyDecomposition() {
        double[][] data = {
            {4, 12, -16},
            {12, 37, -43},
            {-16, -43, 98}
        };
        Matrix matrix = new Matrix(data);

        // Perform Cholesky decomposition
        Matrix lower = MatrixDecompositions.choleskyDecomposition(matrix);

        // Expected Lower matrix
        double[][] expectedLowerData = {
            {2, 0, 0},
            {6, 1, 0},
            {-8, 5, 3}
        };
        Matrix expectedLower = new Matrix(expectedLowerData);

        // Validate the result
        assertArrayEquals(expectedLower.getData(), lower.getData());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCholeskyDecompositionNonSquareMatrix() {
        double[][] data = {
            {4, 3, 1},
            {6, 3, 2}
        };
        Matrix matrix = new Matrix(data);

        // Should throw IllegalArgumentException for non-square matrix
        MatrixDecompositions.choleskyDecomposition(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCholeskyDecompositionNonPositiveDefiniteMatrix() {
        double[][] data = {
            {1, 2},
            {2, 1}
        };
        Matrix matrix = new Matrix(data);

        // Should throw IllegalArgumentException for non-positive definite matrix
        MatrixDecompositions.choleskyDecomposition(matrix);
    }
}
