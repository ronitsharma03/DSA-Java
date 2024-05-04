package staticVariableExample;

public class Main {
    public static void main(String[] args) {
        Human ronit = new Human(20, "Ronit", 100000, false);
        Human khajuria = new Human(30, "khajuria", 100000, true);

        System.out.println(ronit.name);
//         Here it prints the population as 1 But it should be 2 bcoz 2 people exists
//         This is because the population variable is not declared as static
//         Static variable do not depend on the instances of a class
//        System.out.println(ronit.population);

        //And to call or print them actual class name is used not the instance name as it do nopt depends on instances
        System.out.println(Human.population);

//        -> Why main method is always declared as static method
        //Let's call greeting method
//        greeting();
        //But it's giving an error -> Because non-static methods cannot be used inside static methods
        // if greeting method is static then it will work
        // We know that something that is non-static belongs to an object

        greeting();


        //From fun2() ->
        //When greetin2() is called but it don't have obkect then it will ask its
        //parent and when parent runs it actually dont need any object to run
        Main fun2Obj = new Main();
        fun2Obj.fun2();

    }

    //This is not dependent on objects
static void fun(){

        //So here i am referencing it to an object of main classto run greeting2()
        Main obj = new Main();
        obj.greeting2();
        // greeting2(); //We cant use this because this method depends on an object
    //But the function we are using it in does not depend on instances
    //If i create fun method a non-static then it will require an object to call
    // So let's implement this example with fun2() method


}

void fun2(){
        greeting2(); //Here to call greeting() no object is required
    //Because in order to run greeting() fun2() will be called and to run fun2()
    // Object is required so in main method ->
}

    //This is dependent on objects
    static void greeting(){
        System.out.println("Hello from outside main");
    }
    void greeting2(){
//        fun(); //But we can acces fun() method here because it does not need an object to run
        // So we can use static methods inside a non-static methods and can't use non-static methods inside static methods
        System.out.println("Hello from greeting 2");
    }
}
