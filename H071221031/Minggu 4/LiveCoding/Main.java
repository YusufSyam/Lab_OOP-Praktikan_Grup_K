package LiveCoding;
public class Main{
    public static void main(String[] args) {
        Song song1 = new Song();

        song1.setTitle("Ho!");
        song1.setArtist("Twice");
        song1.setAlbum("Whats if Love");
        song1.setYear(2018);
        song1.setGenre("KPOP");
        song1.displayInfo();

        Selfutils.displaySelfInfo();
    }
}
