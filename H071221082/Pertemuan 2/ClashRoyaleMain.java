public class ClashRoyaleMain {
    public static void main(String[] args) {
        ClashRoyale karakter = new ClashRoyale("pekka");
        if (karakter.getName() == "knight"){
            karakter.knight();
        } else if (karakter.getName() == "pekka"){
            karakter.pekka();
        } else if (karakter.getName() == "hog rider"){
            karakter.hogRider();
        }
    }
}