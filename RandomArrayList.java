package com.example.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class RandomArrayList {

    public static void main(String[] args) {
        ArrayList<String> random = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter strings : ");
        while (true){
            String str = s.nextLine();

            if("stop".equalsIgnoreCase(str)){
                break;
            }
            random.add(str);
            Collections.shuffle(random);
        }
        System.out.println("Randomised List : \n" + random);
//        System.out.printf("Randomised Strings : \n%s", String.join("\n", random));
    }
// https://clips.twitch.tv/IncredulousArbitraryToadBatChest-DX9M76ehevWds8GW
}
