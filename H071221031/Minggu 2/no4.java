class Cuboid {
    double height;
    double width;
    double length;

    // membuat rumus mencari volume
    double getVolume(){
       return height * width * length ;
    }
}

public class no4 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 10;
        cuboid.width = 10;
        cuboid.length = 45;

        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
