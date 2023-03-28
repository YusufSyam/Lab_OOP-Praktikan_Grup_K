public class klub {
    // atribut
    String nama ;
    int tahunBerdiri ;
    int jumlahUcl ;

    // Behavior
    public void info (){
        System.out.println("Klub " + nama);
        System.out.println("Tahun Berdiri " + tahunBerdiri);
        System.out.println("Jumlah Trofi UCL " + jumlahUcl);
    }
    // method
    public static void main(String[] args) {
        // membuat objek 
        klub klub1 = new klub();
        klub1.nama = "Real Madrid";
        klub1.tahunBerdiri = 1902;
        klub1.jumlahUcl = 14;
        
        // memanggil behavior 
        klub1.info();
    }
    
}
