package Interfaces.ExtendDemo2;

public interface A {
//    static void greeting(); can't do this as static methods can't be overriden and overriding interface methods
    // needs no body so static should have their body
    static void greeting(){
        System.out.println("Hey i am a static interface method");
    }
    default void fun(){
        System.out.println("I am inside A interface");
    }
}
