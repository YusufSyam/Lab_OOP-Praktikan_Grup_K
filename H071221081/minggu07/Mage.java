
public class Mage extends Character{
    private int attackPower;
    public Mage(String name,int attackPower){
        super(name);
        this.attackPower = attackPower;
    }

    @Override
    public int attack() {
        return this.attackPower;
    }

    @Override
    public int attack(String attackType) {
        int powerMulplication = 1;
        if(attackType == "fire"){
            powerMulplication = 3;
        }else{
            powerMulplication = 2;
        }
        return this.attackPower *= powerMulplication;
    }
}
