package com.example.training;

public class StringLengthHash {
    String text = "Happy Birthday!";
    int length = text.length();
    char[] StringArr = new char[length];

    public static void main(String[] args) {
        StringLengthHash s = new StringLengthHash();
        char hash = '#';
//        System.out.println(s.length);
        for(int i = 0; i < s.length; i++){
            s.StringArr[i] = s.text.charAt(i);
        }
        System.out.println("Array (before) : \n");
        for(char c : s.StringArr){
            System.out.println(c);
        }

        for(int i = 0; i < s.length; i++){
            if (i % 2 != 0){
                s.StringArr[i] = hash;
            }
        }
        System.out.println("Array (after) : \n");
        for(char c : s.StringArr){
            System.out.println(c);
        }
    }
}
