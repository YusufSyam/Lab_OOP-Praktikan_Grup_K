public class no2 { 

    public String name;
    public int age;
    public boolean isMale;


    public void setName (String name) {
        this.name = name;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public void setGender (boolean isMale) {
        this.isMale = isMale;
    }

    String getName() {
        return this.name;
    }
    int getAge() {
        return this.age;
    }
    boolean getGender() {
        return this.isMale;
    }

    public void person() {
        System.out.println("Name    : " + getName());
        System.out.println("Age     : " + getAge());
        System.out.println("isMale  : " + getGender());
    }
    }

class Main {
    public static void main(String[] args) {
        no2 call = new no2();
        call.name = "Fikry";
        call.age = 19;
        call.isMale = true;
        call.person();
    }


    } 
