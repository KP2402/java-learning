package sushant.code;

public class MainClass {
    public static void main(String[] args) {

    }


}

class Parent {
    int number;
    Parent(int i) {
        number = i;
    }
}

class Child extends Parent {
    int  count;
    public Child(int count, int num) {
        super(num);
        this.count=count;
    }

    Child(int count) {
        this(count, 0);
    }

}
