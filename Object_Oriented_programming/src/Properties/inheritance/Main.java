package Properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box cube = new Box(5.6);
//        System.out.println(cube.h + " " + cube.l + " " + cube.w);
//
//        Box square = new Box(5.0, 4.0);
//        System.out.println(square.h + " " + square.l + " " + square.w);
//
//        Box old = new Box(square);
//        System.out.println(old.h + " " + old.l + " " + old.w);

//         Boxweight box = new Boxweight(2.0, 3.0, 4.0, 5.0);
//        System.out.println(box.h + " " + box.w + " " + box.l + " " + box.weight);

        // Can be do something like below
//
//        Box box1 = new Boxweight(2, 3, 4, 5);
//        System.out.println(box1.w);
        //Yes we can because There are many variables in both parent and child classes
        // You are given access to the variables that are in ref type i.e Box
        // Hence you should have access to all the variables contained by Box
        // But here, when the obj itself is of type child class, how will you call the constructor
        // That is why error comes when accessing peoperty of child object type with parent reference
        // Parent classes do not knows which classes are below them
        // But child classes knows which classes are their parent




//        Boxweight box2 =  new Box(2, 3, 4);
//        System.out.println(box2);
        // No, because There are many variables in both parent and child classes
        // You are given access to the variables that are in ref type i.e Boxweight
        // Hence you should have access to all the variables contained by Boxweight
        // But here, when the obj itself is of type parent class, how will you call the constructor of child class
        // That is why error comes when accessing peoperty of child object type with parent reference
        // Parent classes do not knows which classes are below them
        // But child classes knows which classes are their parent



        BoxPrice box = new BoxPrice(5, 8, 200); // Calling the BoxPrice which in Boxprice constructor that
        // takes 2 arguments will be called
        // Super keyword -> calls the constructor of immediate parent class

        Boxweight box5 = new Boxweight();
        Boxweight.greeting(); // You can inherit but u can't override it
    }
}
