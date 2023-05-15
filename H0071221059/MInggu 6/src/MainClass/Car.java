package MainClass;

import InterfaceClass.moveAble;


class Car implements moveAble {
    protected int totalForwardGear;
    protected String color;
    protected int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed){
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void move(){
        System.out.println("Mobil sedang berakselerasi");
    }

    public void display(){
        System.out.println("Sekarang berada di " + this.totalForwardGear);
        System.out.println("Mobil berwaeran " + this.color);
        System.out.println("Berada di kecepetan " + this.maxSpeed + " Km/jam");
    }

}
