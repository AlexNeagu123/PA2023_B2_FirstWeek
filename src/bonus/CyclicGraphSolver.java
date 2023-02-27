package bonus;

public class CyclicGraphSolver {
    public static void run(int nodeNr) {
        CyclicGraph cyclicGraph = new CyclicGraph(nodeNr);
        MatrixUtils.printPoweredMatrix(1, cyclicGraph.getAdjMatrix());

        int[][] powerMatrix = cyclicGraph.cloneAdjMatrix();
        for (int i = 2; i <= nodeNr; ++i) {
            powerMatrix = MatrixUtils.multiply(powerMatrix, cyclicGraph.getAdjMatrix());
            MatrixUtils.printPoweredMatrix(i, powerMatrix);
        }
    }
}
