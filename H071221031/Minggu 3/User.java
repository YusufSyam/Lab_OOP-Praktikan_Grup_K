public class User {
    String name;
    int balance;
    
    public User() {  //cunstructor default
    }
    
    public User(String name, int balance) { // cunstructor kedua
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
        this.balance = this.balance - balance;//untuk mengurangi nilai saldo (balance) pada objek saat ini dengan nilai balance yang diinputkan
    }
    public void  card() {
        System.out.println("-".repeat(18)+"Card"+"-".repeat(18));
        System.out.println(this.getName());
        System.out.println(this.getBalance());
        System.out.println("-".repeat(40));
    }
}
