package sushant.code;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        String s1 = "Hello ";
        s1 += "World";
        String s2 = "Hello";
        s2+=" ";
        s2 += "World";
        String s3 = s1.intern();
        String s4 = s2.intern();
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

        Integer number = 10;
        number++;
        assert number == null && number >= 0;
        System.out.println(number);

        MyClass myVar = new MyClass();
        System.out.println(myVar.iVal);

        Map<Color, String> map = new HashMap<>();
        map.put(new Color("Blue"), "Blue");
        System.out.println(map.get(new Color("Blue")));

        Comparator<Integer> numComp = (num1, num2) -> num2.compareTo(num1);
        Integer arr[] = {1,4,3,2};
        Arrays.sort(arr, numComp);
        for (Integer num : arr)
            System.out.print(num);
        System.out.println();

        System.out.println(method());

        Set<? extends IOException> set1 = new TreeSet<IOException>();
        Set<? extends IOException> set2 = new TreeSet<FileNotFoundException>();

        Runnable runnable = new Runnable() {
            public void run() {

            }
        };

        int sum = Arrays.stream(new int[]{1,2,3,4,5}).filter(i -> i%2==0).map(i->i*2).sum();
        System.out.println(sum);




    }

    static class MyClass {
        int iVal = 85;
        MyClass() {
            iVal = 41;
        }
        {
            iVal = 27;
        }
    }

    static class Color {
        String name;
        Color(String name) {
            this.name = name;
        }
    }

    private static Object method() {
        try {
            int i = 10/0;
            return i;
        } catch (ArithmeticException e) {
            return "catch";
        } finally {
            return "finally";
        }
    }
}
