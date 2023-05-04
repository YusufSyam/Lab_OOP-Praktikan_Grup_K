package MainClass;
public abstract class Dog {
    protected int position;
    protected int averangeLength;

    public Dog(int position, int averangeLength){
        this.position = position;
        this.averangeLength = averangeLength;
    }

    public void move(){
        position += getMovement();
    }

    public abstract void describe();
    protected abstract int getMovement();
}
