package com.operations.Matrix;

import static org.junit.Assert.*;
import org.junit.Test;

public class MatrixApplicationTest {

    @Test
    public void testMatrixAddition() {
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
        double[][] expectedResult = {
            {10, 10, 10},
            {10, 10, 10},
            {10, 10, 10}
        };

        Matrix matrixA = new Matrix(dataA);
        Matrix matrixB = new Matrix(dataB);
        Matrix result = MatrixOperations.add(matrixA, matrixB);

        assert2DArrayEquals(expectedResult, result.getData(), 0.0001);
    }

    @Test
    public void testLUDecomposition() {
        double[][] data = {
            {4, 3},
            {6, 3}
        };
        double[][] expectedLower = {
            {1, 0},
            {1.5, 1}
        };
        double[][] expectedUpper = {
            {4, 3},
            {0, -1.5}
        };

        Matrix matrix = new Matrix(data);
        Matrix[] luResult = MatrixDecompositions.luDecomposition(matrix);

        assert2DArrayEquals(expectedLower, luResult[0].getData(), 0.0001);
        assert2DArrayEquals(expectedUpper, luResult[1].getData(), 0.0001);
    }

    @Test
    public void testRotationTransformation() {
        double angle = 45;
        double radians = Math.toRadians(angle);
        double[][] expectedRotation = {
            {Math.cos(radians), -Math.sin(radians)},
            {Math.sin(radians), Math.cos(radians)}
        };

        Matrix rotationMatrix = MatrixTransformations.rotate2D(angle);
        assert2DArrayEquals(expectedRotation, rotationMatrix.getData(), 0.0001);
    }

    @Test
    public void testFrobeniusNorm() {
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Matrix matrix = new Matrix(data);
        double expectedNorm = Math.sqrt(1 * 1 + 2 * 2 + 3 * 3 + 4 * 4 + 5 * 5 + 6 * 6 + 7 * 7 + 8 * 8 + 9 * 9);

        double result = MatrixUtils.frobeniusNorm(matrix);

        assertEquals(expectedNorm, result, 0.0001);
    }

    @Test
    public void testSolveLinearSystem() {
        double[][] system = {
            {2, 1},
            {5, 7}
        };
        double[] constants = {11, 13};
        double[] expectedSolution = {7.1111, -3.2222};

        Matrix matrix = new Matrix(system);
        double[] solution = MatrixSolver.solveGaussian(matrix, constants);

        assertArrayEquals(expectedSolution, solution, 0.0001);
    }

    @Test
    public void testRandomMatrixGeneration() {
        Matrix randomMatrix = MatrixUtils.generateRandomMatrix(3, 3, 1, 10, 12345L);
;

        assertEquals(3, randomMatrix.getRows());
        assertEquals(3, randomMatrix.getCols());

        double[][] data = randomMatrix.getData();
        for (double[] row : data) {
            for (double value : row) {
                assertTrue(value >= 1 && value <= 10);
            }
        }
    }

    @Test
    public void testMatrixSymmetryCheck() {
        double[][] symmetricData = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        double[][] nonSymmetricData = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Matrix symmetricMatrix = new Matrix(symmetricData);
        Matrix nonSymmetricMatrix = new Matrix(nonSymmetricData);

        assertTrue(MatrixUtils.isSymmetric(symmetricMatrix));
        assertFalse(MatrixUtils.isSymmetric(nonSymmetricMatrix));
    }

    /**
     * Custom helper method to compare two 2D arrays with a tolerance.
     * @param expected The expected 2D array.
     * @param actual The actual 2D array.
     * @param delta The tolerance for floating-point comparison.
     */
    private void assert2DArrayEquals(double[][] expected, double[][] actual, double delta) {
        assertEquals("Row count mismatch", expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals("Row " + i + " mismatch", expected[i], actual[i], delta);
        }
    }
}
