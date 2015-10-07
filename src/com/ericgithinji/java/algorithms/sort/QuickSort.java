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
public class QuickSort {
    private QuickSort() {};
    
//    AcceptArray, Partition, Conquer, Return Sorted Array
    public static void sort(int array[]) {
       quickSort(array, 0, array.length - 1);
    }
    private static void quickSort(int array[], int leftIndex, int rightIndex) {
        int index = partition(array, leftIndex, rightIndex);
        if(leftIndex < index - 1) quickSort(array, leftIndex, index - 1);
        if(rightIndex > index - 1) quickSort(array, index, rightIndex);
    }
//    Partition
    private static int partition(int array[], int leftIndex, int rightIndex){ 
        int temp;
        int pivot = array[(leftIndex + rightIndex)/2];
        
        while(leftIndex <= rightIndex) {
            while (array[leftIndex] < pivot) leftIndex++;
            while (array[rightIndex] > pivot) rightIndex--;
            if(leftIndex <= rightIndex) {
                swap(array, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
//    Swap function
    public static void swap(int[] array, int i, int j) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        }
}
