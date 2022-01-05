package com.Binarysearchtree;

public class Binarynode<K extends Comparable<K>> {
    K key;
    Binarynode<K> left;
    Binarynode<K> right;

    public Binarynode(K key){
        this.key = key;
        this.left= null;
        this.right= null;
    }
}