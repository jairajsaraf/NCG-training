package com.example.training;

public class StringMethods {
    static String s = "HELLO WORLD!";
    static Integer n = 123456789;
    static String s_smalL = "hello world!";
    static String space = "     W H I T E S P A C E     ";


    public static void main(String[] args) {
        String s_conc = s.concat(" This is Jairaj Saraf.");
        System.out.println(s_conc);
        System.out.println(s.equalsIgnoreCase(s_smalL));
        System.out.println(s.replace('!', ','));
        System.out.println(s.substring(6));
        System.out.println(s.substring(0, 5));
        System.out.println(n.toString());
        System.out.println(space.trim());
    }
}
