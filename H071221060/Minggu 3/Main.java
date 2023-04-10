class Player{
    private String name;
    private int hp;
    private int attackPower;
    private int defense;
    public Player(){}
    public void getDamage(Player enemy) {
    hp= hp-Math.abs(enemy.getAttackPower()-defense);
    }
    // Lengkapi
    public Player(String name, int hp ){
        this.name = name;
        this.hp = hp;
        this.attackPower = 0;
        this.defense = 0;
    }

    public Player(String name, int hp, int defense, int attackPower){
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public Player(String name, int hp, int defense){
        this.name = name;
        this.hp = hp;
        this.defense = defense;
    }

//     public void setName (String name){
//         this.name = name;
//     }

//     public void setHp(int hp){
//         this.hp = hp;
//     }

//     public void setDefense(int defense){
//         this.defense = defense;
//     }

    public void setAttackPower(int attackPower){
    this.attackPower = attackPower;
}
// public String getName(){
//     return name;
// }

// public int getHp(){
//     return hp;
// }

// public int getDefense(){
//     return defense;
// }


    
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

    
public class Main {
    public static void main(String [] args) {
    Player player1= new Player("Mino", 100, 15, 30);
    Player player2= new Player("Hilda", 100, 10);
    player2.setAttackPower(35);
    // player1.getDamage(player2);
    player1.status();
    player2.status();
    }
}