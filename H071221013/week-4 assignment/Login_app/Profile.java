package Login_app;

public class Profile {
    private String namaLengkap;
    private String namaPanggilan;
    private int umur;
    private String hobby;
    private User user;

    public Profile() {
    }

    public Profile(String namaLengkap, int umur, String hobby){
        this.namaLengkap = namaLengkap;
        this.umur = umur;
        this.hobby = hobby;
        this.namaPanggilan = StringUtils.getNamaPanggilan(namaLengkap);

    }
    public String getNamaLengkap(){
        return namaLengkap;
    }
    public void setNamaLengkap(String namaLengkap){
        this.namaLengkap = namaLengkap;
    }
    public String getNamaPanggilan(){
        return namaPanggilan;
    }
    public void setNamaPanggilan(String namaPanggilan){
        this.namaPanggilan = namaPanggilan;
    }
    public int getUmur(){
        return umur;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public String getHobby(){
        return hobby;
    }
    public void setHobby(String hobby){
        this.hobby = hobby;
    }
    public User getUser(){
        return user;
    }
    public void setUser(User user){
        this.user = user;
    }
}
