class Cuboid {
    double height;
    double widht;
    double length;    
    double getVolume() {   
        return height * widht * length;  
    }
}
public class Main {
    public static void main(String[] args){
        Cuboid cuboid = new Cuboid();
        cuboid.height = 15.0;
        cuboid.widht = 20.0;
        cuboid.length = 15.0;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}