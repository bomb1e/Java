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
public class LinearSearch {
    private static final int ELEMENT_NOT_FOUND = -1;
//    Integer returned is the index of element in array
    private LinearSearch(){
    
    }
    public static int search(int[] array, int element){
        int tries = 0;
        for(int i = 0; i<array.length; i++){
            if (array[i]==(element)){
                return i;
            }
            tries++;
        }
         System.out.println("No. of tries: " + tries);
        return ELEMENT_NOT_FOUND;
    }
    public static int search(Object[] array, Object e){
        for(int index = 0; index<array.length; index++){
            if(array[index].equals(e)){
                return index;
            }
        }
        return ELEMENT_NOT_FOUND;
    }
}
