package ADS.kenneth.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class UnDirectedGraph implements Graph {

    private List<Vertice> verticeList;
    private Queue<Vertice> queue;

    public UnDirectedGraph() {
        this.verticeList = new ArrayList<>();
    }

    @Override
    public void addVertice(Vertice vertice) {
        this.verticeList.add(vertice);

    }

    @Override
    public void makeEdge(Vertice a, Vertice b) {
        a.addEdge(b);
        b.addEdge(b);
    }

    @Override
    public void printBreathFirst(Vertice start) {

    }

    @Override
    public void printDepthFirst(Vertice start) {

    }

    private void resetGraphColourAndvisited(Vertice start) {
        queue = new PriorityQueue<>();

        queue.add(start);
        Vertice tmp;
        while (!queue.isEmpty()) {
            tmp = queue.remove();
            for (Vertice item : tmp.getEdges()) {
                if (!item.isReset())
                    queue.add(item);
            }
            tmp.reset();
        }
    }
}
