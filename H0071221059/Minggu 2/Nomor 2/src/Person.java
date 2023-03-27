public class Person{
    private String name;
    private int age;
    private boolean isMale;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setGender(boolean isMale){
        this.isMale = isMale;
    }

    public String getGender(){
        if (isMale) {
            return "Male";
        } else {
            return "Female";
        }



    }
}


