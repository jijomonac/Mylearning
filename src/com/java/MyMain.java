package com.java;

/**
 *
 * @author hp
 */
public class MyMain {

    public static void main(String[] args) {
        
       
        Circle c = new Circle();
        c.draw();
        System.out.println(" A " + System.getProperty("user.home"));
        System.out.println(" A " + c.A);
        System.out.println(" B " + c.B);
        c.color();
        //String aa="ji/jo";
        //System.out.println(aa.contains("/"));
    }
}
