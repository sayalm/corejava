/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.cybersansar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Program {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter cyber Sansar model page url:");
        String data = getURLContent(scanner.nextLine());
        System.out.println(data);
        
        String imgPattern ="<img src=\"graphics/wallpaper/model/(.*?)\\.jpg\" border=\"0\" width=\"200\" height=\"150\"/>";
        Pattern pattern= Pattern.compile(imgPattern);
        Matcher matcher = pattern.matcher(data);
        while(matcher.find()){
            String imagePath = "http:/cybersansar.com/" + matcher.group(1);
            imagePath = imagePath.replace("/thumb", "");
            System.out.println(imagePath);
        }
        
    }
    
    public static String getURLContent(String uri) throws IOException {
        try {
            URL url = new URL(uri);
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
}
