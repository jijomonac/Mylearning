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
    public class JavafinalizeExample1 {  
         public static void main(String[] args)   
        {   
            JavafinalizeExample1 obj = new JavafinalizeExample1();   
            System.out.println(obj.hashCode());   
            obj = null;   
            //calling garbage collector    
            //System.gc();   
            System.out.println("end of garbage collection"); 
            
            JavafinalizeExample1 j = new JavafinalizeExample1();
            
            j.finalize();
      
        }   
        @Override  
        protected void finalize()   
        {   
            System.out.println("finalize method called");   
        }   
    }  
