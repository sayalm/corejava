package Dog;

import java.util.List;

public interface IDog {
 void exportDog(List<Dog> dogList, String file_Name);

 List<Dog> importDog(String file_Name);

}
