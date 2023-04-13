public class Film {
    private String title;
    private int duration;
    private String director;
    private String genre;
    private String synopsis;
    
    public Film() {

    }
    public static void main(String[] args){
        Film film1 = new Film();
        film1.setTitle("John Wick");
        film1.setDuration(101);
        film1.setDirector("Chad Stahelski");
        film1.setGenre("Action");
        film1.setSynopsis("John Wick, mantan pembunuh bayaran, berduka atas kematian istrinya. Tapi, ia terpaksa kembali ke dunia hitam setelah kelompok gangster Rusia mencuri mobil dan membunuh anak anjing warisan istrinya.");        
        film1.displayInfo();

        Film film2 = new Film("Parasite", 132, "Bong Joon-ho", "Thriller", "Keluarga Ki-taek beranggotakan empat orang pengangguran dengan masa depan suram menanti mereka. Suatu hari Ki-woo anak laki-laki tertua direkomendasikan oleh sahabatnya yang merupakan seorang mahasiswa dari universitas bergengsi agar Ki-woo menjadi guru les yang dibayar mahal dan membuka secercah harapan penghasilan tetap. Dengan penuh restu serta harapan besar dari keluarga, Ki-woo menuju ke rumah keluarga Park untuk wawancara. Setibanya di rumah Mr. Park pemilik perusahaan IT global, Ki-woo bertemu dengan Yeon-kyo, wanita muda yang cantik di rumah itu. Setelah pertemuan itu, serangkaian kejadian dimulai.");

        System.out.println("\nJudul       : " + film2.getTitle());
        System.out.println("Durasi      : " + film2.getDuration() + " menit");
        System.out.println("Director    : " + film2.getDirector());
        System.out.println("Genre       : " + film2.getGenre());
        System.out.println("Sinopsis    : " + film2.getSynopsis());

        SelfUtils.displaySelfData();
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void displayInfo(){
        System.out.println("Judul       : " + title);
        System.out.println("Durasi      : " + duration + " menit");
        System.out.println("Director    : " + director);
        System.out.println("Genre       : " + genre);
        System.out.println("Sinopsis    : " + synopsis);
    }
    
    public Film(String title, int duration, String director, String genre, String synopsis){
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.genre = genre;
        this.synopsis = synopsis;

    }
    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }
    public String getDirector() {
        return director;
    }
    public String getGenre() {
        return genre;
    }
    public String getSynopsis() {
        return synopsis;
    }

}