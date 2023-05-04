package MainClass;

public class germanShepherd extends Dog{
    public germanShepherd(int position, int averangeLength){
        super(position, averangeLength);
    }

    public void describe(){
        System.out.println("Anjing Gembala Jerman adalah salah satu ras murni anjing yang populer. Ukurannya besar, dikenal cerdas namun penurut");
    }

    public int getMovement(){
        return 3;
    }
}
