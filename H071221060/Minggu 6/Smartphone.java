public class Smartphone implements Move {
    int price;
    String brand;

    public Smartphone(int price, String brand){
        this.brand = brand;
        this.price = price;
    }

    @Override
    public void movement() {
        System.out.println("Smartphone berpindah");
    }
}
