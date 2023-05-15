public class Main {
    public static void main(String[] args) {
        System.out.println("=".repeat(20));
        Pitbull dog = new Pitbull(0, 50);
        System.out.println("+" + dog.getMove() + " berpindah ke kanan");
        dog.describe();
        System.out.println("");
        System.out.println("=".repeat(20));

        Smartphone hp = new Smartphone(2000000, "vivo");
        System.out.println("Merk : " + hp.brand);
        System.out.println("Harga Hp : " + hp.price);
        hp.movement();
        System.out.println("");
        System.out.println("=".repeat(20));

        Car car = new Car(50, 5, "blue");
        System.out.println("Kecepatan Maksimal mobil adalah : " + car.maxSpeed);
        System.out.println("Gear mobil ada " + car.totalForwardGear);
        System.out.println("Mobil berwarna " + car.color);
        car.movement();
        System.out.println("");
        System.out.println("=".repeat(20));
    }
    
}
