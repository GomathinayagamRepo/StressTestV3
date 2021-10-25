package com.capstone.template;

public class ClassGen extends GenMethods {

    static String writeClass = "";

    public void genClass(){
        writeClass += Package+space + genPackage + "template" + endLine();
        writeClass += newLine;
        writeClass += Public + space + Class + space + "Template" + space + curlyOpen + newLine;
        writeClass += tab;
        writeClass += writeInt(1);
        writeClass += writeInt(2);
        writeClass += curlyClose;

        System.out.println(writeClass);
    }

}
