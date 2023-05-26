package Nomor1;

// A. Buatlah class seperti class diagram diatas

// B. Buatlah 2 abstract method dengan nama attack() di class character yang
// mengembalikan nilai integer yang menunjukkan kekuatan serangan
// karakter tersebut dan tipe serangan yang dilakukan dengan ketentuan
// sebagai berikut :
// 1) method attack() pertama akan langsung me return attack power yang
// telah diberikan ke karakter pada saat instance
// 2) method attack() kedua menerima parameter attackType bertipe string
// yang mana akan mengembalikan attack power berdasarkan attackType
// yang diberikan, nah untuk class fighter terdapat dua jenis attackType yaitu
// “melee” dan “ranged” saat tipenya melee akan mengembalikan
// attackPower 2 kali lipat, dan saat tipenya “ranged” akan mengembalikan
// attackPower aslinya.
// Sedangkan untuk class Mage terdapat pula 2 attackType yaitu fire dan
// frost saat tipenya “frost” akan mengembalikan attackPower 2 kali lipat dan
// saat tipenya “fire” akan mengembalikan attackPower 3 kali lipat.

// C. Buatlah method printAttack(Character character) yang menerima objek
// Character dan mencetak informasi tentang serangan karakter tersebut
// dengan memanggil method attack(). perhatikan bahwa method ini
// menerapkan polimorfisme objek.

// D. Di kelas Main, buatlah array Character[] dengan ukuran 5 dan tambahkan
// objek Fighter, Mage, Fighter, Fighter, dan Mage ke dalamnya.

// E. Gunakan loop untuk mengiterasi array tersebut, lalu panggil method
// printAttack() untuk mencetak informasi tentang serangan dari setiap
// karakter.

abstract class Character {
    protected int attackPower;
    protected String name;
    
    public String getName(){
        return name;
    }

    public abstract int attack();
    public abstract int attack(String attackType);
}

