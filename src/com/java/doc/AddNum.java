/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.doc;

import java.io.*;

/**
* 
* The AddNum program implements an application that
* simply adds two given integer numbers and Prints
* the output on the screen.
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author  Zara Ali
* @version 1.0
* @since   2014-03-31
*/

public class AddNum {
    /**
     * This method is used to add two integers. This is a the simplest form of a
     * class method, just to show the usage of various javadoc Tags.
     * {@code
     * Set<String> s;
     * System.out.println(s);
     * }
     *
     * @param numA This is the first paramter to addNum method
     * @param numB This is the second parameter to addNum method
     * @return int This returns sum of numA and numB.
     */
   public int addNum(int numA, int numB) {
      return numA + numB;
   }

   /**
   * This is the main method which makes use of addNum method.
   * @param args Unused.
   * @exception IOException On input error.
   * @see IOException
   */

   public static void main(String args[]) throws IOException {
      AddNum obj = new AddNum();
      int sum = obj.addNum(10, 20);

      System.out.println("Sum of 10 and 20 is :" + sum);
   }
   
    /**
     * @throws java.io.IOException
     * @deprecated As of JDK 1.1, replaced by
     * {@link #setBounds(int,int,int,int)}
     */
    @Deprecated
    public static void ok() throws IOException {
        AddNum obj = new AddNum();
        int sum = obj.addNum(10, 20);

        System.out.println("Sum of 10 and 20 is :" + sum);
    }
    /**
     * 
     * @param a
     * @param b
     * @param c
     * @param d 
     */
    void setBounds(int a,int b,int c,int d){
        
    }
   
   
}
