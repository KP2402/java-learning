package sushant.code;

public class ExceptionTest {
    private static String temp = "1";

    public static void main(String[] args) {
        new ExceptionTest().firstMethod();
        System.out.println(temp);
    }

    private void firstMethod() {
        try {
            secondMethod();
        } catch (Exception e) {
            temp += 5;
        }
    }

    private void secondMethod() throws Exception {
        try {
            thirdMethod();
            temp +=3;
        } catch (Exception e) {
            throw new Exception();
        } finally {
            temp += 4;
        }
        temp += 5;
    }

    private void thirdMethod() throws  Exception {
        throw new Exception();
    }
}

