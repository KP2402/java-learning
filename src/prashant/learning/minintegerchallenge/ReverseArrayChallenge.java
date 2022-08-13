package prashant.learning.minintegerchallenge;

import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[] args) {

        int[] myIntArray = {1,2,3,4,5,6};
        System.out.println("My Int Array: "+ Arrays.toString(myIntArray));
        reverse(myIntArray);
        System.out.println("Reversed: "+ Arrays.toString(myIntArray));

    }

    private static void reverse(int[] myIntArray) {
        System.out.println("My Int Array: "+ Arrays.toString(myIntArray));
        for (int i=0; i<myIntArray.length/2; i++) {
            int temp = myIntArray[i];
            myIntArray[i] = myIntArray[myIntArray.length - 1 - i];
            myIntArray[myIntArray.length - 1 - i] = temp;
        }
        System.out.println("Reversed: "+ Arrays.toString(myIntArray));
    }
}
