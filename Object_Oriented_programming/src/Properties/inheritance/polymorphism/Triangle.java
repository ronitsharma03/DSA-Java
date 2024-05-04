package Properties.inheritance.polymorphism;

public class Triangle extends Shapes{
    @Override
    void area(){
        System.out.println("1/2 * base * height");
    }
}
