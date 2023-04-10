
public class No1 {
    public static void main(String[] args) {
        String nim = "H071221050";
        // * memisahkan 3 angka terakhir nim
        int lastNumber = Integer.parseInt(nim.substring(7));
        // * membagi 3 angka terakhir apabila menyisakan 0 maka siswa akan mendapatkan soal no 7
        int questionNumber = (lastNumber % 7 == 0) ? 7 : lastNumber % 7;
        System.out.println(questionNumber);
    }
}
