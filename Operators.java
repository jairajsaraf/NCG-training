package com.example.training;

public class Operators {
    static int players = 0;
    static int limit = players;
    static String status = limit<3 ? "Not Exceeded" : "Exceeded";

    public static void main(String[] args) {
        System.out.println("No. of players = " + players++);
        System.out.println("No. of players step 1 = " + players);
        System.out.println("No. of players step 2 = " + ++players);

        System.out.println("Server status : " + status);

    }
}
