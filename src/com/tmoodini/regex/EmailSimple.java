package com.tmoodini.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSimple {

    public static void main(String... args){
        String email1 = "homer.simpson@simpsons.com";
        String email2 = "homersimpson1@simpsons.co";
        String pat1 = "^([a-zA-Z]).(\\S+).(\\S+)@(\\S+)\\.(\\S+)";
        String pat2 = "(\\S+).(\\S+)@(\\S+)\\.(\\S+)";
        //remember lowercase 's' is whitespace while upper is non-whitespace
        Pattern p1 = Pattern.compile(pat1);
        Matcher m1 = p1.matcher(email1);
        if(m1.find()){

            System.out.println(m1.group(0));
        }else{
            System.out.println("No match");
        }
    }
}
