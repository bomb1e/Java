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
    
    // Binary Search With Recursion
    public static int recSearch(int[] array, int e) {
        int first = 0;
        int last = array.length - 1;
        return recSearch(array, e, first, last);  
    }
    
    private static int recSearch(int[] array, int e, int first, int last) {
        int mid = (first + last) / 2;
        
        if (first<=last) {
            if(e > array[mid]) {
                first = mid + 1;
                return recSearch(array, e, first, last);
            }
            else if(e < array[mid]) {
                last = mid - 1;
                return recSearch(array, e, first, last);
            }
            else return mid;
        }
        else return ELEMENT_NOT_FOUND;
    }
    
    // Binary Search Without Recursion
    public static int search(int[] array, int e){
        int first = 0;
        int last = array.length - 1;
        int mid = (first + last) / 2;
        int tries = 0;
        System.out.print("No. of tries: ");
        while(first <= last) {
            
            tries++;
            if(e > array[mid]){
            first = mid + 1;
            }
            else if(e < array[mid]){
                last = mid - 1;
            }
            else {System.out.println(tries); return mid;} 
            mid = (first + last) / 2; 
        }
        System.out.println(tries);
       
        return ELEMENT_NOT_FOUND;
    }
}

