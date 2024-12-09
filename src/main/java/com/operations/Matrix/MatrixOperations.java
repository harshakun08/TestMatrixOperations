package com.operations.Matrix;



public class MatrixOperations {

    public static Matrix add(Matrix a, Matrix b) {
        if (a.getRows() != b.getRows() || a.getCols() != b.getCols()) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
        }
        int rows = a.getRows();
        int cols = a.getCols();
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a.getValue(i, j) + b.getValue(i, j);
            }
        }
        return new Matrix(result);
    }

    public static Matrix subtract(Matrix a, Matrix b) {
        if (a.getRows() != b.getRows() || a.getCols() != b.getCols()) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for subtraction.");
        }
        int rows = a.getRows();
        int cols = a.getCols();
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a.getValue(i, j) - b.getValue(i, j);
            }
        }
        return new Matrix(result);
    }

    public static Matrix multiply(Matrix a, Matrix b) {
        if (a.getCols() != b.getRows()) {
            throw new IllegalArgumentException("Matrix A's columns must match Matrix B's rows for multiplication.");
        }
        int rows = a.getRows();
        int cols = b.getCols();
        int commonDim = a.getCols();
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < commonDim; k++) {
                    result[i][j] += a.getValue(i, k) * b.getValue(k, j);
                }
            }
        }
        return new Matrix(result);
    }
    public static Matrix transpose(Matrix matrix) {
        int rows = matrix.getRows();
        int cols = matrix.getCols();
        double[][] result = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix.getValue(i, j);
            }
        }
        return new Matrix(result);
    }

    public static Matrix scalarMultiply(Matrix matrix, double scalar) {
        int rows = matrix.getRows();
        int cols = matrix.getCols();
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix.getValue(i, j) * scalar;
            }
        }
        return new Matrix(result);
    }
}
