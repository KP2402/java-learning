package aqr.code;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AQRMain {
    public static void main(String[] args) {
         /*

         Person
         Name | City | Age
         Andrew | NY | 67
         Andy | NY | 70
          Top 5 cities with age>65

         select top 5 count(*), City
         from person where age > 65
         GROUP BY CITY
         order by 1 DESC

          */

        /*
        List<Person>
         */
        List<Person> personList = Arrays.asList(new Person("Andrew", "NY", 67), new Person("Andy", "NY", 70), new Person("Tony", "LA", 80));

        Map<String, Long> collect = personList.stream().filter(person -> person.getAge() > 65).collect(Collectors.groupingBy(Person::getCity , Collectors.counting()));
        System.out.println(collect);
        LinkedHashMap<String, Long> reverseSortedMap = new LinkedHashMap<>();

        collect.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x->reverseSortedMap.put(x.getKey(),x.getValue()));
        System.out.println(reverseSortedMap);
     }
}
