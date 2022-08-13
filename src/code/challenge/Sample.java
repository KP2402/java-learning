package code.challenge;

/*
1       2        30
8       90        4
7       6        5
*/

// Right Down



public class Sample {

    public void spiralMatrix(int n, int i, int j) {
        int matrix[][] = new int[n][n];
        int totalElements = n*n;
        int topRow = 0;
        int topColumn = 0;
        int bottomRow = n-1;
        int bottomColumn = n-1;
        for(int k=1; k<totalElements+1; k++) {
            if(topColumn<=bottomColumn) {
                matrix[topRow][topColumn] = k;
                topColumn++;
            } else if(topRow <= bottomRow) {
                matrix[topRow][bottomColumn] = k;
                topRow++;
            }
        }


    }
}
