import java.util.ArrayList;

class MainCharacter {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>(5);
        Fighter balmond = new Fighter("Balmond", 12);  characters.add(balmond);
        Mage aurora = new Mage("Aurora", 8); characters.add(aurora);
        Fighter alucard = new Fighter("Alucard", 8); characters.add(alucard);
        Fighter zilong = new Fighter("Zilong", 8); characters.add(zilong);
        Mage eudora = new Mage("Eudora", 9); characters.add(eudora);

        for (int i = 0; i < characters.size(); i++) {
            /* digunakan loop for yang akan berjalan sebanyak ukuran dari list "characters".
             * setiap iterasi dari loop, variabel i akan di-increment atau ditambahkan nilai 1. */

            Character character = characters.get(i);
            /*  kemudian, pada setiap iterasi, loop akan mengambil objek karakter pada indeks i 
             * menggunakan method get() pada list characters dengan parameter indeks i. objek tsb
             * kemudian disimpan dalam variabel "character" dnegan tipe data "Character". 
            */
            
            character.printAttack(character);
            //method "printAttack()" akan memanggil suatu aksi atau penggunaan kemampuan serangan dari karakter
        }
    }
}