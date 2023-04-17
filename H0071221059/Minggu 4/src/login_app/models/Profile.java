package login_app.models;

public class Profile {
    public String fullName;
    public String nickName;
    public String hobby;
    public int age;


    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */

    public Profile() {
    }


    public Profile(String fullName, String nickName, int age, String hobby) {
        this.fullName = fullName;
        this.nickName = nickName;
        this.age = age;
        this.hobby = hobby;
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName){
        this.nickName = nickName;
    }

    public void setAge (int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby(){
        return hobby;
    }

}
