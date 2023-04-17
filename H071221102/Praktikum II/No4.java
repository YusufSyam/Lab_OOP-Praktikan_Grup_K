class Cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        return height * width * length;
    }
}

public class No4 {
    public static void main(String[] args) {
        Cuboid segitiga = new Cuboid();
        segitiga.height = 20;
        segitiga.width = 10;
        segitiga.length = 22.5;

        System.out.printf("Volume = %.2f", segitiga.getVolume());
    }
}
