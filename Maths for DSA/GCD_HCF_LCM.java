public class GCD_HCF_LCM {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 7;
        int ans1 = GCD(n1, n2);
        int ans2 = LCM(n1, n2, ans1);
        System.out.println("GCD("+n1+","+n2+") = "+ans1);
        System.out.println("LCM("+n1+","+n2+") = "+ ans2);
    }

    static int GCD(int n1, int n2){
        if(n1 == 0){
            return n2;
        }

        return GCD((n2 % n1), n1);
    }

    static int LCM(int n1, int n2, int gcd){
        return (n1 * n2)/gcd;
    }
}
