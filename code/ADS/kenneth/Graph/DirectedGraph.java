package ADS.kenneth.Graph;

import java.util.*;

public class DirectedGraph  {

    private ArrayList<DirectedVertice> vertices;

    public DirectedGraph() {
        vertices = new ArrayList<>();
    }

    public void addVertice(DirectedVertice vertice) {
        vertices.add(vertice);

    }

    public void makeEdge(DirectedVertice a, DirectedVertice b) {
        a.addEdge(b);
    }

    public void printBreathFirst(Vertice start) {

    }

    public void printDepthFirst(Vertice start) {

    }

    public void printTropologicalSort() {

        Set<DirectedVertice> visited;

        Stack<DirectedVertice> stack = new Stack<>();
        List<DirectedVertice> resultList = new ArrayList<>();

        for (int i = 0; i < vertices.size(); i++) {
            if (stack.contains(vertices.get(i))) {
                continue;
            }

            // add vertice i to the stack
            stack.push(vertices.get(i));

            //depth first on vertice i, pushing all to the stack
                DirectedVertice tempVertice = vertices.get(i);
                visited = new HashSet<>();
                debthFirstForTropo(visited,stack,tempVertice);

        }

        DirectedVertice item;
        while (!stack.isEmpty())
         {
             item = stack.pop();

            if (resultList.contains(item)) {
                continue;
            }
            resultList.add(0, item);

        }

        int[] expectedValue = {4,5,0,2,1,3};
        for(int i = 0; i < resultList.size(); i++) {

            System.out.println("Expected: " + expectedValue[i] + ", actual: " +                 resultList.get(i).getValue());
        }
    }

    private void debthFirstForTropo(Set<DirectedVertice> visited, Stack<DirectedVertice> stack, DirectedVertice vertice) {
        if (visited.contains(vertice)) {
            return;
        }
        ArrayList<DirectedVertice> edges = new ArrayList<>();
        edges = vertice.getEdgeList();
        stack.push(vertice);
        visited.add(vertice);
        for (DirectedVertice item : edges) {
            debthFirstForTropo(visited,stack,item);
        }
    }
}
