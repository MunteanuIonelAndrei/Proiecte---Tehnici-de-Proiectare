package BusinessLogic;

import GUI.AdministratorLogicView;

import java.util.ArrayList;

public class CompositeProduct {
    String name;
    ArrayList<MenuItem> newMenuItems = new ArrayList<MenuItem>();

    public CompositeProduct(String name, ArrayList<MenuItem> newMenuItems ) {
        this.name = name;
        this.newMenuItems = newMenuItems;
        addItem(name,newMenuItems);
    }
    public void addItem(String name, ArrayList<MenuItem> x){
        AdministratorLogicView.compositeProducts.addNewMenuItems(this);
    }

    public MenuItem getComposite(int i){
        return newMenuItems.get(i);
    }

    public int getSize(){
        return newMenuItems.size();
    }
    public String getName(){

            return name;

    }

    @Override
    public String toString() {
        String x="name= " + name +",\n"+"{\n";

        for (MenuItem menuItem: newMenuItems
             ) {
            x+=menuItem+"\n";

        }
        x+="}";
        return x;
    }

    public int getTotalPrice(){
        int price=0;
        for (MenuItem menuItem: newMenuItems
             ) {
            price+= menuItem.getPrice();
        }
        return price;
    }


}
