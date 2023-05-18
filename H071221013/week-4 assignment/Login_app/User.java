package Login_app;

public class User {
    private String password;
    private String userName;
    private Profile profile;

    public User(){
    }

    public User(String password, String userName, Profile profile){
        this.password = password;
        this.userName = userName;
        this.profile = profile;
    }
    public User(String password, String userName){
        this.password = password;
        this.userName = userName;
    }
    
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public Profile getProfile(){
        return profile;
    }
    public void setProfile(Profile profile){
        this.profile = profile;
    }
}
