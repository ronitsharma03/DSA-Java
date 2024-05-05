package ObjectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human ronit = new Human("Ronit", 20);
        // When we are cloning the object using the new keyword it will take much time in processing instead we can use clone method
        // Clone method is in the Object class
        // Human clone = new Human(ronit);

        Human clone = (Human) (ronit.clone());
        System.out.println(clone.age + " " + clone.name);

        System.out.println(Arrays.toString(clone.arr));
        // If we changes the object cloned's array
        clone.arr[0] = 100;
        // Then the object who got cloned their variables will also change -> this is known as shallow copying
        System.out.println(Arrays.toString(ronit.arr));
    }
}
