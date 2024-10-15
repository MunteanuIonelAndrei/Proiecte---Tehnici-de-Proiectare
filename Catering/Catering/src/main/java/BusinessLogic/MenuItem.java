package BusinessLogic;

import java.util.Arrays;

public class MenuItem {
String title;
float rating;
int calories;
int protein;
int fat;
int sodium;
int price;


    public MenuItem(String title, float rating, int calories, int protein, int fat, int sodium, int price) {
        this.title = title;
        this.rating = rating;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.price = price;
    }

    public MenuItem() {

    }

    public String getTitle() {
        return title;
    }

    public float getRating() {
        return rating;
    }

    public int getCalories() {
        return calories;
    }

    public int getProtein() {
        return protein;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /*public int[] getPositionsNotNull(){
        if(!title.isEmpty()){
            vector[0]=1;
        }else if()
    }*/

    @Override
    public String toString() {
        return
                 title + ", " + rating +
                ", " + calories +
                ", " + protein +
                ", " + fat +
                ", " + sodium +
                ", " + price ;
    }
}
