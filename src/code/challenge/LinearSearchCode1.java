package code.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LinearSearchCode1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input1 = bufferedReader.readLine();
        int n = Integer.parseInt(input1.split(" ")[0]);
        int m = Integer.parseInt(input1.split(" ")[1]);

        System.out.println("n=" + n + ",m=" + m);

        String input2 = bufferedReader.readLine();
        List<Integer> numberList = Arrays.asList(input2.split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(numberList);

        int status = getLastIndexOfNumberN(n, m, numberList);

        System.out.println("Status for the number " + m + " in list " + status);
        System.out.println(status);

    }

    private static int getLastIndexOfNumberN(int n, int m, List<Integer> numberList) {
        AtomicInteger status = new AtomicInteger(-1);
        IntStream.range(0, n).forEach(index -> {
            if(numberList.get(index) == m) {
                status.set(index);
            }
        });
        return status.addAndGet(1);
    }
}
