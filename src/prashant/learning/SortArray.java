package prashant.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortArray {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = new int[]{1,2,3,4,5};
        List<Integer> myListInt = new ArrayList<>();

        sortArray(myIntArray);
    }

    private static void sortArray(int[] myIntArray) {
        int[] sortedArray = Arrays.copyOf(myIntArray, myIntArray.length);
    }

    class A {

        A() {

        }

    }

    class B extends A {
        B(int a, int b) {

        }
    }

    B b = new B(2, 3);
}
