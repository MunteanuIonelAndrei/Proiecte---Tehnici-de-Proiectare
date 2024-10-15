package GUI;

import BusinessLogic.DeliveryService;

import javax.swing.*;
import java.util.ArrayList;

import static GUI.User.cli;

public class ClientVerify {
    ArrayList<Worker> workers=Client.workers;
    String usernameCheck;
    String passwordCheck;
    DeliveryService model;

    public ClientVerify(String usernameCheck, char[] passwordCheck,Object object,DeliveryService d) {
        this.model=d;
        if (object==cli.b) {
            if(usernameCheck.isEmpty()){
                JOptionPane.showMessageDialog(null,
                        "Please enter a username!");
            }else {
                this.usernameCheck = usernameCheck;
            }
            if(String.valueOf(passwordCheck).isEmpty()){
                JOptionPane.showMessageDialog(null,
                        "Please enter a password!");
            }else {
                this.passwordCheck = String.valueOf(passwordCheck);
            }

            if(workers.isEmpty()){
                JOptionPane.showMessageDialog(null,
                        "Please register! ");

            }else {
                checkAdmin(workers, this.usernameCheck, this.passwordCheck);
            }
        }else if(object== cli.b2){
            register(usernameCheck,String.valueOf(passwordCheck));
        }
    }
    private boolean checkAdmin(ArrayList<Worker> workers,String usernameCheck, String passwordCheck){
        int usernamePosition=-1;
        for (int i=0;i< workers.size();i++) {
            if (workers.get(i).username.equals(usernameCheck)) {
                usernamePosition=i;
                if (workers.get(i).password.equals(passwordCheck)) {
                    System.out.println("tot ok");
                    OrderView c= new OrderView(model);
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
    private void register(String usernameCheck,String passwordCheck) {
        if (usernameCheck.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Please enter a username!");
        } else if (passwordCheck.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Please enter a password!");
        } else {
            Worker worker = new Worker(usernameCheck, passwordCheck);
            workers.add(worker);
            JOptionPane.showMessageDialog(null,
                    "You have successfully registered! Please Login.");

        }
    }

}
