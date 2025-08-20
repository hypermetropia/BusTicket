package others;

import java.util.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;

import javax.swing.*;
import others.User;

public class UserManagement {
    public static ArrayList<User> users = new ArrayList<User>();

    public static String createUser(String name, String username, String email, String phone, String password,
            ArrayList<String> tickets) {
        User newUser = new User(UUID.randomUUID().toString(), name, username, email, phone, password, tickets);
        loadUser();
        for(User user: users){
            if(user.username.equals(newUser.username) || user.email.equals(newUser.email)){
                return "User already exists";
            }
        }
        users.add(newUser);
        saveUsers();
        return newUser.id;
    }

    public static void loadUser() {
        String filename = "users.txt";
        ArrayList<User> newUsers = new ArrayList<User>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                newUsers.add(User.fromString(line));
            }
            users = newUsers;
            System.out.println("Loaded: " + users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected static void saveUsers() {
        String filename = "users.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (User p : users) {
                bw.write(p.toString());
                bw.newLine();
            }
            System.out.println("Saved!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
