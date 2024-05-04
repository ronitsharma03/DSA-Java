package staticVariableExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    // to initialize the static variables we can use a static block to initialize that
    // Will run only once when the class is first loaded or the first obj is created

    static{
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        //Creating new object to reset the value of b -> because then staticBlock
        //will run again and reset the value of b to 20 again
        StaticBlock obj2 = new StaticBlock();
        System.out.println("After new obj");
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        //But it is still the same b = 23 because static block run exaxctly
        //only once when the first obj is created
    }
}
