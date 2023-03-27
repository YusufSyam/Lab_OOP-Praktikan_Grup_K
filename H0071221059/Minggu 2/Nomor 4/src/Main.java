class Cuboid {
    double height;
    double width;
    double lenght;
    double getVolume(){
        //lengkapi
        return height * width * lenght;
    }
}

public class Main {
    public static void main(String[] args) {
        //lengkapi
        Cuboid cuboid = new Cuboid();
        cuboid.height = 45.0;
        cuboid.width = 10.0;
        cuboid.lenght = 10.0;

        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}