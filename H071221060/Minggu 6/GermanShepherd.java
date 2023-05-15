public class GermanShepherd extends Dog {

    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void describe() {
        System.out.println("anjing ini memiliki keistimewaan pandai, setia, berani, mudah menyesuaikan diri dengan lingkungan dan unggul dalam mental dan fisik");
    }

    @Override
    public int getMove() {
    return 3;}
    
}
