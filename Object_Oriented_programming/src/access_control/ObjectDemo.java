package access_control;

public class ObjectDemo extends A {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }



    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //Let's override thia method
    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
       // ObjectDemo obj = new ObjectDemo(34);
       // System.out.println(obj.hashCode()); // hashcode -> A unique representation of an object via a number

        ObjectDemo obj = new ObjectDemo(12, 77.9f);
        ObjectDemo obj1 = new ObjectDemo(12, 77.9f);

        if(obj == obj1){
            System.out.println("Obj is equal to obj2");
        }
        if(obj.equals(obj1)){
            System.out.println("Obj is equal to obj1 -> .equals() method");
        }

        // Trying instanceof method
        System.out.println(obj instanceof ObjectDemo);
        System.out.println(obj instanceof Object); // Every object extends the Object class in java

        System.out.println(obj.getClass()); // getClass method is stored in heap
        // Gives data about the object includes various methods



    }
}
