package com.operations.Matrix;

import static org.junit.Assert.*;
import org.junit.Test;

public class MatrixTransformationsTest {

    @Test
    public void testRotate2D() {
        // Test rotation by 90 degrees
        double angle = 90;
        Matrix result = MatrixTransformations.rotate2D(angle);

        double[][] expectedData = {
            { 0, -1 },
            { 1, 0 }
        };
        Matrix expected = new Matrix(expectedData);

        assert2DArrayEquals(expected.getData(), result.getData(), 0.0001);

        // Test rotation by 45 degrees
        angle = 45;
        result = MatrixTransformations.rotate2D(angle);

        double radians = Math.toRadians(angle);
        double[][] expected45Data = {
            { Math.cos(radians), -Math.sin(radians) },
            { Math.sin(radians), Math.cos(radians) }
        };
        Matrix expected45 = new Matrix(expected45Data);

        assert2DArrayEquals(expected45.getData(), result.getData(), 0.0001);
    }

    @Test
    public void testScale2D() {
        // Test scaling by factors 2 and 3
        double scaleX = 2;
        double scaleY = 3;
        Matrix result = MatrixTransformations.scale2D(scaleX, scaleY);

        double[][] expectedData = {
            { 2, 0 },
            { 0, 3 }
        };
        Matrix expected = new Matrix(expectedData);

        assert2DArrayEquals(expected.getData(), result.getData(), 0.0001);

        // Test uniform scaling by factor 1
        scaleX = 1;
        scaleY = 1;
        result = MatrixTransformations.scale2D(scaleX, scaleY);

        double[][] expectedIdentity = {
            { 1, 0 },
            { 0, 1 }
        };
        Matrix expectedIdentityMatrix = new Matrix(expectedIdentity);

        assert2DArrayEquals(expectedIdentityMatrix.getData(), result.getData(), 0.0001);
    }

    @Test
    public void testProject2D() {
        // Test projection with scaling factors 5 and 10
        double x = 5;
        double y = 10;
        Matrix result = MatrixTransformations.project2D(x, y);

        double[][] expectedData = {
            { 5, 0 },
            { 0, 10 }
        };
        Matrix expected = new Matrix(expectedData);

        assert2DArrayEquals(expected.getData(), result.getData(), 0.0001);

        // Test projection with unit factors
        x = 1;
        y = 1;
        result = MatrixTransformations.project2D(x, y);

        double[][] expectedIdentity = {
            { 1, 0 },
            { 0, 1 }
        };
        Matrix expectedIdentityMatrix = new Matrix(expectedIdentity);

        assert2DArrayEquals(expectedIdentityMatrix.getData(), result.getData(), 0.0001);
    }

    /**
     * Custom assertion method to compare two 2D arrays.
     * @param expected The expected 2D array.
     * @param actual The actual 2D array.
     * @param delta The tolerance for floating-point comparisons.
     */
    private void assert2DArrayEquals(double[][] expected, double[][] actual, double delta) {
        assertEquals("Number of rows mismatch", expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals("Row " + i + " mismatch", expected[i], actual[i], delta);
        }
    }
}
