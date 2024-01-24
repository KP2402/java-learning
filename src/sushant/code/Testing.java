package sushant.code;

import prashant.learning.MultiThreadingChallenge;

public class Testing implements Runnable {
    public static Testing obj;
    private int data;
    public Testing() {
        data = 10;
    }
    public static void main(String[] args) {
//        Testing testing = new Testing();
//        MyInnerClass innerClass = testing.new MyInnerClass();



    }

    @Override
    public void run() {
        obj = new Testing();
//        obj.wait(); // Compilation error
        obj.data += 20;

        System.out.println(obj.data);

    }

    private class MyInnerClass {

    }
}
