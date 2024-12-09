package com.operations.Matrix;


import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class MatrixTest {

    @Test
    public void testMatrixConstructorWithRowsAndCols() {
        Matrix matrix = new Matrix(3, 3);
        assertEquals(3, matrix.getRows());
        assertEquals(3, matrix.getCols());

        double[][] expectedData = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        assertArrayEquals(expectedData, matrix.getData());
    }

    @Test
    public void testMatrixConstructorWithData() {
        double[][] data = {
            {1, 2},
            {3, 4}
        };
        Matrix matrix = new Matrix(data);
        assertEquals(2, matrix.getRows());
        assertEquals(2, matrix.getCols());
        assertArrayEquals(data, matrix.getData());
    }

    @Test
    public void testGetRows() {
        double[][] data = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        Matrix matrix = new Matrix(data);
        assertEquals(3, matrix.getRows());
    }

    @Test
    public void testGetCols() {
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6}
        };
        Matrix matrix = new Matrix(data);
        assertEquals(3, matrix.getCols());
    }

    @Test
    public void testGetValue() {
        double[][] data = {
            {1, 2},
            {3, 4}
        };
        Matrix matrix = new Matrix(data);
        assertEquals(1, matrix.getValue(0, 0), 0.0001);
        assertEquals(4, matrix.getValue(1, 1), 0.0001);
    }

    @Test
    public void testSetValue() {
        double[][] data = {
            {1, 2},
            {3, 4}
        };
        Matrix matrix = new Matrix(data);
        matrix.setValue(0, 0, 10);
        matrix.setValue(1, 1, 20);

        assertEquals(10, matrix.getValue(0, 0), 0.0001);
        assertEquals(20, matrix.getValue(1, 1), 0.0001);

        double[][] expectedData = {
            {10, 2},
            {3, 20}
        };
        assertArrayEquals(expectedData, matrix.getData());
    }

    @Test
    public void testGetData() {
        double[][] data = {
            {1, 2},
            {3, 4}
        };
        Matrix matrix = new Matrix(data);
        double[][] copiedData = matrix.getData();

        assertArrayEquals(data, copiedData);

        // Ensure deep copy: Modifying the copied data should not affect the matrix
        copiedData[0][0] = 100;
        assertNotEquals(100, matrix.getValue(0, 0), 0.0001);
    }

    @Test
    public void testDeepCopy() {
        double[][] data = {
            {1, 2},
            {3, 4}
        };
        Matrix matrix = new Matrix(data);
        double[][] copiedData = matrix.getData();

        // Ensure deep copy: Changing the copied data should not affect the original matrix
        copiedData[1][0] = 100;
        assertEquals(3, matrix.getValue(1, 0), 0.0001);
    }

//    @Test
//    public void testPrint() {
//        double[][] data = {
//            {1.0, 2.0},
//            {3.0, 4.0}
//        };
//        Matrix matrix = new Matrix(data);
//
//        // Expected output as a single string
//        String expectedOutput = "[1.0, 2.0]\n[3.0, 4.0]\n";
//
//        // Capture printed output
//        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outContent));
//
//        // Call the print method
//        matrix.print();
//
//        // Reset System.out
//        System.setOut(System.out);
//
//        // Verify the captured output matches the expected output
//        assertEquals(expectedOutput, outContent.toString());
//    }



}
