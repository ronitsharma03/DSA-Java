public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int fact(int n){

        if(n <= 2){
            return n;
        }
        return n * fact(n - 1);
    }
}
