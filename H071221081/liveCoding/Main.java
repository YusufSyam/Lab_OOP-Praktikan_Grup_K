import tugas_praktik.liveCoding.Anime;
import tugas_praktik.liveCoding.SelfUtil;

public class Main {
    public static void main(String[] args) {
        Anime danMachi = new Anime();
        danMachi.setTitle("Dungeon ni Deai wo Motomeru no wa Machigatteiru Darou ka");
        danMachi.setSynopsis("Life in the bustling city of Orario is never dull, especially for Bell Cranel, a naïve young man who hopes to become the greatest adventurer in the land. After a chance encounter with the lonely goddess, Hestia, his dreams become a little closer to reality. With her support, Bell embarks on a fantastic quest as he ventures deep within the city's monster-filled catacombs, known only as the 'Dungeon' Death lurks around every corner in the cavernous depths of this terrifying labyrinth, and a mysterious power moves amidst the shadows.\nEven on the surface, survival is a hard-earned privilege. Indeed, nothing is ever certain in a world where gods and humans live and work together, especially when they often struggle to get along. One thing is for sure, though: a myriad of blunders, triumphs and friendships awaits the dauntlessly optimistic protagonist of this herculean tale.");
        danMachi.setStudio("Finished Airing");
        danMachi.setEpisodeCount(13);
        danMachi.setGenre(new String[] {"Action","Adventure","Fantasy"});
        danMachi.displayInfo();

        Anime konosuba = new Anime("Kono Subarashii Sekai ni Bakuen wo!",21,"asdadas",new String[] {"Comedy", "Fantasy"},"Crimson Magic Clan members Megumin and Yunyun are at the top of their class, but they still have a lot to learn. Yunyun's begun learning advanced magic, but Megumin has gone down a different path-the path of explosion magic! Despite being warned of its limited usefulness, Megumin believes explosion magic is the way for her to become a great, voluptuous wizard, and she won't be convinced otherwise!");
        konosuba.displayInfo();

        SelfUtil.displaySelfData();
    }
}
