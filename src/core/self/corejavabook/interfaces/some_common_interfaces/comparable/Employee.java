package core.self.corejavabook.interfaces.some_common_interfaces.comparable;

public class Employee implements Comparable<Employee> {
    private Double salary;

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }
}
