/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericgithinji.java.algorithms.sort;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author eric
 */
public class MergeSort {
    
    private MergeSort(){};
    
    public static int[] mergeSort(int[] array) {
        if(array.length == 1) return array;
        int newLength = array.length/2;
        int[] leftArray = new int[newLength];
        int[] rightArray = new int[newLength];
        System.arraycopy(array, 0, leftArray, 0, newLength);
        System.arraycopy(array, newLength, rightArray, 0, newLength);
        leftArray = mergeSort(leftArray);
        rightArray = mergeSort(rightArray);
        
        return merge(leftArray,rightArray);
    }
    
//    Merge
    public static int[] merge(int[] array1, int array2[]) {
           int[] mergedArray = new int[array1.length + array2.length];
           int i = mergedArray.length - 1;
           if(mergedArray.length <= 1) return mergedArray;
           if(mergedArray.length > 1) {
               if(array1[0] > array2[0]) {
                   mergedArray[i] = array2[0];
                   mergedArray = ArrayUtils.removeElement(array2, array2[0]);
                   i--;
               }
               else {
                   mergedArray[i] = array1[0];
                   mergedArray = ArrayUtils.removeElement(array1, array1[0]);
                   i--;
               }
           }
           if(array1.length > 0) {
               mergedArray[i] = array1[0];
               mergedArray = ArrayUtils.removeElement(array1, array1[0]);
               i--;
           }
           if(array2.length > 0) {
               mergedArray[i] = array2[0];
               mergedArray = ArrayUtils.removeElement(array2, array2[0]);
               i--;
           }
           return mergedArray;
    }    
}
