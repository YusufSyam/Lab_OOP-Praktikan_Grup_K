interface Moveble {
    void move();
}

class Smartphone implements Moveble {
    int price;
    String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone Berpindah");
    }
}

class Car implements Moveble {
    protected int totalForwardGear;
    protected String color;
    protected int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil sedang Berakselerasi");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(10000000, "Iphone 11");
        smartphone.move();
        System.out.println("Nama Barang : " + smartphone.brand);
        System.out.println("Harga : " +smartphone.price);

        Car car = new Car(5, "Red", 225);
        car.move();
        System.out.println("Total gigi pada mobil : " + car.totalForwardGear);
        System.out.println("Warna Mobil : " + car.color);
        System.out.println("Top Speed : " +car.maxSpeed);
    }
}
