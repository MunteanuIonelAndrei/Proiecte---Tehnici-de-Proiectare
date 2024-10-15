package GUI;

import BusinessLogic.MenuItem;

import javax.swing.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class AdministratorLogicADM {
    ArrayList<MenuItem> menuItemArrayList = Administrator.administrator.getMenuItems();
    MenuItem firstColumn;
    MenuItem secondColumn;
    ArrayList<MenuItem> aux=new ArrayList<>();

    public AdministratorLogicADM(MenuItem firstColumn, MenuItem secondColumn,Object o) throws IllegalAccessException {
        this.firstColumn = firstColumn;
        this.secondColumn = secondColumn;
        checkAction(o);
    }
private void checkAction(Object obj) throws IllegalAccessException {
        if(obj==AdministratorVerify.administratorLogicView.b1){
            addItem(firstColumn);
        }else if(obj == AdministratorVerify.administratorLogicView.b2){
            deleteItem(firstColumn);
        }else if(obj == AdministratorVerify.administratorLogicView.b){
            updateItem(firstColumn,secondColumn);
        }

}


    private void addItem(MenuItem x){
        if(x.getTitle().isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Product is not valid !");
        }else {
            menuItemArrayList.add(x);
            System.out.println("el adaugat");
        }
    }

    private void deleteItem(MenuItem x){
        int found=0;
        for(int i=0;i<menuItemArrayList.size();i++){
            if(menuItemArrayList.get(i).getTitle().equals(x.getTitle())){
                menuItemArrayList.remove(i);
                System.out.println("el sters");
                found++;
            }
        }
        if(found==0){
            JOptionPane.showMessageDialog(null,
                    "Product not found!");
        }

    }

    private void updateItem(MenuItem firstColumn, MenuItem secondColumn) throws IllegalAccessException {

        int [] myarray = new int[7];
        for (int i:myarray
             ) {
            i=0;
         //   System.out.println(i);
        }
        System.out.println(secondColumn);
       if(!secondColumn.getTitle().isEmpty()){
           myarray[0]=1;
       //    System.out.println("S-a primit titlul");
       }
       if(secondColumn.getRating()!=-1){
           myarray[1]=1;
        //   System.out.println("S-a primit rating");
       }
       if(secondColumn.getCalories()!=-1){
        //    System.out.println("caloriiiiiiii"+secondColumn.getCalories());
           myarray[2]=1;
       //     System.out.println("S-a primit caloriile");
       }

        if(secondColumn.getProtein()!=-1){
            myarray[3]=1;
        }

        if(secondColumn.getFat()!=-1){
            System.out.println(secondColumn.getFat());
            myarray[4]=1;
        }

        if(secondColumn.getSodium()!=-1){
            myarray[5]=1;
        }

        if(secondColumn.getPrice()!=-1){
            myarray[6]=1;
        }

        int aux=0;
        for(int i=0;i<myarray.length;i++){
        //    System.out.println("aux are val "+myarray[i]+"pe pozitia "+i);
            aux+=myarray[i];
        }
        System.out.println("aux are valoarea :" +aux);


        while(aux!=0){
            int currentPos=0;
            ArrayList<MenuItem> menuItems= new ArrayList<>();
            //menuItems= getLastArrayList;
            for (int i=0;i<7;i++){
                if(myarray[i]==1){
                    currentPos=i;
                    myarray[i]=0;
                    i=8;
                }
            }
           System.out.println("currPos are val "+currentPos);
              if(currentPos==0){
                  for (MenuItem m: menuItemArrayList
                  ) {
                    if(secondColumn.getTitle().equals(m.getTitle())){
                     menuItems.add(m);
                        System.out.println("S-a bagat in menuItems titlul");
                     }
                  }
                  for (MenuItem mAux: menuItemArrayList
                  ) {
                      MenuItem mAux1=mAux;
                      this.aux.add(mAux1);
                  }
                  aux--;
              menuItems.removeAll(menuItems);
              }else{
                  for (MenuItem mAux: menuItemArrayList
                       ) {
                      MenuItem mAux1=mAux;
                      this.aux.add(mAux1);
                  }
                  aux--;

              }

            if(currentPos==1){
                for (MenuItem m: this.aux
                ) {
                    if(secondColumn.getRating()==m.getRating()){
                        menuItems.add(m);
                    }
                }
                aux--;
                this.aux=menuItems;
                menuItems.removeAll(menuItems);
            }

            if(currentPos==2){
                for (MenuItem m: this.aux
                ) {
                    if(secondColumn.getCalories()==m.getCalories()){
                        menuItems.add(m);
                    }
                }
                aux--;
                this.aux=menuItems;
                menuItems.removeAll(menuItems);
            }

            if(currentPos==3){
                for (MenuItem m: this.aux
                ) {
                    if(secondColumn.getProtein()==m.getProtein()){
                        menuItems.add(m);
                    }
                }
                aux--;
                this.aux=menuItems;
                menuItems.removeAll(menuItems);
            }

            if(currentPos==4){
                for (MenuItem m: this.aux
                ) {
                    if(secondColumn.getFat()==m.getFat()){
                        menuItems.add(m);
                    }
                }
                aux--;
                this.aux=menuItems;
                menuItems.removeAll(menuItems);
            }

            if(currentPos==5){
                for (MenuItem m: this.aux
                ) {
                    if(secondColumn.getSodium()==m.getSodium()){
                        menuItems.add(m);
                    }
                }
                aux--;
                this.aux=menuItems;
                menuItems.removeAll(menuItems);
            }

            if(currentPos==6){
                for (MenuItem m: this.aux
                ) {
                    if(secondColumn.getPrice()==m.getPrice()){
                        menuItems.add(m);
                    }
                }
                aux--;
                this.aux=menuItems;
                menuItems.removeAll(menuItems);
            }

        }

      //  System.out.println(this.aux.get(0));

   /*     int [] myarray2 = new int[7];
        if(!firstColumn.getTitle().isEmpty()){
            myarray2[0]=1;
        }
        if(firstColumn.getRating()!=Float.MAX_VALUE){
            myarray2[1]=1;
        }
        if(firstColumn.getCalories()!=Integer.MAX_VALUE);{
            myarray2[2]=1;
        }

        if(firstColumn.getProtein()!=Integer.MAX_VALUE);{
            myarray2[3]=1;
        }

        if(firstColumn.getFat()!=Integer.MAX_VALUE);{
            myarray2[4]=1;
        }

        if(firstColumn.getSodium()!=Integer.MAX_VALUE);{
            myarray2[5]=1;
        }

        if(firstColumn.getPrice()!=Integer.MAX_VALUE);{
            myarray2[6]=1;
        }*/

        System.out.println(this.aux);

        for (MenuItem m: menuItemArrayList
             ) {
            for (MenuItem m1:this.aux
                 ) {

                if(m1.getTitle().equals(m.getTitle())&&m1.getRating()==m.getRating()&&m1.getCalories()==m.getCalories()&&m1.getProtein()==m.getProtein()&&m1.getFat()==m.getFat()&&m1.getSodium()==m.getSodium()&&m1.getPrice()==m.getPrice()){
                   if(!firstColumn.getTitle().isEmpty()){
                    m.setTitle(firstColumn.getTitle());}
                   if(firstColumn.getRating()!=-1){
                    m.setRating(firstColumn.getRating());}
                   if(firstColumn.getCalories()!=-1){
                    m.setCalories(firstColumn.getCalories());}
                   if(firstColumn.getProtein()!=-1){
                    m.setProtein(firstColumn.getProtein());}
                   if(firstColumn.getFat()!=-1){
                    m.setFat(firstColumn.getFat());}
                   if(firstColumn.getSodium()!=-1){
                    m.setSodium(firstColumn.getSodium());}
                   if(firstColumn.getPrice()!=-1){
                    m.setPrice(firstColumn.getPrice());}
                }

            }

        }





    }

}
