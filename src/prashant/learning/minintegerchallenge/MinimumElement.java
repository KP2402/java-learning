package prashant.learning.minintegerchallenge;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MinimumElement {


    public static void main(String[] args) {

        int count = readInteger();

        int[] myIntegers = readElements(count);

        System.out.println("My integers: " + Arrays.toString(myIntegers));

        int min = findMin(myIntegers);

        System.out.println("Min integer in array: " + min);
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        return scanner.nextInt();
    }

    private static int findMin(int[] myIntegers) {
        int min = myIntegers[0];

        for (int myInteger : myIntegers) {
            if (myInteger < min)
                min = myInteger;
        }

        return min;
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] readIntegers = new int[count];
        for (int i=0; i<count; i++) {
            readIntegers[i] = scanner.nextInt();
        }
        return readIntegers;
    }
}
