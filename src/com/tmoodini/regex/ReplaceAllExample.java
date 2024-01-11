package com.tmoodini.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceAllExample {

    public static void main(String... args){

        String header = "<h1>I should be p</h1>";
        Pattern p1 = Pattern.compile("h1");
        Matcher m1 = p1.matcher(header);

        if(m1.find()){
            header = m1.replaceAll("p");
            System.out.println(header);
        }
    }
}
