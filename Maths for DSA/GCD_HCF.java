public class GCD_HCF {
    public static void main(String[] args) {
        int ans = GCD(3, 9);
        System.out.println(ans);
    }

    static int GCD(int n1, int n2){
        if(n1 == 0){
            return n2;
        }

        return GCD((n2 % n1), n1);
    }
}
