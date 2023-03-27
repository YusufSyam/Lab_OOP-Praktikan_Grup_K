public class Main {
    //Buatlah sebuah program Java sederhana dari diagram
    //class berikut dengan memperhatikan aturan
    //penulisannya,
    public static void main(String[] args) {
        //membuat objek persoon
        Person person = new Person();

        //mengatur nilai atribut nama
        person.setName("Muhammad Zoel Ramadhan");

        //mengatur nilai atribut usia
        person.setAge(25);

        //mengatur nilai atribut jenis kelamin
        person.setGender(false);

        //mendapatkan nilai atribut nama. usia, dan jenis kelamin
        String name = person.getName();
        int age = person.getAge();
        String gender = person.getGender();

        //menampilkan nilai atribut pada layar
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}