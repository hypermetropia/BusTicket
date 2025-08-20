package others;

import java.util.ArrayList;
import java.util.Arrays;

public class User {
    String id;
    String name, username, phone, password, email;
    ArrayList<String> tickets = new ArrayList<>();

    public User(String id, String name, String username, String email, String phone, String password,
            ArrayList<String> tickets) {
        this.tickets = tickets;
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public void addTicket(String id) {
        this.tickets.add(id);
    }

    public String getUsername() {
        return this.username;
    }

    public String isMatch(String username, String password) {
        if(username.equals(this.username) && password.equals(this.password)) return this.id;
        return "";
    }

    @Override
    public String toString() {
        return (this.id + "," + this.name + "," + this.username + "," + this.email + "," + this.phone + ","
                + this.password + "," + String.join(";", tickets));
    }

    public static User fromString(String s) {
        String[] parts = s.split(",", 7);
        ArrayList<String> ticket = new ArrayList<>(Arrays.asList(parts[6].split(";")));
        User user = new User(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], ticket);
        return user;
    }
}
