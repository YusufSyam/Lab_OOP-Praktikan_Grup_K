package MainClass;

class Pitbull extends Dog{
    public Pitbull(int position, int averangeLength){
        super(position, averangeLength);
    }

    public void describe(){
        System.out.println("Pitbull adalah anjing yang berasal dari Inggris. Ciri-cirinya adalah tubuh yang kuat dan berotot, kepala yang besar, dan gigi yang kuat.");
    }

    public int getMovement(){
        return 2;
    }
}


