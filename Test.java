package com.example.training;

public class Test {
    enum Nums{BIG, HUGE, OVERWHELMING};


    public static void main(String[] args) {
        Nums n = Nums.BIG;
        System.out.println(n);
    }
}

class Test2 extends Test{

}