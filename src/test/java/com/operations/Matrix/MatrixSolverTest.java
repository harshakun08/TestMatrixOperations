package com.operations.Matrix;

import static org.junit.Assert.*;
import org.junit.Test;

public class MatrixSolverTest {

    @Test
    public void testSolveGaussian() {
        // Test case: 2x2 system
        double[][] data = {
            {2, 1},
            {5, 7}
        };
        double[] constants = {11, 13};
        Matrix matrix = new Matrix(data);

        double[] expectedSolution = {7.1111, -3.2222};
        double[] result = MatrixSolver.solveGaussian(matrix, constants);

        assertArrayEquals(expectedSolution, result, 0.0001);

        // Test case: 3x3 system
        double[][] data3x3 = {
            {3, 2, -4},
            {2, 3, 3},
            {5, -3, 1}
        };
        double[] constants3x3 = {3, 15, 14};
        Matrix matrix3x3 = new Matrix(data3x3);

        double[] expectedSolution3x3 = {3, 1, 2};
        result = MatrixSolver.solveGaussian(matrix3x3, constants3x3);

        assertArrayEquals(expectedSolution3x3, result, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNonSquareMatrixThrowsException() {
        // Test case: Non-square matrix
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6}
        };
        double[] constants = {7, 8};
        Matrix matrix = new Matrix(data);

        // Should throw IllegalArgumentException
        MatrixSolver.solveGaussian(matrix, constants);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstantsSizeMismatchThrowsException() {
        // Test case: Constants size does not match rows
        double[][] data = {
            {2, 1},
            {5, 7}
        };
        double[] constants = {11}; // Incorrect size
        Matrix matrix = new Matrix(data);

        // Should throw IllegalArgumentException
        MatrixSolver.solveGaussian(matrix, constants);
    }

    @Test
    public void testSolveGaussianSingleVariable() {
        // Test case: 1x1 system
        double[][] data = {
            {4}
        };
        double[] constants = {8};
        Matrix matrix = new Matrix(data);

        double[] expectedSolution = {2};
        double[] result = MatrixSolver.solveGaussian(matrix, constants);

        assertArrayEquals(expectedSolution, result, 0.0001);
    }

    @Test
    public void testSolveGaussianWithPivoting() {
        // Test case: System requiring row swapping
        double[][] data = {
            {1, 2, 3},
            {2, 4, 6},
            {3, 6, 9}
        };
        double[] constants = {6, 12, 18};
        Matrix matrix = new Matrix(data);

        // The system is singular, solution is undefined
        try {
            MatrixSolver.solveGaussian(matrix, constants);
            fail("Expected an exception for singular matrix.");
        } catch (ArithmeticException | IllegalArgumentException e) {
            // Pass the test
        }
    }
}
