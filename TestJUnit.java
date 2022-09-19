package com.example.training;


import junit.framework.TestCase;

public class TestJUnit extends TestCase {
    public TestJUnit(String name){
        super(name);
    }
    public void testSomething(){
        assertTrue(4 == (2*2));
    }
}