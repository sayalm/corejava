package Dog;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class AttributesUtils implements IAttributes{
    public static void printMessage() {
        System.out.println("Callign static method");
        System.out.println(Main.ATTRIB_JSON);
    }

    @Override
    public void exportAttributes(List<Attributes> attributesList, String file_Name) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try(Writer writer = Files.newBufferedWriter(Paths.get(file_Name))) {
            gson.toJson(attributesList, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Attributes> importAttributes(String file_Name) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try(Reader reader = new FileReader(file_Name)){
            JsonElement json = gson.fromJson(reader, JsonElement.class);
            String jsonString = gson.toJson(json);
            System.out.println(jsonString);
            List<Attributes> attributes = gson.fromJson(json,new TypeToken<List<Attributes>>() {}.getType());
            attributes.forEach(System.out::println);
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
