package com.tmoodini.javacore;

import java.util.ArrayList;

public class ThreadPlay implements Runnable{

    public static void main(String... args){

        ThreadPlay tp = new ThreadPlay();
        ThreadPlay[] tps = {new ThreadPlay(), new ThreadPlay(),
                new ThreadPlay(), new ThreadPlay(), new ThreadPlay(), new ThreadPlay(),
                new ThreadPlay(), new ThreadPlay()};

        for(int i = 0; i < tps.length; i ++){
            new Thread(tps[i]).start();
        }


    }

    @Override
    public void run() {
        System.out.println("Hello from Thread " + Thread.currentThread().getName());
    }
}
