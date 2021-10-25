package com.capstone;

import com.capstone.app.StressTest;
import com.capstone.testGen.CopyFiles;
import com.capstone.testGen.GenTests;

public class Main {

    public static void main(String[] args)  {

        /*
        /////sample Testing
        GenTests gt = new GenTests();
        gt.createFiles(10);
        gt.writeInt(2,89);
        gt.writeInt(3,89);
        */
        StressTest st  = new StressTest();
        st.stressTest();
    }
}
