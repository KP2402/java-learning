package design.pattern.creational;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
//        MySingletonClass mySingletonClass1 = MySingletonClass.getInstance("Prashant", 30);
//        System.out.println(mySingletonClass1);
//        MySingletonClass mySingletonClass2 = MySingletonClass.getInstance("Lovely", 27);
//        System.out.println(mySingletonClass2);
//        mySingletonClass1 = MySingletonClass.getInstance("Praveena", 28);
//        System.out.println(mySingletonClass1);
        CompletableFuture<MySingletonClass> person1 = CompletableFuture.supplyAsync(() -> MySingletonClass.getInstance("Prashant", 30));
        CompletableFuture<MySingletonClass> person2 = CompletableFuture.supplyAsync(() -> MySingletonClass.getInstance("Lovely", 27));
        CompletableFuture<MySingletonClass> person3 = CompletableFuture.supplyAsync(() -> MySingletonClass.getInstance("Praveena", 28));
        CompletableFuture.allOf(person1,person2,person3).thenRunAsync(() -> {
            try {
                System.out.println(person1.get());
                System.out.println(person2.get());
                System.out.println(person3.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }).join();


    }
}
