package com.capstone.generate;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class GenerateArray {

    static Random random = new Random();

    // generate an Integer Array in a range
    public static Integer [] getIntArray(int a,int b, int arrLength){

        Integer []arr = new Integer[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = GenerateInt.getInt(a,b);
        }
        return arr;
    }

    // generates a sorted Integer Array
    public static Integer [] getSortIntArray(int a,int b, int arrLength){

        Integer []arr = new Integer[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = GenerateInt.getInt(a,b);
        }
        Arrays.sort(arr);
        return arr;
    }

    // generates a sorted Integer Array
    public static Integer [] getDSortIntArray(int a,int b, int arrLength){

        Integer []arr = new Integer[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = GenerateInt.getInt(a,b);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    //--------------------- String Area ----------------------------
    // generates a lower string Array
    public static String [] getLowerStringArray(int arrLength){
        //arrLength = random.nextInt(50)+1;
        String arr[] = new String[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = GenerateString.getLowerWord();
        }
        return  arr;
    }

    // generates a upper string Array
    public static String [] getUpperStringArray(int arrLength){
        //arrLength = random.nextInt(50)+1;
        String arr[] = new String[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = GenerateString.getUpperWord();
        }
        return  arr;
    }

    // generates a string Array
    public static String [] getStringArray(int arrLength){
        //arrLength = random.nextInt(50)+1;
        String arr[] = new String[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = GenerateString.getWord();
        }
        return arr;
    }

    //------------------- 2d Array -------------------------------
    // generates a Matrix
    public static Integer[][] getMat(int a, int b, int n, int m){

        Integer [][] arr = new Integer[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = GenerateInt.getInt(a,b);
            }
        }
        return arr;
    }
}


