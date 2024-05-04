package access_control;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Ronit");
        // 1. Need to do few things
        // 2. Access the data members
        // 3. modify the data members
        // we can access data members like this
//    obj.arr; but it is not hte right convention to do so
        // Best convention to do so is getter and setter
//    Getter and Setter are defined in the class as public as they are public so can be accessed in any file of the package
        // To access the obj.num -> Do like obj.getNum();

        System.out.println(obj.getNum()); // Private data members can be accessed via the public getters


    }
}

