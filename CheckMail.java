package com.example.training;
import java.util.regex.*;
import java.util.*;
public class CheckMail {
    public static void main(String[] args) {
        ArrayList<String> emails = new ArrayList<String>();
        //Valid mails
        emails.add("jairaj.saraf01@gmail.com");
        emails.add("jairajsaraf.01@hotmail.co.in");
        emails.add("jai.saraf.01@imail.co.au");
        emails.add("j-saraf.0.1@ymail.com");
        emails.add("jairaj1201@rediffmail.com");

        //Invalid mails
        emails.add("@gmail.com");
        emails.add("jairaj%1@gmail.com");

        String regex = "[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(regex);

        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + " : " + matcher.matches() + "\n");
        }
    }
}
