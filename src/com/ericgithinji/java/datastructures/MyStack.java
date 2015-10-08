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
public class MyStack <E> {
    private final int DEFAULT_TOP = -1;
    private final int DEFAULT_SIZE = 10;
    int top = DEFAULT_TOP;
    int size = DEFAULT_SIZE;
    
    Object[] stack = new Object[size];

    public MyStack(int size) {}
    
    public void push(E element) {
        if(isFull()) throw new StackException("Stack Overflow!"); 
        top++;
        stack[top] = element;
    }
    
    public E pop() {
        if(isEmpty()) throw new StackException("Empty Stack!"); 
        Object element = stack[top];
        stack[top] = null;
        top--;
        return (E) element;
    }
    
    public boolean isEmpty() {
        return top  == DEFAULT_TOP;  
    }
    
    public boolean isFull() {
        return top == DEFAULT_SIZE - 1;
    }
    
    public E peek() {
        if (isEmpty()) throw new StackException("Empty Stack");
        return (E)stack[top];
    }
    
    public void destroy() {
        stack = null;
    }
    
    public static class StackException extends RuntimeException { 
        public StackException(String message) {  
            super(message);        
        }      
    }
    
    public void print() {
        System.out.print("{");
        for( Object element : stack ){
            System.out.printf("%s " , element);
        }
        System.out.println("} -> " + top);
    }
}
