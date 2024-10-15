package BusinessLogic;

import java.util.ArrayList;

public class CompositeProducts {
    private ArrayList<CompositeProduct> newMenuItems= new ArrayList<>();

    public CompositeProducts(ArrayList<CompositeProduct> newMenuItems) {
        this.newMenuItems = newMenuItems;
    }

    public CompositeProducts()
    {
    }

    public void addNewMenuItems(CompositeProduct x){
        newMenuItems.add(x);
    }

    public ArrayList<CompositeProduct> getNewMenuItems() {
        return newMenuItems;
    }

    @Override
    public String toString() {
        return "CompositeProducts{" +
                "newMenuItems=" + newMenuItems +
                '}';
    }
}

