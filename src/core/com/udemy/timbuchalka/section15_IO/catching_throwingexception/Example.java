package core.com.udemy.timbuchalka.section15_IO.catching_throwingexception;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by timbuchalka on 1/04/2016.
 */
public class Example {

    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide() {
        int x, y;
        try {
            x = getInt();
        } catch(NoSuchElementException e) {
            throw new ArithmeticException("no suitable input");
        }
        y = getInt();
        System.out.println("x is " + x + ", y is " + y);
        try {
            return x / y;
        } catch(ArithmeticException e) {
            throw new ArithmeticException("attempt to divide by zero");
        }
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        while(true) {
            try {
                return s.nextInt();
            } catch(InputMismatchException e) {
                // go round again.  Read past the end of line in the input first
                s.nextLine();
                System.out.println("Please enter a number using only the digits 0 to 9 ");
            }
        }
    }
}