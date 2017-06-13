package Algorithms.BST;

public class BinarySearchTree{

    private Node rootNode = null;

    public BinarySearchTree(){}

    public void insert(int data){
        if (this.rootNode == null)
            this.rootNode = new Node(data);
        else
            this.rootNode.insert(data);
    }

    public void remove(int dataToRemove){
        Node tmpNode;
        if (rootNode != null){
            if (rootNode.data == dataToRemove) {
                tmpNode = new Node(0);
                tmpNode.leftChild = rootNode;
                rootNode.remove(dataToRemove, tmpNode);
            } else{
                rootNode.remove(dataToRemove, null);
            }

        }
    }

    public int getMax(){
        int result = 0;
        if (rootNode != null)
            result = rootNode.getMax();
        return result;
    }

    public int getMin(){
        int result = 0;
        if(rootNode != null)
            result = rootNode.getMin();
        return result;
    }

    public void traverseInOrder(){
        if (rootNode != null)
            rootNode.traverseInOrder();
    }
}
