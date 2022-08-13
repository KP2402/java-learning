package prashant.learning;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class MultiThreadingChallenge {

    /*print 1-10 using 3 different thread

    t-1 : 1
    t-2 : 2
    t-3: 3
    t-1 : 4*/

/*    Given two values m and n, fill a matrix of size ‘m*n’ in a spiral (or circular) fashion (clockwise) with natural
        numbers from 1 to m*n.
            Examples:
    Input : m = 4, n = 4
    Output : 1  2  3  4
            12 13 14  5
            11 16 15  6
            10  9  8  7
    Input : m = 3, n = 4
    Output :  1  2  3  4
            10 11 12 5
            9  8  7  6*/

    public static void printMatrixSpiral(int m, int n) {
        int i=0;
        int j=0;
        int rightExtreme = n;
        int leftExtreme = 0;
        int top = 0;
        int bottom = m;
        int arr[][] = new int[m][n];

        for(int k=1; k<m*n+1; k++) {
            // Fill outwards
            if(j>=leftExtreme && j<rightExtreme) {
                arr[i][j] = k;
                j++;
            }

            //Fill down
            if(i>=top && i<bottom && j==rightExtreme-1) {
                arr[i][j] = k;
                i++;
            }

            // Fill inwards
            if(i==bottom) {
                j--;
                arr[i][j] = k;
            }
        }

    }

//    public static void main(String[] args) {
//        printMatrixSpiral(4,4);
//    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        IntStream.range(1,11).forEach(index-> {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + ":" + index);
                }
            });
            try {
                executorService.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(index == 10) {
                executorService.shutdown();
            }
        });

    }
}
