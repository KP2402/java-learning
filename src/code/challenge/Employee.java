package code.challenge;

import java.util.Objects;

public final class Employee {

    private final String name;
    private  final Address address;
    private  final int salary;

    public Employee(String name, Address address, int salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public  Address getAddress() {
        return address;
    }

    public  int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) &&
                address.equals(employee.address);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
