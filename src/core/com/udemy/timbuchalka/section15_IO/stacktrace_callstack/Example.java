package core.com.udemy.timbuchalka.section15_IO.stacktrace_callstack;

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
        int x = getInt();
        int y = getInt();
        System.out.println("x is " + x + ", y is " + y);
        return x / y;
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        return s.nextInt();
    }
}
