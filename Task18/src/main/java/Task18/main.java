package Task18;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class main {
    public static final String FILEURL = "http://localhost:8090/Files/ArticlesJSON.json ";
    //    public static final String url = "http://localhost:8090/Files/ArticlesJSON.json";

    public static void main(String[] args) throws IOException {

        try {
            URL url = new URL(FILEURL);
//        URL url = new URL("http://localhost:8090/Files/ArticlesJSON.json");
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
            String str = (inputReader.toString());

            inputReader.close();


        } catch (IOException e) {
            System.out.println(" IOException: " + e.getMessage());
        }
        Article article = new Article();
        Author author = new Author();
        List<Article> list = new ArrayList<Article>();
        {
            try {
                JSONObject jsonObject = new JSONObject(FILEURL);
                JSONArray jsonArray = jsonObject.getJSONArray("article");
                for (int i = 0; i < jsonArray.length(); i++) {
//
//                    JSONObject jitems = jsonArray.getJSONObject(i);

                    JSONArray jsonArray1 = jsonObject.getJSONArray("Author");
//                    for (int j = 0; j < jsonArray1.length(); j++) {
                        JSONObject jAuthors = jsonArray.getJSONObject(i);
                       String firstName = jAuthors.getString("firstName");
                       String lastName = jAuthors.getString("lastName");
                       String address = jAuthors.getString("address");
                       String contact = jAuthors.getString("contact");
                       String email = jAuthors.getString("email");
//
//                        JSONObject jitemsArea = jitems.getJSONObject("area");
//                        areaId = jitemsArea.getInt("id");
//                        areaName = jitemsArea.getString("name");
//                        areaCountryCode = jitemsArea.getString("countryCode");
                    }

//                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
//        try {
//            ArrayList<Article> parsing(String list);
//               JSONArray list1 = new JSONArray(jsonStr);
//
//                if (list != null) {
//                  for (int i = 0; i < list1.length(); i++) {
//                        JSONObject c = list1.getJSONObject(i);
//                   }
//                }
//           } catch (JSONException e) {
//            e.printStackTrace();
//        } finally {
//
//           }
        }
    }

}


