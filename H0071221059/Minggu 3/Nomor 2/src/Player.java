public class Player {
    private String name;
    private int hp;
    private int attackPower;
    private int defense;

    //lengkapi
    public Player(String name, int attackPower, int defense) {
        this.name = name;
        this.hp = 100;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public Player (String name, int defense){
        this.name = name;
        this.defense = defense;
        this.hp = 100;
    }

    public void getDamage(Player enemy) {
        hp = hp - Math.max(0, enemy.getAttackPower() - defense);
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void status() {
        System.out.println(name + " Status");
        System.out.println("HP = " + hp);
        System.out.println("Attack = " + attackPower);
        System.out.println("Defense = " + defense + "\n");
    }
    public int getAttackPower() {
        return attackPower;
        }

    public static void main(String[] args) {
        Player player1 = new Player ("Mino", 30, 15);
        Player player2 = new Player("Hilda", 10);

        player2.setAttackPower(35);

       // player2.getDamage(player1);
        player1.getDamage(player2);

        player1.status();
        player2.status();
    }
 }
