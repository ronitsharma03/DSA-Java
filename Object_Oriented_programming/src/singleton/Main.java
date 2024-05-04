package singleton;

public class Main {
    public static void main(String[] args) {
//        Singleton obj;
        //What if you want to aloow just only one instance should be created for Singleton
        //class
//        Singleton obj = new Singleton();
        //Cannot be accessed here as Singleton class is private
        //But we can do something like this

        //To create just single instance we can do like in Singleton class
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        //All 3 reference variables pointing to only same instance obj
    }
}
