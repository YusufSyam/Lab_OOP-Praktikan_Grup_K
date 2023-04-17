package login_app.models;

public class Profile {
    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */
    private String fullName;
    private int age;
    private String hobby;
    private String nickName;

    
    
    
    public Profile(String fullName, int age, String hobby, String nickName){
        this.fullName = fullName;
        this.age = age;
        this.hobby = hobby;
        this.nickName = nickName;
    }
    public Profile() {
    }
    public String getFullName() {
        return fullName;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getHobby() {
        return hobby;
    }


    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


    public String getNickName() {
        return nickName;
    }


    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
