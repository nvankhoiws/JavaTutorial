package core.com.udemy.timbuchalka.section09.list.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/29/201710:13 AM.
 */
public class GroceryList {

    private ArrayList<String> groceryItems;

    public GroceryList() {
        this.groceryItems = new ArrayList<>();
    }

    public void addGroceryItem (String item){
        groceryItems.add(item);
        System.out.println("The item " + "\" "+ item +" \" is added." );
    }

    public void modifyGroceryItem (int position, String newItem){
        groceryItems.set(position - 1, newItem);
        System.out.println("The item at position " + position + " is modified.");
    }

    public String removeGroceryItem (int position){
        String removed = groceryItems.get(position - 1);
        groceryItems.remove(position - 1);
        System.out.println("The item at position " + position + " is removed from grocery list");
        return removed;
    }

    public void printGroceryList (){
        System.out.println("There are " + groceryItems.size() + " items in your grocery list.");
        for (int i = 0, length = this.groceryItems.size(); i < length; i++) {
            System.out.println(i + 1 + "\t" + groceryItems.get(i));
        }
    }

    public String findItem (String searchItem) {
        int position = groceryItems.indexOf(searchItem);
        if (position > -1) {
            return groceryItems.get(position);
        }
        return null;
    }

    public ArrayList<String> getGroceryItems() {
        return groceryItems;
    }
}
