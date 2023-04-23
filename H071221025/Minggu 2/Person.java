public class Person {
    String name;
    int age;
    boolean isMale;

    void setName(String nama) {  //set untuk mengubah nilai nlai pada atribut 
        name = nama;
    }
    String getName() { //get digunakan untuk mendapatkn nilai dari atribut
        return name;
    }
    void setAge(int umur) {
        age = umur;
    }
    int getAge() {
        return age;
    }
    void setGender(boolean lakiLaki) {
        isMale = lakiLaki;
    }
    String getGender() {
        // if(isMale==true){
        //     return "Male";
        // }else{
        //     return "Female";
        // }
        return isMale ? "Male" : "Female";
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Rezqia");
        person.setAge(19);
        person.setGender(false);
    
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
    }
}
    

