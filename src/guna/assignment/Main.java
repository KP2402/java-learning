package guna.assignment;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CustomOutputStream os = new CustomOutputStream("Prashant");
        os.write(5);
    }
}
