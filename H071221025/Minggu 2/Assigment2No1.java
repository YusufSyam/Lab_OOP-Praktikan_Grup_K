public class Assigment2No1 {
    public class Aktor {
        String nama; //atribut
        String jenisKelamin;
        int age;
        String[] filmTerkenal;
        
        //construktor
        public Aktor(String name, String jeniskelamin, int usia, String[] filmterkenal) {
            nama = name;
            jenisKelamin = jeniskelamin;
            age = usia;
            filmTerkenal = filmterkenal;
        }
        //behavior
        public void tampilkanInfo() { //void itu tidak mengembalikan nilai
            System.out.println("Nama: " + nama);
            System.out.println("Jenis Kelamin: " + jenisKelamin);
            System.out.println("Usia: " + age);
            System.out.println("Film Terkenal: ");
            for (String film : filmTerkenal) {
                System.out.println("- " + film);
            }
        }
}
        public static void main(String[] args) {
            Assigment2No1 no1 = new Assigment2No1();
            String[] filmTerkenal = {"Dilwale", "Mohabatein", "Pathan"};
            Aktor aktor1 = no1.new Aktor("Shahrukh Khan", "Laki-laki", 57, filmTerkenal);
            aktor1.tampilkanInfo();
        }
    }