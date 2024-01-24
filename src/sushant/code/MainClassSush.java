package sushant.code;

//class Base {
//    final public void show() {
//        System.out.println("Base::show() called");
//    }
//}
//
//class Derived extends Base {
//    public void show() {
//        System.out.println("Derive::show() called");
//    }
//}

public class MainClassSush {
    static void printString(char[] str, int n)
    {
        // count number of 1s
        StringBuilder stringBuilder = new StringBuilder();
        int ones = 0;
        for (int i = 0; i < n; i++)
            if (str[i] == 'b')
                ones++;

        // To check if the all the 1s
        // have been used or not
        boolean used = false;

        for (int i = 0; i < n; i++)
        {
            if (str[i] == 'c' && !used)
            {
                used = true;

                // Print all the 1s if any 2 is encountered
                for (int j = 0; j < ones; j++)
                    stringBuilder.append('b');
            }

            // If str[i] = 0 or str[i] = 2
            if (str[i] != 'b')
                stringBuilder.append(str[i]);

        }

        // If 1s are not printed yet
        if (!used)
            for (int j = 0; j < ones; j++)
                stringBuilder.append('b');
        System.out.println(stringBuilder.toString());
    }

    // Driver code
    public static void main(String[] args)
    {
//        String str = "100210";
        String str = "baacba";
        int n = str.length();
        printString(str.toCharArray(), n);
    }
}

