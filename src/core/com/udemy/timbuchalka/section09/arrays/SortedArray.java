package core.com.udemy.timbuchalka.section09.arrays;

import java.util.Scanner;

public class SortedArray {
    private static Scanner scanner = new Scanner(System.in);
    private static int numberofInput = 5;

    public static void main(String[] args) {
        SortedArray sortedArray = new SortedArray();
        int[] enteredInteger = getIntegers();
        printArray(enteredInteger);

        enteredInteger = sortIntegers(enteredInteger);
        printArray(enteredInteger);
    }

    public static int[] getIntegers(){
        int[] integers = new int[numberofInput];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = scanner.nextInt();
            System.out.println(integers[i] + " is just inputted.\r");
        }
        return integers;
    }

    public static void printArray(int[] intArray){
        for (int i = 0; i < intArray.length ; i++) {
            System.out.println("The element number " + i + "is " + intArray[i]);
        }
    }

    public static int[] sortIntegers(int[] intArray){
        for (int i = 1; i <intArray.length ; i++) {
            int key = intArray[i];
            int j = i - 1;
            while (key > intArray[j] && j > 0){
                intArray[j+1] = intArray[j];
                j--;
            }
            if (j == 0) {
                if (key > intArray[j]){
                    intArray[j+1] = intArray[j];
                }
            }
            intArray[j+1] = key;
        }
        return intArray;
    }
}
