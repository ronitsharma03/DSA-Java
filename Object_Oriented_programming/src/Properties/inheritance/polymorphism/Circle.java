package Properties.inheritance.polymorphism;

public class Circle extends Shapes{
    @Override
    void area(){
        System.out.println("Pi * r * r");
    }
}
