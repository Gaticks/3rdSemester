package ADS.kenneth.three;

import java.util.NoSuchElementException;

public interface IBinarySearchTree <T>{

    void add(T element);
    boolean contains(T element);
    T getMin();
    T getMax();
    void remove(T element) throws NoSuchElementException;


}
