package design.pattern.creational;

public class MySingletonClass {
    private MySingletonClass() {}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;
    static MySingletonClass instance = null;
    public static MySingletonClass getInstance(String name, int age) {
        if(instance == null) {
            instance = new MySingletonClass();
            instance.setName(name);
            instance.setAge(age);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "MySingletonClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
