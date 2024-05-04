package Properties.inheritance.polymorphism;

public class Numbers {
    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(2, 3));
        System.out.println(obj.sum(4, 3, 4));
//        obj.sum(2, 3, 4, 7); This will give error as no method with 4 argument exists
    }
}
