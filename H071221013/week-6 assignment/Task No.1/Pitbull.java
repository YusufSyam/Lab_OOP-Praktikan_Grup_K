class Pitbull extends Dog {

    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
      }

    @Override
    public void move() {
        position +=0;
    }

    @Override
    void describe() {
        System.out.println("Anjing Pitbull memiliki tubuh yang berotot dan gagah");
    }
}