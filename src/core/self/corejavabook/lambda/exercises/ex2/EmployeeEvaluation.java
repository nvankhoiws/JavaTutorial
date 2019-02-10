package core.self.corejavabook.lambda.exercises.ex2;

public class EmployeeEvaluation {
    public static void main(String[] args) {
        Measurable[] measurableObjects = {new Employee(9.0f), new Employee(9.2f),new Employee(8.8f)};
        System.out.println(average(measurableObjects));
    }

    private static double average(Measurable[] objects){
        double d = 0.0f;
        for (Measurable measurable : objects
             ) {
            d+=measurable.getMeasure();
        }
        return d/objects.length;
    }
}
