package MainClass;

import InterfaceClass.moveAble;

class Smartphone implements moveAble {
    protected int price;
    protected String brand;

    public Smartphone (int price, String brand){
        this.price = price;
        this.brand = brand;
    }

    public void move(){
        System.out.println("Smartphone berpindah");
    }

    public void display(){
        System.out.println("smartphone merek " + this.brand);
        System.out.println("harga " + this.brand + " adalah " + this.price);
    }
}
