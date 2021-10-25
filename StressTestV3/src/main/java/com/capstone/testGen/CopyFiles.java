package com.capstone.testGen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class CopyFiles {
    public static void copy(String brutePath, String optimalPath){

        String directry = "C:\\Users\\gomat\\IdeaProjects\\StressTestV3\\";
        String sourcePackage = "src\\main\\java\\com\\capstone\\sources\\";
        String destBrutePath = directry+sourcePackage+"BruteForce.java";
        String destOptimalPath = directry+sourcePackage+"Optimal.java";



        try{
            FileChannel src1 = new FileInputStream(brutePath).getChannel();
            FileChannel src2 = new FileInputStream(optimalPath).getChannel();
            FileChannel dest1 = new FileOutputStream(destBrutePath).getChannel();
            FileChannel dest2 = new FileOutputStream(destOptimalPath).getChannel();

            dest1.transferFrom(src1, 0, src1.size());
            dest2.transferFrom(src2, 0, src2.size());

        }
        catch (Exception E){
            System.out.println("Failed in copying files");
        }

    }
}
