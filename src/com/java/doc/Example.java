/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.doc;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Example {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args)
    {
        /**
        * This is the main method
        * which is very important for
        * execution for a java program.
        */
 
        int x, y;
        Scanner sc = new Scanner(System.in);
        /**
        * Declared two variables x and y.
        * And taking input from the user
        * by using Scanner class.
        *
        */
 
        x = sc.nextInt();
        y = sc.nextInt();
        /**
        * Storing the result in variable sum
        * which is of the integer type.
        */
        int sum = x + y;
 
        /**
        * Using standard output stream
        * for giving the output.
        * @return null
        */
        System.out.println("Sum is: " + sum);
    } 
}
