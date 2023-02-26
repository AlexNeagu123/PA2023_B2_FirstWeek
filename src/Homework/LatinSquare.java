package Homework;

public class LatinSquare {
    private final int squareLen;
    private final int[][] square;
    public final int MAXIMUM_DISPLAY_LENGTH = 30000;

    public LatinSquare(int squareLen) {
        this.squareLen = squareLen;
        this.square = new int[squareLen][squareLen];
        for (int row = 0; row < squareLen; ++row) {
            for (int col = 0; col < squareLen; ++col) {
                int cellElement = (col + row) % squareLen;
                this.square[row][col] = cellElement;
            }
        }
    }

    public void printSquare() {
        for (int row = 0; row < squareLen; ++row) {
            for (int col = 0; col < squareLen; ++col) {
                System.out.printf("%d ", square[row][col]);
            }
            System.out.println();
        }
    }

    public void displayRows() {
        if (squareLen < MAXIMUM_DISPLAY_LENGTH) {
            System.out.println("-----Row concatenation-----");
        }
        for (int row = 0; row < squareLen; ++row) {
            StringBuilder rowAsString = concatenateRow(row);
            if (squareLen < MAXIMUM_DISPLAY_LENGTH) {
                System.out.printf("Row %d: %s\n", row, rowAsString);
            }
        }
    }

    public void displayColumns() {
        if (squareLen < MAXIMUM_DISPLAY_LENGTH) {
            System.out.println("-----Column concatenation-----");
        }
        for (int col = 0; col < squareLen; ++col) {
            StringBuilder columnAsString = concatenateColumn(col);
            if (squareLen < MAXIMUM_DISPLAY_LENGTH) {
                System.out.printf("Column %d: %s\n", col, columnAsString);
            }
        }
    }

    StringBuilder concatenateRow(int row) {
        StringBuilder rowConcat = new StringBuilder();
        for (int col = 0; col < squareLen; ++col) {
            rowConcat.append(square[row][col]);
        }
        return rowConcat;
    }

    StringBuilder concatenateColumn(int col) {
        StringBuilder colConcat = new StringBuilder();
        for (int row = 0; row < squareLen; ++row) {
            colConcat.append(square[row][col]);
        }
        return colConcat;
    }
}
