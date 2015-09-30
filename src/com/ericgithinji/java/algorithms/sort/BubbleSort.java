/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericgithinji.java.algorithms.sort;

/**
 *
 * @author eric
 */
public class BubbleSort {
    
    
    public static int[] sort(int[] array, boolean direction) {
        
       for(int i = 0; i < array.length; i++){
           int least = array[i];
           int pos = i;
           int temp;
           if(direction){
                for(int j = i; j < array.length; j++){
                  if (array[i] > array[j]){ 
                      temp = array[j];
                      array[j] = array[i];
                      array[i] = temp;
                  }
                }  
           }
          else if(!direction){
              for(int j = i; j < array.length; j++) {
                if (least < array[j]){ 
                    least = array[j];
                    pos = j;
                }
              }
              temp = array[i];
              array[i] = least;
              array[pos] = temp;
          }
        }
        return array;
    }
    
}
