package liveCoding;

public class Car{
    String brand, model;
    int year, price;
    boolean isSold;

    
    public Car(String brand, String model, int year, int price, boolean isSold){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isSold = isSold;
    }

    public Car(){}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean isSold) {
        this.isSold = isSold;
    }

    public void displayInfo(){
        System.out.println("Nama Brand " + brand);
        System.out.println("Nama Model " + model);
        System.out.println("Tahun keluar " + year);
        System.out.println("Harga mobil " + price);
        System.out.println("Terjual " + isSold);
    }
}