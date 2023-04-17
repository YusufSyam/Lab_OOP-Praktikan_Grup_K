package login_app.models;

public class User {
    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */
    private String username;
    private String password;

    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPasswsord() {
        return password;
    }

    public void setPasswsord(String password) {
        this.password = password;
    }
}
