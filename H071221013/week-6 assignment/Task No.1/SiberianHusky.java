class SiberianHusky extends Dog {

    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
      }
    
     @Override
    public void move() {
        this.position +=0;
    }

    @Override
    void describe() {
        System.out.println("Anjing ini memiliki perawakan mirip serigala");
    }
}
