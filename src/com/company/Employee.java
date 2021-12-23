package com.company;

public class Employee {
    String employeName;
    int salary;

    public Employee(String employeName, int salary) {
        this.employeName = employeName;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getEmployeName() {
        return employeName;
    }

    public void setEmployeName(String employeName) {
        this.employeName = employeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeName='" + employeName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
