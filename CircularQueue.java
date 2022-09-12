package com.example.training;

class MyCircularQueue {

    public int[] data;
    public int head;
    public int tail;
    public int size;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        data = new int[k];
        head = -1;
        tail = -1;
        size = k;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            head = 0;
        }
        tail = (tail + 1) % size;
        data[tail] = value;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        if (head == tail) {
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % size;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[tail];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return head == -1;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return ((tail + 1) % size) == head;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */

class Driver{
    public static void main(String[] args) {
        MyCircularQueue cq = new MyCircularQueue(5);
        cq.enQueue(5);
        cq.enQueue(13);
        cq.enQueue(8);
        cq.enQueue(2);
        cq.enQueue(10);
        cq.deQueue();
        System.out.println("Front : " + cq.head + "\nRear : " + cq.tail +"\n");

//        cq.enQueue(23);
//        System.out.println("Front : " + cq.Front() + "\nRear : " + cq.Rear()+"\n");
//        cq.enQueue(23);
//        System.out.println("Front : " + cq.Front() + "\nRear : " + cq.Rear()+"\n");
//        cq.enQueue(6);
//        System.out.println("Front : " + cq.Front() + "\nRear : " + cq.Rear()+"\n");
//        cq.deQueue();
//        System.out.println("Front : " + cq.Front() + "\nRear : " + cq.Rear()+"\n");
//        cq.deQueue();
//        System.out.println("Front : " + cq.Front() + "\nRear : " + cq.Rear()+"\n");
//        cq.deQueue();
//        System.out.println("Front : " + cq.Front() + "\nRear : " + cq.Rear()+"\n");
//        cq.deQueue();
//        System.out.println("Front : " + cq.Front() + "\nRear : " + cq.Rear()+"\n");

        for (int i : cq.data){
            System.out.println(i);
        }

    }
}