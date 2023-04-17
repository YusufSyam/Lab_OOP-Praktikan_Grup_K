package NO2;

class Player {
    private String name;
    private int hp;
    private int attackPower;
    private int defense;

    public Player(String name, int hp, int defense) {
        this.name = name;
        this.hp = hp;
        this.defense = defense;
    }

    public Player(String name, int hp, int attackPower, int defense) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public void getDamage(Player enemy) {
        hp = hp - Math.max(0, enemy.getAttackPower() - defense);
    }

    public void status() {
        System.out.println(name + " Status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower + "\n");
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}


public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Mino", 80, 15, 30);
        Player player2 = new Player("Hilda", 100, 35, 10);
        player1.status();
        player2.status();
    }
}