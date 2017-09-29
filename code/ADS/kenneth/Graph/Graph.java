package ADS.kenneth.Graph;

public interface Graph {
    void addVertice(Vertice vertice);

    void makeEdge(Vertice a, Vertice b);
    void printBreathFirst(Vertice start);

    void printDepthFirst(Vertice start);
}
