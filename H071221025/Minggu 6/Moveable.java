interface Moveable {
    //Moveable memiliki satu method move() 
    void move();
}

class Smartphone implements Moveable {
    int price;
    String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move(){
        System.out.println("=".repeat(25));
        System.out.println("Smartphone berpindah");
    }
}

class Car implements Moveable {
    int totalForwardGear;
    String color;
    int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move(){
        System.out.println("=".repeat(25));
        System.out.println("Mobil sedang berakselerasi");
    }
}