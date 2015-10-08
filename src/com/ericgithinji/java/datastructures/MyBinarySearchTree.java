/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericgithinji.java.datastructures;

/**
 *
 * @author eric
 */
public class MyBinarySearchTree {
    
    public class MyBSTNode extends MyBinarySearchTree{
        int value;
        MyBSTNode left;
        MyBSTNode right;
        
        public MyBSTNode() {
            this.value = 0;
        }

        public MyBSTNode(int value) {
            this.value = value;
        }

        public MyBSTNode(int value, MyBSTNode left, MyBSTNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
    
    
    public void add(int value) {
        MyBSTNode node = new MyBSTNode();
        MyBSTNode left = node.left;
        MyBSTNode right = node.right;
        if(node.value == 0) {
            node.value = value;
            return;
        }
        if(node.value == value) return;
        if(value > node.value) {
            if(node.value == 0) {
                node.right = new MyBSTNode(value);
            } else right.add(value);         
        }
        if(value < node.value) {
            if(node.value == 0) {
                node.left = new MyBSTNode(value);
            } else left.add(value);
        } 
    }   
}
