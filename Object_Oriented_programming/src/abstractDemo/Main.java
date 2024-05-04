package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(24);
        son.career();

        Daughter daughter = new Daughter(23);
        daughter.career();

        // Since we can't create objects of abstract class but we can use runtime polymorphism and use it as
        // reference variable
        parent daughter1 = new Daughter(22);
        daughter1.career();

        // Since the constructor of abstract class can be made
        // SO let's try this
//        parent mon = new parent(45); // It is giving an error
        // It means we cannot create an object of abstract class
        // But it allows you to Override the abstract methods in it
//        parent papa = new parent(50) {
//            @Override
//            void career() {
//                System.out.println("My papa is a hero");
//            }
//
//            @Override
//            void partner() {
//                System.out.println("he married to a great lady");
//            }
//        }; // It allows this

        parent.hello();
    }
}
