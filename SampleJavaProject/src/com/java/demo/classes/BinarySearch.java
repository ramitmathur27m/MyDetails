package com.demo.java.classes;

public class BinarySearch {

    public static void main(String args[]){
        System.out.println("you are in main method!!!!!");
        BinarySearch bs= new BinarySearch();
        BinaryTree bt= bs.searchInTree();
        bs.inorder(bt.root);
        System.out.println("Contains element or not--> "+bs.containsNode(bt, 1));
    }

    public BinaryTree searchInTree(){
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }

    void inorder(Node root)  {
        inorderRec(root);
    }
    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.value);
            inorderRec(root.right);
        }
    }
    //method to check whether tree has element or not!
    public boolean containsNodeRecursive(Node currentNode, int value){
        if(currentNode==null){
            return false;
        }
        if(value==currentNode.value){
            return true;
        }
        return value < currentNode.value
                ?containsNodeRecursive(currentNode.left, value)
                :containsNodeRecursive(currentNode.right, value);
    }

    public boolean containsNode( BinaryTree bt, int value) {
        return containsNodeRecursive(bt.root, value);
    }
    //End

}
