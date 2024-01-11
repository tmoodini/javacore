package com.tmoodini.designpatterns;

public class SingletonString {

    public static SingletonString singletonString = null;
    public String myPhrase;

    private SingletonString(){
        myPhrase = "THIS IS MY SINGLETON PHRASE";
    }

    public static synchronized SingletonString getInstance(){
        if(singletonString == null){
            return new SingletonString();
        }
        return singletonString;

    }
}
