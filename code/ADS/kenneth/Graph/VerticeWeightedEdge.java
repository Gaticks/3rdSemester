package ADS.kenneth.Graph;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class VerticeWeightedEdge {
    List<VerticeWeightedEdge> neighbourList;
    List<Integer> edgeWeightList;
    int value;


    public VerticeWeightedEdge(int value) {
        throw new NotImplementedException();
//        this.value = value;
//        this.neighbourList = new ArrayList<>();
//        edgeWeightList = new ArrayList<>();

    }

    public void addEdge(VerticeWeightedEdge neighbour, int weight) {
        neighbourList.add(neighbour);
        edgeWeightList.add(weight);
    }


}
