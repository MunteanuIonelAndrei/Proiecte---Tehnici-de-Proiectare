package GUI;

import java.util.ArrayList;
import java.util.Arrays;

public class Worker {
    String username ;
    String password;

    public Worker(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
