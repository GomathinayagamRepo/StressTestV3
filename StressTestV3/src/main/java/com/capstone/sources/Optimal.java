package com.capstone.sources;

import java.io.FileInputStream;
import java.util.Scanner;

public class Optimal {
    public static int optimal(FileInputStream in){

        Scanner scanner = new Scanner(in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return a-b;
    }
}
