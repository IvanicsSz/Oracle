package Algorithms.BST;

public class Node{

    public int data;
    public Node leftChild;
    public Node rightChild;

    public Node(int data){
        this.data = data;
    }

    public void insert(int data){
        if (data < this.data){
            if (this.leftChild == null)
                this.leftChild = new Node(data);
            else
                this.leftChild.insert(data);
        } else {
            if (this.rightChild == null)
                this.rightChild = new Node(data);
            else
                this.rightChild.insert(data);
        }
    }

    public void remove(int data, Node parentNode){
        Node tmpNode;
        if (data < this.data){
            if (this.leftChild != null){
                this.leftChild.remove(data, this);
                System.out.println("remove from leftChild");
            }
        }
        else if (data > this.data){
            if (this.rightChild != null){
                this.rightChild.remove(data, this);
                System.out.println("remove from rightChild");
            }
        }
        else{
            if (this. leftChild != null && this.rightChild != null){
                this.data = this.rightChild.getMin();
                System.out.println("rightChils minimum: " + this.data);
                this.rightChild.remove(this.data, this);
            }
            else if (parentNode.leftChild == this){
                if (this.leftChild != null){
                    tmpNode = this.leftChild;
                    System.out.println("parent leftchild is: " + tmpNode);
                } else{
                    tmpNode = this.rightChild;
                    System.out.println("parent rightChild is: " + tmpNode);
                }
                parentNode.leftChild = tmpNode;
                System.out.println("Remove parentnode left is: " + parentNode);
            }
            else if (parentNode.rightChild == this){
                if (this.leftChild != null){
                    tmpNode = this.leftChild;
                    System.out.println("parent leftchild is: " + tmpNode);
                } else{
                    tmpNode = this.rightChild;
                    System.out.println("parent rightChild is: " + tmpNode);
                }
                parentNode.rightChild = tmpNode;
                System.out.println("Remove parentnode right is: " + parentNode);
            }
        }
    }

    public int getMax(){
        int result = -1;
        if(this.rightChild == null)
            result = this.data;
        else
            this.rightChild.getMax();
        return result;
    }

    public int getMin(){
        int result = -1;
        if (this.leftChild == null)
            result = this.data;
        else
            this.leftChild.getMin();
        return result;
    }

    public void traverseInOrder(){
        if (this.leftChild != null)
            this.leftChild.traverseInOrder();

        System.out.println(this.data);

        if (this.rightChild != null)
            this.rightChild.traverseInOrder();
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
