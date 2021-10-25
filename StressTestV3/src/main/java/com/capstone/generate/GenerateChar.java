package com.capstone.generate;

import java.util.Random;

public class GenerateChar {
    static Random random = new Random();
    public static char c;

    // upper and lower case alphabet
    public static char getAlpha(){
        boolean b = random.nextBoolean();
        int offset = 97;
        if(b){
            offset = 65;
        }
        c = (char) (random.nextInt(26) + offset);
        return c;
    }

    // upper Case alphabet
    public static char getUpperAlpha(){
        c = (char) (random.nextInt(26) + 65);
        return c;
    }

    // lower Case alphabet
    public static char getLowerAlpha(){
        c = (char) (random.nextInt(26) + 97);
        return c;
    }

    // numbers
    public static  char getDigitChar(){
        c = (char) (random.nextInt(10) +48);
        return c;
    }

    // special char
    public static  char getSplChar(){
        c = (char) (random.nextInt(47 - 33) + 33);
        return c;
    }

    // ( , )
    public static char getParaChar(){
        boolean b = random.nextBoolean();
        if(b){
            return (char) 40;
        }
        return (char) 41;
    }

    // Brackets
    public static char getBracketChar(){
        char brackets[] = {'(', ')', '{', '}', '[', ']'};
        c = brackets[random.nextInt(6)];
        return c;
    }

    // any char
    public static char getChar(){
        c = (char) (random.nextInt(126-33)+33);
        return c;
    }

    // vowel
    public static char getVowel(){
        int arr[] = {97,101,105,111,117};
        int temp = random.nextInt(5);
        c = (char) arr[temp];
        return c;
    }

    //consonant
    public static char getConsonant(){
        int arr[] = {98,99,100,102,103,106,107,108,109,110,112,113,114,115,116,118,119,120,121,122};
        int temp = random.nextInt(20);
        c = (char) arr[temp];
        return c;
    }

}