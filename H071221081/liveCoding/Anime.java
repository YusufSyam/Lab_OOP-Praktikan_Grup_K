
public class Anime {
    String title,synopsis,studio;
    int episodeCount;
    String[] genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getGenre() {
        return String.join(",",genre);
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }

    public int getEpisodeCount() {
        return episodeCount;
    }

    public void setEpisodeCount(int episodeCount) {
        this.episodeCount = episodeCount;
    }

    public Anime(){}

    public Anime(String title,int episodeCount, String studio, String[] genre, String synopsis) {
        this.title = title;
        this.synopsis = synopsis;
        this.studio = studio;
        this.genre = genre;
        this.episodeCount = episodeCount;
    }


    public void displayInfo(){
        System.out.printf("%s\n%d\n%s\n%s\n%s\n\n" ,getTitle(),getEpisodeCount(),getStudio(),getGenre(),getSynopsis());
    }

}
