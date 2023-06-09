public class Smartphone implements Movement {
    private int price;
    private String brand;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }

    public void info() {
        System.out.println("Merk : " + getBrand());
        System.out.println("Harga : " + getPrice());
    }

}
