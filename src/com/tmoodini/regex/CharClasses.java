package com.tmoodini.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharClasses {

    private String myString = "Four score and seven years ago our fathers brought forth, " +
            "upon this continent, a new nation, conceived in liberty, " +
            "and dedicated to the proposition that all men are created equal. ";

    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter regex ");
        String regExp = scanner.nextLine();
        System.out.print("Enter text ");
        String lineToScan = scanner.nextLine();

        Pattern p1 = Pattern.compile(regExp);
        Matcher m1 = p1.matcher(lineToScan);

        if(m1.find()){
            System.out.println("FOUND");
            lineToScan = m1.replaceAll("x");
            System.out.println(lineToScan);
        }

        //System.out.println(regExp);
        //System.out.println(lineToScan);
    }
}
