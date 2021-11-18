package Dog;

public class Attributes {
    private String Breed;
    private int weight;
    private String color;


    public Attributes(String breed, int weight, String color) {
        Breed = breed;
        this.weight = weight;
        this.color = color;
    }

    public Attributes() {
        
    }



    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "Breed='" + Breed + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }


}
