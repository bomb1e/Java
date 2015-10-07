/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.ericgithinji.java.algorithms.search.BinarySearch;
import com.ericgithinji.java.algorithms.search.LinearSearch;
import com.ericgithinji.java.algorithms.sort.BubbleSort;
import com.ericgithinji.java.algorithms.sort.QuickSort;
import com.ericgithinji.java.datastructures.BetterArray;
import com.ericgithinji.java.datastructures.MyStack;

/**
 *
 * @author eric
 */
public class Demo {
    private static final int ONE_MILLION = 1_000_000;
    public static void main(String[] args){
        
        // Lemme Sort You Out ;-)
        
        // BubbleSort
        int[] tempArray1 = {8,6,1,2,7,3,5,4,9};
        BubbleSort.sort(tempArray1,false);
        System.out.println("Bubble Sorted!");
        System.out.print("{");
        for(int i = 0; i < tempArray1.length; i++){
            System.out.print(tempArray1[i] + ",");
        }
        System.out.println("}");
        
        // Quickie Sort
        int[] tempArray = {8,6,1,2,7,3,5,4,2};
        QuickSort.sort(tempArray);
        System.out.println("Quickly Sorted!");
        System.out.print("{");
        for(int i = 0; i < tempArray.length; i++){
            System.out.print(tempArray[i] + ",");
        }
        System.out.println("}");
        
        // MergeSort
        int[] tempArray2 = {8,6,1,2,7,3,5,4,9};
        // MergeSort.mergeSort(tempArray2);
        System.out.println("Merge Sorted!");
        System.out.print("{");
        for(int i = 0; i < tempArray2.length; i++){
            System.out.print(tempArray2[i] + ",");
        }
        System.out.println("}");
        
        // Use Search Algorithms
        int[] integerArray = new int[1000000]; 
        Object[] demoArray = {1,2,34,5,63,3,"Erico","Whagwan"};
        for(int i = 0; i < ONE_MILLION; i++) {
            integerArray[i] = i + 1;
        }
        System.out.println("Linear Position is: " + LinearSearch.search(demoArray,"Eric"));
        System.out.println("Binary Position is: " + BinarySearch.search(integerArray,1000000)); 
        System.out.println("Linear Position is: " + LinearSearch.search(integerArray,1000000)); 
        System.out.println("Binary Recursive Position is: " + BinarySearch.recSearch(integerArray,1000000));
        
        // Dynamic Arrays!
        BetterArray array = new BetterArray();
        
        // Stacks on Stacks on Stacks!
        MyStack stack = new MyStack(10);
        
        // Queues
            // Normal Queue
            
            // Priority Queue
            
        // Linked Lists
        
        // Trees
        
        // Sets
        
        // Hash Map
        
        
        
    }
}
