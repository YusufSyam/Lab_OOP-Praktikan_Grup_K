public class SiberianHusky extends Dog {

    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void describe() {
        System.out.println("Anjing ini memiliki ciri - ciri yang sangat mirip dengan serigala karena merupakan hasil persilangan antara anjing dan serigala");
    }

    @Override
    public int getMove() {
    return 2;}


    
}
