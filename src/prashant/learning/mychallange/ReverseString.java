package prashant.learning.mychallange;

import java.util.Stack;
import java.util.stream.IntStream;

public class ReverseString {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String myString = "reverse";
        char[] splitString = myString.toCharArray();
        IntStream.range(0,splitString.length).forEach(i -> {
            stack.push(String.valueOf(splitString[i]));
        });

        while (!stack.empty()) {
            System.out.print(stack.pop());
        }

        System.out.println("\n");
    }
}
