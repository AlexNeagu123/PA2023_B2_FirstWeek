package bonus;

public class CyclicGraph extends Graph {
    public CyclicGraph(int nodeNr) {
        super(nodeNr);
        for (int nodeId = 0; nodeId < nodeNr; ++nodeId) {
            adjMatrix[nodeId][(nodeId + 1) % nodeNr] = adjMatrix[(nodeId + 1) % nodeNr][nodeId] = 1;
        }
    }
}
