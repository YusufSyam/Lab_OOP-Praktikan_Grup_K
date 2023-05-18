abstract class Smartphone implements Moveble{
    protected int price;
    protected String brand;

    public abstract void move();
}

class Oppo extends Smartphone {
    public Oppo(int price, String brand){
        this.price = price;
        this.brand = brand;
    }


    @Override
    public void move() {
        System.out.println("Brand Smartphone\t: " + brand);
        System.out.println("Price Smartphone\t: " + "Rp."+ price + "\n");
        System.out.println("Smartphone Berpindah");
    }
}