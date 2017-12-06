package core.com.udemy.timbuchalka.section09.list.arrayList;

import java.util.Scanner;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/29/201711:31 AM.
 */
public class GroceryListApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        boolean quit = false;
        GroceryList groceryList = new GroceryList();
        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice from 1 to 5(enter 0 to print instructions, enter other number to exit program): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printItem(groceryList);
                    break;
                case 2:
                    addItem(groceryList);
                    break;
                case 3:
                    modifyItem(groceryList);
                    break;
                case 4:
                    removeItem(groceryList);
                    break;
                case 5:
                    searchItem(groceryList);
                    break;
                default:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("Enter 1 to print items in grocery list");
        System.out.println("Enter 2 to add an item to grocery list");
        System.out.println("Enter 3 to modify an item in grocery list");
        System.out.println("Enter 4 to remove an item in grocery list");
        System.out.println("Enter 5 to search an item in grocery list");
    }

    public static void printItem(GroceryList groceryList){
        groceryList.printGroceryList();
    }

    public static void addItem(GroceryList groceryList){
        System.out.println("Please enter the item: ");
        String s = scanner.nextLine();
        groceryList.addGroceryItem(s);
        printItem(groceryList);
    }

    public static void modifyItem(GroceryList groceryList){
        printItem(groceryList);
        System.out.println("Please enter the number of item that you would like to modify and the name of new item");
        int i = scanner.nextInt();
        scanner.nextLine();

        String s = scanner.nextLine();
        groceryList.modifyGroceryItem(i, s);
        printItem(groceryList);
    }

    public static void removeItem(GroceryList groceryList){
        printItem(groceryList);
        System.out.println("Please enter the number of item that you would like to remove");
        int i = scanner.nextInt();
        groceryList.removeGroceryItem(i);
        printItem(groceryList);
    }

    public static void searchItem(GroceryList groceryList){
        printItem(groceryList);
        System.out.println("Please enter the name that you would like to search:");
        String input = scanner.nextLine();
        String found = groceryList.findItem(input);
        if (found == null){
            System.out.println("There is not any item that you searching");
        } else {
            System.out.println("There is an item named " + input + " in the grocery list");
        }
    }

    public static void processArrayList(GroceryList groceryList) {
        // Copy an arryList to a array with a fixed size;
        String[] items = groceryList.getGroceryItems().toArray(new String[groceryList.getGroceryItems().size()]);
    }
}
