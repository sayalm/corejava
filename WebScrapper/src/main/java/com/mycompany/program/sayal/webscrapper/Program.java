/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.webscrapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Program {

    public static String getURLContent(String uri) throws IOException {
        try {
            URL url = new URL("https://www.jobsnepal.com/");
            URLConnection conn = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String line = "";
            StringBuilder content = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                content.append(line);

            }
            return content.toString();

        } catch (MalformedURLException e) {
            //  System.out.println(e.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        return null;

    }
    public static void writeFile(int num, String content) throws IOException{
        FileWriter writer = new FileWriter(new File("url_" + num + ".html"));
        writer.write(content);
        writer.close();
        
    }   
    public static void main(String[] args) throws MalformedURLException, IOException {
        String data = getURLContent("http://jobnepals.com");
        System.out.println("Scrapping Started please be seated");
        if (data!=null) {
            String contentPattern = "<a class=\"job-item\" (.*?) href = \"(.*?)\" >(.*?)<\\/a>";
            
        

        Pattern pattern = Pattern.compile(contentPattern);
        Matcher matcher = pattern.matcher(data);
        int i = 1;
        while (matcher.find()) {
            String jobTitle = matcher.group(3).trim();
            String link = matcher.group(2);
            data = getURLContent(link);
            if(data!=null) {
                try{
                writeFile(i, data);
                }catch(IOException e){
//                    System.out.println(e.getMessage());
                }
            }
            i++;
            
        }

    }
        System.out.println("Scrapping Complete");
    }
}
