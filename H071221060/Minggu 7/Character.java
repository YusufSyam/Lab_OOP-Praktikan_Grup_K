abstract class Character {
    protected String name;
    protected int attackPower;

    public Character(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public String getName() {
        return name;
    }

    public abstract int attack();
    //attack() : method ini mengembalikan tipe data integer, namun tidak memiliki parameter
    public abstract int attack(String attackType);
    //attack(String attackType) : method abstract yang mengembalikan tipe data integer dan memiliki satu parameter bertipe data string

    

    public void printAttack(Character character) {
        /* method printAttack ini akan akan mencetak serangan yang dilakukan oleh objek "Character" tersebut 
        dengan memanggil method attack() atau attack(String attackType) pada objek "Character" tersebut  */
        
        System.out.println("=".repeat(40));
        System.out.println(character.getName() + " - " + character.getClass().getSimpleName());
        /* method getClass() dan getSimpleName() merupakan method bawaan atau method
         * tetap di java. 
         * 
         * method getClass() digunakan untuk mendapatkan informasi kelas suatu objek. hasil yg diberikan
         * berupa objek instance dari class Character
         * 
         * method getSimpleName () digunakan untuk mendapatkan nama kelas dari suatu objek dalam bentuk string.
         * nama kelas ini merupakan nama class tanpa adanya package.
         */
            System.out.println("Normal Attack : " + character.attack());
            //character.attack() digunakan untuk memanggil method attack() pada objek character. 
            //method ini diduga mengembalikan hasil serangan normal dari objek character tersebut. 
            // kemudian hasilnya dicetak ke layar. 

        if (character instanceof Fighter) {
            /* jika objek "character" adalah instance dari kelas "Fighter", maka method ini
             * akan mencetak serangan "Melee" dan "Ranged" */
            System.out.println("Melee         : " + character.attack("melee"));
            System.out.println("Ranged        : " + character.attack("ranged"));

        } else if (character instanceof Mage) {
            /* sedangkan jika objek "character" adalah isntance dari kelas "Mage", method ini 
             * akan mencetak serangan "Fire" dan "Frost"
             */
            System.out.println("Fire         : " + character.attack("fire"));
            System.out.println("Frost        : " + character.attack("frost"));
        }
    }
}