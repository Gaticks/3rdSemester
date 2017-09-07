package ADS.kenneth.three;

public class BinaryTree <T>{
//
//    private BinaryNode<T> root;
//    private int size;
//
//    public BinaryTree() {
//        size = 0;
//    }
//
//    public BinaryTree(BinaryNode<T> root) {
//        this.root = root;
//        size = 1;
//    }
//
//    public int getHeight() {
//        int power = 0;
//        while (Math.pow(2, power) < size) {
//            power++;
//        }
//
//        return power;
//    }
//
//    public T[] levelOrderTraversal() {
//        T[] tmpArray = (T[])new Object[size];
//        Queue<BinaryNode<T>> queue = new ConcurrentLinkedQueue<>();
//        int index = 0;
//        tmpArray[index] = root.getElement();
//        queue.add(root);
//
//
//        BinaryNode<T> current = null;
//        while ((current = queue.remove()) != null) {
//            tmpArray[++index] = current.getElement();
//            queue.add(current.getLeft());
//            queue.add(current.getRight());
//
//        }
//
//        return tmpArray;
//
//    }
//
//
//
//
//
////TODO not at all done
//
//    public static void main(String[] args) {
//
//        BinaryNode<Integer> a = new BinaryNode<Integer>(new Integer(1));
//
//        BinaryNode<Integer> b = new BinaryNode<Integer>(new Integer(2));
//
//        BinaryNode<Integer> c = new BinaryNode<Integer>(new Integer(3));
//
//        BinaryNode<Integer> d = new BinaryNode<Integer>(new Integer(4));
//
//        BinaryNode<Integer> e = new BinaryNode<Integer>(new Integer(5));
//
//        BinaryNode<Integer> f = new BinaryNode<Integer>(new Integer(6));
//
//        BinaryNode<Integer> g = new BinaryNode<Integer>(new Integer(7));
//
//        BinaryNode<Integer> h = new BinaryNode<Integer>(new Integer(8));
//
//        BinaryNode<Integer> i = new BinaryNode<Integer>(new Integer(9));
//
//        a.setLeft(b);
//
//        a.setRight(c);
//
//        b.setLeft(d);
//
//        b.setRight(e);
//
//        d.setLeft(h);
//
//        d.setRight(i);
//
//        c.setLeft(f);
//
//        c.setRight(g);
//
//        BinaryTree t = new BinaryTree<Integer>(a);
//
////        t.prettyPrinter();
//
//    }
//
//



}
