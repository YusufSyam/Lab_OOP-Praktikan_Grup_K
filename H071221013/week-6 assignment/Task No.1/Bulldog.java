class Bulldog extends Dog {

    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
      }

    @Override
    public void move() {
        this.position +=0;
    }

    @Override
    void describe() {
        System.out.println("Anjing yang memiliki tubuh lebar besar \nmoncong pesek, berkaki pendek dan memiliki kulit \nyang jatuh berlipat");
    }
}
