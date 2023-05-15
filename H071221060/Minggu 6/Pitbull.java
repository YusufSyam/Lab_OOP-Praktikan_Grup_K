public class Pitbull extends Dog {

    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void describe() {
        System.out.println("Pitbull terlahir sebagai anjing petarung karena memiliki rahang yang kuat");
    }

    @Override
    public int getMove() {
    return 3;}


    
}
