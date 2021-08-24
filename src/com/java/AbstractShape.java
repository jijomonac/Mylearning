package com.java;

/**
 *
 * @author hp
 */
public abstract class AbstractShape {

    static int A = 5;
    final int B = 6;
    int C = 7;

    abstract void draw();

    void color() {
        System.out.println("RED");
    }

}
