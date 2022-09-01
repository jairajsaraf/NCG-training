package com.example.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrimStr {
    public static List<String> TrimStr() {
        List<String> space_str = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter strings with whitespaces: ");
        while (true) {
            String str = s.nextLine();

            if ("stop".equalsIgnoreCase(str)) {
                break;
            }
            space_str.add(str.trim());

        }
        return space_str;
    }

    public static void main(String[] args) {
        List<String> string_list = TrimStr();
        System.out.println("List with whitespaces removed : \n" + string_list);          // Instead of printf so that we can see whitespaces are removed using .trim()
//        System.out.printf("User Input Data:\n%s", String.join("\n", string_list));
    }
}
