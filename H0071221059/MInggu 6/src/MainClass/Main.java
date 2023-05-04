package MainClass;


public class Main {
    public static void main(String[] args) {

        Pitbull dog1 = new Pitbull(0, 50);
        System.out.println("Pitbull");
        dog1.describe();
        dog1.move();
        System.out.println("Anjing pitbull bergerak sejauh " + dog1.position + " langkah");
    

        Smartphone hp1 = new Smartphone(2000, "Oppo");
        System.out.println();
        hp1.move();
        hp1.display();

        Car car1 = new Car(2, "Blue", 200);
        System.out.println();
        car1.move();
        car1.display();

    }
}
