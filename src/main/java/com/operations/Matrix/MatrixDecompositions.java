package com.operations.Matrix;

public class MatrixDecompositions {

    public static Matrix[] luDecomposition(Matrix matrix) {
        int n = matrix.getRows();
        if (n != matrix.getCols()) {
            throw new IllegalArgumentException("Matrix must be square for LU decomposition.");
        }

        double[][] lower = new double[n][n];
        double[][] upper = new double[n][n];
        double[][] data = matrix.getData();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                upper[i][j] = data[i][j];
                for (int k = 0; k < i; k++) {
                    upper[i][j] -= lower[i][k] * upper[k][j];
                }
            }

            for (int j = i; j < n; j++) {
                if (i == j) {
                    lower[i][i] = 1;
                } else {
                    lower[j][i] = data[j][i];
                    for (int k = 0; k < i; k++) {
                        lower[j][i] -= lower[j][k] * upper[k][i];
                    }
                    lower[j][i] /= upper[i][i];
                }
            }
        }

        return new Matrix[]{new Matrix(lower), new Matrix(upper)};
    }

    public static Matrix choleskyDecomposition(Matrix matrix) {
        int n = matrix.getRows();
        if (n != matrix.getCols()) {
            throw new IllegalArgumentException("Matrix must be square for Cholesky decomposition.");
        }

        double[][] lower = new double[n][n];
        double[][] data = matrix.getData();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                double sum = 0;
                if (i == j) {
                    for (int k = 0; k < j; k++) {
                        sum += Math.pow(lower[j][k], 2);
                    }
                    double value = data[j][j] - sum;
                    if (value <= 0) { // Check for positive definiteness
                        throw new IllegalArgumentException("Matrix is not positive definite.");
                    }
                    lower[j][j] = Math.sqrt(value);
                } else {
                    for (int k = 0; k < j; k++) {
                        sum += lower[i][k] * lower[j][k];
                    }
                    lower[i][j] = (data[i][j] - sum) / lower[j][j];
                }
            }
        }
        return new Matrix(lower);
    }

}
