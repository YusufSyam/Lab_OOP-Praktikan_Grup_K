class Food{
    private String name;
    private String type;
    private int price;
    private double rating;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public Food() {
        this.name = "Nasi";
        this.type = "Sedang";
        this.price = 1000;
        this.rating = 4.5;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    public void displayInfo() {
        System.out.println("nama makanan: " + name);
        System.out.println("type        : " + type);
        System.out.println("price       : " + price);
        System.out.println("rating      : " + rating);
    }

}

class SelfUtils{
    public static void displaySelfData(){
        System.out.println("Muhammad Zoel Ramadhan");
        System.out.println("H071221059");
    }
}

public class Main {
    public static void main(String[] args) {

       Food food1 = new Food();
       food1.setName("Nasi Goreng");
       food1.setType("Sedang");
       food1.setPrice(10000);
       food1.setRating(4.9);
       food1.displayInfo();

       Food food2 = new Food();
       food2.getName();
       food2.getType();
       food2.getPrice();
       food2.getRating();
       food2.displayInfo();

       SelfUtils.displaySelfData();

        class Food{

        }
    }
}

//video methods kelas terbuka