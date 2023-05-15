package LiveCoding;

public class Song {
    private String title;
    private String Artist;
    private String album;
    private int year;
    private String genre;

    public Song(){
        
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return Artist;
    }
    public void setArtist(String artist) {
        Artist = artist;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void displayInfo(){
        System.out.println("Title : " +title);
        System.out.println("Artist : " +Artist);
        System.out.println("Album : " +album);
        System.out.println("Year : " +year);
        System.out.println("Genre : " +genre);
    }


}
