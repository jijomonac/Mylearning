
package com.java.static1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class SafeVar {
     
    private void display(List<String>... products) {  
        for (List<String> product : products) {  
            System.out.println(product);  
        }  
    }  
    public static void main(String[] args) {  
        SafeVar v = new SafeVar();  
        List<String> list = new ArrayList<String>();  
        list.add("Laptop");  
        list.add("Tablet");  
        v.display(list);  
    }   
}
