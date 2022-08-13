package prashant.learning.mychallange;

import java.util.Objects;

public class Employee {

    private int age;
    private String phoneNumber;
    private String name;
    private String address;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return age == employee.age &&
//                Objects.equals(phoneNumber, employee.phoneNumber) &&
//                Objects.equals(name, employee.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(age, phoneNumber, name);
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Employee(int age, String phoneNumber, String name, String address) {
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
    }


}
