public class Snack{
    String merk;
    int harga;
    String rasa;

    public void merkSnack(String merk){
        this.merk = merk;   
    }
    public void hargaSnack(int harga){
        this.harga = harga;
    }
    public void rasaSnack(String rasa){
        this.rasa = rasa;
    }
    public void detailSnack(){
        System.out.println("Merk Snack : " + merk);
        System.out.println("Harga Snack : " + harga);
        System.out.println("Rasa Snack : " + rasa);
    }
    public static void main(String[] args) {
        Snack cemilan = new Snack();    
        cemilan.merkSnack("Taro");
        cemilan.hargaSnack(13_000);
        cemilan.rasaSnack("Gurih");
        cemilan.detailSnack();
    }
}