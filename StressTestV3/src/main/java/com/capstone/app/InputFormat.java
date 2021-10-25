package com.capstone.app;

import java.util.Scanner;

public class InputFormat {
    static String format = "";
    public static void getInputFormat(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Lines of Input :");
        int numOfLines = scanner.nextInt();
        for(int i=0;i<numOfLines;i++){
            System.out.println("What is the input in line "+i+1);
            System.out.println("1.Integer\n2.String\n3.Array\n4.Char");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("What is the range of the Integer ?");
                    int a,b;
                    a= scanner.nextInt();
                    b= scanner.nextInt();
                    format += "GenerateInt.getInt("+a+","+b+")"+"\n";
                    break;
                case 2:
                    System.out.println("Which of following String method is appropriate ?");
                    System.out.println("-----------------\n--------------\n-------------------------");
                    // gets parameters if necessary
                    format += "ClassName.MethodName(parameters)";
                    break;
                case 3:
                    System.out.println("Which of following Array method is appropriate ?");
                    System.out.println("-----------------\n--------------\n-------------------------");
                    // gets parameters if necessary
                    format += "ClassName.MethodName(parameters)";
                    break;
                case 4:
                    System.out.println("Which of following Char method is appropriate ?");
                    System.out.println("-----------------\n--------------\n-------------------------");
                    // gets parameters if necessary
                    format += "ClassName.MethodName(parameters)";
                    break;
                default:
                    System.out.println("Invalid Selection");

            }
        }
        System.out.println("Input generating Method order");
        System.out.println(format);
    }
}
