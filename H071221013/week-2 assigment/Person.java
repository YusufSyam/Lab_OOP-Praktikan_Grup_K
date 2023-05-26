public class Person {
    String name;
    int age;
    boolean isMale;

    public void setname(String name) {  
        this.name = name;
    }
    public String getname() {  
        return name;
    }
    public void setage(int age) {
        this.age = age;
    }
    public int getage() {
        return age;
    }
    public void setgender(boolean isMale) { 
        this.isMale = isMale;
    }
    public String getgender(){
        if (isMale==true){
            return "Laki-laki";
        } else{
            return "Perempuan";
        }
    }
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setname("Santi");
        person1.setage(18);
        person1.setgender(false);
    
        System.out.println(person1.getname());
        System.out.println(person1.getage());
        System.out.println(person1.getgender());
    }
}