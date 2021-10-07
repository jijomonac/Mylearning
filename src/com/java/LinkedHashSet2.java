/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author hp
 */
public class LinkedHashSet2 {
      public static void main(String args[]) {
        LinkedHashSet<Tag> al = new LinkedHashSet<>();

        Tag ravi = new Tag("Ravi");
        Tag Vijay = new Tag("Vijay");
        Tag Ajay = new Tag("Ajay");

        al.add(ravi);
        al.add(Vijay);
        al.add(Ajay);

        ArrayList<Tag> all = new ArrayList<>();
        all.add(ravi);
        all.add(Ajay);
        all.add(Vijay);

        Ajay.setTagName("Jijo");

        Iterator<Tag> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().getTagName());
        }

        if (al.contains(Ajay)) {
            System.out.println(" YES " + Ajay.getTagName());
        }

        if (all.contains(Ajay)) {
            System.out.println(" YES all " + Ajay.getTagName());
        }
      }
}
