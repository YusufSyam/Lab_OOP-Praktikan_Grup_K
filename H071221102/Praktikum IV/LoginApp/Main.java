package LoginApp;

import java.util.ArrayList;
import java.util.Scanner;

import LoginApp.Models.Profile;
import LoginApp.Models.User;
import LoginApp.Utils.Utils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }

    private static void runApp() {
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        // Menginput pilihan menu
        int selectMenu = sc.nextInt();
        sc.nextLine();
        switch (selectMenu) {
            case 1:
                // Membuka Halaman Login
                showLoginMenu();
                break;
            case 2:
                // Membuka Halaman Register
                showRegisterMenu();
            default:
                // Mengulang Pemanggilan Menu Utama
                runApp();
        }
    }

    private static void showLoginMenu() {
        System.out.println("-------------------------");
        System.out.println("Login");
        // Menginput Username dan Menyimpannya di attribute username;
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.next();
        // Membuat variabel userIndex yang mana nanti akan menampung index dari user
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
        }
        // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
        if (userIndex != -1) {
            // Menginput Password
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.next();
            boolean isPasswordMatch = listUser.get(userIndex).getPassword().equals(password);
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                showDetailUser(listUserProfile.get(userIndex));
                System.exit(0);
            } else {
                System.out.println("Password Salah");
            }
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        // Menginput username dan password
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();
        User user = new User(username, password);
        Profile profile = new Profile();

        // Menginput Data Profile
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();

        System.out.println("Umur");
        System.out.print("> ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();        

        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);
        profile.setNickname(Utils.generateNickname(fullName));
        // Menambahkan user yang dibuat ke list user
        listUser.add(user);
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("------------------------------------");
        System.out.println("SELAMAT DATANG !");
        System.out.println("------------------------------------");
        System.out.println("Nama Lengkap: " + profile.getFullName());
        System.out.println("Umur: " + profile.getAge());
        System.out.println("Hobby: " + profile.getHobby());
        System.out.println("Nickname: " + profile.getNickname());
    }
}