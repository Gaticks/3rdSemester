package ADS.kenneth.three;

public class BinaryNodeWithParent <T extends Comparable<T>>{

    private T element;
    private BinaryNodeWithParent parent;
    private BinaryNodeWithParent left;
    private BinaryNodeWithParent right;

    public BinaryNodeWithParent(T element, BinaryNodeWithParent parent, BinaryNodeWithParent left, BinaryNodeWithParent right) {
        this.element = element;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public BinaryNodeWithParent<T> getParent() {
        return parent;
    }

    public void setParent(BinaryNodeWithParent parent) {
        this.parent = parent;
    }

    public BinaryNodeWithParent<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryNodeWithParent left) {
        this.left = left;
        this.left.setParent(this);
    }

    public BinaryNodeWithParent<T> getRight() {
        return right;
    }

    public void setRight(BinaryNodeWithParent right) {
        this.right = right;
        this.right.setParent(this);
    }
}
