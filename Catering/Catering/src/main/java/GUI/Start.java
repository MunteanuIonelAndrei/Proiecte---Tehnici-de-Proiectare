package GUI;

import BusinessLogic.DeliveryService;
import BusinessLogic.MenuItem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Start {
    public static void main(String[] args) throws IOException {
        DeliveryService d=new DeliveryService();
        User u = new User(d);

      /*  ArrayList<MenuItem> menuItems= new ArrayList<MenuItem>();

       String path = "C:\\Users\\andre\\Documents\\An2_sem_2\\Catering\\products.csv";
       String line="";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        while((line = bufferedReader.readLine())!= null){
            String[] values = line.split(",");
            MenuItem menuItem = new MenuItem(values[0],Float.parseFloat(values[1]),Integer.parseInt(values[2]),Integer.parseInt(values[3]),Integer.parseInt(values[4]),Integer.parseInt(values[5]),Integer.parseInt(values[6]));
            menuItems.add(menuItem);
            System.out.println(line);
        }*/


    }
}
