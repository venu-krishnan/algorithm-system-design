package com.algorithm;

public class BinaryTree {

    public static void main1(String[] args) {

        System.out.println("binary tree");

        BinaryTree tree = new BinaryTree();
        tree.buildTree();
        //     10
        //  5    6
        //3  4 7   9

        //(10,5)(10,6)

    }

    public void buildTree() {

        Node root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(6);
        root.right.left = new Node(7);
        root.right.right = new Node(9);

        printNode(root);

    }

    //     10
    //  5    6
    //3  4 7   9

    private void printNode(Node node) {
        if(node == null) {
            return;
        }
        System.out.print(node.value);
        printNode(node.left);
        printNode(node.right);
        System.out.println();
    }



     private class Node {
        private int value;
        private Node left;
        private Node right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public int getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

}
