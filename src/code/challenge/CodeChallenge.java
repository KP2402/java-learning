package code.challenge;

public class CodeChallenge {
    /**
     * number 1000
     * Criteria
     * difference b/w adjacent digit should be 1
     * 10, 12, 123
     * @param args
     */
    public static void main(String[] args) {
        //checkIfSpecialNumber(false, 123);
        int n = 1000;
        // Find all the digits
        //124
        boolean isDifferenceEqualsOne = false;
        for(int i=1; i<=n; i++ ) {

            isDifferenceEqualsOne = checkIfSpecialNumber(isDifferenceEqualsOne, i);


            if(isDifferenceEqualsOne) {
                System.out.println(i);
            }
        }

    }

    private static boolean checkIfSpecialNumber(boolean isDifferenceEqualsOne, int i) {
        int remainder = i%10; // 10%10 = 0 123-> 3
        int quotient = i/10; // 1 -> 12
        int prevDigit = remainder; // 3
        while (quotient != 0) {
            remainder = quotient%10; //1, 2
            quotient = quotient/10 ; // 0, 1
            int diff = Math.abs(prevDigit - remainder);
            if(diff == 1) {
                isDifferenceEqualsOne = true;
                prevDigit = remainder;
            } else {
                isDifferenceEqualsOne = false;
                break;
            }
        }
        return isDifferenceEqualsOne;
    }
}
