package GUI;

import BusinessLogic.DeliveryService;
import BusinessLogic.MenuItem;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AdministratorVerify {
    String username = "AndreiMunteanu";
    String password = "parolae123";
    String usernameCheck;
    String passwordCheck;
    static ArrayList<MenuItem> menuItems= new ArrayList<MenuItem>();
    static AdministratorLogicView administratorLogicView;
    DeliveryService model;


    public AdministratorVerify(String usernameCheck, char[] passwordCheck,DeliveryService d) throws IOException {
        this.model=d;
        this.usernameCheck = usernameCheck;
        this.passwordCheck = String.valueOf(passwordCheck);
        checkAdmin(username,this.usernameCheck,password,this.passwordCheck);
    }
    private boolean checkAdmin(String username,String usernameCheck,String password, String passwordCheck) throws IOException {
        if(username.equals(usernameCheck)){
            if(password.equals(passwordCheck)){
                loadProducts();
                AdministratorLogicView logicView = new AdministratorLogicView(model);
                administratorLogicView=logicView;
                return true;
            }else{
                JOptionPane.showMessageDialog(null,
                        "Password is incorrect! Try again...");
                return false;
            }
        }else{
            JOptionPane.showMessageDialog(null,
                    "Username is incorrect! Try again...");
            return false;
        }
    }

    private void loadProducts() throws IOException {

        ArrayList<String> verifyDuplicates = new ArrayList<>();

        String path = "C:\\Users\\andre\\Documents\\An2_sem_2\\Catering\\products.csv";
        String line="";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        bufferedReader.readLine();
        while((line = bufferedReader.readLine())!= null){


                int found = 0;
                for (int i = 0; i < verifyDuplicates.size(); i++) {
                    if (verifyDuplicates.get(i).equals(line))
                        found++;
                }
                verifyDuplicates.add(line);
                if (found == 0) {
                    String[] values = line.split(",");
                    MenuItem menuItem = new MenuItem(values[0], Float.parseFloat(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]), Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]));
                    menuItems.add(menuItem);
                   // System.out.println(line);
                }

    }

}
public ArrayList<MenuItem> getMenuItems(){
        return this.menuItems;
}

}

