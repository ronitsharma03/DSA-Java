package Interfaces.ExtendDemo;

public class Main  implements B{
    @Override
    public void fun() {
        System.out.println("Function from A interface");
    }

    @Override
    public void greet() {
        System.out.println("Function from B interface");
    }

    public static void main(String[] args) {

    }
}
