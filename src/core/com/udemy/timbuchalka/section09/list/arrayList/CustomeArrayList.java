package core.com.udemy.timbuchalka.section09.list.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/29/201710:13 AM.
 */
public class CustomeArrayList {

    private List<String> groceryItems;

    public CustomeArrayList () {
        this.groceryItems = new ArrayList<>();
    }

    public CustomeArrayList (List<String> groceryItems) {
        this.groceryItems = groceryItems;
    }

    public void addItem (String item){
        this.groceryItems.add(item);
    }

    public void modifyItem (int position, String newItem){
        this.groceryItems.set(position, newItem);
    }

    public void removeItem (int position){
        String removed = this.groceryItems.get(position);
        this.groceryItems.remove(position);
    }

    public void printGroceryList (){
        for (int i = 0, length = this.groceryItems.size(); i < length; i++) {
            System.out.println("item at position " + i + " " + this.groceryItems.get(i));
        }
    }

    public String findItem (String searchItem) {
        int position = groceryItems.indexOf(searchItem);
        if (position >= 0) {
            return groceryItems.get(position);
        }
        return null;
    }
}
