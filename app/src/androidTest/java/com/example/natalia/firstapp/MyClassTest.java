package com.example.natalia.firstapp;

import junit.framework.TestCase;

/**
 * Created by natalia on 8/16/2016.
 */
public class MyClassTest extends TestCase {
    MyClass uMyClass;

    public void setUp() throws Exception {
        super.setUp();
        uMyClass = new MyClass();

    }

    public void testCompare() throws Exception {
        int a = 23;
        int b = 11;
        boolean f = uMyClass.compare(a, b);
        boolean expValue = false;
        assertFalse(f);
        assertEquals(expValue, f);

    }

    public void testSum() throws Exception {
        int a = 30;
        int b = 12;
        int s = uMyClass.sum(a,b);
        int result = 42;
        assertEquals(s,result);
    }

    public void testGetString() throws Exception {


    }
}