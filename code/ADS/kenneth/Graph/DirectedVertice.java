package ADS.kenneth.Graph;

import java.util.ArrayList;

public class DirectedVertice {
    private ArrayList<DirectedVertice> edgeList;
    private int value;

    public DirectedVertice(int value) {
        this.value = value;
        edgeList = new ArrayList<>();
    }

    public DirectedVertice(ArrayList<DirectedVertice> edgeList, int value) {
        this.edgeList = edgeList;
        this.value = value;
    }

    public ArrayList<DirectedVertice> getEdgeList() {
        return edgeList;
    }

    public void addEdge(DirectedVertice vertice) {
        edgeList.add(vertice);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
