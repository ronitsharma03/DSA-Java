package Interfaces.ExtendDemo2;

public class Main  implements B, A{

    @Override
    public void greet() { // Overriding method should not be private -> should be protected and better than protected
        // that is public
        System.out.println("Function from B interface");
    }
    // Here the fun method from A interface is not being overriden here because a default method is present in A
    // But if i create a default in B as well then we will get the error -> So the initial problem we were trying
    // To solve is getting in here

    // The main working of default methods is to provide a mean by which the interfaces could be expanded
    // without breaking the existing code

    // If a class implements more than one interface and both have some default method then it will throw error


    public static void main(String[] args) {
//        Main obj = new Main();
        A.greeting(); // Static methods shouls be called via the interface name
//        obj.greeting(); // This will gives an error -> static don't need object to get called
    }
}
