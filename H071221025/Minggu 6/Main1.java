public class Main1 {
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull(15, 3); 

        System.out.println("=".repeat(25));
        System.out.println(" ".repeat(8) + "~Pitbull~");
        System.out.println("=".repeat(25));
        pitbull.describe();
        int posisiLama = pitbull.position;
        pitbull.move();
        //menampilkan average leght pada pitbull
        System.out.println("Average Leght : " + pitbull.averageLength);
        //menampilkan posisi lama
        System.out.println("Pitbull posisi lama : " + posisiLama);
        // menampilkan posisi setelah gerakan
        System.out.println("Pitbull posisi baru : " + pitbull.position);
        System.out.println("=".repeat(25));

        Smartphone smartphone = new Smartphone(10_000, "Oppo");
        System.out.println(" ".repeat(6) + "~Smartphone~");
        smartphone.move();
        System.out.println("Brand smartphone: " + smartphone.brand);
        System.out.println("Harga smartphone: " + smartphone.price);
        System.out.println("=".repeat(25));

        Car car = new Car(10, "Blue", 70);
        System.out.println(" ".repeat(10)+ "~Car~");
        car.move();
        System.out.println("Warna Mobil : " + car.color);
        System.out.println("Kecepatan Maksimal Mobil : " + car.maxSpeed);
        System.out.println("Car total forward gear : " + car.totalForwardGear);
        System.out.println("=".repeat(25));
                
    }
}
