/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javadsa;
import java.util.*;

/**
 *
 * @author KIIT
 */
public class MyArrayList {
    public static void main(String args[]){
        Random rn = new Random();
        int lowerbound = 10; 
        int upperbound = 50;
        ArrayList<Integer> l1  = new ArrayList<>();
        ArrayList<Integer> l2  = new ArrayList<>();
        for(int i = 0 ; i < 5 ; i++){
            int randomNumber = lowerbound + rn.nextInt(lowerbound + upperbound);
            l1.add(randomNumber);
            int randomNumber1 = lowerbound + rn.nextInt(lowerbound + upperbound);
            l2.add(randomNumber1);
        }
         System.out.println("Array List 1");
          for(int i = 0 ; i < 5 ; i++){
           System.out.println(l1.get(i));
            
        }
          System.out.println("Array List 2");
          for(int i = 0 ; i < 5 ; i++){
           System.out.println(l2.get(i));
            
        }
        
    }
}
