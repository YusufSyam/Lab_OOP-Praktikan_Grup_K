public class Person {
   String name;
   int age;
   boolean isMale;
   
   public void setname(String nama) {
     name = nama;
   }
   public String getname() {
     return name;
   }
   public void setage(int umur) {
     age = umur;
   }
   public int getage() {
     return age;
   }
   public void setGender(boolean cowo) {
     isMale = cowo;
   }
   public String getGender() {
     return isMale ? "Male" : "Female";
   }

   public static void main(String[] args) {
     Person person = new Person();
     person.setname("Kevin");
     person.setage(20);
     person.setGender(true);

     System.out.println("Name : " + person.getname());
     System.out.println("Age : " + person.getage());
     System.out.println("Gender : " + person.getGender());
     
   }
}
