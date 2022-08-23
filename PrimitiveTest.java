package com.example.training;

public class PrimitiveTest {
    public static void main(String[] args) {
        int a = 1;
        PrimitiveTest pt  = new PrimitiveTest();
        System.out.println("Before modify() a = " + a);
        pt.modify(a);
        System.out.println("After modify() in psvm, a = " + a);
    }
    void modify(int num){
        num = num + 1;
        System.out.println("Inside modify() value of a = " + num);
    }
}
