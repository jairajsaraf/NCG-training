package com.example.training;

import java.util.concurrent.ConcurrentHashMap;

public class ConcHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> hm = new ConcurrentHashMap<>();

        hm.put(1, "Jairaj");
        hm.put(2, "Saraf");
        hm.put(3, "Saraf");

        hm.putIfAbsent(2, "Jairaj");

        hm.remove(2, "Saraf");

        hm.putIfAbsent(4, "Jairaj");

        hm.replace(2, "Saraf", "Surname");
        System.out.println(hm);
    }
}
