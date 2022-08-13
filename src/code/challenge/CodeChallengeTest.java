package code.challenge;

/**
 * Employee class name, add, salary
 * Add class -> StreetName, SocietyName, City
 */
public class CodeChallengeTest {

    public static void main(String[] args) {
        Employee employee =
                new Employee("Prashant", new Address("MG Road", "ABC", "JSR"), 1000);
        System.out.println(employee.toString());

        Address a2 = employee.getAddress();
        a2.city = "MUM";
        System.out.println(employee.toString());

        Employee e2 = new Employee("Prashant", new Address("MG Road", "ABC", "JSR"), 2000);
        System.out.println(employee.toString());
    }

}
