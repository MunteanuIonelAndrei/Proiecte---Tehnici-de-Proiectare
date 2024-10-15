package GUI;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeVerify {
    ArrayList<Worker> workers =new ArrayList<>(Arrays.asList(new Worker("Gabi","password1"),new Worker("Mihai","password2"),new Worker("Andreea","password3")));
    String usernameCheck;
    String passwordCheck;

    public EmployeeVerify(String usernameCheck, char[] passwordCheck) {
        this.usernameCheck = usernameCheck;
        this.passwordCheck = String.valueOf(passwordCheck);
        checkAdmin(workers,this.usernameCheck,this.passwordCheck);
    }
    private boolean checkAdmin(ArrayList<Worker> workers,String usernameCheck, String passwordCheck){
        int usernamePosition=-1;
        for (int i=0;i< workers.size();i++) {
            if (workers.get(i).username.equals(usernameCheck)) {
                usernamePosition=i;
                if (workers.get(i).password.equals(passwordCheck)) {
                    System.out.println("tot ok");
                    return true;
                }
        }
    }
        if(usernamePosition!=-1){

                JOptionPane.showMessageDialog(null,
                        "Password is incorrect! Try again...");
                return false;

        } else {
            JOptionPane.showMessageDialog(null,
                    "Username is incorrect! Try again...");
            return false;
        }

    }
}
