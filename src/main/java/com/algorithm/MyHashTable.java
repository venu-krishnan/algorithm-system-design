package com.algorithm;

import java.util.ArrayList;

public class MyHashTable<K, V> {

    private ArrayList<MyHashNode> bucketArray;
    private int size;
    private int bucketSize;
    private static final float loadFactor = 0.7f; //70%, then it resizes
    private double threshold;

    public MyHashTable() {
        size = 0;
        bucketSize = 5;
        threshold = 0;
        bucketArray = new ArrayList<>();
        //initialize
        for(int i = 0; i < bucketSize; i++) {
            bucketArray.add(null);
        }
    }

    public void put(K key, V value) {

        if(key == null) {
            throw new RuntimeException("Key cannot be null");
        }
        addToTable(key, value);
        resizeArrayIfRequired();
    }

    private void addToTable(K key, V value) {
        //find compress
        int index = key.hashCode() % bucketSize;
        MyHashNode node = bucketArray.get(index);
        if(node == null) {
            bucketArray.set(index, new MyHashNode(key, value));
            ++size;
        } else {
            if(node.getKey().equals(key)) { //if same key, overwrite value
                node.setValue(value);
            } else { //if different key, insert in linked list
                bucketArray.set(index, new MyHashNode(key, value, node));
                ++size;
            }
        }
        threshold = ((1.0 * size) / bucketSize);
    }

    private void resizeArrayIfRequired() {
        if(threshold >= loadFactor) {
            ArrayList<MyHashNode> tempBucket = bucketArray;
            bucketArray = new ArrayList<>();
            int tempSize = bucketSize;
            bucketSize = bucketSize * 2;
            for (int i = 0; i < bucketSize; i++) { //initialize
                bucketArray.add(null);
            }
            size = 0; //reset to 0
            for (int i = 0; i < tempSize; i++) { //reindex
                MyHashNode tempNode = tempBucket.get(i);
                while (tempNode != null && tempNode.getKey() != null) { //iterate linked list
                    addToTable((K) tempNode.getKey(), (V) tempNode.getValue());
                    tempNode = tempNode.getNext();
                }
            }
            threshold = ((1.0 * size) / bucketSize);
        }
    }

    public V get(Object key) {
        int index  = key.hashCode() % bucketSize;
        MyHashNode node = bucketArray.get(index);
        if(node == null) {
            return null;
        }
        while(node != null) {
            if(node.getKey().equals(key)) {
                return (V) node.getValue();
            } else {
                node = node.getNext();
            }
        }
        return null;
    }

    public V remove(Object key) {
        int index = key.hashCode() % bucketSize;
        MyHashNode node = bucketArray.get(index);
        if(node == null) {
            return null;
        }
        MyHashNode previous = null;
        while(node != null) {
            if(node.getKey().equals(key)) { //if key found
                if(previous == null) { //index node
                    bucketArray.set(index, node.getNext());
                } else { // chained nodes
                    if(node.getNext() != null) { //if middle node, link next to previous node
                        previous.putNext(node.getNext());
                    } else { //if last node, then mark previous node's next as null
                        previous.putNext(null);
                    }
                }
                --size;
                return (V) node.getValue();
            } else { //not found
                previous = node;
                node = node.getNext();
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }

    //this is to debug
    private void printBucket(String message) {
        for(int i = 0; i < bucketSize; i++) {
            System.out.println(message+"    >>"+ i + " " +bucketArray.get(i));
        }
    }


}

class MyHashNode<K, V> {

    private K key;
    private V value;
    private MyHashNode next;

    public MyHashNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
    public MyHashNode(K key, V value, MyHashNode next) {
        this(key, value);
        this.next = next;
    }

    public MyHashNode getNext() {
        return next;
    }

    public void putNext(MyHashNode next) {
        this.next = next;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    @Override
    public String toString() {
        return " Node{key:"+ key + " value:" + value + " next:" + next+"} ";
    }
}