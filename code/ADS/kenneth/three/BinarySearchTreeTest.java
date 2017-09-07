package ADS.kenneth.three;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {
    @Test
    public void add() throws Exception {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        tree.add(10);
        tree.add(7);
        tree.add(12);
        tree.add(16);
        tree.add(11);
        tree.add(2);
        tree.add(5);
    }

    @Test
    public void contains() throws Exception {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        tree.add(10);
        tree.add(7);
        tree.add(12);
        tree.add(16);
        tree.add(11);
        tree.add(2);
        tree.add(5);

        Assert.assertTrue(tree.contains(10));
        Assert.assertTrue(tree.contains(5));
        Assert.assertTrue(tree.contains(11));
        Assert.assertTrue(tree.contains(16));
    }

    @Test
    public void getMin() throws Exception {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        tree.add(10);
        tree.add(7);
        tree.add(12);
        tree.add(16);
        tree.add(11);
        tree.add(2);
        tree.add(5);

        Assert.assertTrue(tree.getMin() == 2);
    }

    @Test
    public void getMax() throws Exception {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        tree.add(10);
        tree.add(7);
        tree.add(12);
        tree.add(16);
        tree.add(11);
        tree.add(2);
        tree.add(5);

        Assert.assertTrue(tree.getMax() == 16);
    }

    @Test
    public void remove() throws Exception {

        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        tree.add(10);
        tree.add(7);
        tree.add(12);
        tree.add(16);
        tree.add(11);
        tree.add(2);
        tree.add(5);

        tree.remove(7);
        Assert.assertFalse(tree.contains(7));

        tree.remove(11);
        Assert.assertFalse(tree.contains(11));

        tree.remove(10);
        Assert.assertFalse(tree.contains(10));
    }

}