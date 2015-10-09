/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericgithinji.java.datastructures;



/**
 *
 * @author eric
 */

/* Making a class to sort my array issues out.
It should be able to add, remove elements, tell
me whether an element is contained, tell me 
it's index and get it for me.
*/
public class BetterArray {
    
    private static final int NO_ELEMENT_FOUND = -1;
    private final int DEFAULT_SIZE = 10;
    private int array[];
    private int size;
    
    public BetterArray() {
        array = new int[DEFAULT_SIZE];
        size = DEFAULT_SIZE;
    }
        
    public void insert(int index, int element) {
        
        if(index < 0) {
            System.out.println("Please use positive index");
            return;
        }
            
        if(index < size) {
            add(0);
            for(int i = array.length - 1; i > index; i--) {
                array[i] = array[i-1];
            }
            array[index] = element;
//            size++;
            return;
        }
        if(index == size) {
            add(element);
            return;
        }      
        
        if(index > size) {
            for(int i = 0; i <= index; i++) {
                add(0);
                if(size - 1 == index) { 
                    array[index] = element;
                    return;
                }
            }
        }
    }
    
    public void shift(int element) {
        insert(0,element);
    }
    
    public void append(int element) {
        insert(array.length - 1, element);
    }
    
    public boolean contains(int element) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == element) return true;
        }
        return false;
    }
    
    public int index(int element) {
       for(int i = 0; i < array.length; i++) {
            if(array[i] == element) return i;
        }
        return NO_ELEMENT_FOUND;
    }
    
    public int get(int index) {
        return array[index];
    }
    
    public int size() {
        int size = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > 0) size++;
        }
        return size;
    }
    
    public void print() {
        System.out.print("{");
        for( int element : array ) {
            System.out.printf("%s " , element);
        }
        
        System.out.println("} -> " + size());
    }
    
    public boolean isEmpty() {
        if (size() > 0) return true;
        return false;
    }
    
    public void add(int element) {
        if(size == array.length) {
            int[] newArray = new int[size + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            this.array = newArray;
        }
        this.array[size++] = element; 
    }   
    public void remove(int index) {
        if(index < 0 || index > size - 1) {
            System.out.println("Index not found!");
            return;         
        }
        int[] newArray = new int[size - 1];
        System.arraycopy(array, 0, newArray, 0, index - 1);
        System.arraycopy(array, index + 1, newArray, index, size - index - 1);
        array = newArray;
    }
    
//    public void remove(int element) {
//        
//    }
}
