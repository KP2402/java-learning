package sushant.code.morgan;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

    calculate();

        MyAdd<String> myAdd = new MyAdd<>();
        MyAdd c = myAdd;


        Person p1 = new Person("firstName1", "lastName1");
        Person p2 = new Person("firstName2", "lastName2");
//        List<Person> list = new ArrayList<>();
//
//        list.add(p1);
//        list.add(p2);
//
//        Iterator<Person> itr = list.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//            list.add(new Person("firstName3", "lastName3"));
//        }

        Set<Person> treeSet = new TreeSet<>();
        treeSet.add(p2);
        treeSet.add(null);
        treeSet.add(p1);

        for(Person p: treeSet) {
            System.out.println(p);
        }
    }

    void waitForSignal() throws Exception {
        Object obj = new Object();
        synchronized (Thread.currentThread()) {
            obj.wait();
            obj.notify();
        }
    }

    private static void calculate() {
        Integer[] arr = new Integer[] {10, 3, 10, 2, 20};
        List<Integer> list = Arrays.asList(arr);
        OptionalDouble avg = list.stream().mapToInt(n -> n*n).filter(n -> n>=10).average();
        if(avg.isPresent()) {
            System.out.println(avg.getAsDouble());
        }
    }
}
