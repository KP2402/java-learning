package sushant.code;

public class MainClass {
    public static void main(String[] args) {
        Child child = new Child();
    }


}

class Parent {
    static
    {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    public Parent() {
        System.out.println(3);
    }
}

class Child extends Parent {
    static
    {
        System.out.println("4");
    }
    {
        System.out.println("5");
    }
    public Child() {
        System.out.println(6);
    }
}
