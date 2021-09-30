package Television;

import java.util.List;

public interface ITelevision {
    void exportTelevison(List<Televison> televisonList, String file_Name);
    List<Televison> importTelevison(String file_Name);
}
