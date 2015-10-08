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
public class MySinglyLinkedList<E> {
    Node<E> head;
    Node<E> tail;
    int size;
    private class Node<E> {
        public Node<E> prev;
        public Node<E> next;
        E element;
        public Node() {
        
        }
    } 
    public MySinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
//    add(int position, E element) -> Inserts element at position.
    public void add(E element) {
        add(size, element);
    }
    private void add(int position, E element) {
        if(head == null) {
            head = new Node<>();
            head.element = element;
            tail = head;
            size++;
        } else {
            Node temp = new Node<>();
            temp.element = element;
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
            size++;
        }
    }
    
//    insertBefore(E elem1, E elem2) -> Insert elem2 before elem1.
    
//    insertAfter(E elem1, E elem2) -> Insert elem2 after elem1.
//    size() -> Returns the total number of nodes in the list.
    public int size() {
    return size;
    }
//    contains(E element) -> Returns true if element is in the list, false otherwise.
    public boolean contains(E element) {
        while(tail != null) {
            tail = tail.next;
            return tail.element == element;
        }
        return false;
    }
//    head() -> Returns the first node in the list.
    public Node head() {
        return head;
    }
//    tail() -> Returns the last node in the list. (We're actually messing around with what tail really should return.)
    public Node tail(Node tail) {
        while(tail != null) return (tail.next);
        return tail;
    }
 //    remove(E element) -> Removes element from the list.
//    isEmpty() -> Returns true if the list has no elements, false otherwise.
    public boolean isEmpty() {
       return head == null;
    }
//    reverse() -> Reverses the array.
    public void reverse() {
        
    }
//    toString() -> Returns a nice String representation of the nodes in the list.
    public String toString() {
        String str = "";
        while(tail.next != null) {
            str += tail.element + " ,";
        }
        return str;
    }
}
