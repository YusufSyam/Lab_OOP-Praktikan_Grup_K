public class Car implements Move {
    int maxSpeed, totalForwardGear;
    String color;

    public Car(int maxSpeed, int totalForwardGear, String color){
        this.maxSpeed = maxSpeed;
        this.totalForwardGear = totalForwardGear;
        this.color = color;
    }

    @Override
    public void movement() {
        System.out.println("Mobil sedang berakselerasi");
    }

}
