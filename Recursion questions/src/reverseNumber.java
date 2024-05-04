public class reverseNumber {

    // Way 1
    static int sum = 0;
    static void reverse(int n){
        if(n == 0){
            return;
        }
        int rem = 0;
        rem = n%10;
        sum = sum * 10 + rem;
        reverse(n/10);
    }

    //Way 2
    static int rev(int n){
        int digits = (int)(Math.log10(n) + 1);
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n){
            return n;
        }

        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits - 1)) + helper(n/10, digits - 1);
    }
    static boolean palin(int n){
        return n == rev(n);
    }

    public static void main(String[] args) {
//        reverse(874398);
        System.out.println(palin(1));
    }
}
