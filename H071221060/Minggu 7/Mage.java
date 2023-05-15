class Mage extends Character {
    public Mage(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    public int attack() {
        return attackPower;
    }

    @Override
    public int attack(String attackType) {
        if (attackType == "fire") {
            return attackPower * 3;
        } else if (attackType == "frost") {
            return attackPower * 2;
        } else {
            return 0;
        }
    }
}