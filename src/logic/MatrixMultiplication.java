package logic;

import model.TwoDimensionalArray;

public class MatrixMultiplication {

    private static final String MULTIPLY_NOT_ALLOWED = "Matrix multiplication is prohibited!";

    public static TwoDimensionalArray multiplyMatrix(final int[][] firstMatrix, final int[][] secondMatrix) {
        int column1 = firstMatrix.length;
        int row1 = firstMatrix[0].length;
        int column2 = secondMatrix.length;
        int row2 = secondMatrix[0].length;

        if (row1 != column2) {
            System.err.println(MULTIPLY_NOT_ALLOWED);
        }

        int[][] result = new int[column1][row2];
        for (int i = 0; i < column1; ++i) {
            for (int j = 0; j < row2; ++j) {
                result[i][j] = 0;
                for (int k = 0; k < row1; ++k)
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
            }
        }

        TwoDimensionalArray resultMatrix = new TwoDimensionalArray(column1, row2);
        resultMatrix.setTwoDimArray(result);

        return resultMatrix;
    }
}
