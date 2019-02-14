package com.javafortesters.domainentities;

import java.io.*;

public class WriteFile {

    public static File writeTheTestDataFile() throws IOException {
        File outputFile = (File) File.createTempFile("tempFileJava4Testers", ".txt");
        PrintWriter print = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(outputFile)));

        for (int linenumber = 1; linenumber < 6; linenumber++) {
            print.println("line" + linenumber);
        }

        print.close();
        return outputFile;
    }

}
