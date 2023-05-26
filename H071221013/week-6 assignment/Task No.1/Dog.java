abstract class Dog implements Moveble {
    protected int position;
    protected int averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
      }

    abstract void describe();
}