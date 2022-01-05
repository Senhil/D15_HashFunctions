package com.Binarysearchtree;

public class Binarytree<K extends Comparable<K>> {
    private Binarynode<K> root;

    public void add(K key){
        this.root = this.addRecursively(root,key);
    }

    private Binarynode<K> addRecursively(Binarynode<K> current, K key) {
        if(current == null)
            return new Binarynode<>(key);
        int compareResult = key.compareTo(current.key);
        if(compareResult == 0)
            return current;
        if (compareResult < 0){
            current.left = addRecursively(current.left, key);

        }else{
            current.right = addRecursively(current.right, key);
        }
        return current;
    }
    public int getSize(){
        return this.getSizeRecursively(root);
    }
    public void searchBST(K value) {
        int counter = 0;
        Binarynode<K> temp=root;
        if(temp != null) {
            while(temp.key.compareTo(value) < 0) {
                System.out.println(temp.key);
                temp = temp.right;
            }
            if(root.key == value)
                counter++;
            while(temp.key.compareTo(value) > 0) {
                temp = temp.left;
            }
            if(temp.key == value) {
                counter++;
            }
            if(counter > 0) {
                System.out.println(true);
                System.out.println("Element is present");
            }
            else {
                System.out.println(false);
                System.out.println("Element is not present");
            }
        }

    }

    private int getSizeRecursively(Binarynode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursively(current.left) + this.getSizeRecursively(current.right);
    }
    public void print() {
        printRec(root);
    }
    void printRec(Binarynode root) {
        if(root != null) {
            printRec(root.left);
            System.out.println(root.key);
            printRec(root.right);
        }
    }
    @Override
    public String toString() {
        return "Binarytree [root=" + root + ", getSize()=" + getSize() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }



}
