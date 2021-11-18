package Dog;

import book.Author;

import java.util.*;

public class Main {

    public static final String DOG_JSON = "Dog.json";
    public static final String ATTRIB_JSON = "Attrib.json";

    public static void main(String[] args) {
        Attributes attributes = new Attributes();
        List<Attributes> attributesList = new ArrayList<Attributes>();
        attributesList.add(new Attributes("German-Shephard", 20, "BlackYellow"));
        attributesList.add(new Attributes("pomeranian", 10, "yellow"));
        attributesList.add(new Attributes("Pug", 8, "light brown"));


        Dog dog = new Dog();
        List<Dog> dogList = new ArrayList<Dog>();
        attributesList.add(new Attributes("German-Shephard", 20, "BlackYellow"));
        Dog dog1 = new Dog("shere", attributesList);

        DogUtils export = new DogUtils();
        export.exportDog(dogList, DOG_JSON);
        export.importDog(DOG_JSON);
        DogUtils.printMessage();

        Iterator<Attributes> it = Dog.getAttributes().iterator();
        int index = -1;
        while (it.hasNext()) {
            Attributes attributes1 = it.next();
            String str = (attributes1.toString());
            System.out.println(attributes1.toString());
            boolean result = dog.getName().equalsIgnoreCase("shere");
            if (result) {
                index = Dog.getAttributes().indexOf(attributes1);
            }
            Collections.sort(Dog.getAttributes(), new Comparator<Attributes>() {
                @Override
                public int compare(Attributes o1, Attributes o2) {
                    return 0;
                }
            });

            AttributesUtils export1 = new AttributesUtils();
            export1.exportAttributes(attributesList, ATTRIB_JSON);
            export1.importAttributes(ATTRIB_JSON);
            AttributesUtils.printMessage();


        }
    }
}
