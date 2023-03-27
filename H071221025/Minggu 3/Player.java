public class Player {
    private String name;
    private int hp;
    private int attackPower;
    private int defense;

    //konstruktor
    public Player() {}

    public void getDemage(Player enemy) {
        this.hp = this.hp-Math.abs(enemy.getAttackPower()-defense);
    }

    //lngkpi

    public Player(String name, int attackPower, int defense) {
        this.name = name;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public Player(String name, int defense) {
        this.name = name;
        this.defense = defense;

    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    
    public void status() {
        System.out.println(name + " status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower + "\n");
    }

    int getAttackPower() {
        return attackPower;
    }
}
