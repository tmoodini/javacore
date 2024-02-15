package com.tmoodini.javacore;

public class SwitchStatements {

    public static void main(String ... args){

        int num = 7;
        String numberString;
        boolean cloudySkies = false;
    /*
     *  In older versions of Java you had only these rather basic
     *  statments.
     *
     *
     */
        switch(num){
            case 1: System.out.println("1");
                    numberString = "One";
                    if(cloudySkies)
                        System.out.println("Cloudy skies");

            case 2: System.out.println("2");
            case 3: System.out.println("3");
            case 7:System.out.println("7");
                if(!cloudySkies) {
                    System.out.println("Cloudy skies");
                }
                break;
            case 8: System.out.println("8");

            case 9: System.out.println("9");
            default:System.out.println("Default");
        }



        int anothernum = switch(num){
            case 1:
                yield 1;

            case 7:
                if(cloudySkies){
                    System.out.println("Cloudy skies and lucky number");
                }else{
                    System.out.println("Sunny skies and lucky number");
                }
                yield 7;

            default: yield 0;

        };

        int finalnum = switch(num){
            case 1 -> 1;


            case 7 -> {
                if(cloudySkies){
                    System.out.println("Cloudy skies and lucky number");
                   yield 7;
                }else{
                    System.out.println("Sunny skies and lucky number");
                    yield 8;
                }}


            default -> 0;

        };

        System.out.println(anothernum);
    }
}
