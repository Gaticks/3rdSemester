package ADS.kenneth.three;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class BinarySearchTree <T extends Comparable<T>>{

    private BinaryNode<T> rootNode;
    private int size;

    public BinarySearchTree() {
        throw new NotImplementedException();

//        rootNode = null;
//        this.size = 0;
    }

    public BinarySearchTree(T element) {
        throw new NotImplementedException();
//        this.size = 1;
//        rootNode = new BinaryNode<T>(element);
    }

    public void add(T element) {
        BinaryNode<T> current = rootNode;

        if (current == null) {
            rootNode = new BinaryNode<T>(element);
            return;

        }
        while (true) {

            if (element.compareTo(current.getElement()) < 0) {
                if (current.getLeft() == null) {
                    current.setLeft(new BinaryNode<T>(element));
                    break;
                } else {
                    current = current.getLeft();
                }
            } else {
                if (current.getRight() == null) {
                    current.setRight(new BinaryNode<T>(element));
                    break;
                } else {
                    current = current.getRight();
                }
            }

        }
    }

    public boolean contains(T element) {

        BinaryNode<T> current = rootNode;
        while (true) {
            if (element.compareTo(current.getElement()) == 0) {
                return true;
            } else if (element.compareTo(current.getElement()) < 0 && current.getLeft() != null) {
                current = current.getLeft();
            } else if (current.getRight() != null) {
                current = current.getRight();
            } else {
                return false;
            }
        }
    }

    public T getMin() {
        BinaryNode<T> currentNode = rootNode;
        while (true) {
            if (currentNode.getLeft() == null) {
                return currentNode.getElement();
            } else {
                currentNode = currentNode.getLeft();
            }
        }
    }

    public T getMax() {
        BinaryNode<T> current = rootNode;
        while (true) {
            if (current.getRight() == null) {
                return current.getElement();
            } else {
                current = current.getRight();
            }
        }
    }

    public void remove(T element) {  //TODO fix, can't delete leaf nodes
//
//        BinaryNode<T> parentCurrent = null;
//        BinaryNode<T> current = rootNode;
//        //find the element to remove
//        while (true) {
//            if (element.compareTo(current.getElement()) == 0) {
//                break;
//            } else if (element.compareTo(current.getElement()) < 0 && current.getLeft() != null) {
//                parentCurrent = current;
//                current = current.getLeft();
//            } else if (current.getRight() != null) {
//                parentCurrent = current;
//                current = current.getRight();
//            } else {
//                throw new NoSuchElementException("the element is not in the search tree");
//            }
//        }
//
////        if current is leaf make a simple delete
//        if (current.getLeft() == null && current.getRight() == null) {
//            if (parentCurrent.getLeft() == current) {
//                parentCurrent.setLeft(null);
//            } else {
//                parentCurrent.setRight(null);
//            }
//            return;
//        }
//
//
//        //element to remove have been found and is stored in current
//        BinaryNode<T> parentOfReplaceNode = current;
//        if (parentOfReplaceNode.getRight() != null) {
//            parentOfReplaceNode = parentOfReplaceNode.getRight();
//        } else {
//
//            //if element to remove have no right child
//            if (parentCurrent.getLeft() == current) {
//                parentCurrent.setLeft(current.getLeft());
//                return;
//            } else {
//                //element have a right child
//
//
//
//
//
//            }
//            return;
//        }
//
//
//
//
//
//
//        if (parentOfReplaceNode.getRight() != null) {
//            parentOfReplaceNode = parentOfReplaceNode.getRight();
//            isActuallyAParent = true;
//        }
//        if (parentOfReplaceNode.getLeft() != null) {
//            isActuallyAParent = true;
//            while (parentOfReplaceNode.getLeft().getLeft() != null) {
//                parentOfReplaceNode = parentOfReplaceNode.getLeft();
//            }
//        }
//
//        if (isActuallyAParent) {
//            current.setElement(parentOfReplaceNode.getLeft().getElement());
//            parentOfReplaceNode.setLeft(parentOfReplaceNode.getLeft().getRight());
//        } else {
//            current.setElement(parentOfReplaceNode.getElement());
//            current.setRight(parentOfReplaceNode.getRight());
//        }

    }

}
