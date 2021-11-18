/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.sayal.jobscrapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Program {
    public static void main(String[] args) throws IOException {
        String link = "http://jobsnepal.com";
        
        String line = "";
        URL url= new URL(link);
        URLConnection conn = url.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream())); 
        StringBuilder builder = new StringBuilder();
        while((line=reader.readLine())!=null){
            builder.append(line);
            
        }
        reader.close();
        
        
        String regex ="<a class=\"job-title\" href=\"(.*?)title=\"(.*?) class=\"(.*?)\">(.*?)</a>";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(builder.toString());
        
        while(matcher.find()) {
            System.out.println(matcher.group(0));
        }
        
        
    }
}
