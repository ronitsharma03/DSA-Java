public class seiveOfEratostheneses {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        Seive(n, primes);
    }


    //False in the array means the number is prime
    static void Seive(int n, boolean[] primes) {
        for (int i = 2; i <= n; i++) {
            if(!primes[i]){
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
