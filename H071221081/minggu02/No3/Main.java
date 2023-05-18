
public class Main {
    public static void main(String[] args) {
        Produk beras = new Produk("01", "beras", 60000, 0);
        System.out.println(beras.info());
        System.out.println(beras.checkStok());   
    }
}

class Produk{
    String ID,nama;
    int harga,stok;

    Produk(String ID, String nama, int harga, int stok){
        this.ID = ID;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    String checkStok(){

        if(stok > 0){
            return String.format("tersedia %d", stok);
        }
        return "stok tidak tersedia";
    }
    
    String info(){
        return String.format("barang : %s \nnama : %s\nharga : Rp.%d\nstok : %d", ID,nama,harga,stok);
    }

}

// class Toko{
//     Produk[] produk;

//     void checkAll(){
//         for (int i = 0; i < produk.length; i++) {
            
//         }
//     }


// }
