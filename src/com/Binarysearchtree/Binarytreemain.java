package com.Binarysearchtree;

public class Binarytreemain {

    public static void main(String[] args) {

        Binarytree<Integer> myBinaryTree = new Binarytree<>();
        Binarytreemain.add(56);
        Binarytreemain.add(30);
        Binarytreemain.add(70);

        myBinaryTree.searchBST(30);
        int size = Binarytree.getSize();
        System.out.println("Size of binary tree is: "+size);
        System.out.println("Binary Tree is :");
        myBinaryTree.print();
    }

    private static void add(int i) {
    }
}
