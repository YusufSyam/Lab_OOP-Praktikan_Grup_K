class GermanShepherd extends Dog {

    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
      }

    @Override
    public void move() {
        this.position +=3;
    }

    @Override
    void describe() {
        System.out.println("Anjing ini memiliki tubuh panjang dan berotot dengan warna hitam, putih dan coklat kemerahan");
    }
}