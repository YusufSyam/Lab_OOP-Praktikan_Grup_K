
public class Fighter extends Character{
    private int attackPower;

    public Fighter(String name,int attackPower){
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
        if(attackType == "melee"){
            powerMulplication = 2;
        }
        return this.attackPower *= powerMulplication;
    }

    


}