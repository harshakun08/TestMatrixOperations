package com.operations.Matrix;



public class MatrixTransformations {

    public static Matrix rotate2D(double angle) {
        double radians = Math.toRadians(angle);
        double[][] rotationMatrix = {
            { Math.cos(radians), -Math.sin(radians) },
            { Math.sin(radians), Math.cos(radians) }
        };
        return new Matrix(rotationMatrix);
    }

    public static Matrix scale2D(double scaleX, double scaleY) {
        double[][] scaleMatrix = {
            { scaleX, 0 },
            { 0, scaleY }
        };
        return new Matrix(scaleMatrix);
    }

    public static Matrix project2D(double x, double y) {
        double[][] projectionMatrix = {
            { x, 0 },
            { 0, y }
        };
        return new Matrix(projectionMatrix);
    }
}

