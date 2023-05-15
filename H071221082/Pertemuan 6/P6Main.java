interface Dog {
    int getPosition();
    int getAverageLength();
    void move();
    void describe();
}

abstract class Technology {
    int price;
    String brand;
    abstract void move();
    
    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
}

class Pitbull implements Dog {
    private int position;
    private int averageLength;
    
    public Pitbull(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
    
    @Override
    public int getPosition() {
        return position;
    }
    
    @Override
    public int getAverageLength() {
        return averageLength;
    }

    @Override
    public void move() {
        position += 3;
    }

    @Override
    public void describe() {
        System.out.println("\nAnjing pitbull memiliki tubuh yang berotot dan gagah. Selain itu, mereka juga memiliki fisik dan mental yang kuat. Mereka juga dapat menahan rasa sakit yang luar biasa seperti luka berat. Wajar saja kalau pitbull sering menjadi anjing petarung. Anjing ini juga dapat melindungi majikannya dari bahaya. Mereka akan menyerang siapa pun yang menyakiti majikannya.\n");
    }
    
}

class SiberianHusky implements Dog {
    private int position;
    private int averageLength;
    
    public SiberianHusky(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
    
    @Override
    public int getPosition() {
        return position;
    }
    
    @Override
    public int getAverageLength() {
        return averageLength;
    }
    
    @Override
    public void move() {
        position += 2;
    }
    
    @Override
    public void describe() {
        System.out.println("\nSecara penampilan, siberian husky adalah anjing tampan yang gagah. Tubuhnya berukuran sedang dengan tinggi rata-rata 50-60 cm (betina) dan 54-60 cm (jantan). Berat rata-ratanya sekitar 16-22,5 kg (betina) dan 16-27 kg (jantan). Sementara bulunya tebal dan panjang. Warnanya pun cukup beragam, seperti abu-abu kehitaman, hitam, belang, putih, dan cokelat kemerahan.\n");
    }
}

class Bulldog implements Dog {
    private int position;
    private int averageLength;
    
    public Bulldog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
    
    @Override
    public int getPosition() {
        return position;
    }

    @Override
    public int getAverageLength() {
        return averageLength;
    }
    
    @Override
    public void move() {
        position += 1;
    }
    
    @Override
    public void describe() {
        System.out.println("\nPenampilan fisik pada ras Bulldog ini memiliki ciri khas lipatan kulit yang berada di sekitar mata. Moncong berukuran pendek dan lipatan dari beberapa bagian di sekitar hidung juga menjadi karakter fisik utama pada Bulldog. Ras anjing Bulldog memiliki gigi yang cukup runcing untuk usia dewasa. Bentuk gigi runcing ini juga akan menyesuaikan sebagian dari bentuk mulut.\n");
    }
}

class GermanShepherd implements Dog {
    private int position;
    private int averageLength;
    
    public GermanShepherd(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
    
    @Override
    public int getPosition() {
        return position;
    }
    
    @Override
    public int getAverageLength() {
        return averageLength;
    }
    
    @Override
    public void move() {
        position += 3;
    }
    
    @Override
    public void describe() {
        System.out.println("\nAnjing German Stepherd memiliki penampilan seperti anjing yang berotot dan waspada. Tinggi badan ideal untuk anjing jantan dewasa adalah 63cm dan untuk betinanya 58cm dengan kisaran beratnya adalah 30-36kg.\n");
    }
}

class Smartphone extends Technology {
    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }
    
    @Override
    public void move() {
        System.out.println("\nSmartphone berpindah");
    }
}

class Car extends Technology {
    private int totalForwardGear;
    private String color;
    private int maxSpeed;
    
    public Car(int price, String brand, int totalForwardGear, String color, int maxSpeed) {
        this.price = price;
        this.brand = brand;
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public int getTotalForwardGear() {
        return totalForwardGear;
    }
    public String getColor() {
        return color;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("\nMobil sedang berakselerasi");
    }
}

class P6Main {
    public static void main(String[] args) {
        GermanShepherd germanShepherd = new GermanShepherd(0, 60);
        germanShepherd.move();
        germanShepherd.describe();
        System.out.println("German Shepherd position: " + germanShepherd.getPosition());

        Smartphone smartphone = new Smartphone(2400000, "Redmi Note 10");
        smartphone.move();

        Car car = new Car(700000000, "BMW", 7, "Red", 210);
        car.move();
    }
}