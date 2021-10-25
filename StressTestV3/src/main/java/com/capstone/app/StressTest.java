package com.capstone.app;

import com.capstone.testGen.GenTests;
import com.capstone.sources.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.Scanner;

public class StressTest {

    int noOfTestCases = 0;

    String path = GenTests.path;

    public void getTestCases(){
        try {
            InputStream inputStream = new FileInputStream(path + "index.txt");
            Scanner scanner = new Scanner(inputStream);
            // number of test cases generated
            noOfTestCases = scanner.nextInt();
            //System.out.println(noOfTestCases);
        }
        catch (Exception e){
            System.out.println("unable to access index.txt");
            System.exit(0);
        }
    }





    public void failedCaseReport(FileInputStream testCase){

        Scanner scanner = new Scanner(testCase);
        StringBuilder failed = new StringBuilder();

        while (scanner.hasNextLine()){
            failed.append(scanner.nextLine());
            failed.append("\n");
        }
        failed.append("\n-------\n\n");
        try{
            FileWriter fileWriter = new FileWriter(path+"failedCases.txt",true);
            fileWriter.write(String.valueOf(failed));
            fileWriter.close();
        }
        catch (Exception e){
            System.out.println("Error Occured During writing in failedCases");
            System.exit(0);
        }
    }





    public void stressTest(){

        getTestCases();

        try{
            File file = new File(path+"failedCases.txt");
            file.createNewFile();

        }
        catch (Exception e){
            System.out.println("unable to create FailedCases File");
            System.exit(0);
        }

        for(int i=0;i<noOfTestCases;i++){


            try {
                FileInputStream testCaseB = new FileInputStream(path+Integer.toString(i)+".txt");
                FileInputStream testCaseO = new FileInputStream(path+Integer.toString(i)+".txt");
                // call methods and test

                if( BruteForce.bruteForce(testCaseB)!= Optimal.optimal(testCaseO) ){

                    FileInputStream failed = new FileInputStream(path+Integer.toString(i)+".txt");
                    failedCaseReport(failed);
                    //System.out.println("didn't match");
                }
                else{
                    //System.out.println("Passed");
                }
            }

            catch (Exception e){
                System.out.println("Failed Testing "+(i+1)+"th Test Case");
                System.exit(0);
            }

        }

    }



}
