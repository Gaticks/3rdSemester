package ADS.kenneth.Graph;

public class DirectedGraphTropologicalSortTest {
    public static void main(String... args) {
        DirectedGraph directedGraph = new DirectedGraph();

        DirectedVertice v0 = new DirectedVertice(0);
        DirectedVertice v1 = new DirectedVertice(1);
        DirectedVertice v2 = new DirectedVertice(2);
        DirectedVertice v3 = new DirectedVertice(3);
        DirectedVertice v4 = new DirectedVertice(4);
        DirectedVertice v5 = new DirectedVertice(5);

        directedGraph.addVertice(v0);
        directedGraph.addVertice(v1);
        directedGraph.addVertice(v2);
        directedGraph.addVertice(v3);
        directedGraph.addVertice(v4);
        directedGraph.addVertice(v5);


        directedGraph.makeEdge(v5, v0);
        directedGraph.makeEdge(v5, v2);
        directedGraph.makeEdge(v2, v1);
        directedGraph.makeEdge(v1, v3);
        directedGraph.makeEdge(v4, v3);
        directedGraph.makeEdge(v4, v0);


        directedGraph.printTropologicalSort();

    }
}
