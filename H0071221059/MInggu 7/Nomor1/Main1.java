package Nomor1;

class fighter extends Character{

    public fighter(String name, int attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public int attack() {
        return attackPower;
    }

    @Override
    public int attack(String attackType) {
        if(attackType.equals("melee")){
            return attackPower * 2;
        } else if(attackType.equals("ranged")){
            return attackPower;
        } else{
            throw new IllegalArgumentException("Invalid attack type bang");
        }
    }
}

class Mage extends Character{
    
    public Mage(String name, int attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public int attack() {
        return attackPower;
    }

    @Override
    public int attack(String attackType) {
        if(attackType.equals("fire")){
            return attackPower * 2;
        } else if(attackType.equals("frost")){
            return attackPower * 3;
        } else{
            throw new IllegalArgumentException("Invalid attack type bang");
        }
    }
}


public class Main1 {
    public static void main(String[] args) {
        Character[] characters = new Character[5];
        
        characters[0] = new fighter("Fighter 1", 10);
        characters[1] = new Mage("Mage 1", 25);
        characters[2] = new fighter("Fighter 2", 8);
        characters[3] = new Mage("Mage 2", 7);
        characters[4] = new fighter("Fighter 3", 27);

        for(Character character: characters) {
            printAttack(character);
        }
    }

    public static void printAttack(Character character){
        int attackPower = character.attack();
        System.out.println("Attack Info: ");
        System.out.println("Name: " + character.getName());
        System.out.println("attackPower: " + character.attack());
        System.out.println("Attack Power character mu: " + attackPower);
        System.out.println("-----------------------------------");
    }
} 