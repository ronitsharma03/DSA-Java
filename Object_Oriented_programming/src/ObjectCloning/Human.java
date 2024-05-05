package ObjectCloning;

public class Human implements Cloneable {
    String name;
    int age;
    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
