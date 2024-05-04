package staticVariableExample;

public class InnerClasses {
    //But here it is not static and it can't be called inside a static main mehtod
    //because now it depends on Innercalsses's object but if we pu it outside
    //Innerclasses then it wont give any error
//    class Test{
//        String name;
//        public Test(String name){
//            this.name = name;
//        }
//
//    }

//    static class Test{
//        String name;
//        public Test(String name){
//            this.name = name;
//        }
//    }
    static class Test{
        static String name;
        //If the variable is static then the output will be the last modified value
    //It now wont depend upon the individual instances
    //Static methods are resolved during compile time
        public Test(String name){
            Test.name = name;
        }


    @Override
    public String toString() {
        return name;
    }
}
    //Since the above class is static so it should not require any obj to run
    // But that's not completely true but it also means where the static method
    //is called they can (have instances/depend on) of each other's instances and do not depend on the
    //instances of outer/parent class i.e Innerclasses above ^|^
    public static void main(String[] args) {
        Test a = new Test("Ronit");
//        Test b = new Test("Khajuria");

        //If i will print a then it will give some random gibrish
        // Because out is a type of printStream and printStream has a println method that
        //is being called here println calls the value of what is passed which internally
        //calls the toString method -> toString() method just getclassname and add @ +
        // some hexstring..That's why we getsoem hex gibrish when we call an object of a class

        //While calling toString() it will check well if it has its own toString()
        //method if yes then it will call its toString otherwise default one

//
        System.out.println(a.name);
//        System.out.println(b.name);
    }
}

//Outside classes cannot be static
//static class A{
//
//}
