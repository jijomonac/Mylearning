
package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author hp
 */
public class Arraylist {
   
    public static void main(String[] args) {
        
       List<String> a = new ArrayList<>(); 
        a.add("jijo");
        a.add("jijo1");
        
        
 
        a = a.stream().filter(x -> !x.equals("jijo")).collect(Collectors.toList());
        
        for (Iterator<String> iterator = a.iterator(); iterator.hasNext();) {
            String next = iterator.next();
            System.out.println("next "+next);
        }
        
    }
 
}
