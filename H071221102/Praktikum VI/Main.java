public class Main {
    public static void main(String[] args) {
        Pitbull pit = new Pitbull();
        pit.setAverageLength(50);
        pit.move();
        System.out.println(pit.getPosition());
        System.out.println(pit.getAverageLength());
        pit.describe();
        System.out.println();
        System.out.println("================================================");
        Smartphone phone = new Smartphone();
        phone.setBrand("Samsung");
        phone.setPrice(3900000);
        phone.info();
        phone.move();
        System.out.println("=================================================");
        Car mobil = new Car(5, 170, "Black");
        System.out.println("Gear : " + mobil.getTotalForwardGear());
        System.out.println("Max Speed : " + mobil.getMaxSpeed());
        System.out.println("Warna : " + mobil.getColor());
        mobil.move();
        System.out.println();
    }
}
