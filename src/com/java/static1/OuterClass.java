/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.static1;

/**
 *
 * @author hp
 */
public class  OuterClass {

    private static String msg = "outerclass msg";

    // Static nested class
    public static class NestedStaticClass {
        
        String msg = "inner class msg";

        // Only static members of Outer class
        // is directly accessible in nested
        // static class
        public void printMessage() {
            // Try making 'message' a non-static variable, there will be compiler error
            System.out.println("Message from nested static class: "+ msg);
        }
    }

    // Non-static nested class -
    // also called Inner class
    public class InnerClass {

        // Both static and non-static members
        // of Outer class are accessible in
        // this Inner class
        public void display() {
            System.out.println("Message from non-static nested class: " + msg);
        }
    }
}
