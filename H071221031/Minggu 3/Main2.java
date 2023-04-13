class Player {
    private String name;
    private int hp;
    private int attackPower;
    private int defense;
    
    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getHp() {
      return hp;
    }

    public void setHp(int hp) {
      this.hp = hp;
    }

    int getAttackPower() {
      return attackPower;
    }
    
    void setAttackPower(int attackPower) {
      this.attackPower = attackPower;
    }
    public int getDefense() {
      return defense;
    }

    public void setDefense(int defense) {
      this.defense = defense;
    }

    public void getDamage(Player enemy) {
      hp = hp - Math.abs(enemy.getAttackPower() - defense);
    }

    public Player(String name, int attackPower, int defense) {
      this.name = name;
      this.attackPower = attackPower;
      this.defense = defense;
    }

  public Player(String name, int defense){
    this.name = name ;
    this.defense = defense;
  }
    
    public void status() {
      System.out.println(name + " status");
      System.out.println("HP = " + hp);
      System.out.println("Defense = " + defense);
      System.out.println("Attack = " + attackPower + "\n");
    }
  }
  
  public class Main2 {
    public static void main(String [] args) {
      Player player1 = new Player("Mino", 30, 15);
      Player player2 = new Player ("Hilda", 10);
      player2.setAttackPower(35);
      player1.setHp(100);
      player2.setHp(100);

      player1.getDamage(player2);
      
      player1.status();
      player2.status();
    }
  }
  