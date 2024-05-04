package packages.a;

import access_control.A; //Import the necessary file form exact package

import java.util.Arrays;

// Since it is inheriting the class A from access_controlo package we can use protected data members here
public class greeting extends A {
    public greeting(int num, String name) { // Constructor is necessary to create
        super(num, name);
    }


    public static void main(String[] args) {
        System.out.println("Hello world");

        //  Here let's try to access the protected data member arr
        greeting obj = new greeting(12, "khajuria");
        int[] arr = obj.arr;
        System.out.println(Arrays.toString(arr));
        // There are no errors so we can access it here
        // Protected data member access successful!

        A obj1 = new A(11, "Ronit");
//        int[] arr2 = obj1.arr; // We can't do something like this
        // Protected is only accessed via subclass in diff package and not even by the same class
        // Because parent does not know about the child class that are inheriting them


    }
}
