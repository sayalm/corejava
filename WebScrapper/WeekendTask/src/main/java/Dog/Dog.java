package Dog;

import book.Author;

import java.util.ArrayList;
import java.util.List;

public class Dog {
    private String Name;
    private static List<Attributes> attributes = new ArrayList<Attributes>();

    public Dog(String name, List<Attributes> attributes) {
        Name = name;
        this.attributes = attributes;
    }

    public Dog() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public static List<Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Name='" + Name + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
