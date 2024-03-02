public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        print(1);
    }
    static void print(int n){
        System.out.println(n);
        if(n < 5){
            print(n+1);
        }
    }
}