package liveCoding;

public class Main2 {
    public static void main(String[] args) { //3. buat kelas Main
        // 4. objek constructor kosong
        Country country1 = new Country();

        // 5. method setter untuk memberikan nilai kesemua attribut
        country1.setName("Indonesia");
        country1.setCapital("Jakarta");
        country1.setHeadOfState("Jokowi widodo");
        country1.setPopulation(14000000);
        country1.setLanguage("Bahasa Indonesia");

        country1.displayInfo(); //7. panggil method displayInfo()

        // 8.Buat instance (objek) Country kedua
        Country country2 = new Country("India", "Delhi", "Ram", 1000000, "Hindi");

        // 9.Tampilkan informasi menggunakan method getter
        System.out.println("-".repeat(45));
        System.out.println("Name\t\t\t: " + country2.getName());
        System.out.println("Capital\t\t\t: " +country2.getCapital());
        System.out.println("Head Of State\t\t: " +country2.getHeadOfState());
        System.out.println("Population\t\t: " +country2.getPopulation());
        System.out.println("Language\t\t: " +country2.getLanguage());
        System.out.println("-".repeat(45));

        // 12.Memanggil method displaySelfData() dari kelas SelfUtils
        SelfUtils.displaySelfData();
    }
}
