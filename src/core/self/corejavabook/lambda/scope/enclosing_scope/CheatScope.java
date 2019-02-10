package core.self.corejavabook.lambda.scope.enclosing_scope;

public class CheatScope {
    public static void main(String[] args) {
        int[] intArr = new int[1];
        for (int i = 0; i < 10; i++) {
            Runnable runnable = () -> System.out.println(intArr[0]++);
            new Thread(runnable).start();
        }
    }
}
