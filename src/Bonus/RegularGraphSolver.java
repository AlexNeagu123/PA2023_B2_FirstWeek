package Bonus;

public class RegularGraphSolver {
    public static void run(int nodeNr, int kIndex) {
        try {
            RegularGraph regularGraph = new RegularGraph(nodeNr, kIndex);
            regularGraph.printAdjMatrix();
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
