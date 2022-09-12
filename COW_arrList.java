package com.example.training;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class COW_arrList extends Thread{
    static CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();

    public void run(){
        l.add("D");
    }
    public static void main(String[] args) throws InterruptedException{
        l.add("A");
        l.add("B");
        l.add("C");

        COW_arrList c = new COW_arrList();
        c.run();
        Thread.sleep(1000);

        Iterator i = l.iterator();

        while(i.hasNext()){
            String s = (String) i.next();
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(l);
    }
}
