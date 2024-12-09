package com.operations.Matrix;

public class MatrixApplication {

    public static void main(String[] args) {
        // Example 1: Matrix Addition
        System.out.println("=== Matrix Addition ===");
        double[][] dataA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        double[][] dataB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        Matrix matrixA = new Matrix(dataA);
        Matrix matrixB = new Matrix(dataB);
        Matrix result = MatrixOperations.add(matrixA, matrixB);
        System.out.println("Matrix A:");
        matrixA.print();
        System.out.println("Matrix B:");
        matrixB.print();
        System.out.println("A + B:");
        result.print();

        // Example 2: LU Decomposition
        System.out.println("\n=== LU Decomposition ===");
        double[][] luData = {
            {4, 3},
            {6, 3}
        };
        Matrix matrixLU = new Matrix(luData);
        Matrix[] luResult = MatrixDecompositions.luDecomposition(matrixLU);
        System.out.println("Original Matrix:");
        matrixLU.print();
        System.out.println("Lower Matrix:");
        luResult[0].print();
        System.out.println("Upper Matrix:");
        luResult[1].print();

        // Example 3: Rotation Transformation
        System.out.println("\n=== 2D Rotation Transformation ===");
        double angle = 45; // Degrees
        Matrix rotationMatrix = MatrixTransformations.rotate2D(angle);
        System.out.println("Rotation Matrix for " + angle + " degrees:");
        rotationMatrix.print();

        // Example 4: Frobenius Norm
        System.out.println("\n=== Frobenius Norm ===");
        double frobeniusNorm = MatrixUtils.frobeniusNorm(matrixA);
        System.out.println("Frobenius Norm of Matrix A: " + frobeniusNorm);

        // Example 5: Solve a Linear System (Gaussian Elimination)
        System.out.println("\n=== Solve Linear System ===");
        double[][] linearSystem = {
            {2, 1},
            {5, 7}
        };
        double[] constants = {11, 13};
        Matrix matrixLinear = new Matrix(linearSystem);
        double[] solution = MatrixSolver.solveGaussian(matrixLinear, constants);
        System.out.println("Linear System Matrix:");
        matrixLinear.print();
        System.out.println("Constants: ");
        printArray(constants);
        System.out.println("Solution:");
        printArray(solution);

        // Example 6: Random Matrix Generation
        System.out.println("\n=== Random Matrix Generation ===");
        Matrix randomMatrix = MatrixUtils.generateRandomMatrix(3, 3, 1, 10, 12345L);
        System.out.println("Randomly Generated 3x3 Matrix:");
        randomMatrix.print();

        // Example 7: Matrix Symmetry Check
        System.out.println("\n=== Symmetry Check ===");
        System.out.println("Is Matrix A symmetric? " + MatrixUtils.isSymmetric(matrixA));
    }

    // Utility method to print a 1D array
    private static void printArray(double[] array) {
        for (double value : array) {
            System.out.printf("%.4f ", value);
        }
        System.out.println();
    }
}
