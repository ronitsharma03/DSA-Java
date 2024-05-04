package access_control;

public class A {
    private int num;
    String name;
    protected int[] arr; // Let's see the use of protected access modifier
    // We know protected is only accessed in same package using subclass and it is only be accessed in diff package
    // If it is the subclass of the class where it is defined
    // To access it in diff package let's say in 'packages' package

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A() {

    }

    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
