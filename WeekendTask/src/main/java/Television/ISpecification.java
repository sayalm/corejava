package Television;
import java.util.List;

public interface ISpecification {
    void exportSpecification(List<Specification> specificationList,String file_Name);
    List<Specification> importSpecification(String file_Name);
}
