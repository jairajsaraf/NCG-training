package com.example.training;

public class StringUtilities {

    private int charCount = 0;

    public void addChar(StringBuilder sBuilder, char c){
        sBuilder.append(c);
        charCount++;
    }
}
