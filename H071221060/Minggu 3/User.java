public class User {
    String name;
    int balance;

    public User() {
    }

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {

        this.balance = this.balance - balance;
    }
    public void  card() {
        System.out.println("-".repeat(18)+"Card"+"-".repeat(18));
        System.out.println(this.getName());
        System.out.println(this.getBalance());
        System.out.println("-".repeat(40));
    }
}
