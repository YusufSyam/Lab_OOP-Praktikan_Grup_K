class Fighter extends Character {
    public Fighter(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    public int attack() {
        return attackPower;
    }

    @Override
    public int attack(String attackType) {
        if (attackType == "melee") {
            return attackPower * 2;
        } else if (attackType == "ranged") {
            return attackPower;
        } else {
            return 0;
        }
    }
}