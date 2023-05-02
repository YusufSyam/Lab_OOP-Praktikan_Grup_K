abstract class Dog{
    protected int position;
    protected int averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
    
    abstract void move();

    abstract void describe();
}

class Pitbull extends Dog{

    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }
    @Override
    void move (){
        this.position += 3;
    }
    @Override
    void describe() {
        System.out.println("Pitbull memiliki rahang yang kuat sehingga jika ia menggigit, akan sangat sulit melepasnya karena gigitannya bersifat mengunci.");
    }
}

class SiberianHusky extends Dog{

    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move (){
        this.position += 2;
    }

    @Override
    void describe() {
        System.out.println("bulunya tebal dan panjang. Warnanya pun cukup beragam, seperti abu-abu kehitaman, hitam, belang, putih, dan cokelat kemerahan");
    }
}

class Bulldog extends Dog {

    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move (){
        this.position += 1;
    }
    @Override
    void describe() {
        System.out.println("memiliki bentuk mata bulat, hidung berwarna hitam dengan lubang hidung berukuran besar. Sedangkan, untuk telinganya berbentuk seperti bunga mawar yang tipis dan kecil");
    }
}

class GermanShepherd extends Dog{

    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move (){
        this.position += 3;
    }
    @Override
    void describe() {
        System.out.println("Struktur tubuh yang agak memanjang, proporsional, berotot, dan memiliki struktur tulang yang solid. Bobot antara 34-43kg. Tinggi kisaran 57,5-62,5 cm. Hidung umumnya berwarna hitam kadang ada juga berwarna biru atau merah hati");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull(0, 58);
        pitbull.describe();
        pitbull.move();
        System.out.println("Posisi Pitbull :" + pitbull.position);

        SiberianHusky siberianhusky = new SiberianHusky(0, 38);
        siberianhusky.describe();
        siberianhusky.move();
        System.out.println("Posisi Siberian Husky :" + siberianhusky.position);

        Bulldog bulldog = new Bulldog(0, 40);
        bulldog.describe();
        bulldog.move();
        System.out.println("Posisi Bulldog :" + bulldog.position);

        GermanShepherd germanshepherd = new GermanShepherd(0, 37);
        germanshepherd.describe();
        germanshepherd.move();
        System.out.println("Posisi German Shepherd:" + germanshepherd.position);
    }
}