package bonus;

public class RegularGraph extends Graph {
    public RegularGraph(int nodeNr, int kIndex) throws IllegalArgumentException {
        super(nodeNr);
        if (kIndex >= nodeNr || nodeNr * kIndex % 2 == 1) {
            throw new IllegalArgumentException(
                    String.format("A %d-regular graph with %d nodes doesn't exist!", kIndex, nodeNr)
            );
        }

        for (int nodeId = 0; nodeId < nodeNr; ++nodeId) {
            for (int dist = 1; dist <= kIndex / 2; ++dist) {
                int leftNeighbour = (nodeId - dist + nodeNr) % nodeNr;
                int rightNeighbour = (nodeId + dist) % nodeNr;
                adjMatrix[nodeId][leftNeighbour] = adjMatrix[leftNeighbour][nodeId] = 1;
                adjMatrix[nodeId][rightNeighbour] = adjMatrix[rightNeighbour][nodeId] = 1;
            }

            if (kIndex % 2 == 1) {
                int opposedNode = (nodeId + nodeNr / 2) % nodeNr;
                adjMatrix[nodeId][opposedNode] = adjMatrix[opposedNode][nodeId] = 1;
            }
        }
    }
}

