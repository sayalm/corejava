package com.corejava.Multithreading.Task;

import java.io.*;

public class MultithreadWriteToFile {
    public static void main(String[] args) {
        //Priority set to minimum =1 to the current thread
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        long timeStart = System.nanoTime();
        File location = new File("files"); //Location of the file
        File destination = new File("files\\DestinationMultiThread.txt"); // destination for creating new file
        File[] files = location.listFiles();
        for (File file : files) {
            Writer w1 = new Writer(file, destination);
            Thread t = new Thread(w1);
            t.setPriority(Thread.MAX_PRIORITY);
            t.start();
        }
        long timeStop = System.nanoTime();
        System.out.println("Total execution time is " + (timeStop - timeStart));
    }
}

class Writer implements Runnable {
    File source;
    File destination;

    public Writer(File source, File destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public void run() {
        String content = null;
        try {
            content = readFromFile(source.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        writeToFile(destination, content);
    }

    public static void writeToFile(File file, String content) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(content);
            writer.write("file content written");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String readFromFile(String FILE_NAME) throws IOException {
        StringBuffer content = new StringBuffer();
        try {
            String text;
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            while ((text = reader.readLine()) != null) {
                content.append(text);
                content.append("\n");
//                System.out.println(content);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return content.toString();
    }
}