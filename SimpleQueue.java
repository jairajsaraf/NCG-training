package com.example.training;

import java.util.ArrayList;
import java.util.List;

class MyQueue{
    private List<Integer> queue;  //queue struct
    private int p_start;
    public MyQueue(){
        queue = new ArrayList<>();
        p_start = 0;
    }

    public boolean enQueue(int x){
        queue.add(x);
        return true;
    }

    public boolean deQueue(){
        if (isEmpty() == true){
            System.out.println("Queue is empty.");
            return false;
        }
        p_start++;
        return true;
    }

    public int front(){
        return queue.get(p_start);
    }

    public boolean isEmpty(){
        return p_start >= queue.size();
    }


}
public class SimpleQueue {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        if (q.isEmpty() == false)
            System.out.println(q.front());
        q.deQueue();
        if (q.isEmpty() == false)
            System.out.println(q.front());

    }
}