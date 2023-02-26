package Bonus;

public class MatrixUtils {
    public static int[][] multiply(int[][] A, int[][] B) {
        int rowsA = A.length;
        int columnsA = A[0].length;
        int rowsB = B.length;
        int columnsB = B[0].length;

        assert (columnsA == rowsB) : "Number of columns in A should be equal to the number of rows in B";

        int[][] C = new int[rowsA][columnsB];
        for (int row = 0; row < rowsA; ++row) {
            for (int col = 0; col < columnsB; ++col) {
                for (int i = 0; i < columnsA; ++i) {
                    C[row][col] += A[row][i] * B[i][col];
                }
            }
        }

        return C;
    }

    public static void printPoweredMatrix(int pow, int[][] matrix) {
        System.out.println("Matrix raised to power " + pow + ":");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%d ", anInt);
            }
            System.out.println();
        }
        System.out.println();
    }
}
