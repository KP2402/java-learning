package prashant.learning.employee;

import java.io.*;

public class Employee implements Serializable {
    private int employeeId;
    private String name;
    private transient long salary;
    private transient static String department = "GBM";
    private transient final String company = "HSBC";


    public Employee(int employeeId, String name, long salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
