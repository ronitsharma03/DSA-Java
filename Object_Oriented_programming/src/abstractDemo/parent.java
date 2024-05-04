package abstractDemo;

public abstract class parent {
    // As we know final keyword prevents a class from being inherited and abstract classes are made to be inherited
    // So we can't use final keyword with abstract classes

    public parent(int age) {
        this.age = age;
    }

    static void hello(){
        System.out.println("Hello, I am a static method inside a abstract class!");
    }

    int age;
    abstract void career();
    abstract void partner();
}
