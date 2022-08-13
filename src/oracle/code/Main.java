package oracle.code;

import java.util.stream.IntStream;

//         1
//        121
//       12321
//      1234321
public class Main {
    public static void main(String[] args) {
        int pyramidLength = 5;
        int start = 1;
        int end = 1;
        for(int i=pyramidLength; i>0; i--) {
            for (int c=0; c<i; c++) {
                System.out.print(" ");
            }
            for(int j=0; j<end; j++) {
                System.out.print(j+1);

             }
            for(int k=end; k>start; k--) {
                System.out.print(k-1);
            }
            System.out.println();
            end++;
        }

    }

    private static void printPyramid(int pyramidLength) {
        int matrixLength = pyramidLength*2 - 1;
        for(int i=0;i<pyramidLength;i++) {
            int startNumber = 1;
            int mid = matrixLength/2;
            int start = mid-i;
            int end = mid+i;
            for(int j=0; i<end; j++) {
                if(j>=start && j<=mid) {
                    System.out.println(startNumber);
                    startNumber++;
                } else {
                    System.out.println(" ");
                }

            }
        }
    }
}
