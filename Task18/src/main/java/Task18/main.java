package Task18;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class main  {
    public static final String FILEURL = "http://localhost:8090/Files/ArticlesJSON.json ";
    //    public static final String url = "http://localhost:8090/Files/ArticlesJSON.json";

    public static void main(String[] args) {

    try{
        URL url = new URL(FILEURL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent","chrome");
        connection.setReadTimeout(30000);

        int responseCode = connection.getResponseCode();
        System.out.println("Response cod: " + responseCode);

        if(responseCode != 200) {
            System.out.println("Error reading web page");
            System.out.println(connection.getResponseMessage());
        }


      }catch(IOException e) {
        System.out.println(" IOException: "+ e.getMessage());
      }
    }
}

