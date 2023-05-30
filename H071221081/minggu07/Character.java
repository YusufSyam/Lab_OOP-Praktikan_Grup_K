public abstract class Character {
    protected String name;

    public Character(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract int attack();

    public abstract int attack(String attackType);
}

