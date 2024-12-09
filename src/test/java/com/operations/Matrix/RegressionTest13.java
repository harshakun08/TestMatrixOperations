package com.operations.Matrix;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[] doubleArray8 = new double[] { 10, 'a' };
        double[][] doubleArray9 = new double[][] { doubleArray5, doubleArray8 };
        com.operations.Matrix.Matrix matrix10 = new com.operations.Matrix.Matrix(doubleArray9);
        int int11 = matrix10.getCols();
        int int12 = matrix10.getCols();
        int int13 = matrix10.getCols();
        com.operations.Matrix.Matrix[] matrixArray14 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix10);
        com.operations.Matrix.Matrix matrix15 = com.operations.Matrix.MatrixOperations.multiply(matrix2, matrix10);
        com.operations.Matrix.Matrix matrix17 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean19 = com.operations.Matrix.MatrixUtils.compare(matrix10, matrix17, (double) (byte) 0);
        boolean boolean20 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix17);
        com.operations.Matrix.Matrix matrix21 = com.operations.Matrix.MatrixOperations.transpose(matrix17);
        com.operations.Matrix.Matrix matrix24 = com.operations.Matrix.MatrixTransformations.project2D(20.0d, 0.0d);
        boolean boolean25 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix24);
        com.operations.Matrix.Matrix matrix26 = com.operations.Matrix.MatrixOperations.subtract(matrix21, matrix24);
        // The following exception was thrown during execution in test generation
        try {
            com.operations.Matrix.Matrix matrix27 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix is not positive definite.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(matrixArray14);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(matrix17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(matrix26);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        double[] doubleArray2 = new double[] { 10, 'a' };
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[][] doubleArray6 = new double[][] { doubleArray2, doubleArray5 };
        com.operations.Matrix.Matrix matrix7 = new com.operations.Matrix.Matrix(doubleArray6);
        com.operations.Matrix.Matrix matrix8 = new com.operations.Matrix.Matrix(doubleArray6);
        boolean boolean9 = com.operations.Matrix.MatrixUtils.isSquare(matrix8);
        double[] doubleArray12 = new double[] { 10, 'a' };
        double[] doubleArray15 = new double[] { 10, 'a' };
        double[][] doubleArray16 = new double[][] { doubleArray12, doubleArray15 };
        com.operations.Matrix.Matrix matrix17 = new com.operations.Matrix.Matrix(doubleArray16);
        int int18 = matrix17.getCols();
        int int19 = matrix17.getCols();
        matrix17.print();
        double[] doubleArray23 = new double[] { 10, 'a' };
        double[] doubleArray26 = new double[] { 10, 'a' };
        double[][] doubleArray27 = new double[][] { doubleArray23, doubleArray26 };
        com.operations.Matrix.Matrix matrix28 = new com.operations.Matrix.Matrix(doubleArray27);
        boolean boolean30 = com.operations.Matrix.MatrixUtils.compare(matrix17, matrix28, (double) (-1));
        com.operations.Matrix.Matrix matrix31 = com.operations.Matrix.MatrixOperations.subtract(matrix8, matrix28);
        com.operations.Matrix.Matrix matrix33 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix8, (double) 0.0f);
        int int34 = matrix8.getCols();
        com.operations.Matrix.Matrix matrix35 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix8);
        com.operations.Matrix.Matrix matrix38 = com.operations.Matrix.MatrixTransformations.scale2D((double) 100L, 1.0d);
        com.operations.Matrix.Matrix matrix39 = com.operations.Matrix.MatrixOperations.transpose(matrix38);
        com.operations.Matrix.Matrix matrix40 = com.operations.Matrix.MatrixOperations.add(matrix35, matrix39);
        double[][] doubleArray41 = matrix40.getData();
        com.operations.Matrix.Matrix matrix42 = new com.operations.Matrix.Matrix(doubleArray41);
        com.operations.Matrix.Matrix matrix45 = com.operations.Matrix.MatrixTransformations.project2D(137.90576492663388d, 0.0d);
        com.operations.Matrix.Matrix matrix48 = com.operations.Matrix.MatrixTransformations.scale2D(1.414213562373095d, (double) 1);
        com.operations.Matrix.Matrix matrix49 = com.operations.Matrix.MatrixOperations.add(matrix45, matrix48);
        com.operations.Matrix.Matrix matrix50 = com.operations.Matrix.MatrixOperations.subtract(matrix42, matrix48);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertNotNull(matrix48);
        org.junit.Assert.assertNotNull(matrix49);
        org.junit.Assert.assertNotNull(matrix50);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D(146.4308710620817d, (double) 10L);
        boolean boolean3 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix2);
        com.operations.Matrix.Matrix matrix6 = com.operations.Matrix.MatrixTransformations.scale2D((double) (-1L), (double) '4');
        com.operations.Matrix.Matrix matrix7 = com.operations.Matrix.MatrixOperations.transpose(matrix6);
        com.operations.Matrix.Matrix matrix8 = com.operations.Matrix.MatrixOperations.add(matrix2, matrix6);
        boolean boolean9 = com.operations.Matrix.MatrixUtils.isSquare(matrix2);
        boolean boolean10 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix2);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D((double) 'a');
        com.operations.Matrix.Matrix matrix3 = com.operations.Matrix.MatrixTransformations.rotate2D((double) 1.0f);
        com.operations.Matrix.Matrix matrix4 = com.operations.Matrix.MatrixOperations.add(matrix1, matrix3);
        double[] doubleArray7 = new double[] { 10, 'a' };
        double[] doubleArray10 = new double[] { 10, 'a' };
        double[][] doubleArray11 = new double[][] { doubleArray7, doubleArray10 };
        com.operations.Matrix.Matrix matrix12 = new com.operations.Matrix.Matrix(doubleArray11);
        com.operations.Matrix.Matrix matrix13 = new com.operations.Matrix.Matrix(doubleArray11);
        com.operations.Matrix.Matrix[] matrixArray14 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix13);
        double double15 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix13);
        double[] doubleArray18 = new double[] { 10, 'a' };
        double[] doubleArray21 = new double[] { 10, 'a' };
        double[][] doubleArray22 = new double[][] { doubleArray18, doubleArray21 };
        com.operations.Matrix.Matrix matrix23 = new com.operations.Matrix.Matrix(doubleArray22);
        com.operations.Matrix.Matrix matrix24 = new com.operations.Matrix.Matrix(doubleArray22);
        boolean boolean25 = com.operations.Matrix.MatrixUtils.isSquare(matrix24);
        double[] doubleArray28 = new double[] { 10, 'a' };
        double[] doubleArray31 = new double[] { 10, 'a' };
        double[][] doubleArray32 = new double[][] { doubleArray28, doubleArray31 };
        com.operations.Matrix.Matrix matrix33 = new com.operations.Matrix.Matrix(doubleArray32);
        int int34 = matrix33.getCols();
        int int35 = matrix33.getCols();
        matrix33.print();
        double[] doubleArray39 = new double[] { 10, 'a' };
        double[] doubleArray42 = new double[] { 10, 'a' };
        double[][] doubleArray43 = new double[][] { doubleArray39, doubleArray42 };
        com.operations.Matrix.Matrix matrix44 = new com.operations.Matrix.Matrix(doubleArray43);
        boolean boolean46 = com.operations.Matrix.MatrixUtils.compare(matrix33, matrix44, (double) (-1));
        com.operations.Matrix.Matrix matrix47 = com.operations.Matrix.MatrixOperations.subtract(matrix24, matrix44);
        com.operations.Matrix.Matrix[] matrixArray48 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix47);
        double[][] doubleArray49 = matrix47.getData();
        com.operations.Matrix.Matrix matrix52 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray55 = new double[] { 10, 'a' };
        double[] doubleArray58 = new double[] { 10, 'a' };
        double[][] doubleArray59 = new double[][] { doubleArray55, doubleArray58 };
        com.operations.Matrix.Matrix matrix60 = new com.operations.Matrix.Matrix(doubleArray59);
        int int61 = matrix60.getCols();
        int int62 = matrix60.getCols();
        int int63 = matrix60.getCols();
        com.operations.Matrix.Matrix[] matrixArray64 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix60);
        com.operations.Matrix.Matrix matrix65 = com.operations.Matrix.MatrixOperations.multiply(matrix52, matrix60);
        int int66 = matrix60.getRows();
        com.operations.Matrix.Matrix matrix67 = com.operations.Matrix.MatrixOperations.multiply(matrix47, matrix60);
        boolean boolean69 = com.operations.Matrix.MatrixUtils.compare(matrix13, matrix67, (double) 2);
        com.operations.Matrix.Matrix matrix70 = com.operations.Matrix.MatrixOperations.transpose(matrix67);
        com.operations.Matrix.Matrix matrix72 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix67, (double) (short) -1);
        com.operations.Matrix.Matrix matrix73 = com.operations.Matrix.MatrixOperations.add(matrix3, matrix72);
        boolean boolean74 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix72);
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(matrixArray14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 137.90576492663388d + "'", double15 == 137.90576492663388d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(matrix47);
        org.junit.Assert.assertNotNull(matrixArray48);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertNotNull(matrix52);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertNotNull(matrixArray64);
        org.junit.Assert.assertNotNull(matrix65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertNotNull(matrix67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(matrix70);
        org.junit.Assert.assertNotNull(matrix72);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[] doubleArray8 = new double[] { 10, 'a' };
        double[][] doubleArray9 = new double[][] { doubleArray5, doubleArray8 };
        com.operations.Matrix.Matrix matrix10 = new com.operations.Matrix.Matrix(doubleArray9);
        int int11 = matrix10.getCols();
        int int12 = matrix10.getCols();
        int int13 = matrix10.getCols();
        com.operations.Matrix.Matrix[] matrixArray14 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix10);
        com.operations.Matrix.Matrix matrix15 = com.operations.Matrix.MatrixOperations.multiply(matrix2, matrix10);
        com.operations.Matrix.Matrix matrix17 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean19 = com.operations.Matrix.MatrixUtils.compare(matrix10, matrix17, (double) (byte) 0);
        double[] doubleArray22 = new double[] { 10, 'a' };
        double[] doubleArray25 = new double[] { 10, 'a' };
        double[][] doubleArray26 = new double[][] { doubleArray22, doubleArray25 };
        com.operations.Matrix.Matrix matrix27 = new com.operations.Matrix.Matrix(doubleArray26);
        com.operations.Matrix.Matrix matrix28 = new com.operations.Matrix.Matrix(doubleArray26);
        com.operations.Matrix.Matrix matrix29 = new com.operations.Matrix.Matrix(doubleArray26);
        boolean boolean31 = com.operations.Matrix.MatrixUtils.compare(matrix10, matrix29, (double) (-1));
        com.operations.Matrix.Matrix matrix33 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray36 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray37 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix33, doubleArray36);
        com.operations.Matrix.Matrix matrix40 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray43 = new double[] { 10, 'a' };
        double[] doubleArray46 = new double[] { 10, 'a' };
        double[][] doubleArray47 = new double[][] { doubleArray43, doubleArray46 };
        com.operations.Matrix.Matrix matrix48 = new com.operations.Matrix.Matrix(doubleArray47);
        int int49 = matrix48.getCols();
        int int50 = matrix48.getCols();
        int int51 = matrix48.getCols();
        com.operations.Matrix.Matrix[] matrixArray52 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix48);
        com.operations.Matrix.Matrix matrix53 = com.operations.Matrix.MatrixOperations.multiply(matrix40, matrix48);
        boolean boolean55 = com.operations.Matrix.MatrixUtils.compare(matrix33, matrix40, (double) (-1L));
        com.operations.Matrix.Matrix matrix56 = com.operations.Matrix.MatrixOperations.add(matrix29, matrix40);
        double double57 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix29);
        com.operations.Matrix.Matrix[] matrixArray58 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix29);
        com.operations.Matrix.Matrix matrix59 = com.operations.Matrix.MatrixOperations.transpose(matrix29);
        com.operations.Matrix.Matrix matrix61 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix29, (double) (short) 100);
        double[][] doubleArray62 = matrix29.getData();
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(matrixArray14);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(matrix17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(matrixArray52);
        org.junit.Assert.assertNotNull(matrix53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 137.90576492663388d + "'", double57 == 137.90576492663388d);
        org.junit.Assert.assertNotNull(matrixArray58);
        org.junit.Assert.assertNotNull(matrix59);
        org.junit.Assert.assertNotNull(matrix61);
        org.junit.Assert.assertNotNull(doubleArray62);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray4 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray5 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix1, doubleArray4);
        com.operations.Matrix.Matrix matrix8 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray11 = new double[] { 10, 'a' };
        double[] doubleArray14 = new double[] { 10, 'a' };
        double[][] doubleArray15 = new double[][] { doubleArray11, doubleArray14 };
        com.operations.Matrix.Matrix matrix16 = new com.operations.Matrix.Matrix(doubleArray15);
        int int17 = matrix16.getCols();
        int int18 = matrix16.getCols();
        int int19 = matrix16.getCols();
        com.operations.Matrix.Matrix[] matrixArray20 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix16);
        com.operations.Matrix.Matrix matrix21 = com.operations.Matrix.MatrixOperations.multiply(matrix8, matrix16);
        boolean boolean23 = com.operations.Matrix.MatrixUtils.compare(matrix1, matrix8, (double) (-1L));
        boolean boolean24 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix1);
        int int25 = matrix1.getCols();
        com.operations.Matrix.Matrix matrix27 = com.operations.Matrix.MatrixTransformations.rotate2D((-1.0d));
        com.operations.Matrix.Matrix matrix29 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (-1L));
        com.operations.Matrix.Matrix matrix31 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray34 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray35 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix31, doubleArray34);
        double[] doubleArray36 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix29, doubleArray34);
        double[] doubleArray37 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix27, doubleArray34);
        double[] doubleArray38 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix1, doubleArray34);
        double[][] doubleArray39 = matrix1.getData();
        com.operations.Matrix.Matrix matrix41 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[][] doubleArray42 = matrix41.getData();
        com.operations.Matrix.Matrix matrix43 = new com.operations.Matrix.Matrix(doubleArray42);
        int int44 = matrix43.getCols();
        com.operations.Matrix.Matrix matrix45 = com.operations.Matrix.MatrixOperations.subtract(matrix1, matrix43);
        int int46 = matrix1.getCols();
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(matrixArray20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 137.90221361711127d, 1.4069397643877004d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 137.90221361711127d, 1.4069397643877004d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixUtils.generateRandomMatrix((int) (short) 10, 100, (int) (short) 100, (int) '#', (long) (byte) 0);
        matrix5.print();
        org.junit.Assert.assertNotNull(matrix5);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[] doubleArray8 = new double[] { 10, 'a' };
        double[][] doubleArray9 = new double[][] { doubleArray5, doubleArray8 };
        com.operations.Matrix.Matrix matrix10 = new com.operations.Matrix.Matrix(doubleArray9);
        int int11 = matrix10.getCols();
        int int12 = matrix10.getCols();
        int int13 = matrix10.getCols();
        com.operations.Matrix.Matrix[] matrixArray14 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix10);
        com.operations.Matrix.Matrix matrix15 = com.operations.Matrix.MatrixOperations.multiply(matrix2, matrix10);
        com.operations.Matrix.Matrix matrix17 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean19 = com.operations.Matrix.MatrixUtils.compare(matrix10, matrix17, (double) (byte) 0);
        double[] doubleArray22 = new double[] { 10, 'a' };
        double[] doubleArray25 = new double[] { 10, 'a' };
        double[][] doubleArray26 = new double[][] { doubleArray22, doubleArray25 };
        com.operations.Matrix.Matrix matrix27 = new com.operations.Matrix.Matrix(doubleArray26);
        com.operations.Matrix.Matrix matrix28 = com.operations.Matrix.MatrixOperations.multiply(matrix10, matrix27);
        com.operations.Matrix.Matrix matrix30 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix10, 364.0054944640259d);
        boolean boolean31 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix30);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(matrixArray14);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(matrix17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(matrix30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D((double) (byte) 10, (double) 10);
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[] doubleArray8 = new double[] { 10, 'a' };
        double[][] doubleArray9 = new double[][] { doubleArray5, doubleArray8 };
        com.operations.Matrix.Matrix matrix10 = new com.operations.Matrix.Matrix(doubleArray9);
        com.operations.Matrix.Matrix matrix11 = new com.operations.Matrix.Matrix(doubleArray9);
        boolean boolean12 = com.operations.Matrix.MatrixUtils.isSquare(matrix11);
        double[] doubleArray15 = new double[] { 10, 'a' };
        double[] doubleArray18 = new double[] { 10, 'a' };
        double[][] doubleArray19 = new double[][] { doubleArray15, doubleArray18 };
        com.operations.Matrix.Matrix matrix20 = new com.operations.Matrix.Matrix(doubleArray19);
        int int21 = matrix20.getCols();
        int int22 = matrix20.getCols();
        matrix20.print();
        double[] doubleArray26 = new double[] { 10, 'a' };
        double[] doubleArray29 = new double[] { 10, 'a' };
        double[][] doubleArray30 = new double[][] { doubleArray26, doubleArray29 };
        com.operations.Matrix.Matrix matrix31 = new com.operations.Matrix.Matrix(doubleArray30);
        boolean boolean33 = com.operations.Matrix.MatrixUtils.compare(matrix20, matrix31, (double) (-1));
        com.operations.Matrix.Matrix matrix34 = com.operations.Matrix.MatrixOperations.subtract(matrix11, matrix31);
        com.operations.Matrix.Matrix[] matrixArray35 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix34);
        double[][] doubleArray36 = matrix34.getData();
        com.operations.Matrix.Matrix matrix37 = new com.operations.Matrix.Matrix(doubleArray36);
        com.operations.Matrix.Matrix matrix38 = com.operations.Matrix.MatrixOperations.multiply(matrix2, matrix37);
        com.operations.Matrix.Matrix matrix40 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix37, (double) (short) -1);
        com.operations.Matrix.Matrix matrix41 = com.operations.Matrix.MatrixOperations.transpose(matrix40);
        double[][] doubleArray42 = matrix41.getData();
        com.operations.Matrix.Matrix matrix43 = new com.operations.Matrix.Matrix(doubleArray42);
        double[] doubleArray46 = new double[] { 10, 'a' };
        double[] doubleArray49 = new double[] { 10, 'a' };
        double[][] doubleArray50 = new double[][] { doubleArray46, doubleArray49 };
        com.operations.Matrix.Matrix matrix51 = new com.operations.Matrix.Matrix(doubleArray50);
        com.operations.Matrix.Matrix matrix52 = new com.operations.Matrix.Matrix(doubleArray50);
        com.operations.Matrix.Matrix matrix54 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray57 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray58 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix54, doubleArray57);
        com.operations.Matrix.Matrix matrix59 = com.operations.Matrix.MatrixOperations.add(matrix52, matrix54);
        com.operations.Matrix.Matrix matrix60 = com.operations.Matrix.MatrixOperations.transpose(matrix54);
        double double61 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix60);
        com.operations.Matrix.Matrix matrix62 = com.operations.Matrix.MatrixOperations.multiply(matrix43, matrix60);
        double[][] doubleArray63 = matrix60.getData();
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(matrixArray35);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertNotNull(matrix54);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix59);
        org.junit.Assert.assertNotNull(matrix60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.414213562373095d + "'", double61 == 1.414213562373095d);
        org.junit.Assert.assertNotNull(matrix62);
        org.junit.Assert.assertNotNull(doubleArray63);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.project2D((double) '#', 0.0d);
        int int3 = matrix2.getCols();
        double[][] doubleArray4 = matrix2.getData();
        double double5 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix2);
        double double6 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix2);
        com.operations.Matrix.Matrix matrix7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.operations.Matrix.Matrix matrix8 = com.operations.Matrix.MatrixOperations.add(matrix2, matrix7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D((double) (byte) 100, 350.0d);
        double double3 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix2);
        int int4 = matrix2.getCols();
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixOperations.transpose(matrix2);
        matrix2.setValue((int) (short) 1, 0, 10.270003094125075d);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 364.0054944640259d + "'", double3 == 364.0054944640259d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(matrix5);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D(632611.037605257d, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            com.operations.Matrix.Matrix matrix3 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix is not positive definite.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix2);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[] doubleArray8 = new double[] { 10, 'a' };
        double[][] doubleArray9 = new double[][] { doubleArray5, doubleArray8 };
        com.operations.Matrix.Matrix matrix10 = new com.operations.Matrix.Matrix(doubleArray9);
        int int11 = matrix10.getCols();
        int int12 = matrix10.getCols();
        int int13 = matrix10.getCols();
        com.operations.Matrix.Matrix[] matrixArray14 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix10);
        com.operations.Matrix.Matrix matrix15 = com.operations.Matrix.MatrixOperations.multiply(matrix2, matrix10);
        com.operations.Matrix.Matrix matrix17 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean19 = com.operations.Matrix.MatrixUtils.compare(matrix10, matrix17, (double) (byte) 0);
        boolean boolean20 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix17);
        boolean boolean21 = com.operations.Matrix.MatrixUtils.isSquare(matrix17);
        com.operations.Matrix.Matrix matrix24 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray27 = new double[] { 10, 'a' };
        double[] doubleArray30 = new double[] { 10, 'a' };
        double[][] doubleArray31 = new double[][] { doubleArray27, doubleArray30 };
        com.operations.Matrix.Matrix matrix32 = new com.operations.Matrix.Matrix(doubleArray31);
        int int33 = matrix32.getCols();
        int int34 = matrix32.getCols();
        int int35 = matrix32.getCols();
        com.operations.Matrix.Matrix[] matrixArray36 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix32);
        com.operations.Matrix.Matrix matrix37 = com.operations.Matrix.MatrixOperations.multiply(matrix24, matrix32);
        com.operations.Matrix.Matrix matrix39 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean41 = com.operations.Matrix.MatrixUtils.compare(matrix32, matrix39, (double) (byte) 0);
        double[] doubleArray44 = new double[] { 10, 'a' };
        double[] doubleArray47 = new double[] { 10, 'a' };
        double[][] doubleArray48 = new double[][] { doubleArray44, doubleArray47 };
        com.operations.Matrix.Matrix matrix49 = new com.operations.Matrix.Matrix(doubleArray48);
        com.operations.Matrix.Matrix matrix50 = new com.operations.Matrix.Matrix(doubleArray48);
        com.operations.Matrix.Matrix matrix51 = new com.operations.Matrix.Matrix(doubleArray48);
        boolean boolean53 = com.operations.Matrix.MatrixUtils.compare(matrix32, matrix51, (double) (-1));
        double[] doubleArray56 = new double[] { 10, 'a' };
        double[] doubleArray59 = new double[] { 10, 'a' };
        double[][] doubleArray60 = new double[][] { doubleArray56, doubleArray59 };
        com.operations.Matrix.Matrix matrix61 = new com.operations.Matrix.Matrix(doubleArray60);
        com.operations.Matrix.Matrix matrix62 = new com.operations.Matrix.Matrix(doubleArray60);
        boolean boolean63 = com.operations.Matrix.MatrixUtils.isSquare(matrix62);
        com.operations.Matrix.Matrix matrix64 = com.operations.Matrix.MatrixOperations.multiply(matrix51, matrix62);
        com.operations.Matrix.Matrix matrix67 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int68 = matrix67.getRows();
        com.operations.Matrix.Matrix matrix70 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix67, (double) 2);
        matrix67.print();
        matrix67.print();
        com.operations.Matrix.Matrix matrix73 = com.operations.Matrix.MatrixOperations.multiply(matrix64, matrix67);
        boolean boolean75 = com.operations.Matrix.MatrixUtils.compare(matrix17, matrix73, (-1.0d));
        com.operations.Matrix.Matrix matrix76 = com.operations.Matrix.MatrixOperations.transpose(matrix17);
        double[][] doubleArray77 = matrix17.getData();
        com.operations.Matrix.Matrix[] matrixArray78 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix17);
        // The following exception was thrown during execution in test generation
        try {
            com.operations.Matrix.Matrix matrix79 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix is not positive definite.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(matrixArray14);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(matrix17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(matrixArray36);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertNotNull(matrix67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertNotNull(matrix70);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(matrix76);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertNotNull(matrixArray78);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D((double) 1.0f);
        com.operations.Matrix.Matrix matrix4 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int5 = matrix4.getRows();
        com.operations.Matrix.Matrix matrix7 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix4, (double) 2);
        double double8 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix4);
        com.operations.Matrix.Matrix matrix11 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int12 = matrix11.getRows();
        com.operations.Matrix.Matrix matrix14 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix11, (double) 2);
        com.operations.Matrix.Matrix matrix15 = com.operations.Matrix.MatrixOperations.subtract(matrix4, matrix14);
        com.operations.Matrix.Matrix matrix16 = com.operations.Matrix.MatrixOperations.add(matrix1, matrix14);
        matrix1.print();
        double[] doubleArray20 = new double[] { 10, 'a' };
        double[] doubleArray23 = new double[] { 10, 'a' };
        double[][] doubleArray24 = new double[][] { doubleArray20, doubleArray23 };
        com.operations.Matrix.Matrix matrix25 = new com.operations.Matrix.Matrix(doubleArray24);
        com.operations.Matrix.Matrix matrix26 = com.operations.Matrix.MatrixOperations.transpose(matrix25);
        com.operations.Matrix.Matrix matrix29 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int30 = matrix29.getRows();
        com.operations.Matrix.Matrix matrix36 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(100, (int) (byte) 1, (int) '#', (int) '#', 1L);
        boolean boolean38 = com.operations.Matrix.MatrixUtils.compare(matrix29, matrix36, (double) 1.0f);
        com.operations.Matrix.Matrix matrix40 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix29, (double) 1L);
        matrix29.print();
        com.operations.Matrix.Matrix matrix42 = com.operations.Matrix.MatrixOperations.multiply(matrix26, matrix29);
        com.operations.Matrix.Matrix matrix43 = com.operations.Matrix.MatrixOperations.multiply(matrix1, matrix29);
        com.operations.Matrix.Matrix matrix45 = com.operations.Matrix.MatrixTransformations.rotate2D((double) 1.0f);
        boolean boolean47 = com.operations.Matrix.MatrixUtils.compare(matrix29, matrix45, (double) (short) 0);
        matrix29.print();
        com.operations.Matrix.Matrix matrix49 = com.operations.Matrix.MatrixOperations.transpose(matrix29);
        com.operations.Matrix.Matrix matrix51 = com.operations.Matrix.MatrixTransformations.rotate2D(100.0d);
        int int52 = matrix51.getCols();
        int int53 = matrix51.getRows();
        double[] doubleArray56 = new double[] { 10, 'a' };
        double[] doubleArray59 = new double[] { 10, 'a' };
        double[][] doubleArray60 = new double[][] { doubleArray56, doubleArray59 };
        com.operations.Matrix.Matrix matrix61 = new com.operations.Matrix.Matrix(doubleArray60);
        com.operations.Matrix.Matrix matrix62 = com.operations.Matrix.MatrixOperations.transpose(matrix61);
        com.operations.Matrix.Matrix matrix65 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int66 = matrix65.getRows();
        com.operations.Matrix.Matrix matrix72 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(100, (int) (byte) 1, (int) '#', (int) '#', 1L);
        boolean boolean74 = com.operations.Matrix.MatrixUtils.compare(matrix65, matrix72, (double) 1.0f);
        com.operations.Matrix.Matrix matrix76 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix65, (double) 1L);
        matrix65.print();
        com.operations.Matrix.Matrix matrix78 = com.operations.Matrix.MatrixOperations.multiply(matrix62, matrix65);
        boolean boolean79 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix65);
        com.operations.Matrix.Matrix matrix80 = com.operations.Matrix.MatrixOperations.subtract(matrix51, matrix65);
        com.operations.Matrix.Matrix matrix82 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix80, (double) 1);
        com.operations.Matrix.Matrix matrix83 = com.operations.Matrix.MatrixOperations.multiply(matrix29, matrix80);
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(matrix43);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(matrix49);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertNotNull(matrix62);
        org.junit.Assert.assertNotNull(matrix65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertNotNull(matrix72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(matrix76);
        org.junit.Assert.assertNotNull(matrix78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(matrix80);
        org.junit.Assert.assertNotNull(matrix82);
        org.junit.Assert.assertNotNull(matrix83);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D(10.0d);
        com.operations.Matrix.Matrix matrix3 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix1, 0.01745240643728351d);
        com.operations.Matrix.Matrix matrix4 = com.operations.Matrix.MatrixOperations.transpose(matrix3);
        double double5 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix3);
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.02468142987965385d + "'", double5 == 0.02468142987965385d);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.project2D((double) 0L, 10.344080432788601d);
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[] doubleArray8 = new double[] { 10, 'a' };
        double[][] doubleArray9 = new double[][] { doubleArray5, doubleArray8 };
        com.operations.Matrix.Matrix matrix10 = new com.operations.Matrix.Matrix(doubleArray9);
        com.operations.Matrix.Matrix matrix11 = new com.operations.Matrix.Matrix(doubleArray9);
        com.operations.Matrix.Matrix matrix13 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray16 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray17 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix13, doubleArray16);
        com.operations.Matrix.Matrix matrix18 = com.operations.Matrix.MatrixOperations.add(matrix11, matrix13);
        com.operations.Matrix.Matrix matrix19 = com.operations.Matrix.MatrixOperations.transpose(matrix13);
        int int20 = matrix13.getCols();
        com.operations.Matrix.Matrix matrix23 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray26 = new double[] { 10, 'a' };
        double[] doubleArray29 = new double[] { 10, 'a' };
        double[][] doubleArray30 = new double[][] { doubleArray26, doubleArray29 };
        com.operations.Matrix.Matrix matrix31 = new com.operations.Matrix.Matrix(doubleArray30);
        int int32 = matrix31.getCols();
        int int33 = matrix31.getCols();
        int int34 = matrix31.getCols();
        com.operations.Matrix.Matrix[] matrixArray35 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix31);
        com.operations.Matrix.Matrix matrix36 = com.operations.Matrix.MatrixOperations.multiply(matrix23, matrix31);
        com.operations.Matrix.Matrix matrix38 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean40 = com.operations.Matrix.MatrixUtils.compare(matrix31, matrix38, (double) (byte) 0);
        boolean boolean41 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix38);
        boolean boolean42 = com.operations.Matrix.MatrixUtils.isSquare(matrix38);
        com.operations.Matrix.Matrix matrix44 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean46 = com.operations.Matrix.MatrixUtils.compare(matrix38, matrix44, (double) (byte) 100);
        matrix44.print();
        com.operations.Matrix.Matrix matrix48 = com.operations.Matrix.MatrixOperations.add(matrix13, matrix44);
        int int49 = matrix48.getCols();
        double double52 = matrix48.getValue(1, 0);
        double[][] doubleArray53 = matrix48.getData();
        double double56 = matrix48.getValue((int) (byte) 1, 0);
        double[][] doubleArray57 = matrix48.getData();
        com.operations.Matrix.Matrix matrix59 = com.operations.Matrix.MatrixTransformations.rotate2D((double) '#');
        com.operations.Matrix.Matrix matrix61 = com.operations.Matrix.MatrixTransformations.rotate2D((double) '4');
        matrix61.print();
        com.operations.Matrix.Matrix matrix63 = com.operations.Matrix.MatrixOperations.transpose(matrix61);
        double[][] doubleArray64 = matrix61.getData();
        com.operations.Matrix.Matrix matrix67 = com.operations.Matrix.MatrixTransformations.project2D(400.0d, 36.40054944640259d);
        com.operations.Matrix.Matrix matrix69 = com.operations.Matrix.MatrixTransformations.rotate2D(100.0d);
        int int70 = matrix69.getCols();
        matrix69.print();
        com.operations.Matrix.Matrix matrix73 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix69, (double) (byte) 1);
        com.operations.Matrix.Matrix matrix75 = com.operations.Matrix.MatrixTransformations.rotate2D(350.0d);
        com.operations.Matrix.Matrix matrix77 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray80 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray81 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix77, doubleArray80);
        double[] doubleArray82 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix75, doubleArray81);
        double[] doubleArray83 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix69, doubleArray81);
        double[] doubleArray84 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix67, doubleArray81);
        double[] doubleArray85 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix61, doubleArray84);
        double[] doubleArray86 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix59, doubleArray85);
        double[] doubleArray87 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix48, doubleArray86);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray88 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix2, doubleArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix is singular or nearly singular.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(matrix13);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(matrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(matrixArray35);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(matrix44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(matrix48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.969615506024416d + "'", double52 == 1.969615506024416d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.969615506024416d + "'", double56 == 1.969615506024416d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertNotNull(matrix59);
        org.junit.Assert.assertNotNull(matrix61);
        org.junit.Assert.assertNotNull(matrix63);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertNotNull(matrix67);
        org.junit.Assert.assertNotNull(matrix69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertNotNull(matrix75);
        org.junit.Assert.assertNotNull(matrix77);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { (-0.9999999999999858d), (-137.90576492663388d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { (-129.24700952206834d), 48.1062421064292d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { (-0.06232973130571564d), (-3.7262354653980627d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { (-2.9746876315367503d), (-2.2449831254994406d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { (-3.7243908752867103d), (-0.13277178569277412d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] { 0.2579895022406808d, 1.8454322939307053d }, 1.0E-15);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(10, (int) (short) 10, 32, (-1), 0L);
        double[][] doubleArray6 = matrix5.getData();
        int int7 = matrix5.getRows();
        double[][] doubleArray8 = matrix5.getData();
        com.operations.Matrix.Matrix matrix10 = com.operations.Matrix.MatrixTransformations.rotate2D((double) '4');
        double[] doubleArray13 = new double[] { 10, 'a' };
        double[] doubleArray16 = new double[] { 10, 'a' };
        double[][] doubleArray17 = new double[][] { doubleArray13, doubleArray16 };
        com.operations.Matrix.Matrix matrix18 = new com.operations.Matrix.Matrix(doubleArray17);
        com.operations.Matrix.Matrix matrix19 = new com.operations.Matrix.Matrix(doubleArray17);
        com.operations.Matrix.Matrix matrix21 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray24 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray25 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix21, doubleArray24);
        com.operations.Matrix.Matrix matrix26 = com.operations.Matrix.MatrixOperations.add(matrix19, matrix21);
        boolean boolean27 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix26);
        boolean boolean29 = com.operations.Matrix.MatrixUtils.compare(matrix10, matrix26, 364.0054944640259d);
        com.operations.Matrix.Matrix[] matrixArray30 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix26);
        com.operations.Matrix.Matrix matrix32 = com.operations.Matrix.MatrixTransformations.rotate2D(100.0d);
        int int33 = matrix32.getCols();
        double[][] doubleArray34 = matrix32.getData();
        double[] doubleArray37 = new double[] { 10, 'a' };
        double[] doubleArray40 = new double[] { 10, 'a' };
        double[][] doubleArray41 = new double[][] { doubleArray37, doubleArray40 };
        com.operations.Matrix.Matrix matrix42 = new com.operations.Matrix.Matrix(doubleArray41);
        com.operations.Matrix.Matrix matrix43 = com.operations.Matrix.MatrixOperations.transpose(matrix42);
        com.operations.Matrix.Matrix matrix46 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int47 = matrix46.getRows();
        com.operations.Matrix.Matrix matrix53 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(100, (int) (byte) 1, (int) '#', (int) '#', 1L);
        boolean boolean55 = com.operations.Matrix.MatrixUtils.compare(matrix46, matrix53, (double) 1.0f);
        com.operations.Matrix.Matrix matrix57 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix46, (double) 1L);
        matrix46.print();
        com.operations.Matrix.Matrix matrix59 = com.operations.Matrix.MatrixOperations.multiply(matrix43, matrix46);
        boolean boolean61 = com.operations.Matrix.MatrixUtils.compare(matrix32, matrix59, (double) 0.0f);
        boolean boolean62 = com.operations.Matrix.MatrixUtils.isSquare(matrix59);
        double double63 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix59);
        com.operations.Matrix.Matrix matrix66 = com.operations.Matrix.MatrixTransformations.scale2D((double) 100L, 1.0d);
        com.operations.Matrix.Matrix matrix67 = com.operations.Matrix.MatrixOperations.transpose(matrix66);
        double[][] doubleArray68 = matrix67.getData();
        boolean boolean70 = com.operations.Matrix.MatrixUtils.compare(matrix59, matrix67, 641.7761389614766d);
        com.operations.Matrix.Matrix matrix71 = com.operations.Matrix.MatrixOperations.multiply(matrix26, matrix67);
        int int72 = matrix26.getRows();
        int int73 = matrix26.getCols();
        com.operations.Matrix.Matrix matrix75 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix26, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            com.operations.Matrix.Matrix matrix76 = com.operations.Matrix.MatrixOperations.subtract(matrix5, matrix26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices must have the same dimensions for subtraction.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(matrixArray30);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertNotNull(matrix43);
        org.junit.Assert.assertNotNull(matrix46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(matrix53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(matrix57);
        org.junit.Assert.assertNotNull(matrix59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 975.1410154434076d + "'", double63 == 975.1410154434076d);
        org.junit.Assert.assertNotNull(matrix66);
        org.junit.Assert.assertNotNull(matrix67);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(matrix71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertNotNull(matrix75);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D(1.414213562373095d);
        com.operations.Matrix.Matrix matrix3 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix1, 21.023651153076518d);
        com.operations.Matrix.Matrix matrix6 = com.operations.Matrix.MatrixTransformations.scale2D((double) (byte) 10, (double) 10);
        double[] doubleArray9 = new double[] { 10, 'a' };
        double[] doubleArray12 = new double[] { 10, 'a' };
        double[][] doubleArray13 = new double[][] { doubleArray9, doubleArray12 };
        com.operations.Matrix.Matrix matrix14 = new com.operations.Matrix.Matrix(doubleArray13);
        com.operations.Matrix.Matrix matrix15 = new com.operations.Matrix.Matrix(doubleArray13);
        boolean boolean16 = com.operations.Matrix.MatrixUtils.isSquare(matrix15);
        double[] doubleArray19 = new double[] { 10, 'a' };
        double[] doubleArray22 = new double[] { 10, 'a' };
        double[][] doubleArray23 = new double[][] { doubleArray19, doubleArray22 };
        com.operations.Matrix.Matrix matrix24 = new com.operations.Matrix.Matrix(doubleArray23);
        int int25 = matrix24.getCols();
        int int26 = matrix24.getCols();
        matrix24.print();
        double[] doubleArray30 = new double[] { 10, 'a' };
        double[] doubleArray33 = new double[] { 10, 'a' };
        double[][] doubleArray34 = new double[][] { doubleArray30, doubleArray33 };
        com.operations.Matrix.Matrix matrix35 = new com.operations.Matrix.Matrix(doubleArray34);
        boolean boolean37 = com.operations.Matrix.MatrixUtils.compare(matrix24, matrix35, (double) (-1));
        com.operations.Matrix.Matrix matrix38 = com.operations.Matrix.MatrixOperations.subtract(matrix15, matrix35);
        com.operations.Matrix.Matrix[] matrixArray39 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix38);
        double[][] doubleArray40 = matrix38.getData();
        com.operations.Matrix.Matrix matrix41 = new com.operations.Matrix.Matrix(doubleArray40);
        com.operations.Matrix.Matrix matrix42 = com.operations.Matrix.MatrixOperations.multiply(matrix6, matrix41);
        boolean boolean43 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix6);
        com.operations.Matrix.Matrix matrix45 = com.operations.Matrix.MatrixTransformations.rotate2D(350.0d);
        com.operations.Matrix.Matrix matrix46 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix45);
        int int47 = matrix45.getRows();
        com.operations.Matrix.Matrix matrix48 = com.operations.Matrix.MatrixOperations.subtract(matrix6, matrix45);
        com.operations.Matrix.Matrix matrix49 = com.operations.Matrix.MatrixOperations.multiply(matrix3, matrix6);
        com.operations.Matrix.Matrix matrix51 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix49, 364.0054944640259d);
        // The following exception was thrown during execution in test generation
        try {
            matrix49.setValue((int) (byte) 10, 10, 186.6644586191991d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(matrixArray39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertNotNull(matrix46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(matrix48);
        org.junit.Assert.assertNotNull(matrix49);
        org.junit.Assert.assertNotNull(matrix51);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        com.operations.Matrix.Matrix matrix0 = null;
        com.operations.Matrix.Matrix matrix6 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(2, (int) (byte) 0, 97, (int) (short) -1, (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.operations.Matrix.MatrixUtils.compare(matrix0, matrix6, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix6);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        // The following exception was thrown during execution in test generation
        try {
            com.operations.Matrix.Matrix matrix4 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(0, 0, (int) (byte) 10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.project2D(65.19779036970327d, 1.969615506024416d);
        double double3 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix2);
        com.operations.Matrix.Matrix matrix4 = com.operations.Matrix.MatrixOperations.transpose(matrix2);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 65.22753447995213d + "'", double3 == 65.22753447995213d);
        org.junit.Assert.assertNotNull(matrix4);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.project2D((double) '#', 0.0d);
        int int3 = matrix2.getCols();
        double[][] doubleArray4 = matrix2.getData();
        double double5 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix2);
        int int6 = matrix2.getCols();
        com.operations.Matrix.Matrix matrix9 = com.operations.Matrix.MatrixTransformations.scale2D(350.0d, (double) ' ');
        boolean boolean10 = com.operations.Matrix.MatrixUtils.isSquare(matrix9);
        int int11 = matrix9.getRows();
        com.operations.Matrix.Matrix matrix14 = com.operations.Matrix.MatrixTransformations.project2D(52.009614495783374d, (double) (short) -1);
        com.operations.Matrix.Matrix matrix15 = com.operations.Matrix.MatrixOperations.multiply(matrix9, matrix14);
        com.operations.Matrix.Matrix matrix16 = com.operations.Matrix.MatrixOperations.add(matrix2, matrix14);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(matrix16);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D(1.414213562373095d, 36.40054944640259d);
        com.operations.Matrix.Matrix matrix3 = com.operations.Matrix.MatrixOperations.transpose(matrix2);
        double[][] doubleArray4 = matrix3.getData();
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D(100.0d);
        int int2 = matrix1.getCols();
        matrix1.print();
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix1, (double) (byte) 1);
        com.operations.Matrix.Matrix matrix7 = com.operations.Matrix.MatrixTransformations.rotate2D(350.0d);
        com.operations.Matrix.Matrix matrix9 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray12 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray13 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix9, doubleArray12);
        double[] doubleArray14 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix7, doubleArray13);
        double[] doubleArray15 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix1, doubleArray13);
        int int16 = matrix1.getRows();
        matrix1.print();
        com.operations.Matrix.Matrix matrix20 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0, (double) 100L);
        com.operations.Matrix.Matrix matrix25 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(2, (int) (short) 1, (int) (short) 100, 0);
        boolean boolean27 = com.operations.Matrix.MatrixUtils.compare(matrix20, matrix25, (-1.0d));
        com.operations.Matrix.Matrix matrix29 = com.operations.Matrix.MatrixTransformations.rotate2D(100.0d);
        int int30 = matrix29.getCols();
        double[][] doubleArray31 = matrix29.getData();
        double[] doubleArray34 = new double[] { 10, 'a' };
        double[] doubleArray37 = new double[] { 10, 'a' };
        double[][] doubleArray38 = new double[][] { doubleArray34, doubleArray37 };
        com.operations.Matrix.Matrix matrix39 = new com.operations.Matrix.Matrix(doubleArray38);
        com.operations.Matrix.Matrix matrix40 = com.operations.Matrix.MatrixOperations.transpose(matrix39);
        com.operations.Matrix.Matrix matrix43 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int44 = matrix43.getRows();
        com.operations.Matrix.Matrix matrix50 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(100, (int) (byte) 1, (int) '#', (int) '#', 1L);
        boolean boolean52 = com.operations.Matrix.MatrixUtils.compare(matrix43, matrix50, (double) 1.0f);
        com.operations.Matrix.Matrix matrix54 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix43, (double) 1L);
        matrix43.print();
        com.operations.Matrix.Matrix matrix56 = com.operations.Matrix.MatrixOperations.multiply(matrix40, matrix43);
        boolean boolean58 = com.operations.Matrix.MatrixUtils.compare(matrix29, matrix56, (double) 0.0f);
        boolean boolean59 = com.operations.Matrix.MatrixUtils.isSquare(matrix56);
        double double60 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix56);
        com.operations.Matrix.Matrix matrix61 = com.operations.Matrix.MatrixOperations.add(matrix20, matrix56);
        com.operations.Matrix.Matrix matrix62 = com.operations.Matrix.MatrixOperations.add(matrix1, matrix20);
        com.operations.Matrix.Matrix matrix63 = com.operations.Matrix.MatrixOperations.transpose(matrix20);
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-0.9999999999999858d), (-137.90576492663388d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-129.24700952206834d), 48.1062421064292d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(matrix43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(matrix54);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 975.1410154434076d + "'", double60 == 975.1410154434076d);
        org.junit.Assert.assertNotNull(matrix61);
        org.junit.Assert.assertNotNull(matrix62);
        org.junit.Assert.assertNotNull(matrix63);
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D(1.414213562373095d);
        com.operations.Matrix.Matrix matrix3 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix1, 21.023651153076518d);
        com.operations.Matrix.Matrix matrix6 = com.operations.Matrix.MatrixTransformations.scale2D((double) (byte) 10, (double) 10);
        double[] doubleArray9 = new double[] { 10, 'a' };
        double[] doubleArray12 = new double[] { 10, 'a' };
        double[][] doubleArray13 = new double[][] { doubleArray9, doubleArray12 };
        com.operations.Matrix.Matrix matrix14 = new com.operations.Matrix.Matrix(doubleArray13);
        com.operations.Matrix.Matrix matrix15 = new com.operations.Matrix.Matrix(doubleArray13);
        boolean boolean16 = com.operations.Matrix.MatrixUtils.isSquare(matrix15);
        double[] doubleArray19 = new double[] { 10, 'a' };
        double[] doubleArray22 = new double[] { 10, 'a' };
        double[][] doubleArray23 = new double[][] { doubleArray19, doubleArray22 };
        com.operations.Matrix.Matrix matrix24 = new com.operations.Matrix.Matrix(doubleArray23);
        int int25 = matrix24.getCols();
        int int26 = matrix24.getCols();
        matrix24.print();
        double[] doubleArray30 = new double[] { 10, 'a' };
        double[] doubleArray33 = new double[] { 10, 'a' };
        double[][] doubleArray34 = new double[][] { doubleArray30, doubleArray33 };
        com.operations.Matrix.Matrix matrix35 = new com.operations.Matrix.Matrix(doubleArray34);
        boolean boolean37 = com.operations.Matrix.MatrixUtils.compare(matrix24, matrix35, (double) (-1));
        com.operations.Matrix.Matrix matrix38 = com.operations.Matrix.MatrixOperations.subtract(matrix15, matrix35);
        com.operations.Matrix.Matrix[] matrixArray39 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix38);
        double[][] doubleArray40 = matrix38.getData();
        com.operations.Matrix.Matrix matrix41 = new com.operations.Matrix.Matrix(doubleArray40);
        com.operations.Matrix.Matrix matrix42 = com.operations.Matrix.MatrixOperations.multiply(matrix6, matrix41);
        boolean boolean43 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix6);
        com.operations.Matrix.Matrix matrix45 = com.operations.Matrix.MatrixTransformations.rotate2D(350.0d);
        com.operations.Matrix.Matrix matrix46 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix45);
        int int47 = matrix45.getRows();
        com.operations.Matrix.Matrix matrix48 = com.operations.Matrix.MatrixOperations.subtract(matrix6, matrix45);
        com.operations.Matrix.Matrix matrix49 = com.operations.Matrix.MatrixOperations.multiply(matrix3, matrix6);
        com.operations.Matrix.Matrix matrix51 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix49, 364.0054944640259d);
        int int52 = matrix51.getRows();
        double[][] doubleArray53 = matrix51.getData();
        com.operations.Matrix.Matrix matrix54 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix51);
        matrix54.print();
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(matrixArray39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertNotNull(matrix46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(matrix48);
        org.junit.Assert.assertNotNull(matrix49);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertNotNull(matrix54);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.project2D((double) ' ', 0.0d);
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[] doubleArray8 = new double[] { 10, 'a' };
        double[][] doubleArray9 = new double[][] { doubleArray5, doubleArray8 };
        com.operations.Matrix.Matrix matrix10 = new com.operations.Matrix.Matrix(doubleArray9);
        int int11 = matrix10.getCols();
        boolean boolean12 = com.operations.Matrix.MatrixUtils.isSquare(matrix10);
        com.operations.Matrix.Matrix matrix13 = com.operations.Matrix.MatrixOperations.transpose(matrix10);
        int int14 = matrix13.getRows();
        com.operations.Matrix.Matrix matrix17 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray20 = new double[] { 10, 'a' };
        double[] doubleArray23 = new double[] { 10, 'a' };
        double[][] doubleArray24 = new double[][] { doubleArray20, doubleArray23 };
        com.operations.Matrix.Matrix matrix25 = new com.operations.Matrix.Matrix(doubleArray24);
        int int26 = matrix25.getCols();
        int int27 = matrix25.getCols();
        int int28 = matrix25.getCols();
        com.operations.Matrix.Matrix[] matrixArray29 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix25);
        com.operations.Matrix.Matrix matrix30 = com.operations.Matrix.MatrixOperations.multiply(matrix17, matrix25);
        com.operations.Matrix.Matrix matrix32 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean34 = com.operations.Matrix.MatrixUtils.compare(matrix25, matrix32, (double) (byte) 0);
        com.operations.Matrix.Matrix matrix35 = com.operations.Matrix.MatrixOperations.multiply(matrix13, matrix25);
        com.operations.Matrix.Matrix matrix36 = com.operations.Matrix.MatrixOperations.add(matrix2, matrix25);
        com.operations.Matrix.Matrix matrix37 = com.operations.Matrix.MatrixOperations.transpose(matrix2);
        com.operations.Matrix.Matrix matrix40 = com.operations.Matrix.MatrixTransformations.scale2D((double) (byte) 100, 350.0d);
        double double41 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix40);
        int int42 = matrix40.getCols();
        com.operations.Matrix.Matrix matrix43 = com.operations.Matrix.MatrixOperations.multiply(matrix2, matrix40);
        com.operations.Matrix.Matrix matrix46 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int47 = matrix46.getRows();
        com.operations.Matrix.Matrix matrix49 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix46, (double) 2);
        double double50 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix46);
        int int51 = matrix46.getRows();
        com.operations.Matrix.Matrix matrix52 = com.operations.Matrix.MatrixOperations.transpose(matrix46);
        com.operations.Matrix.Matrix matrix53 = com.operations.Matrix.MatrixOperations.add(matrix43, matrix52);
        double[][] doubleArray54 = matrix52.getData();
        com.operations.Matrix.Matrix matrix55 = new com.operations.Matrix.Matrix(doubleArray54);
        com.operations.Matrix.Matrix matrix61 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(35, 10, 0, (int) (short) 10, (long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.operations.Matrix.Matrix matrix62 = com.operations.Matrix.MatrixOperations.add(matrix55, matrix61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices must have the same dimensions for addition.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(matrix13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(matrix17);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(matrixArray29);
        org.junit.Assert.assertNotNull(matrix30);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 364.0054944640259d + "'", double41 == 364.0054944640259d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(matrix43);
        org.junit.Assert.assertNotNull(matrix46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(matrix49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(matrix52);
        org.junit.Assert.assertNotNull(matrix53);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertNotNull(matrix61);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        com.operations.Matrix.Matrix matrix2 = new com.operations.Matrix.Matrix((int) (short) 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray3 = matrix2.getData();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D((double) 2, (double) 0L);
        org.junit.Assert.assertNotNull(matrix2);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[] doubleArray8 = new double[] { 10, 'a' };
        double[][] doubleArray9 = new double[][] { doubleArray5, doubleArray8 };
        com.operations.Matrix.Matrix matrix10 = new com.operations.Matrix.Matrix(doubleArray9);
        int int11 = matrix10.getCols();
        int int12 = matrix10.getCols();
        int int13 = matrix10.getCols();
        com.operations.Matrix.Matrix[] matrixArray14 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix10);
        com.operations.Matrix.Matrix matrix15 = com.operations.Matrix.MatrixOperations.multiply(matrix2, matrix10);
        com.operations.Matrix.Matrix matrix17 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean19 = com.operations.Matrix.MatrixUtils.compare(matrix10, matrix17, (double) (byte) 0);
        com.operations.Matrix.Matrix[] matrixArray20 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix10);
        com.operations.Matrix.Matrix matrix21 = com.operations.Matrix.MatrixOperations.transpose(matrix10);
        com.operations.Matrix.Matrix matrix23 = com.operations.Matrix.MatrixTransformations.rotate2D(35.0d);
        com.operations.Matrix.Matrix matrix24 = com.operations.Matrix.MatrixOperations.subtract(matrix21, matrix23);
        com.operations.Matrix.Matrix matrix27 = com.operations.Matrix.MatrixTransformations.scale2D((double) (-1L), (double) '4');
        com.operations.Matrix.Matrix matrix28 = com.operations.Matrix.MatrixOperations.transpose(matrix27);
        com.operations.Matrix.Matrix matrix29 = com.operations.Matrix.MatrixOperations.subtract(matrix23, matrix27);
        double double30 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix23);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(matrixArray14);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(matrix17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(matrixArray20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix23);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.414213562373095d + "'", double30 == 1.414213562373095d);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D(100.0d);
        int int2 = matrix1.getCols();
        matrix1.print();
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix1, (double) (byte) 1);
        com.operations.Matrix.Matrix[] matrixArray6 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix1);
        com.operations.Matrix.Matrix matrix7 = com.operations.Matrix.MatrixOperations.transpose(matrix1);
        double[][] doubleArray8 = matrix7.getData();
        com.operations.Matrix.Matrix matrix9 = new com.operations.Matrix.Matrix(doubleArray8);
        com.operations.Matrix.Matrix matrix11 = com.operations.Matrix.MatrixTransformations.rotate2D((double) '4');
        double[] doubleArray14 = new double[] { 10, 'a' };
        double[] doubleArray17 = new double[] { 10, 'a' };
        double[][] doubleArray18 = new double[][] { doubleArray14, doubleArray17 };
        com.operations.Matrix.Matrix matrix19 = new com.operations.Matrix.Matrix(doubleArray18);
        com.operations.Matrix.Matrix matrix20 = new com.operations.Matrix.Matrix(doubleArray18);
        com.operations.Matrix.Matrix matrix22 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray25 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray26 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix22, doubleArray25);
        com.operations.Matrix.Matrix matrix27 = com.operations.Matrix.MatrixOperations.add(matrix20, matrix22);
        boolean boolean28 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix27);
        boolean boolean30 = com.operations.Matrix.MatrixUtils.compare(matrix11, matrix27, 364.0054944640259d);
        com.operations.Matrix.Matrix matrix33 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int34 = matrix33.getRows();
        com.operations.Matrix.Matrix matrix36 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix33, (double) 2);
        matrix33.print();
        com.operations.Matrix.Matrix matrix38 = com.operations.Matrix.MatrixOperations.multiply(matrix27, matrix33);
        com.operations.Matrix.Matrix matrix41 = com.operations.Matrix.MatrixTransformations.project2D((double) ' ', 0.0d);
        double[] doubleArray44 = new double[] { 10, 'a' };
        double[] doubleArray47 = new double[] { 10, 'a' };
        double[][] doubleArray48 = new double[][] { doubleArray44, doubleArray47 };
        com.operations.Matrix.Matrix matrix49 = new com.operations.Matrix.Matrix(doubleArray48);
        int int50 = matrix49.getCols();
        boolean boolean51 = com.operations.Matrix.MatrixUtils.isSquare(matrix49);
        com.operations.Matrix.Matrix matrix52 = com.operations.Matrix.MatrixOperations.transpose(matrix49);
        int int53 = matrix52.getRows();
        com.operations.Matrix.Matrix matrix56 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray59 = new double[] { 10, 'a' };
        double[] doubleArray62 = new double[] { 10, 'a' };
        double[][] doubleArray63 = new double[][] { doubleArray59, doubleArray62 };
        com.operations.Matrix.Matrix matrix64 = new com.operations.Matrix.Matrix(doubleArray63);
        int int65 = matrix64.getCols();
        int int66 = matrix64.getCols();
        int int67 = matrix64.getCols();
        com.operations.Matrix.Matrix[] matrixArray68 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix64);
        com.operations.Matrix.Matrix matrix69 = com.operations.Matrix.MatrixOperations.multiply(matrix56, matrix64);
        com.operations.Matrix.Matrix matrix71 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean73 = com.operations.Matrix.MatrixUtils.compare(matrix64, matrix71, (double) (byte) 0);
        com.operations.Matrix.Matrix matrix74 = com.operations.Matrix.MatrixOperations.multiply(matrix52, matrix64);
        com.operations.Matrix.Matrix matrix75 = com.operations.Matrix.MatrixOperations.add(matrix41, matrix64);
        matrix64.print();
        com.operations.Matrix.Matrix matrix77 = com.operations.Matrix.MatrixOperations.add(matrix33, matrix64);
        double double78 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix77);
        boolean boolean80 = com.operations.Matrix.MatrixUtils.compare(matrix9, matrix77, 1.969615506024416d);
        com.operations.Matrix.Matrix matrix81 = com.operations.Matrix.MatrixOperations.transpose(matrix9);
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(matrixArray6);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(matrix52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertNotNull(matrixArray68);
        org.junit.Assert.assertNotNull(matrix69);
        org.junit.Assert.assertNotNull(matrix71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(matrix74);
        org.junit.Assert.assertNotNull(matrix75);
        org.junit.Assert.assertNotNull(matrix77);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 145.11374848717816d + "'", double78 == 145.11374848717816d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(matrix81);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[] doubleArray8 = new double[] { 10, 'a' };
        double[][] doubleArray9 = new double[][] { doubleArray5, doubleArray8 };
        com.operations.Matrix.Matrix matrix10 = new com.operations.Matrix.Matrix(doubleArray9);
        int int11 = matrix10.getCols();
        int int12 = matrix10.getCols();
        int int13 = matrix10.getCols();
        com.operations.Matrix.Matrix[] matrixArray14 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix10);
        com.operations.Matrix.Matrix matrix15 = com.operations.Matrix.MatrixOperations.multiply(matrix2, matrix10);
        int int16 = matrix10.getRows();
        com.operations.Matrix.Matrix matrix18 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix10, (double) (-1L));
        com.operations.Matrix.Matrix matrix20 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix18, 10.0d);
        com.operations.Matrix.Matrix matrix22 = com.operations.Matrix.MatrixTransformations.rotate2D(100.0d);
        int int23 = matrix22.getCols();
        int int24 = matrix22.getRows();
        double[] doubleArray27 = new double[] { 10, 'a' };
        double[] doubleArray30 = new double[] { 10, 'a' };
        double[][] doubleArray31 = new double[][] { doubleArray27, doubleArray30 };
        com.operations.Matrix.Matrix matrix32 = new com.operations.Matrix.Matrix(doubleArray31);
        com.operations.Matrix.Matrix matrix33 = com.operations.Matrix.MatrixOperations.transpose(matrix32);
        com.operations.Matrix.Matrix matrix36 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int37 = matrix36.getRows();
        com.operations.Matrix.Matrix matrix43 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(100, (int) (byte) 1, (int) '#', (int) '#', 1L);
        boolean boolean45 = com.operations.Matrix.MatrixUtils.compare(matrix36, matrix43, (double) 1.0f);
        com.operations.Matrix.Matrix matrix47 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix36, (double) 1L);
        matrix36.print();
        com.operations.Matrix.Matrix matrix49 = com.operations.Matrix.MatrixOperations.multiply(matrix33, matrix36);
        boolean boolean50 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix36);
        com.operations.Matrix.Matrix matrix51 = com.operations.Matrix.MatrixOperations.subtract(matrix22, matrix36);
        com.operations.Matrix.Matrix matrix52 = com.operations.Matrix.MatrixOperations.subtract(matrix18, matrix51);
        double double53 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix51);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(matrixArray14);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(matrix43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(matrix47);
        org.junit.Assert.assertNotNull(matrix49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertNotNull(matrix52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.270003094125075d + "'", double53 == 10.270003094125075d);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D((-1.0d));
        com.operations.Matrix.Matrix matrix3 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (-1L));
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray8 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray9 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix5, doubleArray8);
        double[] doubleArray10 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix3, doubleArray8);
        double[] doubleArray11 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix1, doubleArray8);
        double double14 = matrix1.getValue(0, (int) (byte) 1);
        boolean boolean15 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix1);
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 137.90221361711127d, 1.4069397643877004d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 137.90221361711127d, 1.4069397643877004d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.01745240643728351d + "'", double14 == 0.01745240643728351d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        com.operations.Matrix.Matrix matrix2 = new com.operations.Matrix.Matrix((int) '4', 1);
        com.operations.Matrix.Matrix matrix3 = com.operations.Matrix.MatrixOperations.transpose(matrix2);
        matrix2.print();
        org.junit.Assert.assertNotNull(matrix3);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixUtils.generateRandomMatrix((int) (byte) 100, 0, (int) (byte) 1, 2, (long) 32);
        boolean boolean6 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix5);
        double[][] doubleArray7 = matrix5.getData();
        double[] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix5, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix must be square to solve equations.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.project2D((double) 35, 1.414213562373095d);
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int6 = matrix5.getRows();
        com.operations.Matrix.Matrix matrix9 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int10 = matrix9.getRows();
        com.operations.Matrix.Matrix matrix12 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix9, (double) 2);
        com.operations.Matrix.Matrix matrix13 = com.operations.Matrix.MatrixOperations.subtract(matrix5, matrix9);
        com.operations.Matrix.Matrix matrix16 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int17 = matrix16.getRows();
        com.operations.Matrix.Matrix matrix23 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(100, (int) (byte) 1, (int) '#', (int) '#', 1L);
        boolean boolean25 = com.operations.Matrix.MatrixUtils.compare(matrix16, matrix23, (double) 1.0f);
        com.operations.Matrix.Matrix matrix27 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix16, (double) 1L);
        boolean boolean29 = com.operations.Matrix.MatrixUtils.compare(matrix13, matrix27, 0.0d);
        com.operations.Matrix.Matrix matrix30 = com.operations.Matrix.MatrixOperations.transpose(matrix13);
        int int31 = matrix13.getCols();
        com.operations.Matrix.Matrix matrix33 = com.operations.Matrix.MatrixTransformations.rotate2D(32.0d);
        com.operations.Matrix.Matrix matrix34 = com.operations.Matrix.MatrixOperations.subtract(matrix13, matrix33);
        com.operations.Matrix.Matrix matrix35 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix33);
        com.operations.Matrix.Matrix matrix38 = com.operations.Matrix.MatrixTransformations.project2D(400.0d, 36.40054944640259d);
        com.operations.Matrix.Matrix matrix40 = com.operations.Matrix.MatrixTransformations.rotate2D(100.0d);
        int int41 = matrix40.getCols();
        matrix40.print();
        com.operations.Matrix.Matrix matrix44 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix40, (double) (byte) 1);
        com.operations.Matrix.Matrix matrix46 = com.operations.Matrix.MatrixTransformations.rotate2D(350.0d);
        com.operations.Matrix.Matrix matrix48 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray51 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray52 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix48, doubleArray51);
        double[] doubleArray53 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix46, doubleArray52);
        double[] doubleArray54 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix40, doubleArray52);
        double[] doubleArray55 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix38, doubleArray52);
        double[] doubleArray56 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix33, doubleArray52);
        double[] doubleArray57 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix2, doubleArray56);
        com.operations.Matrix.Matrix matrix58 = com.operations.Matrix.MatrixOperations.transpose(matrix2);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(matrix12);
        org.junit.Assert.assertNotNull(matrix13);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(matrix23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(matrix30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(matrix44);
        org.junit.Assert.assertNotNull(matrix46);
        org.junit.Assert.assertNotNull(matrix48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { (-0.9999999999999858d), (-137.90576492663388d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { (-129.24700952206834d), 48.1062421064292d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { (-0.06232973130571564d), (-3.7262354653980627d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { (-93.02011293121807d), (-101.81482500237102d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { (-2.657717512320516d), (-71.9939531844982d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix58);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        com.operations.Matrix.Matrix matrix4 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(35, 35, (int) (byte) 10, 1);
        org.junit.Assert.assertNotNull(matrix4);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        double[] doubleArray2 = new double[] { 10, 'a' };
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[][] doubleArray6 = new double[][] { doubleArray2, doubleArray5 };
        com.operations.Matrix.Matrix matrix7 = new com.operations.Matrix.Matrix(doubleArray6);
        com.operations.Matrix.Matrix matrix8 = new com.operations.Matrix.Matrix(doubleArray6);
        boolean boolean9 = com.operations.Matrix.MatrixUtils.isSquare(matrix8);
        double[] doubleArray12 = new double[] { 10, 'a' };
        double[] doubleArray15 = new double[] { 10, 'a' };
        double[][] doubleArray16 = new double[][] { doubleArray12, doubleArray15 };
        com.operations.Matrix.Matrix matrix17 = new com.operations.Matrix.Matrix(doubleArray16);
        int int18 = matrix17.getCols();
        int int19 = matrix17.getCols();
        matrix17.print();
        double[] doubleArray23 = new double[] { 10, 'a' };
        double[] doubleArray26 = new double[] { 10, 'a' };
        double[][] doubleArray27 = new double[][] { doubleArray23, doubleArray26 };
        com.operations.Matrix.Matrix matrix28 = new com.operations.Matrix.Matrix(doubleArray27);
        boolean boolean30 = com.operations.Matrix.MatrixUtils.compare(matrix17, matrix28, (double) (-1));
        com.operations.Matrix.Matrix matrix31 = com.operations.Matrix.MatrixOperations.subtract(matrix8, matrix28);
        com.operations.Matrix.Matrix matrix33 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix8, (double) 0.0f);
        int int34 = matrix8.getCols();
        com.operations.Matrix.Matrix matrix35 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix8);
        int int36 = matrix35.getRows();
        com.operations.Matrix.Matrix[] matrixArray37 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix35);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(matrixArray37);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0.0f, 350.0d);
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixTransformations.project2D(0.0d, (double) 0);
        com.operations.Matrix.Matrix[] matrixArray6 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix5);
        com.operations.Matrix.Matrix matrix9 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int10 = matrix9.getRows();
        com.operations.Matrix.Matrix matrix12 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix9, (double) 2);
        double double13 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix9);
        int int14 = matrix9.getRows();
        com.operations.Matrix.Matrix matrix15 = com.operations.Matrix.MatrixOperations.transpose(matrix9);
        com.operations.Matrix.Matrix matrix16 = com.operations.Matrix.MatrixOperations.multiply(matrix5, matrix15);
        com.operations.Matrix.Matrix matrix17 = com.operations.Matrix.MatrixOperations.multiply(matrix2, matrix15);
        boolean boolean18 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix2);
        com.operations.Matrix.Matrix matrix21 = com.operations.Matrix.MatrixTransformations.scale2D(137.15495886388925d, 137.90576492663388d);
        boolean boolean23 = com.operations.Matrix.MatrixUtils.compare(matrix2, matrix21, 138.5659917737053d);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(matrixArray6);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(matrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(matrix17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.project2D((double) 100L, (double) 100);
        com.operations.Matrix.Matrix matrix4 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray7 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray8 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix4, doubleArray7);
        com.operations.Matrix.Matrix matrix11 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray14 = new double[] { 10, 'a' };
        double[] doubleArray17 = new double[] { 10, 'a' };
        double[][] doubleArray18 = new double[][] { doubleArray14, doubleArray17 };
        com.operations.Matrix.Matrix matrix19 = new com.operations.Matrix.Matrix(doubleArray18);
        int int20 = matrix19.getCols();
        int int21 = matrix19.getCols();
        int int22 = matrix19.getCols();
        com.operations.Matrix.Matrix[] matrixArray23 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix19);
        com.operations.Matrix.Matrix matrix24 = com.operations.Matrix.MatrixOperations.multiply(matrix11, matrix19);
        boolean boolean26 = com.operations.Matrix.MatrixUtils.compare(matrix4, matrix11, (double) (-1L));
        boolean boolean27 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix4);
        int int28 = matrix4.getCols();
        com.operations.Matrix.Matrix[] matrixArray29 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix4);
        double double30 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix4);
        com.operations.Matrix.Matrix matrix32 = com.operations.Matrix.MatrixTransformations.rotate2D(100.0d);
        int int33 = matrix32.getCols();
        matrix32.print();
        com.operations.Matrix.Matrix matrix36 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix32, (double) (byte) 1);
        com.operations.Matrix.Matrix matrix38 = com.operations.Matrix.MatrixTransformations.rotate2D(350.0d);
        com.operations.Matrix.Matrix matrix40 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray43 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray44 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix40, doubleArray43);
        double[] doubleArray45 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix38, doubleArray44);
        double[] doubleArray46 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix32, doubleArray44);
        double[] doubleArray47 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix4, doubleArray46);
        boolean boolean48 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix4);
        com.operations.Matrix.Matrix matrix49 = com.operations.Matrix.MatrixOperations.add(matrix2, matrix4);
        double[][] doubleArray50 = matrix4.getData();
        java.lang.Class<?> wildcardClass51 = doubleArray50.getClass();
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(matrixArray23);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(matrixArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.414213562373095d + "'", double30 == 1.414213562373095d);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { (-0.9999999999999858d), (-137.90576492663388d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { (-129.24700952206834d), 48.1062421064292d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 69.81890786710137d, 118.92989575479001d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(matrix49);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.project2D(1.0d, 0.0d);
        com.operations.Matrix.Matrix matrix4 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix2, 0.0d);
        com.operations.Matrix.Matrix matrix7 = com.operations.Matrix.MatrixTransformations.project2D((double) 0.0f, (double) '4');
        com.operations.Matrix.Matrix matrix8 = com.operations.Matrix.MatrixOperations.subtract(matrix4, matrix7);
        com.operations.Matrix.Matrix matrix11 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray14 = new double[] { 10, 'a' };
        double[] doubleArray17 = new double[] { 10, 'a' };
        double[][] doubleArray18 = new double[][] { doubleArray14, doubleArray17 };
        com.operations.Matrix.Matrix matrix19 = new com.operations.Matrix.Matrix(doubleArray18);
        int int20 = matrix19.getCols();
        int int21 = matrix19.getCols();
        int int22 = matrix19.getCols();
        com.operations.Matrix.Matrix[] matrixArray23 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix19);
        com.operations.Matrix.Matrix matrix24 = com.operations.Matrix.MatrixOperations.multiply(matrix11, matrix19);
        com.operations.Matrix.Matrix matrix26 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean28 = com.operations.Matrix.MatrixUtils.compare(matrix19, matrix26, (double) (byte) 0);
        double[] doubleArray31 = new double[] { 10, 'a' };
        double[] doubleArray34 = new double[] { 10, 'a' };
        double[][] doubleArray35 = new double[][] { doubleArray31, doubleArray34 };
        com.operations.Matrix.Matrix matrix36 = new com.operations.Matrix.Matrix(doubleArray35);
        com.operations.Matrix.Matrix matrix37 = com.operations.Matrix.MatrixOperations.multiply(matrix19, matrix36);
        com.operations.Matrix.Matrix matrix39 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix19, 364.0054944640259d);
        com.operations.Matrix.Matrix matrix42 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int43 = matrix42.getRows();
        com.operations.Matrix.Matrix matrix45 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix42, (double) 2);
        matrix42.print();
        matrix42.print();
        com.operations.Matrix.Matrix matrix48 = com.operations.Matrix.MatrixOperations.multiply(matrix19, matrix42);
        boolean boolean49 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix19);
        com.operations.Matrix.Matrix matrix50 = com.operations.Matrix.MatrixOperations.transpose(matrix19);
        boolean boolean52 = com.operations.Matrix.MatrixUtils.compare(matrix4, matrix19, 32.524725901652594d);
        // The following exception was thrown during execution in test generation
        try {
            matrix19.setValue(10, (int) (short) 100, 73.04302967434272d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(matrixArray23);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertNotNull(matrix48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D((double) '4');
        double[] doubleArray4 = new double[] { 10, 'a' };
        double[] doubleArray7 = new double[] { 10, 'a' };
        double[][] doubleArray8 = new double[][] { doubleArray4, doubleArray7 };
        com.operations.Matrix.Matrix matrix9 = new com.operations.Matrix.Matrix(doubleArray8);
        com.operations.Matrix.Matrix matrix10 = new com.operations.Matrix.Matrix(doubleArray8);
        com.operations.Matrix.Matrix matrix12 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray15 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray16 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix12, doubleArray15);
        com.operations.Matrix.Matrix matrix17 = com.operations.Matrix.MatrixOperations.add(matrix10, matrix12);
        boolean boolean18 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix17);
        boolean boolean20 = com.operations.Matrix.MatrixUtils.compare(matrix1, matrix17, 364.0054944640259d);
        com.operations.Matrix.Matrix[] matrixArray21 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix17);
        com.operations.Matrix.Matrix matrix23 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix17, (double) 1L);
        com.operations.Matrix.Matrix matrix25 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix17, (-10.34729635533386d));
        matrix25.print();
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(matrix12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(matrixArray21);
        org.junit.Assert.assertNotNull(matrix23);
        org.junit.Assert.assertNotNull(matrix25);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D((double) 10L, 35.0d);
        matrix2.print();
        boolean boolean4 = com.operations.Matrix.MatrixUtils.isSquare(matrix2);
        com.operations.Matrix.Matrix matrix6 = com.operations.Matrix.MatrixTransformations.rotate2D((-1.0d));
        com.operations.Matrix.Matrix matrix8 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (-1L));
        com.operations.Matrix.Matrix matrix10 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray13 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray14 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix10, doubleArray13);
        double[] doubleArray15 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix8, doubleArray13);
        double[] doubleArray16 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix6, doubleArray13);
        double[] doubleArray17 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix2, doubleArray13);
        com.operations.Matrix.Matrix matrix19 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray22 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray23 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix19, doubleArray22);
        com.operations.Matrix.Matrix matrix26 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray29 = new double[] { 10, 'a' };
        double[] doubleArray32 = new double[] { 10, 'a' };
        double[][] doubleArray33 = new double[][] { doubleArray29, doubleArray32 };
        com.operations.Matrix.Matrix matrix34 = new com.operations.Matrix.Matrix(doubleArray33);
        int int35 = matrix34.getCols();
        int int36 = matrix34.getCols();
        int int37 = matrix34.getCols();
        com.operations.Matrix.Matrix[] matrixArray38 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix34);
        com.operations.Matrix.Matrix matrix39 = com.operations.Matrix.MatrixOperations.multiply(matrix26, matrix34);
        boolean boolean41 = com.operations.Matrix.MatrixUtils.compare(matrix19, matrix26, (double) (-1L));
        com.operations.Matrix.Matrix matrix43 = com.operations.Matrix.MatrixTransformations.rotate2D((-1.0d));
        com.operations.Matrix.Matrix matrix45 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (-1L));
        com.operations.Matrix.Matrix matrix47 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray50 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray51 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix47, doubleArray50);
        double[] doubleArray52 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix45, doubleArray50);
        double[] doubleArray53 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix43, doubleArray50);
        boolean boolean55 = com.operations.Matrix.MatrixUtils.compare(matrix26, matrix43, (double) '4');
        com.operations.Matrix.Matrix matrix57 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray60 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray61 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix57, doubleArray60);
        com.operations.Matrix.Matrix matrix64 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray67 = new double[] { 10, 'a' };
        double[] doubleArray70 = new double[] { 10, 'a' };
        double[][] doubleArray71 = new double[][] { doubleArray67, doubleArray70 };
        com.operations.Matrix.Matrix matrix72 = new com.operations.Matrix.Matrix(doubleArray71);
        int int73 = matrix72.getCols();
        int int74 = matrix72.getCols();
        int int75 = matrix72.getCols();
        com.operations.Matrix.Matrix[] matrixArray76 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix72);
        com.operations.Matrix.Matrix matrix77 = com.operations.Matrix.MatrixOperations.multiply(matrix64, matrix72);
        boolean boolean79 = com.operations.Matrix.MatrixUtils.compare(matrix57, matrix64, (double) (-1L));
        double[][] doubleArray80 = matrix57.getData();
        com.operations.Matrix.Matrix matrix82 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray85 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray86 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix82, doubleArray85);
        double[] doubleArray87 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix57, doubleArray85);
        double[] doubleArray88 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix43, doubleArray87);
        boolean boolean90 = com.operations.Matrix.MatrixUtils.compare(matrix2, matrix43, 41.14922324710797d);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 137.90221361711127d, 1.4069397643877004d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 137.90221361711127d, 1.4069397643877004d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 13.790576492663387d, (-0.02857142857142857d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(matrixArray38);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(matrix43);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertNotNull(matrix47);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 137.90221361711127d, 1.4069397643877004d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 137.90221361711127d, 1.4069397643877004d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(matrix57);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2 + "'", int75 == 2);
        org.junit.Assert.assertNotNull(matrixArray76);
        org.junit.Assert.assertNotNull(matrix77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertNotNull(matrix82);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertArrayEquals(doubleArray88, new double[] { (-22.560902902856938d), (-136.05148165384992d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        double[] doubleArray2 = new double[] { 10, 'a' };
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[][] doubleArray6 = new double[][] { doubleArray2, doubleArray5 };
        com.operations.Matrix.Matrix matrix7 = new com.operations.Matrix.Matrix(doubleArray6);
        int int8 = matrix7.getCols();
        int int9 = matrix7.getCols();
        int int10 = matrix7.getCols();
        com.operations.Matrix.Matrix matrix16 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(100, (int) (byte) 1, (int) '#', (int) '#', 1L);
        double double19 = matrix16.getValue((int) '4', 0);
        double double20 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix16);
        boolean boolean21 = com.operations.Matrix.MatrixUtils.isSquare(matrix16);
        boolean boolean23 = com.operations.Matrix.MatrixUtils.compare(matrix7, matrix16, (double) 100L);
        com.operations.Matrix.Matrix matrix24 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix7);
        double[] doubleArray27 = new double[] { 10, 'a' };
        double[] doubleArray30 = new double[] { 10, 'a' };
        double[][] doubleArray31 = new double[][] { doubleArray27, doubleArray30 };
        com.operations.Matrix.Matrix matrix32 = new com.operations.Matrix.Matrix(doubleArray31);
        int int33 = matrix32.getCols();
        int int34 = matrix32.getCols();
        int int35 = matrix32.getCols();
        com.operations.Matrix.Matrix matrix37 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix32, (double) 0.0f);
        boolean boolean39 = com.operations.Matrix.MatrixUtils.compare(matrix24, matrix32, (double) '4');
        int int40 = matrix24.getRows();
        com.operations.Matrix.Matrix matrix43 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray46 = new double[] { 10, 'a' };
        double[] doubleArray49 = new double[] { 10, 'a' };
        double[][] doubleArray50 = new double[][] { doubleArray46, doubleArray49 };
        com.operations.Matrix.Matrix matrix51 = new com.operations.Matrix.Matrix(doubleArray50);
        int int52 = matrix51.getCols();
        int int53 = matrix51.getCols();
        int int54 = matrix51.getCols();
        com.operations.Matrix.Matrix[] matrixArray55 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix51);
        com.operations.Matrix.Matrix matrix56 = com.operations.Matrix.MatrixOperations.multiply(matrix43, matrix51);
        com.operations.Matrix.Matrix matrix58 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean60 = com.operations.Matrix.MatrixUtils.compare(matrix51, matrix58, (double) (byte) 0);
        double[] doubleArray63 = new double[] { 10, 'a' };
        double[] doubleArray66 = new double[] { 10, 'a' };
        double[][] doubleArray67 = new double[][] { doubleArray63, doubleArray66 };
        com.operations.Matrix.Matrix matrix68 = new com.operations.Matrix.Matrix(doubleArray67);
        com.operations.Matrix.Matrix matrix69 = new com.operations.Matrix.Matrix(doubleArray67);
        com.operations.Matrix.Matrix matrix70 = new com.operations.Matrix.Matrix(doubleArray67);
        boolean boolean72 = com.operations.Matrix.MatrixUtils.compare(matrix51, matrix70, (double) (-1));
        double[] doubleArray75 = new double[] { 10, 'a' };
        double[] doubleArray78 = new double[] { 10, 'a' };
        double[][] doubleArray79 = new double[][] { doubleArray75, doubleArray78 };
        com.operations.Matrix.Matrix matrix80 = new com.operations.Matrix.Matrix(doubleArray79);
        com.operations.Matrix.Matrix matrix81 = new com.operations.Matrix.Matrix(doubleArray79);
        boolean boolean82 = com.operations.Matrix.MatrixUtils.isSquare(matrix81);
        com.operations.Matrix.Matrix matrix83 = com.operations.Matrix.MatrixOperations.multiply(matrix70, matrix81);
        double[][] doubleArray84 = matrix81.getData();
        com.operations.Matrix.Matrix matrix85 = new com.operations.Matrix.Matrix(doubleArray84);
        com.operations.Matrix.Matrix matrix86 = com.operations.Matrix.MatrixOperations.transpose(matrix85);
        boolean boolean87 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix85);
        com.operations.Matrix.Matrix matrix89 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix85, (double) 2);
        com.operations.Matrix.Matrix matrix90 = com.operations.Matrix.MatrixOperations.add(matrix24, matrix89);
        matrix89.print();
        int int92 = matrix89.getRows();
        double[][] doubleArray93 = matrix89.getData();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 350.0d + "'", double20 == 350.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(matrix43);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(matrixArray55);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(matrix58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(matrix83);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertNotNull(matrix86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(matrix89);
        org.junit.Assert.assertNotNull(matrix90);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 2 + "'", int92 == 2);
        org.junit.Assert.assertNotNull(doubleArray93);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        com.operations.Matrix.Matrix matrix2 = new com.operations.Matrix.Matrix((int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixUtils.generateRandomMatrix((int) '4', (int) (byte) 1, 100, 32, 0L);
        int int6 = matrix5.getRows();
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D(14009.328092863216d, 146.46842663181715d);
        com.operations.Matrix.Matrix[] matrixArray3 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix2);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(matrixArray3);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D(10.0d, 0.0d);
        com.operations.Matrix.Matrix matrix3 = com.operations.Matrix.MatrixOperations.transpose(matrix2);
        int int4 = matrix3.getRows();
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D(1.414213562373095d);
        com.operations.Matrix.Matrix matrix3 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray6 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray7 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix3, doubleArray6);
        com.operations.Matrix.Matrix matrix10 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray13 = new double[] { 10, 'a' };
        double[] doubleArray16 = new double[] { 10, 'a' };
        double[][] doubleArray17 = new double[][] { doubleArray13, doubleArray16 };
        com.operations.Matrix.Matrix matrix18 = new com.operations.Matrix.Matrix(doubleArray17);
        int int19 = matrix18.getCols();
        int int20 = matrix18.getCols();
        int int21 = matrix18.getCols();
        com.operations.Matrix.Matrix[] matrixArray22 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix18);
        com.operations.Matrix.Matrix matrix23 = com.operations.Matrix.MatrixOperations.multiply(matrix10, matrix18);
        boolean boolean25 = com.operations.Matrix.MatrixUtils.compare(matrix3, matrix10, (double) (-1L));
        com.operations.Matrix.Matrix matrix27 = com.operations.Matrix.MatrixTransformations.rotate2D((-1.0d));
        com.operations.Matrix.Matrix matrix29 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (-1L));
        com.operations.Matrix.Matrix matrix31 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray34 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray35 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix31, doubleArray34);
        double[] doubleArray36 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix29, doubleArray34);
        double[] doubleArray37 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix27, doubleArray34);
        boolean boolean39 = com.operations.Matrix.MatrixUtils.compare(matrix10, matrix27, (double) '4');
        double[] doubleArray42 = new double[] { 10, 'a' };
        double[] doubleArray45 = new double[] { 10, 'a' };
        double[][] doubleArray46 = new double[][] { doubleArray42, doubleArray45 };
        com.operations.Matrix.Matrix matrix47 = new com.operations.Matrix.Matrix(doubleArray46);
        com.operations.Matrix.Matrix matrix48 = new com.operations.Matrix.Matrix(doubleArray46);
        com.operations.Matrix.Matrix matrix50 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray53 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray54 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix50, doubleArray53);
        com.operations.Matrix.Matrix matrix55 = com.operations.Matrix.MatrixOperations.add(matrix48, matrix50);
        com.operations.Matrix.Matrix matrix56 = com.operations.Matrix.MatrixOperations.transpose(matrix50);
        int int57 = matrix50.getCols();
        com.operations.Matrix.Matrix matrix60 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray63 = new double[] { 10, 'a' };
        double[] doubleArray66 = new double[] { 10, 'a' };
        double[][] doubleArray67 = new double[][] { doubleArray63, doubleArray66 };
        com.operations.Matrix.Matrix matrix68 = new com.operations.Matrix.Matrix(doubleArray67);
        int int69 = matrix68.getCols();
        int int70 = matrix68.getCols();
        int int71 = matrix68.getCols();
        com.operations.Matrix.Matrix[] matrixArray72 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix68);
        com.operations.Matrix.Matrix matrix73 = com.operations.Matrix.MatrixOperations.multiply(matrix60, matrix68);
        com.operations.Matrix.Matrix matrix75 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean77 = com.operations.Matrix.MatrixUtils.compare(matrix68, matrix75, (double) (byte) 0);
        boolean boolean78 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix75);
        boolean boolean79 = com.operations.Matrix.MatrixUtils.isSquare(matrix75);
        com.operations.Matrix.Matrix matrix81 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean83 = com.operations.Matrix.MatrixUtils.compare(matrix75, matrix81, (double) (byte) 100);
        matrix81.print();
        com.operations.Matrix.Matrix matrix85 = com.operations.Matrix.MatrixOperations.add(matrix50, matrix81);
        com.operations.Matrix.Matrix matrix86 = com.operations.Matrix.MatrixOperations.subtract(matrix27, matrix81);
        com.operations.Matrix.Matrix matrix87 = com.operations.Matrix.MatrixOperations.subtract(matrix1, matrix86);
        double double88 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix87);
        com.operations.Matrix.Matrix matrix89 = com.operations.Matrix.MatrixOperations.transpose(matrix87);
        com.operations.Matrix.Matrix matrix91 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix89, (double) 1L);
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(matrixArray22);
        org.junit.Assert.assertNotNull(matrix23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 137.90221361711127d, 1.4069397643877004d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 137.90221361711127d, 1.4069397643877004d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix55);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(matrix60);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(matrixArray72);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertNotNull(matrix75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(matrix81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(matrix85);
        org.junit.Assert.assertNotNull(matrix86);
        org.junit.Assert.assertNotNull(matrix87);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 1.472965077159101d + "'", double88 == 1.472965077159101d);
        org.junit.Assert.assertNotNull(matrix89);
        org.junit.Assert.assertNotNull(matrix91);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D((double) 10L, 145.11374848717816d);
        com.operations.Matrix.Matrix matrix3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.operations.Matrix.MatrixUtils.compare(matrix2, matrix3, 100.00000152293244d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix2);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        com.operations.Matrix.Matrix matrix2 = new com.operations.Matrix.Matrix(0, 2);
        com.operations.Matrix.Matrix matrix4 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray7 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray8 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix4, doubleArray7);
        com.operations.Matrix.Matrix matrix11 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray14 = new double[] { 10, 'a' };
        double[] doubleArray17 = new double[] { 10, 'a' };
        double[][] doubleArray18 = new double[][] { doubleArray14, doubleArray17 };
        com.operations.Matrix.Matrix matrix19 = new com.operations.Matrix.Matrix(doubleArray18);
        int int20 = matrix19.getCols();
        int int21 = matrix19.getCols();
        int int22 = matrix19.getCols();
        com.operations.Matrix.Matrix[] matrixArray23 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix19);
        com.operations.Matrix.Matrix matrix24 = com.operations.Matrix.MatrixOperations.multiply(matrix11, matrix19);
        boolean boolean26 = com.operations.Matrix.MatrixUtils.compare(matrix4, matrix11, (double) (-1L));
        double[] doubleArray29 = new double[] { 10, 'a' };
        double[] doubleArray32 = new double[] { 10, 'a' };
        double[][] doubleArray33 = new double[][] { doubleArray29, doubleArray32 };
        com.operations.Matrix.Matrix matrix34 = new com.operations.Matrix.Matrix(doubleArray33);
        int int35 = matrix34.getCols();
        int int36 = matrix34.getCols();
        boolean boolean37 = com.operations.Matrix.MatrixUtils.isSquare(matrix34);
        com.operations.Matrix.Matrix matrix38 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix34);
        com.operations.Matrix.Matrix matrix41 = com.operations.Matrix.MatrixTransformations.project2D(0.0d, (double) 0);
        com.operations.Matrix.Matrix matrix42 = com.operations.Matrix.MatrixOperations.subtract(matrix38, matrix41);
        com.operations.Matrix.Matrix matrix44 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix38, (double) 1.0f);
        com.operations.Matrix.Matrix matrix45 = com.operations.Matrix.MatrixOperations.subtract(matrix4, matrix44);
        com.operations.Matrix.Matrix matrix46 = com.operations.Matrix.MatrixOperations.transpose(matrix44);
        // The following exception was thrown during execution in test generation
        try {
            com.operations.Matrix.Matrix matrix47 = com.operations.Matrix.MatrixOperations.add(matrix2, matrix46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices must have the same dimensions for addition.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(matrixArray23);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(matrix44);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertNotNull(matrix46);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.project2D(10.0d, (double) '#');
        double double3 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix2);
        com.operations.Matrix.Matrix matrix6 = com.operations.Matrix.MatrixTransformations.scale2D((double) 1.0f, (double) 1);
        com.operations.Matrix.Matrix matrix8 = com.operations.Matrix.MatrixTransformations.rotate2D((double) 1.0f);
        com.operations.Matrix.Matrix matrix11 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int12 = matrix11.getRows();
        com.operations.Matrix.Matrix matrix14 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix11, (double) 2);
        double double15 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix11);
        com.operations.Matrix.Matrix matrix18 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int19 = matrix18.getRows();
        com.operations.Matrix.Matrix matrix21 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix18, (double) 2);
        com.operations.Matrix.Matrix matrix22 = com.operations.Matrix.MatrixOperations.subtract(matrix11, matrix21);
        com.operations.Matrix.Matrix matrix23 = com.operations.Matrix.MatrixOperations.add(matrix8, matrix21);
        boolean boolean25 = com.operations.Matrix.MatrixUtils.compare(matrix6, matrix8, (double) (byte) -1);
        com.operations.Matrix.Matrix matrix26 = com.operations.Matrix.MatrixOperations.transpose(matrix8);
        com.operations.Matrix.Matrix matrix29 = com.operations.Matrix.MatrixTransformations.project2D((double) 10L, 10.0d);
        com.operations.Matrix.Matrix matrix31 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray34 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray35 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix31, doubleArray34);
        com.operations.Matrix.Matrix matrix38 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray41 = new double[] { 10, 'a' };
        double[] doubleArray44 = new double[] { 10, 'a' };
        double[][] doubleArray45 = new double[][] { doubleArray41, doubleArray44 };
        com.operations.Matrix.Matrix matrix46 = new com.operations.Matrix.Matrix(doubleArray45);
        int int47 = matrix46.getCols();
        int int48 = matrix46.getCols();
        int int49 = matrix46.getCols();
        com.operations.Matrix.Matrix[] matrixArray50 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix46);
        com.operations.Matrix.Matrix matrix51 = com.operations.Matrix.MatrixOperations.multiply(matrix38, matrix46);
        boolean boolean53 = com.operations.Matrix.MatrixUtils.compare(matrix31, matrix38, (double) (-1L));
        double[][] doubleArray54 = matrix31.getData();
        com.operations.Matrix.Matrix matrix56 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray59 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray60 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix56, doubleArray59);
        double[] doubleArray61 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix31, doubleArray59);
        double[] doubleArray62 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix29, doubleArray61);
        double[] doubleArray63 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix8, doubleArray62);
        com.operations.Matrix.Matrix matrix64 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix8);
        matrix8.print();
        boolean boolean67 = com.operations.Matrix.MatrixUtils.compare(matrix2, matrix8, 100.00499987500625d);
        com.operations.Matrix.Matrix matrix69 = com.operations.Matrix.MatrixTransformations.rotate2D(350.0d);
        com.operations.Matrix.Matrix matrix70 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix69);
        com.operations.Matrix.Matrix matrix71 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix70);
        matrix71.print();
        com.operations.Matrix.Matrix matrix73 = com.operations.Matrix.MatrixOperations.subtract(matrix8, matrix71);
        com.operations.Matrix.Matrix matrix75 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix8, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            matrix8.setValue(100, 10, 10.327279585867041d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 36.40054944640259d + "'", double3 == 36.40054944640259d);
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(matrix23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNotNull(matrixArray50);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { (-2.4931892522286256d), (-13.563701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { (-2.7295287645732618d), (-13.518123861075072d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(matrix69);
        org.junit.Assert.assertNotNull(matrix70);
        org.junit.Assert.assertNotNull(matrix71);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertNotNull(matrix75);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D(100.0d);
        int int2 = matrix1.getCols();
        matrix1.print();
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix1, (double) (byte) 1);
        com.operations.Matrix.Matrix matrix8 = com.operations.Matrix.MatrixTransformations.project2D((double) ' ', 0.0d);
        double[] doubleArray11 = new double[] { 10, 'a' };
        double[] doubleArray14 = new double[] { 10, 'a' };
        double[][] doubleArray15 = new double[][] { doubleArray11, doubleArray14 };
        com.operations.Matrix.Matrix matrix16 = new com.operations.Matrix.Matrix(doubleArray15);
        int int17 = matrix16.getCols();
        boolean boolean18 = com.operations.Matrix.MatrixUtils.isSquare(matrix16);
        com.operations.Matrix.Matrix matrix19 = com.operations.Matrix.MatrixOperations.transpose(matrix16);
        int int20 = matrix19.getRows();
        com.operations.Matrix.Matrix matrix23 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray26 = new double[] { 10, 'a' };
        double[] doubleArray29 = new double[] { 10, 'a' };
        double[][] doubleArray30 = new double[][] { doubleArray26, doubleArray29 };
        com.operations.Matrix.Matrix matrix31 = new com.operations.Matrix.Matrix(doubleArray30);
        int int32 = matrix31.getCols();
        int int33 = matrix31.getCols();
        int int34 = matrix31.getCols();
        com.operations.Matrix.Matrix[] matrixArray35 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix31);
        com.operations.Matrix.Matrix matrix36 = com.operations.Matrix.MatrixOperations.multiply(matrix23, matrix31);
        com.operations.Matrix.Matrix matrix38 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean40 = com.operations.Matrix.MatrixUtils.compare(matrix31, matrix38, (double) (byte) 0);
        com.operations.Matrix.Matrix matrix41 = com.operations.Matrix.MatrixOperations.multiply(matrix19, matrix31);
        com.operations.Matrix.Matrix matrix42 = com.operations.Matrix.MatrixOperations.add(matrix8, matrix31);
        matrix31.print();
        boolean boolean44 = com.operations.Matrix.MatrixUtils.isSquare(matrix31);
        boolean boolean46 = com.operations.Matrix.MatrixUtils.compare(matrix1, matrix31, 1.414213562373095d);
        com.operations.Matrix.Matrix matrix48 = com.operations.Matrix.MatrixTransformations.rotate2D(100.0d);
        int int49 = matrix48.getCols();
        com.operations.Matrix.Matrix matrix50 = com.operations.Matrix.MatrixOperations.subtract(matrix31, matrix48);
        boolean boolean51 = com.operations.Matrix.MatrixUtils.isSquare(matrix48);
        boolean boolean52 = com.operations.Matrix.MatrixUtils.isSquare(matrix48);
        // The following exception was thrown during execution in test generation
        try {
            double double55 = matrix48.getValue(2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(matrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(matrixArray35);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(matrix48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.project2D((double) 0L, (double) 0);
        com.operations.Matrix.Matrix[] matrixArray3 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix2);
        double[] doubleArray6 = new double[] { 10, 'a' };
        double[] doubleArray9 = new double[] { 10, 'a' };
        double[][] doubleArray10 = new double[][] { doubleArray6, doubleArray9 };
        com.operations.Matrix.Matrix matrix11 = new com.operations.Matrix.Matrix(doubleArray10);
        com.operations.Matrix.Matrix matrix12 = new com.operations.Matrix.Matrix(doubleArray10);
        boolean boolean13 = com.operations.Matrix.MatrixUtils.isSquare(matrix12);
        double[] doubleArray16 = new double[] { 10, 'a' };
        double[] doubleArray19 = new double[] { 10, 'a' };
        double[][] doubleArray20 = new double[][] { doubleArray16, doubleArray19 };
        com.operations.Matrix.Matrix matrix21 = new com.operations.Matrix.Matrix(doubleArray20);
        int int22 = matrix21.getCols();
        int int23 = matrix21.getCols();
        matrix21.print();
        double[] doubleArray27 = new double[] { 10, 'a' };
        double[] doubleArray30 = new double[] { 10, 'a' };
        double[][] doubleArray31 = new double[][] { doubleArray27, doubleArray30 };
        com.operations.Matrix.Matrix matrix32 = new com.operations.Matrix.Matrix(doubleArray31);
        boolean boolean34 = com.operations.Matrix.MatrixUtils.compare(matrix21, matrix32, (double) (-1));
        com.operations.Matrix.Matrix matrix35 = com.operations.Matrix.MatrixOperations.subtract(matrix12, matrix32);
        com.operations.Matrix.Matrix matrix37 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix12, (double) 0.0f);
        com.operations.Matrix.Matrix matrix38 = com.operations.Matrix.MatrixOperations.add(matrix2, matrix37);
        double[][] doubleArray39 = matrix37.getData();
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(matrixArray3);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(doubleArray39);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.project2D(0.9998476951563913d, 975.1410154434076d);
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0, (double) 100L);
        int int6 = matrix5.getRows();
        boolean boolean7 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix5);
        com.operations.Matrix.Matrix matrix8 = com.operations.Matrix.MatrixOperations.subtract(matrix2, matrix5);
        com.operations.Matrix.Matrix matrix10 = com.operations.Matrix.MatrixTransformations.rotate2D((double) '4');
        matrix10.print();
        com.operations.Matrix.Matrix matrix13 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix10, 0.0d);
        boolean boolean14 = com.operations.Matrix.MatrixUtils.isSquare(matrix13);
        com.operations.Matrix.Matrix matrix15 = com.operations.Matrix.MatrixOperations.multiply(matrix8, matrix13);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(matrix13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(matrix15);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D(100.00499987500625d);
        double[][] doubleArray2 = matrix1.getData();
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray8 = new double[] { 10, 'a' };
        double[] doubleArray11 = new double[] { 10, 'a' };
        double[][] doubleArray12 = new double[][] { doubleArray8, doubleArray11 };
        com.operations.Matrix.Matrix matrix13 = new com.operations.Matrix.Matrix(doubleArray12);
        int int14 = matrix13.getCols();
        int int15 = matrix13.getCols();
        int int16 = matrix13.getCols();
        com.operations.Matrix.Matrix[] matrixArray17 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix13);
        com.operations.Matrix.Matrix matrix18 = com.operations.Matrix.MatrixOperations.multiply(matrix5, matrix13);
        com.operations.Matrix.Matrix matrix20 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean22 = com.operations.Matrix.MatrixUtils.compare(matrix13, matrix20, (double) (byte) 0);
        double[] doubleArray25 = new double[] { 10, 'a' };
        double[] doubleArray28 = new double[] { 10, 'a' };
        double[][] doubleArray29 = new double[][] { doubleArray25, doubleArray28 };
        com.operations.Matrix.Matrix matrix30 = new com.operations.Matrix.Matrix(doubleArray29);
        com.operations.Matrix.Matrix matrix31 = new com.operations.Matrix.Matrix(doubleArray29);
        com.operations.Matrix.Matrix matrix32 = new com.operations.Matrix.Matrix(doubleArray29);
        boolean boolean34 = com.operations.Matrix.MatrixUtils.compare(matrix13, matrix32, (double) (-1));
        double[] doubleArray37 = new double[] { 10, 'a' };
        double[] doubleArray40 = new double[] { 10, 'a' };
        double[][] doubleArray41 = new double[][] { doubleArray37, doubleArray40 };
        com.operations.Matrix.Matrix matrix42 = new com.operations.Matrix.Matrix(doubleArray41);
        com.operations.Matrix.Matrix matrix43 = new com.operations.Matrix.Matrix(doubleArray41);
        boolean boolean44 = com.operations.Matrix.MatrixUtils.isSquare(matrix43);
        com.operations.Matrix.Matrix matrix45 = com.operations.Matrix.MatrixOperations.multiply(matrix32, matrix43);
        boolean boolean46 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix32);
        com.operations.Matrix.Matrix matrix48 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix32, (double) ' ');
        com.operations.Matrix.Matrix[] matrixArray49 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix48);
        com.operations.Matrix.Matrix matrix50 = com.operations.Matrix.MatrixOperations.subtract(matrix1, matrix48);
        java.lang.Class<?> wildcardClass51 = matrix50.getClass();
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(matrixArray17);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(matrix48);
        org.junit.Assert.assertNotNull(matrixArray49);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[] doubleArray8 = new double[] { 10, 'a' };
        double[][] doubleArray9 = new double[][] { doubleArray5, doubleArray8 };
        com.operations.Matrix.Matrix matrix10 = new com.operations.Matrix.Matrix(doubleArray9);
        int int11 = matrix10.getCols();
        int int12 = matrix10.getCols();
        int int13 = matrix10.getCols();
        com.operations.Matrix.Matrix[] matrixArray14 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix10);
        com.operations.Matrix.Matrix matrix15 = com.operations.Matrix.MatrixOperations.multiply(matrix2, matrix10);
        com.operations.Matrix.Matrix matrix17 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean19 = com.operations.Matrix.MatrixUtils.compare(matrix10, matrix17, (double) (byte) 0);
        com.operations.Matrix.Matrix[] matrixArray20 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix10);
        com.operations.Matrix.Matrix matrix21 = com.operations.Matrix.MatrixOperations.transpose(matrix10);
        com.operations.Matrix.Matrix matrix24 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int25 = matrix24.getRows();
        com.operations.Matrix.Matrix matrix28 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int29 = matrix28.getRows();
        com.operations.Matrix.Matrix matrix31 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix28, (double) 2);
        com.operations.Matrix.Matrix matrix32 = com.operations.Matrix.MatrixOperations.subtract(matrix24, matrix28);
        boolean boolean34 = com.operations.Matrix.MatrixUtils.compare(matrix10, matrix24, (double) ' ');
        boolean boolean35 = com.operations.Matrix.MatrixUtils.isSquare(matrix24);
        com.operations.Matrix.Matrix matrix36 = com.operations.Matrix.MatrixOperations.transpose(matrix24);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(matrixArray14);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(matrix17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(matrixArray20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(matrix36);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D((double) 100L, 1.0d);
        com.operations.Matrix.Matrix matrix3 = com.operations.Matrix.MatrixOperations.transpose(matrix2);
        com.operations.Matrix.Matrix matrix6 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray9 = new double[] { 10, 'a' };
        double[] doubleArray12 = new double[] { 10, 'a' };
        double[][] doubleArray13 = new double[][] { doubleArray9, doubleArray12 };
        com.operations.Matrix.Matrix matrix14 = new com.operations.Matrix.Matrix(doubleArray13);
        int int15 = matrix14.getCols();
        int int16 = matrix14.getCols();
        int int17 = matrix14.getCols();
        com.operations.Matrix.Matrix[] matrixArray18 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix14);
        com.operations.Matrix.Matrix matrix19 = com.operations.Matrix.MatrixOperations.multiply(matrix6, matrix14);
        int int20 = matrix14.getRows();
        boolean boolean22 = com.operations.Matrix.MatrixUtils.compare(matrix2, matrix14, (-1.0d));
        com.operations.Matrix.Matrix[] matrixArray23 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix2);
        boolean boolean24 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix2);
        double[] doubleArray27 = new double[] { 10, 'a' };
        double[] doubleArray30 = new double[] { 10, 'a' };
        double[][] doubleArray31 = new double[][] { doubleArray27, doubleArray30 };
        com.operations.Matrix.Matrix matrix32 = new com.operations.Matrix.Matrix(doubleArray31);
        int int33 = matrix32.getCols();
        int int34 = matrix32.getCols();
        matrix32.print();
        double[] doubleArray38 = new double[] { 10, 'a' };
        double[] doubleArray41 = new double[] { 10, 'a' };
        double[][] doubleArray42 = new double[][] { doubleArray38, doubleArray41 };
        com.operations.Matrix.Matrix matrix43 = new com.operations.Matrix.Matrix(doubleArray42);
        boolean boolean45 = com.operations.Matrix.MatrixUtils.compare(matrix32, matrix43, (double) (-1));
        boolean boolean46 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix32);
        int int47 = matrix32.getRows();
        com.operations.Matrix.Matrix matrix48 = com.operations.Matrix.MatrixOperations.add(matrix2, matrix32);
        double[] doubleArray51 = new double[] { 10, 'a' };
        double[] doubleArray54 = new double[] { 10, 'a' };
        double[][] doubleArray55 = new double[][] { doubleArray51, doubleArray54 };
        com.operations.Matrix.Matrix matrix56 = new com.operations.Matrix.Matrix(doubleArray55);
        com.operations.Matrix.Matrix matrix57 = new com.operations.Matrix.Matrix(doubleArray55);
        boolean boolean58 = com.operations.Matrix.MatrixUtils.isSquare(matrix57);
        double[] doubleArray61 = new double[] { 10, 'a' };
        double[] doubleArray64 = new double[] { 10, 'a' };
        double[][] doubleArray65 = new double[][] { doubleArray61, doubleArray64 };
        com.operations.Matrix.Matrix matrix66 = new com.operations.Matrix.Matrix(doubleArray65);
        int int67 = matrix66.getCols();
        int int68 = matrix66.getCols();
        matrix66.print();
        double[] doubleArray72 = new double[] { 10, 'a' };
        double[] doubleArray75 = new double[] { 10, 'a' };
        double[][] doubleArray76 = new double[][] { doubleArray72, doubleArray75 };
        com.operations.Matrix.Matrix matrix77 = new com.operations.Matrix.Matrix(doubleArray76);
        boolean boolean79 = com.operations.Matrix.MatrixUtils.compare(matrix66, matrix77, (double) (-1));
        com.operations.Matrix.Matrix matrix80 = com.operations.Matrix.MatrixOperations.subtract(matrix57, matrix77);
        com.operations.Matrix.Matrix matrix82 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix57, (double) 0.0f);
        com.operations.Matrix.Matrix matrix83 = com.operations.Matrix.MatrixOperations.transpose(matrix57);
        double[][] doubleArray84 = matrix57.getData();
        matrix57.print();
        matrix57.print();
        com.operations.Matrix.Matrix matrix87 = com.operations.Matrix.MatrixOperations.transpose(matrix57);
        int int88 = matrix87.getCols();
        matrix87.print();
        com.operations.Matrix.Matrix matrix90 = com.operations.Matrix.MatrixOperations.multiply(matrix48, matrix87);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(matrixArray18);
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(matrixArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(matrix48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(matrix80);
        org.junit.Assert.assertNotNull(matrix82);
        org.junit.Assert.assertNotNull(matrix83);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertNotNull(matrix87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 2 + "'", int88 == 2);
        org.junit.Assert.assertNotNull(matrix90);
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D(1.969615506024416d, (double) 32);
        org.junit.Assert.assertNotNull(matrix2);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D((double) 100L);
        com.operations.Matrix.Matrix matrix3 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix1, (double) ' ');
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixTransformations.rotate2D((double) 'a');
        com.operations.Matrix.Matrix matrix7 = com.operations.Matrix.MatrixTransformations.rotate2D((double) 1.0f);
        com.operations.Matrix.Matrix matrix8 = com.operations.Matrix.MatrixOperations.add(matrix5, matrix7);
        com.operations.Matrix.Matrix matrix11 = com.operations.Matrix.MatrixTransformations.project2D((double) (-1L), (-1.0d));
        com.operations.Matrix.Matrix matrix14 = com.operations.Matrix.MatrixTransformations.scale2D((double) 1.0f, (double) 1);
        com.operations.Matrix.Matrix matrix16 = com.operations.Matrix.MatrixTransformations.rotate2D((double) 1.0f);
        com.operations.Matrix.Matrix matrix19 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int20 = matrix19.getRows();
        com.operations.Matrix.Matrix matrix22 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix19, (double) 2);
        double double23 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix19);
        com.operations.Matrix.Matrix matrix26 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int27 = matrix26.getRows();
        com.operations.Matrix.Matrix matrix29 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix26, (double) 2);
        com.operations.Matrix.Matrix matrix30 = com.operations.Matrix.MatrixOperations.subtract(matrix19, matrix29);
        com.operations.Matrix.Matrix matrix31 = com.operations.Matrix.MatrixOperations.add(matrix16, matrix29);
        boolean boolean33 = com.operations.Matrix.MatrixUtils.compare(matrix14, matrix16, (double) (byte) -1);
        com.operations.Matrix.Matrix matrix34 = com.operations.Matrix.MatrixOperations.transpose(matrix16);
        com.operations.Matrix.Matrix matrix37 = com.operations.Matrix.MatrixTransformations.project2D((double) 10L, 10.0d);
        com.operations.Matrix.Matrix matrix39 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray42 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray43 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix39, doubleArray42);
        com.operations.Matrix.Matrix matrix46 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray49 = new double[] { 10, 'a' };
        double[] doubleArray52 = new double[] { 10, 'a' };
        double[][] doubleArray53 = new double[][] { doubleArray49, doubleArray52 };
        com.operations.Matrix.Matrix matrix54 = new com.operations.Matrix.Matrix(doubleArray53);
        int int55 = matrix54.getCols();
        int int56 = matrix54.getCols();
        int int57 = matrix54.getCols();
        com.operations.Matrix.Matrix[] matrixArray58 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix54);
        com.operations.Matrix.Matrix matrix59 = com.operations.Matrix.MatrixOperations.multiply(matrix46, matrix54);
        boolean boolean61 = com.operations.Matrix.MatrixUtils.compare(matrix39, matrix46, (double) (-1L));
        double[][] doubleArray62 = matrix39.getData();
        com.operations.Matrix.Matrix matrix64 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray67 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray68 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix64, doubleArray67);
        double[] doubleArray69 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix39, doubleArray67);
        double[] doubleArray70 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix37, doubleArray69);
        double[] doubleArray71 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix16, doubleArray70);
        double[] doubleArray72 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix11, doubleArray70);
        double[] doubleArray73 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix5, doubleArray70);
        double[] doubleArray74 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix3, doubleArray73);
        com.operations.Matrix.Matrix matrix77 = com.operations.Matrix.MatrixTransformations.project2D((double) ' ', 0.0d);
        boolean boolean78 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix77);
        com.operations.Matrix.Matrix matrix79 = com.operations.Matrix.MatrixOperations.transpose(matrix77);
        boolean boolean80 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix79);
        int int81 = matrix79.getRows();
        com.operations.Matrix.Matrix matrix82 = com.operations.Matrix.MatrixOperations.subtract(matrix3, matrix79);
        double[][] doubleArray83 = matrix79.getData();
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertNotNull(matrix30);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix46);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(matrixArray58);
        org.junit.Assert.assertNotNull(matrix59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { (-2.4931892522286256d), (-13.563701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { (-2.7295287645732618d), (-13.518123861075072d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 2.4931892522286256d, 13.563701830716116d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { (-13.158756716933762d), 4.127604833865596d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 0.19843410518811042d, 0.3825654555408708d }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(matrix79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2 + "'", int81 == 2);
        org.junit.Assert.assertNotNull(matrix82);
        org.junit.Assert.assertNotNull(doubleArray83);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D(1.414213562373095d);
        com.operations.Matrix.Matrix matrix3 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray6 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray7 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix3, doubleArray6);
        com.operations.Matrix.Matrix matrix10 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray13 = new double[] { 10, 'a' };
        double[] doubleArray16 = new double[] { 10, 'a' };
        double[][] doubleArray17 = new double[][] { doubleArray13, doubleArray16 };
        com.operations.Matrix.Matrix matrix18 = new com.operations.Matrix.Matrix(doubleArray17);
        int int19 = matrix18.getCols();
        int int20 = matrix18.getCols();
        int int21 = matrix18.getCols();
        com.operations.Matrix.Matrix[] matrixArray22 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix18);
        com.operations.Matrix.Matrix matrix23 = com.operations.Matrix.MatrixOperations.multiply(matrix10, matrix18);
        boolean boolean25 = com.operations.Matrix.MatrixUtils.compare(matrix3, matrix10, (double) (-1L));
        com.operations.Matrix.Matrix matrix27 = com.operations.Matrix.MatrixTransformations.rotate2D((-1.0d));
        com.operations.Matrix.Matrix matrix29 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (-1L));
        com.operations.Matrix.Matrix matrix31 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray34 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray35 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix31, doubleArray34);
        double[] doubleArray36 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix29, doubleArray34);
        double[] doubleArray37 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix27, doubleArray34);
        boolean boolean39 = com.operations.Matrix.MatrixUtils.compare(matrix10, matrix27, (double) '4');
        double[] doubleArray42 = new double[] { 10, 'a' };
        double[] doubleArray45 = new double[] { 10, 'a' };
        double[][] doubleArray46 = new double[][] { doubleArray42, doubleArray45 };
        com.operations.Matrix.Matrix matrix47 = new com.operations.Matrix.Matrix(doubleArray46);
        com.operations.Matrix.Matrix matrix48 = new com.operations.Matrix.Matrix(doubleArray46);
        com.operations.Matrix.Matrix matrix50 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray53 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray54 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix50, doubleArray53);
        com.operations.Matrix.Matrix matrix55 = com.operations.Matrix.MatrixOperations.add(matrix48, matrix50);
        com.operations.Matrix.Matrix matrix56 = com.operations.Matrix.MatrixOperations.transpose(matrix50);
        int int57 = matrix50.getCols();
        com.operations.Matrix.Matrix matrix60 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray63 = new double[] { 10, 'a' };
        double[] doubleArray66 = new double[] { 10, 'a' };
        double[][] doubleArray67 = new double[][] { doubleArray63, doubleArray66 };
        com.operations.Matrix.Matrix matrix68 = new com.operations.Matrix.Matrix(doubleArray67);
        int int69 = matrix68.getCols();
        int int70 = matrix68.getCols();
        int int71 = matrix68.getCols();
        com.operations.Matrix.Matrix[] matrixArray72 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix68);
        com.operations.Matrix.Matrix matrix73 = com.operations.Matrix.MatrixOperations.multiply(matrix60, matrix68);
        com.operations.Matrix.Matrix matrix75 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean77 = com.operations.Matrix.MatrixUtils.compare(matrix68, matrix75, (double) (byte) 0);
        boolean boolean78 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix75);
        boolean boolean79 = com.operations.Matrix.MatrixUtils.isSquare(matrix75);
        com.operations.Matrix.Matrix matrix81 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean83 = com.operations.Matrix.MatrixUtils.compare(matrix75, matrix81, (double) (byte) 100);
        matrix81.print();
        com.operations.Matrix.Matrix matrix85 = com.operations.Matrix.MatrixOperations.add(matrix50, matrix81);
        com.operations.Matrix.Matrix matrix86 = com.operations.Matrix.MatrixOperations.subtract(matrix27, matrix81);
        com.operations.Matrix.Matrix matrix87 = com.operations.Matrix.MatrixOperations.subtract(matrix1, matrix86);
        double[][] doubleArray88 = matrix87.getData();
        double[][] doubleArray89 = matrix87.getData();
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(matrixArray22);
        org.junit.Assert.assertNotNull(matrix23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 137.90221361711127d, 1.4069397643877004d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 137.90221361711127d, 1.4069397643877004d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix55);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(matrix60);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(matrixArray72);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertNotNull(matrix75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(matrix81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(matrix85);
        org.junit.Assert.assertNotNull(matrix86);
        org.junit.Assert.assertNotNull(matrix87);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertNotNull(doubleArray89);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D(4362.86355112226d);
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix1);
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[] doubleArray8 = new double[] { 10, 'a' };
        double[][] doubleArray9 = new double[][] { doubleArray5, doubleArray8 };
        com.operations.Matrix.Matrix matrix10 = new com.operations.Matrix.Matrix(doubleArray9);
        com.operations.Matrix.Matrix matrix11 = new com.operations.Matrix.Matrix(doubleArray9);
        boolean boolean12 = com.operations.Matrix.MatrixUtils.isSquare(matrix11);
        double[] doubleArray15 = new double[] { 10, 'a' };
        double[] doubleArray18 = new double[] { 10, 'a' };
        double[][] doubleArray19 = new double[][] { doubleArray15, doubleArray18 };
        com.operations.Matrix.Matrix matrix20 = new com.operations.Matrix.Matrix(doubleArray19);
        int int21 = matrix20.getCols();
        int int22 = matrix20.getCols();
        matrix20.print();
        double[] doubleArray26 = new double[] { 10, 'a' };
        double[] doubleArray29 = new double[] { 10, 'a' };
        double[][] doubleArray30 = new double[][] { doubleArray26, doubleArray29 };
        com.operations.Matrix.Matrix matrix31 = new com.operations.Matrix.Matrix(doubleArray30);
        boolean boolean33 = com.operations.Matrix.MatrixUtils.compare(matrix20, matrix31, (double) (-1));
        com.operations.Matrix.Matrix matrix34 = com.operations.Matrix.MatrixOperations.subtract(matrix11, matrix31);
        com.operations.Matrix.Matrix matrix35 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix11);
        double[] doubleArray38 = new double[] { 10, 'a' };
        double[] doubleArray41 = new double[] { 10, 'a' };
        double[][] doubleArray42 = new double[][] { doubleArray38, doubleArray41 };
        com.operations.Matrix.Matrix matrix43 = new com.operations.Matrix.Matrix(doubleArray42);
        com.operations.Matrix.Matrix matrix44 = com.operations.Matrix.MatrixOperations.transpose(matrix43);
        com.operations.Matrix.Matrix matrix47 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int48 = matrix47.getRows();
        com.operations.Matrix.Matrix matrix54 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(100, (int) (byte) 1, (int) '#', (int) '#', 1L);
        boolean boolean56 = com.operations.Matrix.MatrixUtils.compare(matrix47, matrix54, (double) 1.0f);
        com.operations.Matrix.Matrix matrix58 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix47, (double) 1L);
        matrix47.print();
        com.operations.Matrix.Matrix matrix60 = com.operations.Matrix.MatrixOperations.multiply(matrix44, matrix47);
        boolean boolean62 = com.operations.Matrix.MatrixUtils.compare(matrix11, matrix44, 137.15495886388925d);
        com.operations.Matrix.Matrix matrix65 = com.operations.Matrix.MatrixTransformations.scale2D(146.4308710620817d, 0.9998476951563913d);
        double[] doubleArray68 = new double[] { 10, 'a' };
        double[] doubleArray71 = new double[] { 10, 'a' };
        double[][] doubleArray72 = new double[][] { doubleArray68, doubleArray71 };
        com.operations.Matrix.Matrix matrix73 = new com.operations.Matrix.Matrix(doubleArray72);
        com.operations.Matrix.Matrix matrix74 = new com.operations.Matrix.Matrix(doubleArray72);
        boolean boolean75 = com.operations.Matrix.MatrixUtils.isSquare(matrix74);
        com.operations.Matrix.Matrix[] matrixArray76 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix74);
        com.operations.Matrix.Matrix matrix77 = com.operations.Matrix.MatrixOperations.multiply(matrix65, matrix74);
        boolean boolean79 = com.operations.Matrix.MatrixUtils.compare(matrix11, matrix65, 391.8840992892044d);
        com.operations.Matrix.Matrix matrix80 = com.operations.Matrix.MatrixOperations.add(matrix2, matrix11);
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(matrix44);
        org.junit.Assert.assertNotNull(matrix47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(matrix54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(matrix58);
        org.junit.Assert.assertNotNull(matrix60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(matrix65);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(matrixArray76);
        org.junit.Assert.assertNotNull(matrix77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(matrix80);
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(10, (int) (short) 10, 32, (-1), 0L);
        double[][] doubleArray6 = matrix5.getData();
        int int7 = matrix5.getRows();
        double[][] doubleArray8 = matrix5.getData();
        com.operations.Matrix.Matrix matrix9 = new com.operations.Matrix.Matrix(doubleArray8);
        com.operations.Matrix.Matrix matrix10 = new com.operations.Matrix.Matrix(doubleArray8);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        com.operations.Matrix.Matrix matrix4 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(100, 2, (int) 'a', 97);
        org.junit.Assert.assertNotNull(matrix4);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D(3.5828693903896434d);
        int int2 = matrix1.getCols();
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        double[] doubleArray2 = new double[] { 10, 'a' };
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[][] doubleArray6 = new double[][] { doubleArray2, doubleArray5 };
        com.operations.Matrix.Matrix matrix7 = new com.operations.Matrix.Matrix(doubleArray6);
        int int8 = matrix7.getCols();
        boolean boolean9 = com.operations.Matrix.MatrixUtils.isSquare(matrix7);
        com.operations.Matrix.Matrix matrix11 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix7, 98.07140255956371d);
        com.operations.Matrix.Matrix matrix14 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray17 = new double[] { 10, 'a' };
        double[] doubleArray20 = new double[] { 10, 'a' };
        double[][] doubleArray21 = new double[][] { doubleArray17, doubleArray20 };
        com.operations.Matrix.Matrix matrix22 = new com.operations.Matrix.Matrix(doubleArray21);
        int int23 = matrix22.getCols();
        int int24 = matrix22.getCols();
        int int25 = matrix22.getCols();
        com.operations.Matrix.Matrix[] matrixArray26 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix22);
        com.operations.Matrix.Matrix matrix27 = com.operations.Matrix.MatrixOperations.multiply(matrix14, matrix22);
        com.operations.Matrix.Matrix matrix29 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean31 = com.operations.Matrix.MatrixUtils.compare(matrix22, matrix29, (double) (byte) 0);
        double[] doubleArray34 = new double[] { 10, 'a' };
        double[] doubleArray37 = new double[] { 10, 'a' };
        double[][] doubleArray38 = new double[][] { doubleArray34, doubleArray37 };
        com.operations.Matrix.Matrix matrix39 = new com.operations.Matrix.Matrix(doubleArray38);
        com.operations.Matrix.Matrix matrix40 = new com.operations.Matrix.Matrix(doubleArray38);
        com.operations.Matrix.Matrix matrix41 = new com.operations.Matrix.Matrix(doubleArray38);
        boolean boolean43 = com.operations.Matrix.MatrixUtils.compare(matrix22, matrix41, (double) (-1));
        double[] doubleArray46 = new double[] { 10, 'a' };
        double[] doubleArray49 = new double[] { 10, 'a' };
        double[][] doubleArray50 = new double[][] { doubleArray46, doubleArray49 };
        com.operations.Matrix.Matrix matrix51 = new com.operations.Matrix.Matrix(doubleArray50);
        com.operations.Matrix.Matrix matrix52 = new com.operations.Matrix.Matrix(doubleArray50);
        boolean boolean53 = com.operations.Matrix.MatrixUtils.isSquare(matrix52);
        com.operations.Matrix.Matrix matrix54 = com.operations.Matrix.MatrixOperations.multiply(matrix41, matrix52);
        com.operations.Matrix.Matrix matrix57 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int58 = matrix57.getRows();
        com.operations.Matrix.Matrix matrix60 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix57, (double) 2);
        matrix57.print();
        matrix57.print();
        com.operations.Matrix.Matrix matrix63 = com.operations.Matrix.MatrixOperations.multiply(matrix54, matrix57);
        com.operations.Matrix.Matrix matrix66 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0.0f, 350.0d);
        com.operations.Matrix.Matrix matrix69 = com.operations.Matrix.MatrixTransformations.project2D(0.0d, (double) 0);
        com.operations.Matrix.Matrix[] matrixArray70 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix69);
        com.operations.Matrix.Matrix matrix73 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int74 = matrix73.getRows();
        com.operations.Matrix.Matrix matrix76 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix73, (double) 2);
        double double77 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix73);
        int int78 = matrix73.getRows();
        com.operations.Matrix.Matrix matrix79 = com.operations.Matrix.MatrixOperations.transpose(matrix73);
        com.operations.Matrix.Matrix matrix80 = com.operations.Matrix.MatrixOperations.multiply(matrix69, matrix79);
        com.operations.Matrix.Matrix matrix81 = com.operations.Matrix.MatrixOperations.multiply(matrix66, matrix79);
        com.operations.Matrix.Matrix matrix82 = com.operations.Matrix.MatrixOperations.transpose(matrix81);
        double double83 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix82);
        boolean boolean84 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix82);
        com.operations.Matrix.Matrix matrix85 = com.operations.Matrix.MatrixOperations.add(matrix63, matrix82);
        double[][] doubleArray86 = matrix85.getData();
        com.operations.Matrix.Matrix matrix87 = new com.operations.Matrix.Matrix(doubleArray86);
        int int88 = matrix87.getRows();
        com.operations.Matrix.Matrix matrix89 = com.operations.Matrix.MatrixOperations.subtract(matrix11, matrix87);
        com.operations.Matrix.Matrix[] matrixArray90 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix87);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(matrixArray26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(matrix54);
        org.junit.Assert.assertNotNull(matrix57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertNotNull(matrix60);
        org.junit.Assert.assertNotNull(matrix63);
        org.junit.Assert.assertNotNull(matrix66);
        org.junit.Assert.assertNotNull(matrix69);
        org.junit.Assert.assertNotNull(matrixArray70);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertNotNull(matrix76);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2 + "'", int78 == 2);
        org.junit.Assert.assertNotNull(matrix79);
        org.junit.Assert.assertNotNull(matrix80);
        org.junit.Assert.assertNotNull(matrix81);
        org.junit.Assert.assertNotNull(matrix82);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 3500.0d + "'", double83 == 3500.0d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(matrix85);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 2 + "'", int88 == 2);
        org.junit.Assert.assertNotNull(matrix89);
        org.junit.Assert.assertNotNull(matrixArray90);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(35, 32, (-1), 35, (long) '#');
        double[] doubleArray8 = new double[] { 10, 'a' };
        double[] doubleArray11 = new double[] { 10, 'a' };
        double[][] doubleArray12 = new double[][] { doubleArray8, doubleArray11 };
        com.operations.Matrix.Matrix matrix13 = new com.operations.Matrix.Matrix(doubleArray12);
        int int14 = matrix13.getCols();
        int int15 = matrix13.getCols();
        int int16 = matrix13.getCols();
        com.operations.Matrix.Matrix matrix22 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(100, (int) (byte) 1, (int) '#', (int) '#', 1L);
        double double25 = matrix22.getValue((int) '4', 0);
        double double26 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix22);
        boolean boolean27 = com.operations.Matrix.MatrixUtils.isSquare(matrix22);
        boolean boolean29 = com.operations.Matrix.MatrixUtils.compare(matrix13, matrix22, (double) 100L);
        com.operations.Matrix.Matrix matrix31 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray34 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray35 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix31, doubleArray34);
        com.operations.Matrix.Matrix matrix38 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray41 = new double[] { 10, 'a' };
        double[] doubleArray44 = new double[] { 10, 'a' };
        double[][] doubleArray45 = new double[][] { doubleArray41, doubleArray44 };
        com.operations.Matrix.Matrix matrix46 = new com.operations.Matrix.Matrix(doubleArray45);
        int int47 = matrix46.getCols();
        int int48 = matrix46.getCols();
        int int49 = matrix46.getCols();
        com.operations.Matrix.Matrix[] matrixArray50 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix46);
        com.operations.Matrix.Matrix matrix51 = com.operations.Matrix.MatrixOperations.multiply(matrix38, matrix46);
        boolean boolean53 = com.operations.Matrix.MatrixUtils.compare(matrix31, matrix38, (double) (-1L));
        com.operations.Matrix.Matrix matrix54 = com.operations.Matrix.MatrixOperations.subtract(matrix13, matrix38);
        com.operations.Matrix.Matrix matrix55 = com.operations.Matrix.MatrixOperations.transpose(matrix13);
        matrix55.print();
        boolean boolean58 = com.operations.Matrix.MatrixUtils.compare(matrix5, matrix55, 12.751772028997056d);
        boolean boolean59 = com.operations.Matrix.MatrixUtils.isSquare(matrix55);
        int int60 = matrix55.getRows();
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 35.0d + "'", double25 == 35.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 350.0d + "'", double26 == 350.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNotNull(matrixArray50);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(matrix54);
        org.junit.Assert.assertNotNull(matrix55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0.0f, (double) (-1));
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixTransformations.scale2D(146.4308710620817d, (double) 10L);
        com.operations.Matrix.Matrix matrix6 = com.operations.Matrix.MatrixOperations.multiply(matrix2, matrix5);
        int int7 = matrix6.getCols();
        com.operations.Matrix.Matrix matrix10 = com.operations.Matrix.MatrixTransformations.project2D((double) (short) 100, (double) 0L);
        boolean boolean11 = com.operations.Matrix.MatrixUtils.isSquare(matrix10);
        double[] doubleArray14 = new double[] { 10, 'a' };
        double[] doubleArray17 = new double[] { 10, 'a' };
        double[][] doubleArray18 = new double[][] { doubleArray14, doubleArray17 };
        com.operations.Matrix.Matrix matrix19 = new com.operations.Matrix.Matrix(doubleArray18);
        com.operations.Matrix.Matrix matrix20 = new com.operations.Matrix.Matrix(doubleArray18);
        com.operations.Matrix.Matrix matrix22 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray25 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray26 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix22, doubleArray25);
        com.operations.Matrix.Matrix matrix27 = com.operations.Matrix.MatrixOperations.add(matrix20, matrix22);
        com.operations.Matrix.Matrix matrix28 = com.operations.Matrix.MatrixOperations.transpose(matrix22);
        int int29 = matrix22.getCols();
        int int30 = matrix22.getRows();
        double[] doubleArray33 = new double[] { 10, 'a' };
        double[] doubleArray36 = new double[] { 10, 'a' };
        double[][] doubleArray37 = new double[][] { doubleArray33, doubleArray36 };
        com.operations.Matrix.Matrix matrix38 = new com.operations.Matrix.Matrix(doubleArray37);
        int int39 = matrix38.getCols();
        int int40 = matrix38.getCols();
        matrix38.print();
        double[] doubleArray44 = new double[] { 10, 'a' };
        double[] doubleArray47 = new double[] { 10, 'a' };
        double[][] doubleArray48 = new double[][] { doubleArray44, doubleArray47 };
        com.operations.Matrix.Matrix matrix49 = new com.operations.Matrix.Matrix(doubleArray48);
        boolean boolean51 = com.operations.Matrix.MatrixUtils.compare(matrix38, matrix49, (double) (-1));
        com.operations.Matrix.Matrix matrix52 = com.operations.Matrix.MatrixOperations.multiply(matrix22, matrix38);
        double double55 = matrix22.getValue((int) (short) 0, 0);
        com.operations.Matrix.Matrix matrix56 = com.operations.Matrix.MatrixOperations.add(matrix10, matrix22);
        com.operations.Matrix.Matrix matrix57 = com.operations.Matrix.MatrixOperations.multiply(matrix6, matrix10);
        int int58 = matrix57.getRows();
        java.lang.Class<?> wildcardClass59 = matrix57.getClass();
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(matrix52);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-0.1736481776669303d) + "'", double55 == (-0.1736481776669303d));
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(matrix57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.project2D(36.40054944640259d, 364.0054944640259d);
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[] doubleArray8 = new double[] { 10, 'a' };
        double[][] doubleArray9 = new double[][] { doubleArray5, doubleArray8 };
        com.operations.Matrix.Matrix matrix10 = new com.operations.Matrix.Matrix(doubleArray9);
        com.operations.Matrix.Matrix matrix11 = new com.operations.Matrix.Matrix(doubleArray9);
        com.operations.Matrix.Matrix matrix13 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray16 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray17 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix13, doubleArray16);
        com.operations.Matrix.Matrix matrix18 = com.operations.Matrix.MatrixOperations.add(matrix11, matrix13);
        com.operations.Matrix.Matrix matrix19 = com.operations.Matrix.MatrixOperations.transpose(matrix13);
        int int20 = matrix13.getCols();
        com.operations.Matrix.Matrix matrix23 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray26 = new double[] { 10, 'a' };
        double[] doubleArray29 = new double[] { 10, 'a' };
        double[][] doubleArray30 = new double[][] { doubleArray26, doubleArray29 };
        com.operations.Matrix.Matrix matrix31 = new com.operations.Matrix.Matrix(doubleArray30);
        int int32 = matrix31.getCols();
        int int33 = matrix31.getCols();
        int int34 = matrix31.getCols();
        com.operations.Matrix.Matrix[] matrixArray35 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix31);
        com.operations.Matrix.Matrix matrix36 = com.operations.Matrix.MatrixOperations.multiply(matrix23, matrix31);
        com.operations.Matrix.Matrix matrix38 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean40 = com.operations.Matrix.MatrixUtils.compare(matrix31, matrix38, (double) (byte) 0);
        boolean boolean41 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix38);
        boolean boolean42 = com.operations.Matrix.MatrixUtils.isSquare(matrix38);
        com.operations.Matrix.Matrix matrix44 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean46 = com.operations.Matrix.MatrixUtils.compare(matrix38, matrix44, (double) (byte) 100);
        matrix44.print();
        com.operations.Matrix.Matrix matrix48 = com.operations.Matrix.MatrixOperations.add(matrix13, matrix44);
        com.operations.Matrix.Matrix matrix51 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int52 = matrix51.getRows();
        com.operations.Matrix.Matrix matrix54 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix51, (double) 2);
        matrix51.print();
        com.operations.Matrix.Matrix matrix57 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix51, 100.00499987500625d);
        com.operations.Matrix.Matrix matrix60 = new com.operations.Matrix.Matrix(10, (int) (byte) 1);
        boolean boolean62 = com.operations.Matrix.MatrixUtils.compare(matrix57, matrix60, (double) 100L);
        com.operations.Matrix.Matrix matrix63 = com.operations.Matrix.MatrixOperations.add(matrix44, matrix57);
        boolean boolean65 = com.operations.Matrix.MatrixUtils.compare(matrix2, matrix63, (double) 0L);
        com.operations.Matrix.Matrix matrix66 = com.operations.Matrix.MatrixOperations.transpose(matrix2);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(matrix13);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(matrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(matrixArray35);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(matrix44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(matrix48);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(matrix54);
        org.junit.Assert.assertNotNull(matrix57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(matrix63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(matrix66);
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        double[] doubleArray2 = new double[] { 10, 'a' };
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[][] doubleArray6 = new double[][] { doubleArray2, doubleArray5 };
        com.operations.Matrix.Matrix matrix7 = new com.operations.Matrix.Matrix(doubleArray6);
        com.operations.Matrix.Matrix matrix8 = new com.operations.Matrix.Matrix(doubleArray6);
        com.operations.Matrix.Matrix matrix10 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray13 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray14 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix10, doubleArray13);
        com.operations.Matrix.Matrix matrix15 = com.operations.Matrix.MatrixOperations.add(matrix8, matrix10);
        com.operations.Matrix.Matrix matrix16 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix8);
        com.operations.Matrix.Matrix matrix19 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray22 = new double[] { 10, 'a' };
        double[] doubleArray25 = new double[] { 10, 'a' };
        double[][] doubleArray26 = new double[][] { doubleArray22, doubleArray25 };
        com.operations.Matrix.Matrix matrix27 = new com.operations.Matrix.Matrix(doubleArray26);
        int int28 = matrix27.getCols();
        int int29 = matrix27.getCols();
        int int30 = matrix27.getCols();
        com.operations.Matrix.Matrix[] matrixArray31 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix27);
        com.operations.Matrix.Matrix matrix32 = com.operations.Matrix.MatrixOperations.multiply(matrix19, matrix27);
        com.operations.Matrix.Matrix matrix34 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean36 = com.operations.Matrix.MatrixUtils.compare(matrix27, matrix34, (double) (byte) 0);
        com.operations.Matrix.Matrix matrix37 = com.operations.Matrix.MatrixOperations.transpose(matrix27);
        com.operations.Matrix.Matrix matrix39 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix37, (double) 10);
        com.operations.Matrix.Matrix matrix40 = com.operations.Matrix.MatrixOperations.add(matrix16, matrix37);
        com.operations.Matrix.Matrix matrix42 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix16, 131.06486943494812d);
        com.operations.Matrix.Matrix matrix43 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix42);
        com.operations.Matrix.Matrix matrix44 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix43);
        double[] doubleArray47 = new double[] { 10, 'a' };
        double[] doubleArray50 = new double[] { 10, 'a' };
        double[][] doubleArray51 = new double[][] { doubleArray47, doubleArray50 };
        com.operations.Matrix.Matrix matrix52 = new com.operations.Matrix.Matrix(doubleArray51);
        com.operations.Matrix.Matrix matrix53 = new com.operations.Matrix.Matrix(doubleArray51);
        com.operations.Matrix.Matrix matrix55 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray58 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray59 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix55, doubleArray58);
        com.operations.Matrix.Matrix matrix60 = com.operations.Matrix.MatrixOperations.add(matrix53, matrix55);
        double[][] doubleArray61 = matrix53.getData();
        com.operations.Matrix.Matrix matrix62 = new com.operations.Matrix.Matrix(doubleArray61);
        com.operations.Matrix.Matrix matrix64 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray67 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray68 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix64, doubleArray67);
        com.operations.Matrix.Matrix matrix71 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray74 = new double[] { 10, 'a' };
        double[] doubleArray77 = new double[] { 10, 'a' };
        double[][] doubleArray78 = new double[][] { doubleArray74, doubleArray77 };
        com.operations.Matrix.Matrix matrix79 = new com.operations.Matrix.Matrix(doubleArray78);
        int int80 = matrix79.getCols();
        int int81 = matrix79.getCols();
        int int82 = matrix79.getCols();
        com.operations.Matrix.Matrix[] matrixArray83 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix79);
        com.operations.Matrix.Matrix matrix84 = com.operations.Matrix.MatrixOperations.multiply(matrix71, matrix79);
        boolean boolean86 = com.operations.Matrix.MatrixUtils.compare(matrix64, matrix71, (double) (-1L));
        boolean boolean87 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix64);
        int int88 = matrix64.getCols();
        com.operations.Matrix.Matrix[] matrixArray89 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix64);
        double double90 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix64);
        double double91 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix64);
        com.operations.Matrix.Matrix matrix92 = com.operations.Matrix.MatrixOperations.subtract(matrix62, matrix64);
        com.operations.Matrix.Matrix matrix93 = com.operations.Matrix.MatrixOperations.subtract(matrix44, matrix92);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(matrixArray31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(matrix43);
        org.junit.Assert.assertNotNull(matrix44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertNotNull(matrix55);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix60);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix71);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2 + "'", int80 == 2);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2 + "'", int81 == 2);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2 + "'", int82 == 2);
        org.junit.Assert.assertNotNull(matrixArray83);
        org.junit.Assert.assertNotNull(matrix84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 2 + "'", int88 == 2);
        org.junit.Assert.assertNotNull(matrixArray89);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 1.414213562373095d + "'", double90 == 1.414213562373095d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1.414213562373095d + "'", double91 == 1.414213562373095d);
        org.junit.Assert.assertNotNull(matrix92);
        org.junit.Assert.assertNotNull(matrix93);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        double[] doubleArray2 = new double[] { 10, 'a' };
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[][] doubleArray6 = new double[][] { doubleArray2, doubleArray5 };
        com.operations.Matrix.Matrix matrix7 = new com.operations.Matrix.Matrix(doubleArray6);
        com.operations.Matrix.Matrix matrix8 = new com.operations.Matrix.Matrix(doubleArray6);
        com.operations.Matrix.Matrix matrix10 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray13 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray14 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix10, doubleArray13);
        com.operations.Matrix.Matrix matrix15 = com.operations.Matrix.MatrixOperations.add(matrix8, matrix10);
        com.operations.Matrix.Matrix[] matrixArray16 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix8);
        boolean boolean17 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix8);
        double[][] doubleArray18 = matrix8.getData();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(matrixArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.project2D(0.0d, (double) (-1L));
        com.operations.Matrix.Matrix matrix3 = com.operations.Matrix.MatrixOperations.transpose(matrix2);
        com.operations.Matrix.Matrix matrix6 = com.operations.Matrix.MatrixTransformations.scale2D(131.06486943494812d, (double) (byte) 100);
        com.operations.Matrix.Matrix matrix8 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix6, (double) 1L);
        com.operations.Matrix.Matrix matrix10 = com.operations.Matrix.MatrixTransformations.rotate2D(100.0d);
        int int11 = matrix10.getCols();
        matrix10.print();
        com.operations.Matrix.Matrix matrix14 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix10, (double) (byte) 1);
        com.operations.Matrix.Matrix[] matrixArray15 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix10);
        com.operations.Matrix.Matrix matrix16 = com.operations.Matrix.MatrixOperations.transpose(matrix10);
        double[][] doubleArray17 = matrix16.getData();
        com.operations.Matrix.Matrix matrix18 = new com.operations.Matrix.Matrix(doubleArray17);
        com.operations.Matrix.Matrix matrix20 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray23 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray24 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix20, doubleArray23);
        com.operations.Matrix.Matrix matrix27 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray30 = new double[] { 10, 'a' };
        double[] doubleArray33 = new double[] { 10, 'a' };
        double[][] doubleArray34 = new double[][] { doubleArray30, doubleArray33 };
        com.operations.Matrix.Matrix matrix35 = new com.operations.Matrix.Matrix(doubleArray34);
        int int36 = matrix35.getCols();
        int int37 = matrix35.getCols();
        int int38 = matrix35.getCols();
        com.operations.Matrix.Matrix[] matrixArray39 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix35);
        com.operations.Matrix.Matrix matrix40 = com.operations.Matrix.MatrixOperations.multiply(matrix27, matrix35);
        boolean boolean42 = com.operations.Matrix.MatrixUtils.compare(matrix20, matrix27, (double) (-1L));
        boolean boolean43 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix20);
        int int44 = matrix20.getCols();
        com.operations.Matrix.Matrix[] matrixArray45 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix20);
        double double46 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix20);
        com.operations.Matrix.Matrix matrix48 = com.operations.Matrix.MatrixTransformations.rotate2D(100.0d);
        int int49 = matrix48.getCols();
        matrix48.print();
        com.operations.Matrix.Matrix matrix52 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix48, (double) (byte) 1);
        com.operations.Matrix.Matrix matrix54 = com.operations.Matrix.MatrixTransformations.rotate2D(350.0d);
        com.operations.Matrix.Matrix matrix56 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray59 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray60 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix56, doubleArray59);
        double[] doubleArray61 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix54, doubleArray60);
        double[] doubleArray62 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix48, doubleArray60);
        double[] doubleArray63 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix20, doubleArray62);
        boolean boolean64 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix20);
        double[] doubleArray67 = new double[] { 10, 'a' };
        double[] doubleArray70 = new double[] { 10, 'a' };
        double[][] doubleArray71 = new double[][] { doubleArray67, doubleArray70 };
        com.operations.Matrix.Matrix matrix72 = new com.operations.Matrix.Matrix(doubleArray71);
        com.operations.Matrix.Matrix matrix73 = new com.operations.Matrix.Matrix(doubleArray71);
        com.operations.Matrix.Matrix matrix75 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray78 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray79 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix75, doubleArray78);
        com.operations.Matrix.Matrix matrix80 = com.operations.Matrix.MatrixOperations.add(matrix73, matrix75);
        com.operations.Matrix.Matrix matrix81 = com.operations.Matrix.MatrixOperations.transpose(matrix75);
        double double82 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix81);
        double[][] doubleArray83 = matrix81.getData();
        com.operations.Matrix.Matrix matrix85 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix81, (double) 'a');
        com.operations.Matrix.Matrix matrix87 = com.operations.Matrix.MatrixTransformations.rotate2D(350.0d);
        com.operations.Matrix.Matrix matrix89 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray92 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray93 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix89, doubleArray92);
        double[] doubleArray94 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix87, doubleArray93);
        double[] doubleArray95 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix81, doubleArray93);
        double[] doubleArray96 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix20, doubleArray95);
        double[] doubleArray97 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix18, doubleArray96);
        double[] doubleArray98 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix6, doubleArray96);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray99 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix2, doubleArray98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix is singular or nearly singular.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(matrixArray15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(matrixArray39);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(matrixArray45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.414213562373095d + "'", double46 == 1.414213562373095d);
        org.junit.Assert.assertNotNull(matrix48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNotNull(matrix52);
        org.junit.Assert.assertNotNull(matrix54);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { (-0.9999999999999858d), (-137.90576492663388d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { (-129.24700952206834d), 48.1062421064292d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 69.81890786710137d, 118.92989575479001d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertNotNull(matrix75);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix80);
        org.junit.Assert.assertNotNull(matrix81);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 1.414213562373095d + "'", double82 == 1.414213562373095d);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertNotNull(matrix85);
        org.junit.Assert.assertNotNull(matrix87);
        org.junit.Assert.assertNotNull(matrix89);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertArrayEquals(doubleArray93, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertArrayEquals(doubleArray94, new double[] { (-0.9999999999999858d), (-137.90576492663388d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertArrayEquals(doubleArray95, new double[] { 137.90576492663388d, (-1.0000000000000022d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray96);
        org.junit.Assert.assertArrayEquals(doubleArray96, new double[] { (-24.931892522286258d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray97);
        org.junit.Assert.assertArrayEquals(doubleArray97, new double[] { 137.90576492663388d, (-1.0000000000000058d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray98);
        org.junit.Assert.assertArrayEquals(doubleArray98, new double[] { (-0.19022559309579742d), (-1.3563701830716115d) }, 1.0E-15);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D((double) 1.0f);
        com.operations.Matrix.Matrix matrix4 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int5 = matrix4.getRows();
        com.operations.Matrix.Matrix matrix7 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix4, (double) 2);
        double double8 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix4);
        com.operations.Matrix.Matrix matrix11 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int12 = matrix11.getRows();
        com.operations.Matrix.Matrix matrix14 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix11, (double) 2);
        com.operations.Matrix.Matrix matrix15 = com.operations.Matrix.MatrixOperations.subtract(matrix4, matrix14);
        com.operations.Matrix.Matrix matrix16 = com.operations.Matrix.MatrixOperations.add(matrix1, matrix14);
        com.operations.Matrix.Matrix[] matrixArray17 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix14);
        boolean boolean18 = com.operations.Matrix.MatrixUtils.isSquare(matrix14);
        com.operations.Matrix.Matrix matrix19 = com.operations.Matrix.MatrixOperations.transpose(matrix14);
        com.operations.Matrix.Matrix matrix21 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix14, (double) ' ');
        com.operations.Matrix.Matrix matrix24 = com.operations.Matrix.MatrixTransformations.project2D(0.0d, (double) 0);
        double[][] doubleArray25 = matrix24.getData();
        com.operations.Matrix.Matrix matrix26 = new com.operations.Matrix.Matrix(doubleArray25);
        com.operations.Matrix.Matrix matrix27 = new com.operations.Matrix.Matrix(doubleArray25);
        com.operations.Matrix.Matrix matrix28 = com.operations.Matrix.MatrixOperations.multiply(matrix14, matrix27);
        com.operations.Matrix.Matrix matrix29 = com.operations.Matrix.MatrixOperations.transpose(matrix28);
        matrix28.print();
        com.operations.Matrix.Matrix matrix32 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix28, (double) 35);
        int int33 = matrix28.getRows();
        com.operations.Matrix.Matrix matrix35 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix28, (double) (short) 0);
        com.operations.Matrix.Matrix matrix37 = com.operations.Matrix.MatrixTransformations.rotate2D((double) '4');
        com.operations.Matrix.Matrix matrix40 = com.operations.Matrix.MatrixTransformations.project2D((double) ' ', 0.0d);
        boolean boolean41 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix40);
        boolean boolean43 = com.operations.Matrix.MatrixUtils.compare(matrix37, matrix40, 1.4142135623730951d);
        com.operations.Matrix.Matrix matrix44 = com.operations.Matrix.MatrixOperations.subtract(matrix28, matrix40);
        matrix44.print();
        double[][] doubleArray46 = matrix44.getData();
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(matrixArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(matrix44);
        org.junit.Assert.assertNotNull(doubleArray46);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D((double) 97);
        // The following exception was thrown during execution in test generation
        try {
            com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrix is not positive definite.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix1);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        double[] doubleArray2 = new double[] { 10, 'a' };
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[][] doubleArray6 = new double[][] { doubleArray2, doubleArray5 };
        com.operations.Matrix.Matrix matrix7 = new com.operations.Matrix.Matrix(doubleArray6);
        com.operations.Matrix.Matrix matrix8 = new com.operations.Matrix.Matrix(doubleArray6);
        com.operations.Matrix.Matrix matrix9 = new com.operations.Matrix.Matrix(doubleArray6);
        com.operations.Matrix.Matrix matrix10 = new com.operations.Matrix.Matrix(doubleArray6);
        com.operations.Matrix.Matrix matrix11 = com.operations.Matrix.MatrixOperations.transpose(matrix10);
        com.operations.Matrix.Matrix matrix14 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray17 = new double[] { 10, 'a' };
        double[] doubleArray20 = new double[] { 10, 'a' };
        double[][] doubleArray21 = new double[][] { doubleArray17, doubleArray20 };
        com.operations.Matrix.Matrix matrix22 = new com.operations.Matrix.Matrix(doubleArray21);
        int int23 = matrix22.getCols();
        int int24 = matrix22.getCols();
        int int25 = matrix22.getCols();
        com.operations.Matrix.Matrix[] matrixArray26 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix22);
        com.operations.Matrix.Matrix matrix27 = com.operations.Matrix.MatrixOperations.multiply(matrix14, matrix22);
        int int28 = matrix22.getRows();
        int int29 = matrix22.getCols();
        com.operations.Matrix.Matrix matrix32 = com.operations.Matrix.MatrixTransformations.project2D((double) (-1L), (double) (short) 100);
        com.operations.Matrix.Matrix matrix33 = com.operations.Matrix.MatrixOperations.subtract(matrix22, matrix32);
        com.operations.Matrix.Matrix matrix36 = com.operations.Matrix.MatrixTransformations.project2D(0.0d, (double) 0);
        double[][] doubleArray37 = matrix36.getData();
        com.operations.Matrix.Matrix matrix40 = com.operations.Matrix.MatrixTransformations.project2D((double) ' ', 0.0d);
        double[] doubleArray43 = new double[] { 10, 'a' };
        double[] doubleArray46 = new double[] { 10, 'a' };
        double[][] doubleArray47 = new double[][] { doubleArray43, doubleArray46 };
        com.operations.Matrix.Matrix matrix48 = new com.operations.Matrix.Matrix(doubleArray47);
        int int49 = matrix48.getCols();
        boolean boolean50 = com.operations.Matrix.MatrixUtils.isSquare(matrix48);
        com.operations.Matrix.Matrix matrix51 = com.operations.Matrix.MatrixOperations.transpose(matrix48);
        int int52 = matrix51.getRows();
        com.operations.Matrix.Matrix matrix55 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray58 = new double[] { 10, 'a' };
        double[] doubleArray61 = new double[] { 10, 'a' };
        double[][] doubleArray62 = new double[][] { doubleArray58, doubleArray61 };
        com.operations.Matrix.Matrix matrix63 = new com.operations.Matrix.Matrix(doubleArray62);
        int int64 = matrix63.getCols();
        int int65 = matrix63.getCols();
        int int66 = matrix63.getCols();
        com.operations.Matrix.Matrix[] matrixArray67 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix63);
        com.operations.Matrix.Matrix matrix68 = com.operations.Matrix.MatrixOperations.multiply(matrix55, matrix63);
        com.operations.Matrix.Matrix matrix70 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean72 = com.operations.Matrix.MatrixUtils.compare(matrix63, matrix70, (double) (byte) 0);
        com.operations.Matrix.Matrix matrix73 = com.operations.Matrix.MatrixOperations.multiply(matrix51, matrix63);
        com.operations.Matrix.Matrix matrix74 = com.operations.Matrix.MatrixOperations.add(matrix40, matrix63);
        com.operations.Matrix.Matrix matrix75 = com.operations.Matrix.MatrixOperations.transpose(matrix40);
        boolean boolean77 = com.operations.Matrix.MatrixUtils.compare(matrix36, matrix40, (double) 0L);
        com.operations.Matrix.Matrix matrix78 = com.operations.Matrix.MatrixOperations.multiply(matrix33, matrix40);
        double double79 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix40);
        com.operations.Matrix.Matrix matrix80 = com.operations.Matrix.MatrixOperations.multiply(matrix10, matrix40);
        com.operations.Matrix.Matrix matrix83 = com.operations.Matrix.MatrixTransformations.project2D(65.19779036970327d, (double) 100);
        double[][] doubleArray84 = matrix83.getData();
        com.operations.Matrix.Matrix matrix85 = com.operations.Matrix.MatrixOperations.multiply(matrix40, matrix83);
        com.operations.Matrix.Matrix[] matrixArray86 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix83);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(matrixArray26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(matrix55);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertNotNull(matrixArray67);
        org.junit.Assert.assertNotNull(matrix68);
        org.junit.Assert.assertNotNull(matrix70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertNotNull(matrix74);
        org.junit.Assert.assertNotNull(matrix75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(matrix78);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 32.0d + "'", double79 == 32.0d);
        org.junit.Assert.assertNotNull(matrix80);
        org.junit.Assert.assertNotNull(matrix83);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertNotNull(matrix85);
        org.junit.Assert.assertNotNull(matrixArray86);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.project2D(640031.99920004d, 36.40054944640259d);
        org.junit.Assert.assertNotNull(matrix2);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        double[] doubleArray2 = new double[] { 10, 'a' };
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[][] doubleArray6 = new double[][] { doubleArray2, doubleArray5 };
        com.operations.Matrix.Matrix matrix7 = new com.operations.Matrix.Matrix(doubleArray6);
        com.operations.Matrix.Matrix matrix8 = new com.operations.Matrix.Matrix(doubleArray6);
        com.operations.Matrix.Matrix matrix10 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray13 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray14 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix10, doubleArray13);
        com.operations.Matrix.Matrix matrix15 = com.operations.Matrix.MatrixOperations.add(matrix8, matrix10);
        com.operations.Matrix.Matrix matrix16 = com.operations.Matrix.MatrixOperations.transpose(matrix10);
        boolean boolean17 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix16);
        com.operations.Matrix.Matrix matrix19 = com.operations.Matrix.MatrixTransformations.rotate2D(350.0d);
        com.operations.Matrix.Matrix matrix20 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix19);
        com.operations.Matrix.Matrix matrix22 = com.operations.Matrix.MatrixTransformations.rotate2D((double) '4');
        double[] doubleArray25 = new double[] { 10, 'a' };
        double[] doubleArray28 = new double[] { 10, 'a' };
        double[][] doubleArray29 = new double[][] { doubleArray25, doubleArray28 };
        com.operations.Matrix.Matrix matrix30 = new com.operations.Matrix.Matrix(doubleArray29);
        com.operations.Matrix.Matrix matrix31 = new com.operations.Matrix.Matrix(doubleArray29);
        com.operations.Matrix.Matrix matrix33 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray36 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray37 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix33, doubleArray36);
        com.operations.Matrix.Matrix matrix38 = com.operations.Matrix.MatrixOperations.add(matrix31, matrix33);
        boolean boolean39 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix38);
        boolean boolean41 = com.operations.Matrix.MatrixUtils.compare(matrix22, matrix38, 364.0054944640259d);
        com.operations.Matrix.Matrix matrix44 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int45 = matrix44.getRows();
        com.operations.Matrix.Matrix matrix47 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix44, (double) 2);
        matrix44.print();
        com.operations.Matrix.Matrix matrix49 = com.operations.Matrix.MatrixOperations.multiply(matrix38, matrix44);
        com.operations.Matrix.Matrix matrix50 = com.operations.Matrix.MatrixOperations.transpose(matrix49);
        boolean boolean52 = com.operations.Matrix.MatrixUtils.compare(matrix20, matrix50, (-1.0d));
        com.operations.Matrix.Matrix matrix53 = com.operations.Matrix.MatrixOperations.add(matrix16, matrix50);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(matrix44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(matrix47);
        org.junit.Assert.assertNotNull(matrix49);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(matrix53);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        com.operations.Matrix.Matrix matrix2 = new com.operations.Matrix.Matrix(97, 35);
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.project2D((double) 1L, 12.751772028997056d);
        com.operations.Matrix.Matrix matrix4 = com.operations.Matrix.MatrixTransformations.rotate2D(100.0d);
        int int5 = matrix4.getCols();
        matrix4.print();
        com.operations.Matrix.Matrix matrix8 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix4, (double) (byte) 1);
        com.operations.Matrix.Matrix matrix10 = com.operations.Matrix.MatrixTransformations.rotate2D(100.0d);
        int int11 = matrix10.getCols();
        int int12 = matrix10.getRows();
        com.operations.Matrix.Matrix matrix15 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int16 = matrix15.getRows();
        com.operations.Matrix.Matrix matrix18 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix15, (double) 2);
        double double19 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix15);
        com.operations.Matrix.Matrix matrix20 = com.operations.Matrix.MatrixOperations.add(matrix10, matrix15);
        double[] doubleArray23 = new double[] { 10, 'a' };
        double[] doubleArray26 = new double[] { 10, 'a' };
        double[][] doubleArray27 = new double[][] { doubleArray23, doubleArray26 };
        com.operations.Matrix.Matrix matrix28 = new com.operations.Matrix.Matrix(doubleArray27);
        com.operations.Matrix.Matrix matrix29 = new com.operations.Matrix.Matrix(doubleArray27);
        com.operations.Matrix.Matrix matrix31 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray34 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray35 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix31, doubleArray34);
        com.operations.Matrix.Matrix matrix36 = com.operations.Matrix.MatrixOperations.add(matrix29, matrix31);
        com.operations.Matrix.Matrix matrix37 = com.operations.Matrix.MatrixOperations.transpose(matrix31);
        com.operations.Matrix.Matrix matrix39 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        com.operations.Matrix.Matrix matrix40 = com.operations.Matrix.MatrixOperations.subtract(matrix31, matrix39);
        com.operations.Matrix.Matrix matrix41 = com.operations.Matrix.MatrixOperations.multiply(matrix10, matrix39);
        com.operations.Matrix.Matrix matrix43 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix10, 146.4308710620817d);
        com.operations.Matrix.Matrix matrix46 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray49 = new double[] { 10, 'a' };
        double[] doubleArray52 = new double[] { 10, 'a' };
        double[][] doubleArray53 = new double[][] { doubleArray49, doubleArray52 };
        com.operations.Matrix.Matrix matrix54 = new com.operations.Matrix.Matrix(doubleArray53);
        int int55 = matrix54.getCols();
        int int56 = matrix54.getCols();
        int int57 = matrix54.getCols();
        com.operations.Matrix.Matrix[] matrixArray58 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix54);
        com.operations.Matrix.Matrix matrix59 = com.operations.Matrix.MatrixOperations.multiply(matrix46, matrix54);
        com.operations.Matrix.Matrix matrix61 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean63 = com.operations.Matrix.MatrixUtils.compare(matrix54, matrix61, (double) (byte) 0);
        com.operations.Matrix.Matrix matrix64 = com.operations.Matrix.MatrixOperations.transpose(matrix54);
        com.operations.Matrix.Matrix matrix66 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix64, (double) 10);
        double double67 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix64);
        com.operations.Matrix.Matrix matrix68 = com.operations.Matrix.MatrixOperations.add(matrix10, matrix64);
        boolean boolean70 = com.operations.Matrix.MatrixUtils.compare(matrix4, matrix64, (double) 2);
        com.operations.Matrix.Matrix matrix71 = com.operations.Matrix.MatrixOperations.multiply(matrix2, matrix64);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(matrix43);
        org.junit.Assert.assertNotNull(matrix46);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(matrixArray58);
        org.junit.Assert.assertNotNull(matrix59);
        org.junit.Assert.assertNotNull(matrix61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertNotNull(matrix66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 137.90576492663388d + "'", double67 == 137.90576492663388d);
        org.junit.Assert.assertNotNull(matrix68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(matrix71);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (-1L));
        matrix1.print();
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray8 = new double[] { 10, 'a' };
        double[] doubleArray11 = new double[] { 10, 'a' };
        double[][] doubleArray12 = new double[][] { doubleArray8, doubleArray11 };
        com.operations.Matrix.Matrix matrix13 = new com.operations.Matrix.Matrix(doubleArray12);
        int int14 = matrix13.getCols();
        int int15 = matrix13.getCols();
        int int16 = matrix13.getCols();
        com.operations.Matrix.Matrix[] matrixArray17 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix13);
        com.operations.Matrix.Matrix matrix18 = com.operations.Matrix.MatrixOperations.multiply(matrix5, matrix13);
        com.operations.Matrix.Matrix matrix20 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        boolean boolean22 = com.operations.Matrix.MatrixUtils.compare(matrix13, matrix20, (double) (byte) 0);
        double[] doubleArray25 = new double[] { 10, 'a' };
        double[] doubleArray28 = new double[] { 10, 'a' };
        double[][] doubleArray29 = new double[][] { doubleArray25, doubleArray28 };
        com.operations.Matrix.Matrix matrix30 = new com.operations.Matrix.Matrix(doubleArray29);
        com.operations.Matrix.Matrix matrix31 = new com.operations.Matrix.Matrix(doubleArray29);
        com.operations.Matrix.Matrix matrix32 = new com.operations.Matrix.Matrix(doubleArray29);
        boolean boolean34 = com.operations.Matrix.MatrixUtils.compare(matrix13, matrix32, (double) (-1));
        double[] doubleArray37 = new double[] { 10, 'a' };
        double[] doubleArray40 = new double[] { 10, 'a' };
        double[][] doubleArray41 = new double[][] { doubleArray37, doubleArray40 };
        com.operations.Matrix.Matrix matrix42 = new com.operations.Matrix.Matrix(doubleArray41);
        com.operations.Matrix.Matrix matrix43 = new com.operations.Matrix.Matrix(doubleArray41);
        boolean boolean44 = com.operations.Matrix.MatrixUtils.isSquare(matrix43);
        com.operations.Matrix.Matrix matrix45 = com.operations.Matrix.MatrixOperations.multiply(matrix32, matrix43);
        com.operations.Matrix.Matrix matrix48 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int49 = matrix48.getRows();
        com.operations.Matrix.Matrix matrix51 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix48, (double) 2);
        matrix48.print();
        matrix48.print();
        com.operations.Matrix.Matrix matrix54 = com.operations.Matrix.MatrixOperations.multiply(matrix45, matrix48);
        com.operations.Matrix.Matrix matrix55 = com.operations.Matrix.MatrixOperations.subtract(matrix1, matrix48);
        com.operations.Matrix.Matrix matrix56 = com.operations.Matrix.MatrixOperations.transpose(matrix1);
        com.operations.Matrix.Matrix matrix59 = com.operations.Matrix.MatrixTransformations.project2D((double) (byte) 100, (double) 1L);
        com.operations.Matrix.Matrix matrix60 = com.operations.Matrix.MatrixOperations.add(matrix1, matrix59);
        com.operations.Matrix.Matrix[] matrixArray61 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix60);
        int int62 = matrix60.getCols();
        int int63 = matrix60.getRows();
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(matrixArray17);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertNotNull(matrix48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertNotNull(matrix54);
        org.junit.Assert.assertNotNull(matrix55);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(matrix59);
        org.junit.Assert.assertNotNull(matrix60);
        org.junit.Assert.assertNotNull(matrixArray61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D((double) 1.0f);
        com.operations.Matrix.Matrix matrix4 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int5 = matrix4.getRows();
        com.operations.Matrix.Matrix matrix7 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix4, (double) 2);
        double double8 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix4);
        com.operations.Matrix.Matrix matrix11 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int12 = matrix11.getRows();
        com.operations.Matrix.Matrix matrix14 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix11, (double) 2);
        com.operations.Matrix.Matrix matrix15 = com.operations.Matrix.MatrixOperations.subtract(matrix4, matrix14);
        com.operations.Matrix.Matrix matrix16 = com.operations.Matrix.MatrixOperations.add(matrix1, matrix14);
        boolean boolean17 = com.operations.Matrix.MatrixUtils.isSquare(matrix14);
        double[][] doubleArray18 = matrix14.getData();
        com.operations.Matrix.Matrix matrix19 = new com.operations.Matrix.Matrix(doubleArray18);
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(matrix15);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int3 = matrix2.getRows();
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix2, (double) 2);
        matrix2.print();
        com.operations.Matrix.Matrix matrix8 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix2, 100.00499987500625d);
        com.operations.Matrix.Matrix matrix10 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix8, 35.0d);
        matrix8.print();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = matrix8.getValue((int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(matrix10);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixUtils.generateRandomMatrix((int) (byte) 10, 52, (int) (short) 100, (int) 'a', (long) (short) 100);
        boolean boolean6 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix5);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        com.operations.Matrix.Matrix matrix2 = new com.operations.Matrix.Matrix(100, (int) (byte) 10);
        int int3 = matrix2.getCols();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        com.operations.Matrix.Matrix matrix0 = null;
        com.operations.Matrix.Matrix matrix3 = com.operations.Matrix.MatrixTransformations.scale2D(364.0054944640259d, (double) 100);
        double[][] doubleArray4 = matrix3.getData();
        com.operations.Matrix.Matrix matrix5 = new com.operations.Matrix.Matrix(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.operations.Matrix.MatrixUtils.compare(matrix0, matrix5, 43.079766291379094d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int3 = matrix2.getRows();
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix2, (double) 2);
        matrix2.print();
        com.operations.Matrix.Matrix matrix12 = com.operations.Matrix.MatrixUtils.generateRandomMatrix((int) (short) 10, (int) (short) 100, (int) (byte) -1, (-1), (long) (byte) 10);
        boolean boolean14 = com.operations.Matrix.MatrixUtils.compare(matrix2, matrix12, (double) (short) 10);
        com.operations.Matrix.Matrix[] matrixArray15 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix2);
        matrix2.print();
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(matrix12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(matrixArray15);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        com.operations.Matrix.Matrix matrix4 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(52, 97, 52, (int) (short) 100);
        org.junit.Assert.assertNotNull(matrix4);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.project2D((double) 0L, (double) 0);
        com.operations.Matrix.Matrix[] matrixArray3 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix2);
        com.operations.Matrix.Matrix matrix4 = com.operations.Matrix.MatrixOperations.transpose(matrix2);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = matrix2.getValue((-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(matrixArray3);
        org.junit.Assert.assertNotNull(matrix4);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.project2D(400.0d, 36.40054944640259d);
        com.operations.Matrix.Matrix matrix4 = com.operations.Matrix.MatrixTransformations.rotate2D(100.0d);
        int int5 = matrix4.getCols();
        matrix4.print();
        com.operations.Matrix.Matrix matrix8 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix4, (double) (byte) 1);
        com.operations.Matrix.Matrix matrix10 = com.operations.Matrix.MatrixTransformations.rotate2D(350.0d);
        com.operations.Matrix.Matrix matrix12 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray15 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray16 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix12, doubleArray15);
        double[] doubleArray17 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix10, doubleArray16);
        double[] doubleArray18 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix4, doubleArray16);
        double[] doubleArray19 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix2, doubleArray16);
        boolean boolean20 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix2);
        com.operations.Matrix.Matrix matrix21 = com.operations.Matrix.MatrixOperations.transpose(matrix2);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(matrix4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(matrix10);
        org.junit.Assert.assertNotNull(matrix12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-0.9999999999999858d), (-137.90576492663388d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-129.24700952206834d), 48.1062421064292d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-0.06232973130571564d), (-3.7262354653980627d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(matrix21);
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.project2D((double) 1.0f, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = matrix2.getValue((int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matrix2);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        double[] doubleArray2 = new double[] { 10, 'a' };
        double[] doubleArray5 = new double[] { 10, 'a' };
        double[][] doubleArray6 = new double[][] { doubleArray2, doubleArray5 };
        com.operations.Matrix.Matrix matrix7 = new com.operations.Matrix.Matrix(doubleArray6);
        com.operations.Matrix.Matrix matrix8 = new com.operations.Matrix.Matrix(doubleArray6);
        boolean boolean9 = com.operations.Matrix.MatrixUtils.isSquare(matrix8);
        double[] doubleArray12 = new double[] { 10, 'a' };
        double[] doubleArray15 = new double[] { 10, 'a' };
        double[][] doubleArray16 = new double[][] { doubleArray12, doubleArray15 };
        com.operations.Matrix.Matrix matrix17 = new com.operations.Matrix.Matrix(doubleArray16);
        int int18 = matrix17.getCols();
        int int19 = matrix17.getCols();
        matrix17.print();
        double[] doubleArray23 = new double[] { 10, 'a' };
        double[] doubleArray26 = new double[] { 10, 'a' };
        double[][] doubleArray27 = new double[][] { doubleArray23, doubleArray26 };
        com.operations.Matrix.Matrix matrix28 = new com.operations.Matrix.Matrix(doubleArray27);
        boolean boolean30 = com.operations.Matrix.MatrixUtils.compare(matrix17, matrix28, (double) (-1));
        com.operations.Matrix.Matrix matrix31 = com.operations.Matrix.MatrixOperations.subtract(matrix8, matrix28);
        com.operations.Matrix.Matrix[] matrixArray32 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix31);
        com.operations.Matrix.Matrix matrix34 = com.operations.Matrix.MatrixTransformations.rotate2D((double) 1.0f);
        com.operations.Matrix.Matrix matrix37 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int38 = matrix37.getRows();
        com.operations.Matrix.Matrix matrix40 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix37, (double) 2);
        double double41 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix37);
        com.operations.Matrix.Matrix matrix44 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int45 = matrix44.getRows();
        com.operations.Matrix.Matrix matrix47 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix44, (double) 2);
        com.operations.Matrix.Matrix matrix48 = com.operations.Matrix.MatrixOperations.subtract(matrix37, matrix47);
        com.operations.Matrix.Matrix matrix49 = com.operations.Matrix.MatrixOperations.add(matrix34, matrix47);
        matrix34.print();
        double[] doubleArray53 = new double[] { 10, 'a' };
        double[] doubleArray56 = new double[] { 10, 'a' };
        double[][] doubleArray57 = new double[][] { doubleArray53, doubleArray56 };
        com.operations.Matrix.Matrix matrix58 = new com.operations.Matrix.Matrix(doubleArray57);
        com.operations.Matrix.Matrix matrix59 = com.operations.Matrix.MatrixOperations.transpose(matrix58);
        com.operations.Matrix.Matrix matrix62 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int63 = matrix62.getRows();
        com.operations.Matrix.Matrix matrix69 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(100, (int) (byte) 1, (int) '#', (int) '#', 1L);
        boolean boolean71 = com.operations.Matrix.MatrixUtils.compare(matrix62, matrix69, (double) 1.0f);
        com.operations.Matrix.Matrix matrix73 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix62, (double) 1L);
        matrix62.print();
        com.operations.Matrix.Matrix matrix75 = com.operations.Matrix.MatrixOperations.multiply(matrix59, matrix62);
        com.operations.Matrix.Matrix matrix76 = com.operations.Matrix.MatrixOperations.multiply(matrix34, matrix62);
        boolean boolean78 = com.operations.Matrix.MatrixUtils.compare(matrix31, matrix76, (double) (byte) 0);
        com.operations.Matrix.Matrix[] matrixArray79 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix76);
        boolean boolean80 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix76);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(matrixArray32);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(matrix44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(matrix47);
        org.junit.Assert.assertNotNull(matrix48);
        org.junit.Assert.assertNotNull(matrix49);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertNotNull(matrix59);
        org.junit.Assert.assertNotNull(matrix62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertNotNull(matrix69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertNotNull(matrix75);
        org.junit.Assert.assertNotNull(matrix76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(matrixArray79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        com.operations.Matrix.Matrix matrix1 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray4 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray5 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix1, doubleArray4);
        com.operations.Matrix.Matrix matrix8 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        double[] doubleArray11 = new double[] { 10, 'a' };
        double[] doubleArray14 = new double[] { 10, 'a' };
        double[][] doubleArray15 = new double[][] { doubleArray11, doubleArray14 };
        com.operations.Matrix.Matrix matrix16 = new com.operations.Matrix.Matrix(doubleArray15);
        int int17 = matrix16.getCols();
        int int18 = matrix16.getCols();
        int int19 = matrix16.getCols();
        com.operations.Matrix.Matrix[] matrixArray20 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix16);
        com.operations.Matrix.Matrix matrix21 = com.operations.Matrix.MatrixOperations.multiply(matrix8, matrix16);
        boolean boolean23 = com.operations.Matrix.MatrixUtils.compare(matrix1, matrix8, (double) (-1L));
        boolean boolean24 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix1);
        int int25 = matrix1.getCols();
        com.operations.Matrix.Matrix matrix27 = com.operations.Matrix.MatrixTransformations.rotate2D((-1.0d));
        com.operations.Matrix.Matrix matrix29 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (-1L));
        com.operations.Matrix.Matrix matrix31 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[] doubleArray34 = new double[] { 137.90576492663388d, (byte) -1 };
        double[] doubleArray35 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix31, doubleArray34);
        double[] doubleArray36 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix29, doubleArray34);
        double[] doubleArray37 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix27, doubleArray34);
        double[] doubleArray38 = com.operations.Matrix.MatrixSolver.solveGaussian(matrix1, doubleArray34);
        double[][] doubleArray39 = matrix1.getData();
        com.operations.Matrix.Matrix matrix41 = com.operations.Matrix.MatrixTransformations.rotate2D((double) (short) 100);
        double[][] doubleArray42 = matrix41.getData();
        com.operations.Matrix.Matrix matrix43 = new com.operations.Matrix.Matrix(doubleArray42);
        int int44 = matrix43.getCols();
        com.operations.Matrix.Matrix matrix45 = com.operations.Matrix.MatrixOperations.subtract(matrix1, matrix43);
        boolean boolean46 = com.operations.Matrix.MatrixUtils.isSymmetric(matrix45);
        org.junit.Assert.assertNotNull(matrix1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(matrixArray20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(matrix29);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 137.90576492663388d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 137.90221361711127d, 1.4069397643877004d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 137.90221361711127d, 1.4069397643877004d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { (-24.931892522286255d), (-135.63701830716116d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.scale2D((double) 0L, (double) (byte) 10);
        int int3 = matrix2.getRows();
        com.operations.Matrix.Matrix matrix9 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(100, (int) (byte) 1, (int) '#', (int) '#', 1L);
        boolean boolean11 = com.operations.Matrix.MatrixUtils.compare(matrix2, matrix9, (double) 1.0f);
        double[] doubleArray14 = new double[] { 10, 'a' };
        double[] doubleArray17 = new double[] { 10, 'a' };
        double[][] doubleArray18 = new double[][] { doubleArray14, doubleArray17 };
        com.operations.Matrix.Matrix matrix19 = new com.operations.Matrix.Matrix(doubleArray18);
        int int20 = matrix19.getCols();
        int int21 = matrix19.getCols();
        int int22 = matrix19.getCols();
        com.operations.Matrix.Matrix matrix28 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(100, (int) (byte) 1, (int) '#', (int) '#', 1L);
        double double31 = matrix28.getValue((int) '4', 0);
        double double32 = com.operations.Matrix.MatrixUtils.frobeniusNorm(matrix28);
        boolean boolean33 = com.operations.Matrix.MatrixUtils.isSquare(matrix28);
        boolean boolean35 = com.operations.Matrix.MatrixUtils.compare(matrix19, matrix28, (double) 100L);
        com.operations.Matrix.Matrix matrix36 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix19);
        double[] doubleArray39 = new double[] { 10, 'a' };
        double[] doubleArray42 = new double[] { 10, 'a' };
        double[][] doubleArray43 = new double[][] { doubleArray39, doubleArray42 };
        com.operations.Matrix.Matrix matrix44 = new com.operations.Matrix.Matrix(doubleArray43);
        int int45 = matrix44.getCols();
        int int46 = matrix44.getCols();
        int int47 = matrix44.getCols();
        com.operations.Matrix.Matrix matrix49 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix44, (double) 0.0f);
        boolean boolean51 = com.operations.Matrix.MatrixUtils.compare(matrix36, matrix44, (double) '4');
        matrix44.print();
        boolean boolean54 = com.operations.Matrix.MatrixUtils.compare(matrix9, matrix44, 137.90576492663388d);
        com.operations.Matrix.Matrix matrix55 = com.operations.Matrix.MatrixDecompositions.choleskyDecomposition(matrix44);
        com.operations.Matrix.Matrix matrix56 = com.operations.Matrix.MatrixOperations.transpose(matrix44);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 35.0d + "'", double31 == 35.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 350.0d + "'", double32 == 350.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(matrix49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(matrix55);
        org.junit.Assert.assertNotNull(matrix56);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        com.operations.Matrix.Matrix matrix2 = com.operations.Matrix.MatrixTransformations.project2D(137.90576492663388d, 0.0d);
        double[][] doubleArray3 = matrix2.getData();
        com.operations.Matrix.Matrix matrix5 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix2, 975.1410154434076d);
        com.operations.Matrix.Matrix matrix7 = com.operations.Matrix.MatrixOperations.scalarMultiply(matrix5, 0.0d);
        com.operations.Matrix.Matrix[] matrixArray8 = com.operations.Matrix.MatrixDecompositions.luDecomposition(matrix7);
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(matrix5);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(matrixArray8);
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        com.operations.Matrix.Matrix matrix4 = com.operations.Matrix.MatrixUtils.generateRandomMatrix(32, 52, (int) (short) 100, (-1));
        org.junit.Assert.assertNotNull(matrix4);
    }
}

