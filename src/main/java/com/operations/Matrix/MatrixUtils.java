package com.operations.Matrix;

import java.util.Random;

public class MatrixUtils {

    // Generates a random matrix with deterministic behavior using a seed
    public static Matrix generateRandomMatrix(int rows, int cols, int minValue, int maxValue, long seed) {
        Random random = new Random(seed); // Use the provided seed for deterministic behavior
        double[][] data = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = minValue + random.nextDouble() * (maxValue - minValue);
            }
        }
        return new Matrix(data);
    }

    // Overloaded method for generating a random matrix without a seed
    public static Matrix generateRandomMatrix(int rows, int cols, int minValue, int maxValue) {
        // Use a fixed seed to make the behavior deterministic during testing
        return generateRandomMatrix(rows, cols, minValue, maxValue, 12345L); // Fixed seed for testing
    }

    // Compare two matrices with a given tolerance
    public static boolean compare(Matrix a, Matrix b, double tolerance) {
        if (a.getRows() != b.getRows() || a.getCols() != b.getCols()) {
            return false;
        }
        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < a.getCols(); j++) {
                if (Math.abs(a.getValue(i, j) - b.getValue(i, j)) > tolerance) {
                    return false;
                }
            }
        }
        return true;
    }

    // Compute the Frobenius norm of a matrix
    public static double frobeniusNorm(Matrix matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getCols(); j++) {
                sum += Math.pow(matrix.getValue(i, j), 2);
            }
        }
        return Math.sqrt(sum);
    }

    // Check if a matrix is symmetric
    public static boolean isSymmetric(Matrix matrix) {
        if (!isSquare(matrix)) {
            return false;
        }

        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getCols(); j++) {
                if (Math.abs(matrix.getValue(i, j) - matrix.getValue(j, i)) > 1e-10) { // Adjusted for precision
                    return false;
                }
            }
        }
        return true;
    }

    // Check if a matrix is square
    public static boolean isSquare(Matrix matrix) {
        return matrix.getRows() == matrix.getCols();
    }
}
