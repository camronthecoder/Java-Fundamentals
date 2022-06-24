package com.haley.mosh;

import java.util.Date;

public class Variable {
    //class = function in js
    //public = it will be a pulic class.
    //static= the class doesnt have to be called for it to work(global varitable).
    //void = doesnt return anything.
    //main starts the class without it class wont work
    public static void main (String[] args){
        byte hisAge = 30;
        //use underscore in java like a comma
        // int viewCount = 100_000_000_000; ( too long for a int)
        long viewCount=  100_000_000_000L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        //System.out.println is basically console.log
        System.out.println(hisAge);
    }
}
