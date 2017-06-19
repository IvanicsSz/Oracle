package Algorithms.BST;


public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(12);
        bst.insert(10);
        bst.insert(20);
        bst.insert(2);
        bst.insert(5);
        bst.traverseInOrder();

        bst.remove(5);
        bst.traverseInOrder();
    }
}
