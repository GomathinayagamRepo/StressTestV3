package com.capstone.sources;

import java.io.FileInputStream;
import java.util.Scanner;

public class BruteForce {
    public static int bruteForce(FileInputStream in){

        Scanner scanner = new Scanner(in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return a+b;
    }
}
