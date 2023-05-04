package MainClass;
class SiberianHusky extends Dog{
    public SiberianHusky (int position, int averangeLength){
        super(position, averangeLength);
    }

    public void describe(){
        System.out.println("Husky Siberia termasuk dalam jenis anjing ras berukuran sedang dan berbulu tebal. Anjing ras ini termasuk jinak dan ramah kepada siapapun");
    }

    public int  getMovement(){
        return 3;
    }
}
