package Television;

public class Specification {
    private String Brand;
    private int Price;
    private int size;

    public Specification(String brand, int price, int size) {
        Brand = brand;
        Price = price;
        this.size = size;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "Brand='" + Brand + '\'' +
                ", Price=" + Price +
                ", size=" + size +
                '}';
    }
}
