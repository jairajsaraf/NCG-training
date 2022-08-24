package com.example.training;

public class StrIntCheck {

    public static void main(String[] args) {
        String str = "123456789";

        try {
            Integer.parseInt(str);
            System.out.println("Input String is valid Integer.");
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
    }
}
