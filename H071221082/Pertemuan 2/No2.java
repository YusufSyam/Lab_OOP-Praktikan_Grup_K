public class No2 { 
    private String name;
    private int age;
    private boolean isMale;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    String getName() {
        return this.name;
    }
    int getAge() {
        return this.age;
    }
    String getGender() {
        String gender;

        if (this.isMale == true){
            gender = "Male";
        } else {
            gender = "Female";
        }
        return gender;
    }

    public void person() {
        System.out.println("Name    : " + getName());
        System.out.println("Age     : " + getAge());
        System.out.println("isMale  : " + getGender());
    }
    }