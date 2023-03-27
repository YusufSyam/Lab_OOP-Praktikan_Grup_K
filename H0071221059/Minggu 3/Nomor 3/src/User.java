import java.util.ArrayList;
import java.util.Scanner;

class User {
    private String name;
    private int balance;

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

    public int getBalance(int balance) {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void debit(int priceValue) {
        balance -= priceValue;
    }
}

