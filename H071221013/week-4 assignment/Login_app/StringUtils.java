package Login_app;

public class StringUtils {
    public static String getNamaPanggilan(String NamaLengkap) {
        String[] names = NamaLengkap.split(" ");
        if (names.length == 0) {
            return NamaLengkap;
        } else {
            return names[1];
        }
    }
}
