/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericgithinji.java.algorithms.search;

/**
 *
 * @author eric
 */
public class Demo {
    public static void main(String[] args){
        Object[] demoArray = {1,2,34,5,63,3,"Erico","Whagwan"};
        System.out.println("Position is: " + LinearSearch.search(demoArray,"Eric"));
    }
}