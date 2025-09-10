package case_study;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee() {
        id = 1;
        name = "";
        salary = 0.0;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return this.id + ", " + this.name + ", " + this.salary;
    }
}
