package ObjectCloning;

public class Human implements Cloneable {
    String name;
    int age;
    int[] arr;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr = new int[]{1, 2, 3, 4, 5};
    }

//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException{
        Human clone = (Human)super.clone(); // this is actually shallow copy

        // Deep copy example
        clone.arr = new int[clone.arr.length];
        for (int i = 0; i < clone.arr.length; i++){
            clone.arr[i] = this.arr[i];
        }
        return clone;
    }
}
