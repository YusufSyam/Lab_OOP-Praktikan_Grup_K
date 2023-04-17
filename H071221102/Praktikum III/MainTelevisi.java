class Televisi {
       String merk; 
       int channel;
       Tipe tipe;

    //    constructor tanpa parameter
       public Televisi () {
        merk = "";
        channel = 0;
        tipe = new Tipe();
       }

    //    constructor dengan parameter
       public Televisi (String merk, int channel, Tipe tipe) {
        this.merk = merk;
        this.channel = channel;
        this.tipe = tipe;
       }

    //    membuat setter dan getter
       public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public Tipe getTipe() {
        return tipe;
    }

    public void setTipe(Tipe tipe) {
        this.tipe = tipe;
    }

    // behaviour
    public void nyalakan() {
        System.out.println("Menyala TV " + merk);
    }

    public String mengecekGambar () {
        String siaran = "";
        if (channel == 1) {
            siaran = "[Kompas TV]";
        } else if (channel == 2) {
            siaran = "[ANTV]";
        } else if (channel == 3) {
            siaran = "[Indosiar]";
        } else if (channel == 4) {
            siaran = "[MNCTV]";
        } else if (channel == 5) {
            siaran = "[RCTI]";
        } else if (channel == 6) {
            siaran = "[SCTV]";
        } else if (channel == 7) {
            siaran = "[TVRI]";
        } else if (channel == 8) {
            siaran = "[METRO TV]";
        } else if (channel == 9) {
            siaran = "[TRANS 7]";
        } else if (channel == 10) {
            siaran = "[GLOBAL TV]";
        } else if (channel > 10) {
            siaran = "No Signal";
        }
        
        return siaran;
    }  
    
    public void tampilkanHarga() {
        System.out.println("Tipe, " + tipe.getTipe() + "Harga " + tipe.getHarga());
    }
}

class Tipe {
    String tipe;
    int harga;

    public Tipe() {
        tipe = "";
        harga = 0;
    }

    // constructor
    public Tipe(String tipe, int harga) {
        this.tipe = tipe;
        this.harga = harga;    
    }
    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }    
}

public class MainTelevisi {
    public static void main(String[] args) {
        // Membuat objek Tipe
        Tipe tipe1 = new Tipe("A05 ", 5000000);

        // Membuat objek televisi dengan konstruktor tanpa parameter
        Televisi tv1 = new Televisi();
        tv1.setMerk("SAMSUNG");
        tv1.setChannel(11);
        tv1.setTipe(tipe1);

        // Menampilkan informasi Televisi
        System.out.println("Televisi " + tv1.getMerk());
        tv1.tampilkanHarga();
        System.out.println("Channel " + tv1.getChannel());
        tv1.mengecekGambar();
        System.out.println(tv1.mengecekGambar());
        tv1.nyalakan();
        System.out.println();
    }
}