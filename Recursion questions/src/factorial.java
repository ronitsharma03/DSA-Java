public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int ans = 1;
    static int fact(int n){

        if(n <= 2){
            return n;
        }
        ans = n * fact(n - 1);
        return ans;
    }
}
