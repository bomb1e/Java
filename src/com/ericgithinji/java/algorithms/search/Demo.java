/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericgithinji.java.algorithms.search;

/**
 *
 * @author eric
 */
public class Demo {
    public static void main(String[] args){
        int[] integerArray = {1,2,3,4,5,6,7,8,9,10};
        
//        Object[] demoArray = {1,2,34,5,63,3,"Erico","Whagwan"};
//        System.out.println("Linear Position is: " + LinearSearch.search(demoArray,"Eric"));
        System.out.println("Binary Position is: " + BinarySearch.search(integerArray,7)); 
        System.out.println("Linear Position is: " + LinearSearch.search(integerArray,7)); 
    }
}