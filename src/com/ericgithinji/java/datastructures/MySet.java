/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericgithinji.java.datastructures;

/**
 *
 * @author eric
 * @param <T>
 */

public class MySet<T> {
      private T arrayElement[];
      int size = 0;
      public MySet() {
            this.arrayElement = null;
      }
      public MySet(T[] element) {
            arrayElement = element;
            size = arrayElement.length;
      }
      public void addElement(T element) {
            if(!contains(element)) {
            if(size == arrayElement.length) {
                  incrementArray();
            }
            arrayElement[size++] = element;
            }
      }
      public boolean contains(T element) {
            if (element == null) {
                for (int i = 0; i < size; i++) return arrayElement[i] == null;                    
            } else {
                for (int i = 0; i < size; i++) return element == arrayElement[i];
            }
            return false;
      }
      public int size() {
            if(arrayElement != null) return arrayElement.length; 
            return 0;
      }
      public void clear() {
            arrayElement = null;
      }
      @Override
      public String toString() {
            if(arrayElement == null || arrayElement.length == 0 ) {
                  return "[EMPTY]";
            } else {
                String toStr="[";
                for (T arrayElement1 : arrayElement) {
                    toStr += arrayElement1 + ",";
                }
                toStr+="]";
                return toStr;
            }
      }
      public boolean isEmpty() {
            return arrayElement == null || arrayElement.length ==0;
      }
      private void incrementArray(){
            T[] temparray = arrayElement;
            int tempsize=size + 5;
            arrayElement = (T[]) new Object[tempsize];
            System.arraycopy(temparray, 0, arrayElement, 0, size);
      }
}