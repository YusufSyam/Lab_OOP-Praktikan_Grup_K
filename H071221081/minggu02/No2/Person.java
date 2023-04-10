
public class Person {
    String name;
    int age;
    boolean isMale;

    void setName(String s){
        name = s;
    }

    String getName(){
        return name;
    }
    
    void setAge(int s){
        age = s;
    }

    int getAge(){
        return age;
    }
    void setGender(boolean s){
        isMale = s;
    }

    String getGender(){
        if(isMale){
            return "Pria";
        }else{
            return "Wanita";
        }
    }
}
class Main {
    public static void main(String[] args) {
        Person orang = new Person();
        orang.age = 20;
        orang.name = "nito";
        orang.isMale = true;

        System.out.println("orang ini bernama " + orang.getName());
        System.out.println("orang ini berusia " +orang.getAge() + " tahun");
        System.out.println("orang ini " + orang.getGender());
    }
}

