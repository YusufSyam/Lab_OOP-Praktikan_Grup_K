abstract class Car implements Moveble {
    protected int totalForwardGear;
    protected String color;
    protected int maxSpeed;

    public abstract void move();
}

class Alphard extends Car {
    public Alphard(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    
    @Override
    public void move() {
       System.out.println("Total Forward Gear\t: " + totalForwardGear);
       System.out.println("Color\t\t\t: " + color);
       System.out.println("Max Speed\t\t: " + maxSpeed + " " + "Km/Jam" + "\n");
       System.out.println("Mobil Sedang Berakselerasi");
    }

}