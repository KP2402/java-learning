package prashant.learning.employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManageEmployee {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee e1 = new Employee(1, "Prashant", 1000L);
        Employee e2 = new Employee(2, "KP", 2000L);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);

        FileOutputStream fileOutputStream = new FileOutputStream("/Users/kprashant/github/Java-Learning/src/resources/text.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employeeList);
        System.out.println(e1.toString());
        System.out.println(e2.toString());

        FileInputStream fileInputStream = new FileInputStream("/Users/kprashant/github/Java-Learning/src/resources/text.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Employee> employee = (List<Employee>) objectInputStream.readObject();
        employee.forEach(e -> System.out.println(e.toString()));
    }
}
