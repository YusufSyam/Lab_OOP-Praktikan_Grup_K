public class Bulldog extends Dog {

    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void describe() {
        System.out.println("Anjing ini memiliki sifat yang ramah, suka bermain, serta dapat bergaul dengan semua orang");
    }

    @Override
    public int getMove() {
    return 1;}
    
}
