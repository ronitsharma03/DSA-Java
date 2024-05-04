package Interfaces.Nestedinterfaces;

public class A {
    // nested interfaces
    // But top level interface has to be declared public or default one
    public interface NestedInterface{ // Nested interface can be declared as public, private or protected

        boolean isOdd(int num);
    }
}
class B implements A.NestedInterface{
    @Override
    public boolean isOdd(int num){
        return (num&1) == 1;
    }
}
