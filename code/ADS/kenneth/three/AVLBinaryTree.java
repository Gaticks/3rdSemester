package ADS.kenneth.three;

import java.util.NoSuchElementException;

public class AVLBinaryTree <T extends Comparable<T>> implements IBinarySearchTree<T>{

    private BinaryNodeWithParent<T> root;
    private int size;

    public AVLBinaryTree(BinaryNodeWithParent<T> root) {
        this.root = root;
        this.size = 1;
    }

    public AVLBinaryTree() {
        this.size = 0;
        this.root = null;
    }

    @Override
    public void add(T element) {
        if (root == null) {

            this.root = new BinaryNodeWithParent<T>(element, null, null, null);
        } else {
            BinaryNodeWithParent<T> current = root;
            while (true) {
                if (current.getElement().compareTo(element) <= 0) {
                    //go right
                    if (current.getRight() == null) {
                        current.setRight(new BinaryNodeWithParent(element, current, null, null));
                        return;
                    } else {
                        current = current.getRight();
                    }
                } else {
                    // search left
                    if (current.getLeft() == null) {
                        current.setLeft(new BinaryNodeWithParent(element, current, null, null));
                        return;
                    } else {
                        current = current.getLeft();
                    }
                }
            }
        }

    }

    @Override
    public boolean contains(T element) {
        if (root != null) {
            BinaryNodeWithParent<T> current = root;
            while (true) {
                int compareResult = current.getElement().compareTo(element);
                if (compareResult == 0) {
                    return true;
                } else if (compareResult < 0) {
                    //go right
                    current = current.getRight();
                    if (current == null)
                        break;
                } else {
                    //go left
                    current = current.getLeft();
                    if (current == null)
                        break;
                }
            }
        }

        return false;
    }

    @Override
    public T getMin() {
        BinaryNodeWithParent<T> current = root;
        if (current == null)
            return null;
        while (current.getLeft() != null) {
            current = current.getLeft();
        }
        return current.getElement();
    }

    @Override
    public T getMax() {
        BinaryNodeWithParent<T> current = root;
        if (current == null)
            return null;
        while (current.getRight() != null) {
            current = current.getRight();
        }
        return current.getElement();
    }

    @Override
    public void remove(T element) throws NoSuchElementException{
        System.out.println("AVLBinaryTree trying to delete element: " + element);

        BinaryNodeWithParent<T> nodeToDelete = root;
        if (nodeToDelete == null) {
            throw new NoSuchElementException("the tree is empty");
        }
        while (true) {
            int compareResult = nodeToDelete.getElement().compareTo(element);
            if (compareResult == 0) {
                break;
            } else if (compareResult < 0) {
                //go right
                nodeToDelete = nodeToDelete.getRight();
            } else {
                //go left
                nodeToDelete = nodeToDelete.getLeft();
            }
            if (nodeToDelete == null) {
                throw new NoSuchElementException("The element was not found in the tree");
            }
        }

        //case 1, node is a leaf'
        if (nodeToDelete.getLeft() == null && nodeToDelete.getRight() == null) {
            if (nodeToDelete.getElement().compareTo(root.getElement()) == 0) {
                root = null;
                return;
            }
            System.out.println("this is a case 1: the element is a leaf");

            if (nodeToDelete.getParent().getElement().compareTo(element) < 0) {
                //remove right reference
                System.out.println("Setting right to null, the parent is: " + nodeToDelete.getParent().getElement());
                nodeToDelete.getParent().setRight(null);
            } else {
                System.out.println("Setting left to null");
                nodeToDelete.getParent().setLeft(null);
            }

            return;
        }
        
        //case 3
        if (nodeToDelete.getLeft() != null && nodeToDelete.getRight() != null) {
            System.out.println("this is a case three, the node to be deleted have two children");
            // find first inorder element
            BinaryNodeWithParent<T> replacerNode = nodeToDelete;
            replacerNode = replacerNode.getRight();
            System.out.println("right child of to be deleted node: " + replacerNode.getElement());
            if (replacerNode.getLeft() == null) {
                //special case
                nodeToDelete.setElement(replacerNode.getElement());
                nodeToDelete.setRight(replacerNode.getRight());
                replacerNode.getRight().setParent(nodeToDelete);

                return;
            }
            while (replacerNode.getLeft() != null) {
                replacerNode = replacerNode.getLeft();
            }
            System.out.println("The element that will replace is: " + replacerNode.getElement());

            //step 1, set element of nodeToDelete
            nodeToDelete.setElement(replacerNode.getElement());
            //step2, set replacernode parent left chil to replacernode rightChild
            replacerNode.getParent().setLeft(replacerNode.getRight());
            return;
        }

        //case 2
        if (nodeToDelete.getLeft() != null || nodeToDelete.getRight() != null) {

            System.out.println("this is a case 2: (only one child of the node that will be deleted)");
            //case node is the root


            if (nodeToDelete.getLeft() != null) {
                System.out.println("case2: node to delete: " + nodeToDelete.getElement() + ", root: " + root.getElement());
                if (nodeToDelete.getElement().compareTo(root.getElement()) == 0) {
                    root = nodeToDelete.getLeft();
                    return;
                }

                if (nodeToDelete.getParent().getElement().compareTo(element) < 0) {
                    //element is right child
                    nodeToDelete.getParent().setRight(nodeToDelete.getLeft());
                } else {
                    nodeToDelete.getParent().setLeft(nodeToDelete.getLeft());
                }
            } else {
                if (nodeToDelete.getElement().compareTo(root.getElement()) == 0) {
                    root = nodeToDelete.getRight();
                    return;
                }
                if (nodeToDelete.getParent().getElement().compareTo(element) > 0) {
                    //element is in left child
                    nodeToDelete.getParent().setLeft(nodeToDelete.getRight());
                } else {
                    nodeToDelete.getParent().setRight(nodeToDelete.getRight());
                }
            }
        }
    }

}
