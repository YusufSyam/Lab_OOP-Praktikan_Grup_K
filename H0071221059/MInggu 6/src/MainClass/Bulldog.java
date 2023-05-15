package MainClass;

public class Bulldog extends Dog {
    public Bulldog(int position, int averangeLength){
        super(position, averangeLength);
    }

    public void describe(){
        System.out.println("Bulldog adalah salah satu anjing ras tertua di dunia yang berasal dari Inggris, maka sering dikenal sebagai English Bulldog");
    }

    public int getMovement(){
        return 4;
    }
}
