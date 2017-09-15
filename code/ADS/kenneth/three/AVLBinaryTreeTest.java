package ADS.kenneth.three;

import org.junit.Assert;
import org.junit.Test;

public class AVLBinaryTreeTest {

    @Test
    public void add() throws Exception {
        AVLBinaryTree<Integer> tree = new AVLBinaryTree<>();
        tree.add(6);
        tree.add(10);
        tree.add(20);
        tree.add(18);
        tree.add(4);
    }

    @Test
    public void contains() throws Exception {

        AVLBinaryTree<Integer> tree = new AVLBinaryTree<>();
        tree.add(6);
        tree.add(10);
        tree.add(20);
        tree.add(18);
        tree.add(4);

        Assert.assertTrue(tree.contains(6));
        Assert.assertTrue(tree.contains(10));
        Assert.assertTrue(tree.contains(20));
        Assert.assertTrue(tree.contains(18));
        Assert.assertTrue(tree.contains(4));
        Assert.assertFalse(tree.contains(-1));
    }

    @Test
    public void getMin() throws Exception {
     AVLBinaryTree<Integer> tree = new AVLBinaryTree<>();
        tree.add(6);
        tree.add(10);
        tree.add(20);
        tree.add(18);
        tree.add(4);
        Assert.assertTrue(tree.getMin() == 4);
    }

    @Test
    public void getMax() throws Exception {
     AVLBinaryTree<Integer> tree = new AVLBinaryTree<>();
        tree.add(6);
        tree.add(10);
        tree.add(20);
        tree.add(18);
        tree.add(4);

        System.out.println(tree.getMax());
        Assert.assertTrue(tree.getMax() == 20);
    }

    @Test
    public void remove() throws Exception {
    AVLBinaryTree<Integer> tree = new AVLBinaryTree<>();
        tree.add(6);
        tree.add(10);
        tree.add(20);
        tree.add(18);
        tree.add(4);

        tree.remove(6);
        Assert.assertFalse(tree.contains(6));

        tree.remove(10);
        Assert.assertFalse(tree.contains(10));

        tree.remove(20);
        Assert.assertFalse(tree.contains(20));

        tree.remove(18);
        Assert.assertFalse(tree.contains(18));

        tree.remove(4);
        Assert.assertFalse(tree.contains(4));
    }

}