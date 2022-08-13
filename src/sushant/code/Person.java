package sushant.code;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class Person {
    public static void main(String[] args) {

        List<List<String>> employees = Arrays.asList(Arrays.asList("Sachin", "Tarun"), Arrays.asList("Sam","Ankit"), Arrays.asList("Anil"));
        employees.stream().flatMap(name ->name.stream()).filter(s ->s.startsWith("A"))
                .collect(Collectors.toList())
                .forEach(System.out::print);

        ExecutorService service = Executors.newFixedThreadPool(2);
        Future result = service.submit(()->1);


        Car<String> cString = new Car<>();
        Car c = cString;

    }

    void  waitForSignal() throws InterruptedException {
        Object object = new Object();
        synchronized (Thread.currentThread()) {
            object.wait();
            object.notify();
        }
    }



}

class Car<T> {
    void set(T t) {

    }
}
