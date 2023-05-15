public abstract class Dog{
    int position;
    int averageLength;

    public Dog(int position, int averageLength){
        this.position = position;
        this.averageLength = averageLength;
    }

    public void move (){
        position += getMove();
    }
    public abstract void describe();
    public abstract int getMove();

}
