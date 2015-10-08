/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericgithinji.java.datastructures;

/**
 *
 * @author eric
 * @param <E>
 */
public class MyNode <E> {
    E value;
    MyNode ref;
    
    public MyNode(E value, MyNode ref) {
        this.value = value;
        this.ref = ref;                
    }

    MyNode(E value) { 
        this.value = value;
        this.ref = null;
    }
    
    MyNode() {
        this.value = null;
        this.ref = null;
    }
       
}
