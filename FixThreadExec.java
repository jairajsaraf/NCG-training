
package com.example.training;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class FixThreadExec {


    public static void main(String[] args)
    {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            service.execute(() -> {
                System.out.println(
                        "Printing document by thread : "
                                + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000L);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        service.shutdown();
    }
}
