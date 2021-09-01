package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author hp
 */
public class MyMain {

    public static void main(String[] args) {
        
       
        int a[] = {1,2};
        int k =0;
        a[++k]=5;

        for (int i = 0; i < a.length; i++) {
            int j = a[i];
            System.out.println(""+j);
        }
      
        MyMain my = new MyMain();
        
        
        Circle c = new Circle();
        c.draw();
        System.out.println(" A " + System.getProperty("user.home"));
        System.out.println(" A " + c.A);
        System.out.println(" B " + c.B);
        c.color();
        //String aa="ji/jo";
        //System.out.println(aa.contains("/"));
    }
    
    public static void netTest(int a, String b){
     
        
    }
    
   
}
