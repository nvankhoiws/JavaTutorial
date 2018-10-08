package core.self.corejavabook.lambda.syntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class LambdaDemo {
    public static void main(String[] args) {
        String[] friends = { "Peter", "Paul", "Mary" };
        Arrays.sort(friends, (_1, _2) -> _1.length() - _2.length());
        System.out.println(Arrays.toString(friends));
        ArrayList<String> enemies = new ArrayList<>(Arrays.asList("Malfoy", "Crabbe", "Goyle", null));

        /**
         * block code 1: use lambda expression
         */
        enemies.removeIf(e -> e == null);

        /**
         * block code 2: tradditional way
         */
        enemies.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s == null || s.equals("Goyle") || s.equals("Crabbe") || s.equals("Malfoy"); // remove all thing, haha
            }
        });

        System.out.println(enemies);
    }
}
