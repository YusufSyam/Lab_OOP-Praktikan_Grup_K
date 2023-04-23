package login_app;

public class StringUtils {
    public static String getNickName(String fullName) {
        String[] names = fullName.split(" "); // digunakan untuk memecah sebuah string menjadi beberapa bagian dengan menggunakan karakter spasi 
        if (names.length == 1) {   //method akan mengembalikan nilai parameter fullName itu sendiri sebagai nickname.
            return fullName;
        } else {
            return names[1]; //method akan mengembalikan nilai elemen ke-2 (indeks ke-1) sebagai nickname.
        }
    }
}
    /*
     * Buatlah sebuah method static yang akan
     * mengembalikan nickName berdasarkan fullName yang diberikan
     * aturan pembuatan nickName adalah :
     * 1. Jika fullName hanya 1 kata maka nickName = fullName
     * (ex: FullName = Agus, maka NickName = Agus)
     * 2. Jika fullName lebih dari 1 kata maka nickName adalah kata kedua dari
     * fullName
     * (ex: FullName = Eurico Devon, maka NickName = Devon)
     */