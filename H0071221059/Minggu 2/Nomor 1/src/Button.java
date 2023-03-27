public class Button {
    //Buatlah Sebuah Kelas sederhana beserta atribut dan
    //behaviornya masing-masing, kemudian panggil di main
    //method dan tambahkan nilai pada salah satu attribute dan
    //panggil salah satu behavior.
    //Kelasnya harus berbeda untuk tiap orang dan tidak
    //digunakan di soal praktikum dibawah (Person, Product,
    //Cubold, Mahasiswa)
    private String label;

    public Button(String label) {
        this.label = label;
    }

    public void onClick() {
        System.out.println("Button " + label + " is clicked.");
    }

    public static void main(String[] args) {
        Button myButton = new Button("Close");
        myButton.onClick();
    }
}


