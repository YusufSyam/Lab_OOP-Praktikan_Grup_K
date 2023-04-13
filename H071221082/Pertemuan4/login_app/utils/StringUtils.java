package Pertemuan4.login_app.utils;

public class StringUtils {
    public static String generateNickname(String fullName) {
        String[] nameParts = fullName.split(" ");

        if (nameParts.length == 1) {
            // Jika fullName hanya 1 kata maka nickName = fullName
            return fullName;
        } else {
            // Jika fullName lebih dari 1 kata maka nickName adalah kata kedua dari fullName
            return nameParts[1];
        }
    }
}