public class data {
    // atribut
    String name ;
    int age ;
    boolean isMale ;

    // this untuk yang menyimpan data dari atribut
    public void setName(String name) {
        this.name = name ;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age ;
    }

    public int getAge(){
        return this.age;
    }

    public void setGender(boolean gender){
        this.isMale = gender;
    }

    public String getGender(){
        if (this.isMale == true){
            return "male" ;
        } else {
            return "Female";
        }
    
    }

    // untuk menampilkan data yang sudah diisi dari Maindata
    public void info() {
        System.out.println("Nama " + this.name);
        System.out.println("Umur " + this.age);
        System.out.println(getGender());
    }
}
