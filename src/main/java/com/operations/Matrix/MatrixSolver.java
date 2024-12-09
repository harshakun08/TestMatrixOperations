package com.operations.Matrix;

public class MatrixSolver {

	public static double[] solveGaussian(Matrix matrix, double[] constants) {
	    if (matrix.getRows() != matrix.getCols()) {
	        throw new IllegalArgumentException("Matrix must be square to solve equations.");
	    }
	    if (matrix.getRows() != constants.length) {
	        throw new IllegalArgumentException("Constant vector size must match matrix size.");
	    }

	    int n = matrix.getRows();
	    double[][] augmented = new double[n][n + 1];

	    // Augment the matrix with constants
	    for (int i = 0; i < n; i++) {
	        System.arraycopy(matrix.getData()[i], 0, augmented[i], 0, n);
	        augmented[i][n] = constants[i];
	    }

	    // Gaussian elimination
	    for (int i = 0; i < n; i++) {
	        // Partial pivoting
	        for (int k = i + 1; k < n; k++) {
	            if (Math.abs(augmented[k][i]) > Math.abs(augmented[i][i])) {
	                double[] temp = augmented[i];
	                augmented[i] = augmented[k];
	                augmented[k] = temp;
	            }
	        }

	        // Check for singular matrix
	        if (Math.abs(augmented[i][i]) < 1e-10) {
	            throw new IllegalArgumentException("Matrix is singular or nearly singular.");
	        }

	        // Normalize row i
	        for (int j = i + 1; j <= n; j++) {
	            augmented[i][j] /= augmented[i][i];
	        }
	        augmented[i][i] = 1;

	        // Eliminate column i in subsequent rows
	        for (int k = i + 1; k < n; k++) {
	            double factor = augmented[k][i];
	            for (int j = i; j <= n; j++) {
	                augmented[k][j] -= factor * augmented[i][j];
	            }
	        }
	    }

	    // Back-substitution
	    double[] solution = new double[n];
	    for (int i = n - 1; i >= 0; i--) {
	        solution[i] = augmented[i][n];
	        for (int j = i + 1; j < n; j++) {
	            solution[i] -= augmented[i][j] * solution[j];
	        }
	    }
	    return solution;
	}

}
