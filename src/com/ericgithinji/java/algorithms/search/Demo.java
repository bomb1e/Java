/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericgithinji.java.algorithms.search;

import com.ericgithinji.java.algorithms.sort.BubbleSort;

/**
 *
 * @author eric
 */
public class Demo {
    private static final int ONE_MILLION = 1_000_000;
    public static void main(String[] args){
        // Use Sort Algorithms
        int[] tempArray = {8,6,1,2,7,3,5,4,9};
        BubbleSort.sort(tempArray,false);
        System.out.print("{");
        for(int i = 0; i < tempArray.length; i++){
            System.out.print(tempArray[i] + ",");
        }
        System.out.println("}");
        
        // Use Search Algorithms
        int[] integerArray = new int[1000000]; 
        Object[] demoArray = {1,2,34,5,63,3,"Erico","Whagwan"};
        for(int i = 0; i < ONE_MILLION; i++) {
            integerArray[i] = i + 1;
        }
//        The next two functions will take a long time
//        Use them only if you know what you're doing
//        System.out.print("Linear times is ");
//        
//        for(int n = 1; n < integerArray.length; n++){
//            System.out.println(n);
//        }
        
        
//        System.out.print("Binary times is ");
//        
//        for(int i = 1; i < integerArray.length; i++){
//            System.out.println(Math.log(i)/Math.log(2));
//        }
        
        System.out.println("Linear Position is: " + LinearSearch.search(demoArray,"Eric"));
        System.out.println("Binary Position is: " + BinarySearch.search(integerArray,1000000)); 
        System.out.println("Linear Position is: " + LinearSearch.search(integerArray,1000000)); 
        System.out.println("Binary Recursive Position is: " + BinarySearch.recSearch(integerArray,1000000));       
    }
}
