package liveCoding;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("=".repeat(20));
        car.setBrand("Ferarri");
        car.setModel("Sport");
        car.setPrice(1000000000);
        car.setYear(2023);
        car.setSold(true);

        car.displayInfo();

        Car car2 = new Car("Honda", "Yaris",2023, 100000000, true);
        System.out.println("=".repeat(20));
        System.out.println("Brand : " + car2.getBrand());
        System.out.println("Model : " + car2.getModel());
        System.out.println("Year : " + car2.getYear());
        System.out.println("Price : " + car2.getPrice());
        System.out.println("Sold : " + car2.isSold);
        System.out.println("=".repeat(20));

        Utils.displaySelfData();
    }
}
