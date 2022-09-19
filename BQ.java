package com.example.training;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class BQ {
    public static void main(String[] args) throws InterruptedException{
        BlockingQueue<Integer> bq = new LinkedBlockingDeque<>(5);
        bq.put(128);
        bq.put(256);
        bq.put(512);
        bq.put(1024);
        bq.put(2048);

        bq.take();
        bq.put(4096);
//        bq.put(8192);
        System.out.println(bq);
        int head = bq.element();
        System.out.println("Head = " + head);
        for (int i : bq){
            System.out.println(i);
        }
    }


}
