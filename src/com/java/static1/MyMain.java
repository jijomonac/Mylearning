package com.java.static1;

import java.util.List;

/**
 *
 * @author hp
 */
public class MyMain {

    public static void main(String[] args) {
        
         // Create instance of nested Static class
        OuterClass.NestedStaticClass printer
            = new OuterClass.NestedStaticClass();
  
        // Call non static method of nested
        // static class
        printer.printMessage();
//        Circle c = new Circle();
//        c.draw();
//        System.out.println(" A " + System.getProperty("user.home"));
//        System.out.println(" A " + c.A);
//        System.out.println(" B " + c.B);
//        c.color();
        //String aa="ji/jo";
        //System.out.println(aa.contains("/"));
        printAll(null);
    }
    
    
    public static void printAll(List<String>... lists){
    for(List<String> list : lists){
        System.out.println(list);
    }
}

    
    
    
    
}
