abstract class Dog {
   int position;
   int averageLength;

   public Dog(int position, int averageLength) {
    this.position = position;
    this.averageLength = averageLength;
}

    abstract void describe();

    abstract void move();
}

class Pitbull extends Dog{
    public Pitbull(int position, int averageLength){
        super(position, averageLength);
    }

    //describe() yang menampilkan deskripsi khusus dari jenis Dog yang diwakilinya
    @Override
    public void describe(){
        System.out.println("Pitbull adalah anjing yang memiliki otot yang kekar");
    }

    @Override
    void move() {
       this.position += 3;
    }
}

class SiberianHusky extends Dog{
    public SiberianHusky(int position, int averageLength){
        super(position, averageLength);
    }

    //describe() yang menampilkan deskripsi khusus dari jenis dog yang diwakilinya
    @Override
    public void describe(){
        System.out.println("SiberianHusky adalah anjing yang memiliki bulu yang tebal");
    }

    @Override
    void move() {
        this.position += 2; 
    }
}

class Bulldog extends Dog{
    public Bulldog(int position, int averageLength){
        super(position, averageLength);
    }

    //describe() yang menampilkan deskripsi khusus dari jenis dog yang diwakilinya
    @Override
    public void describe(){
        System.out.println("Bulldog adalah anjing yang memiliki tubuh lebar,besar dan mempunyai kaki pendek");
    }

    @Override
    void move() {
        this.position += 1;
    }
}

class GermanShepherd extends Dog{
    public GermanShepherd(int position, int averageLength){
        super(position, averageLength);
    }

    //describe() yang menampilkan deskripsi khusus dari jenis dog yang diwakilinya
    @Override
    public void describe(){
        System.out.println("GermanShepherd adalah anjing yang memilikikepala yang proporsional, telinga yang tegak, dan mata yang cokelat gelap. Bulu German Shepherd biasanya lurus dan tebal, dengan warna yang bervariasi dari hitam, cokelat, dan abu-abu.");
    }
    
    @Override
    void move() {
        this.position += 3;
    }
}