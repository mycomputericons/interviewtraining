package tibi.interviewtraining;

import lombok.Data;

/**
 * Created by mycomputericons on 7/3/2018.
 */
@Data
public class BinarySearchTree<T extends Comparable, U> {

    private BinaryTreeNode rootNode;

    public void insert(T key, U value) {
        if (rootNode == null) {
            rootNode = new BinaryTreeNode(key, value);
            return;
        }
        insertInto(key, value, rootNode);
    }

    private void insertInto(T key, U value, BinaryTreeNode currentNode) {
        int compareResult = currentNode.getKey().compareTo(key);
        if (compareResult == 0) {
            throw new IllegalArgumentException("Key " + key + " already exists!");
        }
        else if (compareResult < 0) {
            if (currentNode.getRight() == null) {
                currentNode.setRight(new BinaryTreeNode(key, value));
                return;
            }
            insertInto(key, value, currentNode.getRight());
        } else if (compareResult > 0) {
            if (currentNode.getLeft() == null) {
                currentNode.setLeft(new BinaryTreeNode(key, value));
                return;
            }
            insertInto(key, value, currentNode.getLeft());
        }
    }
}
