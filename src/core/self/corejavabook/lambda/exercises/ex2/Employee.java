package core.self.corejavabook.lambda.exercises.ex2;

public class Employee implements Measurable {
    private double measure;

    Employee (double measure){
        this.measure = measure;
    }

    @Override
    public double getMeasure() {
        return this.measure;
    }


}
