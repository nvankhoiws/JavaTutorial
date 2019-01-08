package core.self.corejavabook.lambda.method_and_constructor_references;

import java.util.ArrayList;
import java.util.Collections;

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        /**
         * Problem:
         * Establish new arrays of object from array of string
         */
        ArrayList<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Paul");
        names.add("Mary");
        Employee[] employees = names.stream().map(Employee::new).toArray(Employee[]::new);
        for (Employee e : employees) System.out.println(e.getName());
    }
}
