package com.mycompany.program.sayal.task18withjdbc.fileUtils;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Filedownloader {
    public static final String FILEURL = "http://localhost:8090/Files/ArticlesJSON.json ";

    public static void downloadFileFromUrl() {
        try {
            URL url = new URL(FILEURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "chrome");
            connection.setReadTimeout(30000);

            int responseCode = connection.getResponseCode();
            System.out.println("Response cod: " + responseCode);

            if (responseCode != 200) {
                System.out.println("Error reading web page");
                System.out.println(connection.getResponseMessage());
                return;
            }
            BufferedReader inputReader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));

            String line;

            while ((line = inputReader.readLine()) != null) {
                System.out.println(line);
            }
            File jsonFile = new File("D:/sayal/corejava/NetBeansProjects/Files/ArticlesJSON1.json");
//            FileUtils.copyInputStreamToFile(connection.getInputStream(),jsonFile);
            writeFile(FILEURL,jsonFile);
            inputReader.close();



        } catch (IOException e) {
            System.out.println(" IOException: " + e.getMessage());
        }

    }

    public static void writeFile(String FILE_URL,File FILE_NAME){
        try (BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream())) {
            try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME)) {
                byte dataBuffer[] = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                    fileOutputStream.write(dataBuffer, 0, bytesRead);
                }
            }
        } catch (IOException e) {
            // handle exception
        }
    }

    public static void main(String[] args) {
            downloadFileFromUrl();
    }
}
