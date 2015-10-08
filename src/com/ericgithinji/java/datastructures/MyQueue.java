/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericgithinji.java.datastructures;

/**
 *
 * @author eric
 * @param <E>
 */
public class MyQueue <E>{
    
    private final int DEFAULT_SIZE = 10;
    int top = DEFAULT_SIZE;
    E[] queue = (E[]) new Object[top];
//    add
    public void add(E element) {
        if(isFull()) throw new QueueException("Queue is currently full!");
        for(int i = top; i < 10; i++) {
        queue[i - 1] = queue[i];
        }
        queue[DEFAULT_SIZE - 1] = element;
        top--;
        
    }
//    peek
    public E peek() {
        return queue[top];
    }
//    pull
    public  E pull() {
        if(isEmpty()) throw new QueueException("Empty Queue!");
        E temp = (E)queue[top];
        queue[top] = null;
        top++;
        return temp;
    }
//    size
    public int size() {
        return DEFAULT_SIZE - top;
    }
//    clear
    public void clear() {
        queue = null;
    }
//    isEmpty()
    public boolean isEmpty() {
        if(top==DEFAULT_SIZE) return true;
        return false;
    }
//    isFull()
    public boolean isFull() {
        if(top == 0) return true;
        return false;
    }
//    toArray()
    
//    toString()
//    Queue Exception
    public static class QueueException extends RuntimeException {
        public QueueException(String message) {
            super(message);
        }
    }
    
    public void print() {
        System.out.print("{");
        for( Object element : queue ){
            System.out.printf("%s " , element);
        }
        System.out.println("} -> " + top + " " + size());
    }    
}
