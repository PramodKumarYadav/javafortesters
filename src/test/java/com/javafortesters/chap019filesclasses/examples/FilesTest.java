package com.javafortesters.chap019filesclasses.examples;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.file.Files;

import static com.javafortesters.domainentities.WriteFile.writeTheTestDataFile;
import static java.nio.file.StandardCopyOption.ATOMIC_MOVE;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class FilesTest {

    @Test
    public void outputFileToSystemOutWithBufferedReader() throws IOException{
        File inputFile = writeTheTestDataFile();
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));

        try{
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        }finally {
            reader.close();
        }
    }

    @Test
    public void fileStaticMethods() throws IOException {
        File outputFile = File.createTempFile("forReading", null);
        File aTempFile = File.createTempFile("pre", null, new File(System.getProperty("user.dir")));
    }

    @Test
    public void createsATempFile() throws IOException {
        File tempFile = writeTheTestDataFile();
        System.out.println(File.separator);
        Assert.assertTrue("Unrecognised OS file seperator", File.separator.equals("\\") ||
                File.separator.equals("/"));

        System.out.println(File.pathSeparator);
        Assert.assertTrue("Unrecognised OS path seperator", File.pathSeparator.equals(";") ||
                File.pathSeparator.equals(":"));

        File[] roots = File.listRoots();
        System.out.println(roots);
    }

    @Test
    public void writeOutRoots() throws IOException {
        File tempFile = writeTheTestDataFile();
        System.out.println(tempFile.getAbsolutePath());
    }

    @Test
    public void createAFile() throws IOException {
        File aTempFile = new File("D:/tempJavaForTesters.txt");
        assertThat(aTempFile.exists(), is(false));

        aTempFile.createNewFile();
        assertThat(aTempFile.exists(), is(true));

        aTempFile.delete();
        assertThat(aTempFile.exists(), is(false));
    }

    @Test
    public void anotherConstructorForFileCreation() throws IOException {
        File atempFile = new File("D:", "tempJavaForTesters.txt");
        atempFile.createNewFile();
        assertThat(atempFile.exists(), is(true));
    }

    @Test
    public void createAFileInAnyDirectory() throws IOException {

        File aTempFile = new File("D:/tempJavaForTesters.txt");
        aTempFile.deleteOnExit();
        assertThat(aTempFile.exists(), is(false));

        aTempFile.createNewFile();
        assertThat(aTempFile.exists(), is(true));

        System.out.println(aTempFile.getName());
        System.out.println(aTempFile.getParent());
        System.out.println(aTempFile.getAbsolutePath());
        System.out.println(aTempFile.getCanonicalPath());

//        assertThat(aTempFile.exists(), is(false));
    }

    @Test
    public void createAFileInTempDirectory() throws IOException {

        File aTempFile = File.createTempFile("newTempFile",".txt");
        aTempFile.deleteOnExit();
        assertThat(aTempFile.exists(), is(true));

        System.out.println(aTempFile.getName());
        assertThat(aTempFile.getName().startsWith("newTempFile"),is(true));
        assertThat(aTempFile.getName().endsWith(".txt"),is(true));
        System.out.println(aTempFile.getParent());
        System.out.println(System.getProperty("java.io.tmpdir"));
        assertThat(aTempFile.getParent() + File.separator, is(System.getProperty(("java.io.tmpdir"))));
        System.out.println(aTempFile.getAbsolutePath());
        System.out.println(aTempFile.getCanonicalPath());
        assertThat(aTempFile.getAbsolutePath().startsWith(System.getProperty("java.io.tmpdir")),is(true));

//        assertThat(aTempFile.exists(), is(false));
    }

    @Test
    public void getAbsoluteAndCanonicalPath() throws IOException {

        File bTempFile = File.createTempFile("file01", ".txt");
        System.out.println(bTempFile.getCanonicalPath());
        System.out.println(bTempFile.getAbsolutePath());

    }

    @Test
    public void getTempDirectory() {
        String tempDirectory = System.getProperty("java.io.tmpdir");
        System.out.println(tempDirectory);
        String newDirectoryStructure = tempDirectory + System.currentTimeMillis()+ File.separator + System.currentTimeMillis();
        File aDirectory = new File(newDirectoryStructure);
        assertThat(aDirectory.mkdir(), is(false));
        assertThat(aDirectory.mkdirs(), is(true));

    }

    @Test
    public void checkFileOrDirectory() {

        String locationDirectory = System.getProperty("java.io.tmpdir");

        File tempDirectory = new File(locationDirectory);
        assertThat(tempDirectory.isDirectory(),is(true));
        assertThat(tempDirectory.isFile(),is(true));
    }

    @Test
    public void readingAndWritingFiles() throws IOException {
        File outputFile = File.createTempFile("printWriter", ".txt");
        FileWriter writer = new FileWriter(outputFile);
        BufferedWriter buffer = new BufferedWriter(writer);
        PrintWriter print = new PrintWriter(buffer);

        print.println("Simple print to bufferd writer");
        print.println("-------------------------------");
        print.close();

        FileWriter writer2 = new FileWriter(outputFile, true);
        BufferedWriter buffer2 = new BufferedWriter(writer2);
        PrintWriter print2 = new PrintWriter(buffer2);

        print2.println("appending text to bufferd writer");
        print2.println("-------------------------------");
        print2.close();

        writer2.close();

    }

    @Test
    public void usingNameFileWriter() throws IOException {
        File outputFile = File.createTempFile("nameIsFileWriter", null);
        outputFile.deleteOnExit();

        FileWriter oFilewriter = new FileWriter(outputFile);
        oFilewriter.write("simple text written using FileWriter \n");
        oFilewriter.write("=====================================");
        oFilewriter.close();

        FileReader fileReader = new FileReader(outputFile);

        System.out.println(fileReader.read());

    }

    @Test
    public void additionalFileMethods() throws IOException {
        File outputFile = File.createTempFile("nameIsFileWriter", null);
        outputFile.deleteOnExit();

        FileWriter oFilewriter = new FileWriter(outputFile);
        oFilewriter.write("simple text written using FileWriter \n");
        oFilewriter.write("=====================================");

        oFilewriter.close();

        System.out.println(outputFile.length());
        assertEquals(75, outputFile.length());
        System.out.println(outputFile.getFreeSpace());
        System.out.println(outputFile.getTotalSpace());
        System.out.println(outputFile.getUsableSpace());
        System.out.println(outputFile.getAbsolutePath());
        System.out.println(outputFile.isDirectory());
        System.out.println(outputFile.isFile());
        System.out.println(System.lineSeparator());
    }

    @Test
    public void listTempDirectory() {
        File tempDir = new File(System.getProperty("java.io.tmpdir"));
        String[] fileList = tempDir.list();
        System.out.println(fileList);

        for (String fileInList : fileList) {
            System.out.println(fileInList);
        }
    }

    @Test
    public void listFilesTempDirectory() {
        File tempDir = new File(System.getProperty("java.io.tmpdir"));
        File[] oFileList = tempDir.listFiles();

        System.out.println(oFileList);

        for (File oFileInList : oFileList) {
            if (oFileInList.isDirectory()) {
                System.out.println("DIR : " + oFileInList.getName() );
            }
            if (oFileInList.isFile()) {
                System.out.println("FIL : " + oFileInList.getName());
            }
        }
    }

    @Test
    public void checkAndAmendFileAttributes() {
        File tempDir = new File(System.getProperty("java.io.tmpdir"));
        File[] oFileList = tempDir.listFiles();

        for (File oFileInList : oFileList) {
            if (oFileInList.isDirectory()) {
                System.out.println("DIR : " + oFileInList.getName() );
            }
            if (oFileInList.isFile()) {
                System.out.println("FIL : " + oFileInList.getName());
            }
            System.out.println(oFileInList.canRead());
            System.out.println(oFileInList.canExecute());
            System.out.println(oFileInList.canWrite());
            System.out.println(oFileInList.lastModified());

            // Set the properties
            oFileInList.setExecutable(false);
            oFileInList.setReadable(false);
            oFileInList.setWritable(false);
            // oFileInList.setReadOnly();
            oFileInList.setLastModified(2018-01-01);

            // Read the set properties again
            System.out.println(oFileInList.canRead());
            System.out.println(oFileInList.canExecute());
            System.out.println(oFileInList.canWrite());
            System.out.println(oFileInList.lastModified());
        }
    }


    @Test
    public void copyAFile() throws IOException {
        File fromThisFile = writeTheTestDataFile();

        File toThisFile = new File(fromThisFile.getCanonicalPath() + ".copy");

        assertThat(toThisFile.exists(),is(false));

        Files.copy(fromThisFile.toPath(), toThisFile.toPath());
        assertThat(toThisFile.exists(), is(true));
        assertThat(fromThisFile.length(), is(toThisFile.length()));
    }

    @Test
    public void moveAFile() throws IOException {
        File fromThisFile = writeTheTestDataFile();

        File toThisFile = new File(fromThisFile.getCanonicalPath() + ".move");

        assertThat(toThisFile.exists(),is(false));

        Files.move(fromThisFile.toPath(), toThisFile.toPath(),REPLACE_EXISTING, ATOMIC_MOVE);
        assertThat(toThisFile.exists(), is(true));
        assertThat(fromThisFile.exists(), is(false));
    }
}
