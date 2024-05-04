package Properties.inheritance.polymorphism;

import java.awt.*;

public class Square extends Shapes {
    // Annotation -> @Override
    @Override // method overriding -> Runtime polymorphism
    void area(){
        System.out.println("Side * Side");
    }
//    *** Important NOTES ***
    // Type of method in overriding that is called depends upon the type of object it is
    // But here in method Overriding the method being called depends upon the object type
    // The variables or methods it can access still depends upon the ref type not object but while method overriding
    // It calls the method of object type not ref type
    // The method gonna be called should be present in the ref type

    // Actually, what it's able to access is defined by the ref type but which one it should access
    // is defined by object type in method Overriding
}
