class Cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        return height * width * length;
    }
}

public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 20;
        cuboid.width = 10;
        cuboid.length = 22.5;
        
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}