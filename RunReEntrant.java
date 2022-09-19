package com.example.training;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class worker implements Runnable{
    String name;
    ReentrantLock lock;
    public worker(ReentrantLock r, String s){
        lock = r;
        name = s;
    }
    public void run(){
        boolean done = false;
        while(!done){
            boolean ans = lock.tryLock();

            if(ans){
                try{
                    Date d = new Date();
                    SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Task name : " + name + " outer lock acquired at " + df.format(d) + " Doing outer work");
                    Thread.sleep(1500);

                    lock.lock();
                    try{
                        d = new Date();
                        df = new SimpleDateFormat("hh:mm:ss");
                        System.out.println("Task name : " + name + " inner lock acquired at " + df.format(d) + " Doing inner work");
                        System.out.println("Lock hold count = " + lock.getHoldCount());
                        Thread.sleep(1500);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    finally{
                        System.out.println("Task name : " + name + " releasing inner lock");
                        lock.unlock();
                    }
                    System.out.println("Lock Hold count " + lock.getHoldCount());
                    System.out.println("Task name : " + name + " work done");
                    done = true;
                }

                catch(InterruptedException e) {
                e.printStackTrace();
                }
                finally {
                    System.out.println("Task name : " + name + " releasing outer lock");
                    lock.unlock();
                    System.out.println("Lock Hold count = " + lock.getHoldCount());
                }

            }
            else{
                System.out.println("Task name : " + name + " waiting for lock");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
public class RunReEntrant {
    static final int MAX_T = 2;

    public static void main(String[] args) {
        ReentrantLock rel = new ReentrantLock();
        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
        Runnable w1 = new worker(rel, "Job1");
        Runnable w2 = new worker(rel, "Job2");
        Runnable w3 = new worker(rel, "Job3");
        Runnable w4 = new worker(rel, "Job4");
        pool.execute(w1);
        pool.execute(w2);
        pool.execute(w3);
        pool.execute(w4);
        pool.shutdown();
    }
}
