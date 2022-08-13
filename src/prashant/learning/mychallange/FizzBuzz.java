package prashant.learning.mychallange;

import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {
        int n = 20;
        printFizzBuzz(n);
    }

    private static void printFizzBuzz(int n) {
        IntStream.range(1,n+1).forEach(index -> {
            if(index%3==0) {
                System.out.print("Fizz");
                if(index%5==0) {
                    System.out.print("Buzz");
                }
            } else if(index%5==0){
                    System.out.print("Buzz");
            } else {
                System.out.print(index);
            }
            System.out.print("\n");
        });
    }
}
