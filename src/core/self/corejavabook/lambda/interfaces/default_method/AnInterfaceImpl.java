package core.self.corejavabook.lambda.interfaces.default_method;

import java.util.Collection;

public class AnInterfaceImpl implements AnInterface {
    public static void main(String[] args) {
        AnInterface anInterface = new AnInterface() {
            @Override
            public String printSomething() {
                return "I would like to override";
            }
        };

        System.out.println(anInterface.printSomething());

        System.out.println(anInterface.printSomethingStrange());

    }
}
