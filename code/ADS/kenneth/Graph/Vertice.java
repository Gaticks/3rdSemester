package ADS.kenneth.Graph;

import java.util.ArrayList;
import java.util.List;

public class Vertice {

    private int element;
    private boolean isColour;
    private boolean isVisited;
    private List<Vertice> edges;
    private boolean isReset;

    public Vertice(int element) {
        this.element = element;
        this.isColour = false;
        this.isVisited = false;
        this.edges = new ArrayList<>();
        this.isReset = true;

    }

    public void addEdge(Vertice vertice) {
        this.edges.add(vertice);
    }

    public void removeElement(Vertice vertice) {
        this.edges.remove(vertice);
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public boolean isColour() {
        return isColour;
    }

    public void setColour(boolean colour) {
        isColour = colour;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public List<Vertice> getEdges() {
        return edges;
    }
    public void reset() {
        this.isColour = false;
        this.isVisited = false;
        this.isReset = true;
    }

    public boolean isReset() {
        return isReset;
    }
}
