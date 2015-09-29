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
public class BinarySearch {
    private BinarySearch() {}
    
    private static final int ELEMENT_NOT_FOUND = -1;
    
    public static int search(int[] array, int e){
        int first = 0;
        int last = array.length - 1;
        int mid = (first + last) / 2;
        int tries = 0;
        while(first <= last) {
            if(e > array[mid]){
            first = mid + 1;
            }
            else if(e < array[mid]){
                last = mid - 1;
            }
            else {return mid;} 
            mid = (first + last) / 2;
            tries++;
        }
        System.out.println("No. of tries: " + tries);
        return -1;
    }
}

