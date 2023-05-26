package Login_app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<User> listUser = new ArrayList<User>(); 
    static ArrayList<Profile> listUserProfile = new ArrayList<Profile>(); 
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {    
        runApp();
    }

    private static void runApp() {
        System.out.println("-".repeat(35));
        System.out.println("Welcome to application");
        System.out.println("-".repeat(35));
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Logout");
        System.out.println("-".repeat(35));
        System.out.print("> ");
        String input = sc.nextLine();
        switch (input) {
            case "1":
            showLoginMenu();
                break;
            case "2":
                showRegisterMenu();
            case "3":
                System.out.println("-".repeat(35));
                System.out.println("Thank You For Visiting");
                System.out.println("-".repeat(3));
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Input");
                runApp();
                break;
        }
    }

    private static void showLoginMenu() {
        System.out.println("-".repeat(35));
        System.out.println("REGISTER");
        System.out.println("-".repeat(35));
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();
        User user = findUser(username);
        if (user == null) {
            System.out.println("Username Not Found");
            showLoginMenu();
        } else {

            boolean isPasswordMatch = user.getPassword().equals(password);
            if (isPasswordMatch) {
                System.out.println("-".repeat(35));
                System.out.println("Successful Login");

                showDetailUser(findProfile(username));
                runApp();
            } else {
                System.out.println("-".repeat(35));
                System.out.println("The Password you entered is incorrect");
                System.out.println("-".repeat(35));
                showLoginMenu();
            }
        }
    }
    private static User findUser(String username) {
        for (User user : listUser) {
            if (user.getUserName().equals(username)) {
                return user;
            }
        }
        return null;
    }

    private static Profile findProfile(String username) {
        for (Profile profile : listUserProfile) {
            if (profile.getUser().getUserName().equals(username)) {
                return profile;
            }
        }
        return null;
    }

    private static void showRegisterMenu() {
        System.out.println("-".repeat(35));
        System.out.println("Silakan Isi Data Akun Baru");
        System.out.println("-".repeat(35));
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        System.out.println("Umur");
        System.out.print("> ");
        int age = validateIntegerInput();
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();
        String username = "";
        String password = "";
        while (username.equals("") || password.equals("")) {
            System.out.println("Username");
            System.out.print("> ");
            username = sc.nextLine();
            if (username.equals("")) {
                System.out.println("Username Cannot Be Empty");
                continue;
            }
            if (isUsernameExist(username)) {
                System.out.println("The Username Has Already been Used");
                username = "";
                continue;
            }
            System.out.println("Password");
            System.out.print("> ");
            password = sc.nextLine();
            if (password.length() <= 5) {
                System.out.println("The length of the Password is 5 Characters");
                password = "";
            }
        }
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
    
        Profile profile = new Profile(fullName, age, hobby);
        profile.setUser(user);
        listUserProfile.add(profile);
        listUser.add(user);
        System.out.println("-".repeat(35));
        System.out.println("Account Created Successfully!!!");
        System.out.println("-".repeat(35));

        showDetailUser(profile);
        runApp();
    }
    private static boolean isUsernameExist(String username) {
        for (User user : listUser) {
            if (user.getUserName().equals(username)) {
                return true;
            }
        }
        return false;
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("-".repeat(35));
        System.out.println("        ~ Selamat Datang~     ");
        System.out.println();
        System.out.println("Nama Lengkap\t: " + profile.getNamaLengkap());
        System.out.println("Nama Panggilan\t: " + profile.getNamaPanggilan());
        System.out.println("Usia\t\t: " + profile.getUmur());
        System.out.println("Hobby\t\t: " + profile.getHobby());
        System.out.println("-".repeat(35));
    }

    private static int validateIntegerInput() {
        int result = 0;
        boolean isValid = false;
        while (!isValid) {
            try {
                result = Integer.parseInt(sc.nextLine());
                isValid = true;
            } catch (Exception e) {
                System.out.println("Input Must Be a Number");
                System.out.print("> ");
            }
        }
        return result;
    }
}