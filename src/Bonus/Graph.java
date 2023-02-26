package Bonus;

public class Graph {
    protected int[][] adjMatrix;
    protected int nodeNr;

    public Graph(int nodeNr) {
        this.nodeNr = nodeNr;
        this.adjMatrix = new int[nodeNr][nodeNr];
    }

    public int[][] getAdjMatrix() {
        return adjMatrix;
    }

    public void printAdjMatrix() {
        System.out.println("The graph has been built and has the following adjacency matrix");
        for (int row = 0; row < nodeNr; ++row) {
            for (int col = 0; col < nodeNr; ++col) {
                System.out.printf("%d ", adjMatrix[row][col]);
            }
            System.out.println();
        }
    }

    public int[][] cloneAdjMatrix() {
        int[][] clonedMatrix = new int[nodeNr][nodeNr];
        for (int row = 0; row < nodeNr; ++row) {
            System.arraycopy(adjMatrix[row], 0, clonedMatrix[row], 0, nodeNr);
        }
        return clonedMatrix;
    }
}
