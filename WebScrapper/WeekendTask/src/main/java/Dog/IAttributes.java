package Dog;

import java.util.List;

public interface IAttributes {
    void exportAttributes(List<Attributes> attributesList, String file_Name);

    List<Attributes> importAttributes(String file_Name);
}
