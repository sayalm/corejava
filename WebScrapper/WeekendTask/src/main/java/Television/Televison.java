package Television;

import java.util.ArrayList;
import java.util.List;

public class Televison {

    private String CodeNumber;
    private static List<Specification> specifications = new ArrayList<Specification>();

    public Televison(String codeNumber,List<Specification> specifications) {
        CodeNumber = codeNumber;
        this.specifications = specifications;
    }

    public String getCodeNumber() {
        return CodeNumber;
    }

    public void setCodeNumber(String codeNumber) {
        CodeNumber = codeNumber;
    }

    public static List<Specification> getSpecifications() {
        return specifications;
    }

    public static void setSpecifications(List<Specification> specifications) {
        Televison.specifications = specifications;
    }

    @Override
    public String toString() {
        return "Televison{" +
                "CodeNumber='" + CodeNumber + '\'' + "specifications='" + specifications +
                '}';
    }
}
