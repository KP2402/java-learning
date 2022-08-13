package prashant.learning.mychallange;

public class StringChallenge {
    public static void main(String[] args) {
        String str1 = "prashant";
        System.out.println(str1);
        printwelcome(str1);
        System.out.println(str1);
        System.out.println(str1);
        printwelcome(str1);
        System.out.println(str1);
    }

    private static void printwelcome(String str1) {
        str1 = str1 + "welcome";
        System.out.println(str1);
    }
}
