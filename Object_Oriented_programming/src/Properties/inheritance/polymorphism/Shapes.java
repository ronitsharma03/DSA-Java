package Properties.inheritance.polymorphism;

public class Shapes { // Using final here can be used to prevent  inheritance
    void area(){ // If this method is declared as final then @Override can't be used
        System.out.println("I am in Shapes class");
    }

    // Example to Early binding
//    final void area(){ // If this method is declared as final then @Override can't be used
//        System.out.println("I am in Shapes class");
//    }
}
