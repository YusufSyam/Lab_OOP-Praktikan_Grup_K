
public class Smartphone {
    
    private String namaProduk,chipSet;
    int ram,storage;
    int Battery;

    Smartphone(String namaProduk){
        this.namaProduk = namaProduk;
    }

    Smartphone(String namaProduk,String chipSet,int ram,int storage,int Battery){
        this.namaProduk = namaProduk;
        this.chipSet = chipSet;
        this.ram = ram;
        this.storage = storage;
        this.Battery = Battery;
    }

    void setNamaProduk(String s){
        namaProduk = s;
    }

    String getNamaProduk(){
        if(namaProduk.isEmpty()){
            System.out.println("set nama produk terlebih dahulu menggunakan method 'setNamaProduk()'");
        }
        return namaProduk;
    }
    
    void setChipSet(String s){
        chipSet = s;
    }

    void getChipSet(){
        if(chipSet.isEmpty()){
            System.out.println("set chipSet terlebih dahulu menggunakan method 'setChipSet()'");
        }
        System.out.println(chipSet);
    }

    void setRam(int s) {
        ram = s;
    }

    String getRam() {
        return ram + "GB";
    }
    
    void setStorage(int s) {
        storage = s;
    }

    String getStorage() {
        return storage + "GB";
    }

    String getSpesifikasi(){
        return String.format("Spesifikasi %s : \nchipset \t: %s\nRAM \t\t: %d GB\nPeyimpanan \t: %d GB", namaProduk,chipSet,ram,storage);
    }


    int charge(int minute){
        if(this.Battery + minute <= 100){
            this.Battery += minute;
        }else{
            this.Battery = 100;
        }
        return this.Battery;
    }

    int played(int minute){
        this.Battery -= (minute/5);
        if(this.Battery <= 0){
            this.Battery = 0; 
        } 
        return this.Battery;
    }

}

class Main {
    public static void main(String[] args) {
        Smartphone samsung = new Smartphone("samsung","Qualcomm Snapdragon 695 5G",6,128,20);
        // Smartphone samsul = new Smartphone("samasul");

        // samsung.namaProduk = "samsung";
        // samsung.ba

        // System.out.println(samsung.getNamaProduk());

        System.out.println(samsung.getSpesifikasi());
        System.out.println(samsung.charge(10));
        System.out.println(samsung.played(1000));
        
    }
}