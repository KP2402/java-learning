package sushant.code;

public class GenericTest<T> {
    T value;
    public GenericTest(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        GenericTest<String> first = new GenericTest<>("a string");
        GenericTest<Integer> two = new GenericTest<>(123);
        System.out.print(first.getValue());
        System.out.println(two.getValue());
    }
}
