package com.capstone.generate;

import java.util.Random;

public class GenerateInt {

    // generates Integers in a range (+ve and -ve)
    static Random random = new Random();
    static Integer rInt;
    public static int getInt(int a,int b){
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        rInt = random.nextInt(max - min) + min;
        return rInt;
    }

}
