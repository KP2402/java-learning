package prashant.learning.mychallange;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Employee e1 = new Employee(10,"12345", "KP", "abcd");
        Employee e2 = new Employee(10,"12345", "KP", "abcd");

        System.out.println("Prashant".getBytes().length);

        HashSet<Employee> hashSet = new HashSet<>();
        hashSet.add(e1);
        hashSet.add(e2);

        System.out.println(hashSet.size());

        for (Employee employee : hashSet) {
            System.out.println(employee.toString());
        }
    }
}
