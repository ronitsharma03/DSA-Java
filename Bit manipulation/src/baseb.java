//This will find the number of digits in the base format of that given number
//for eg: (7)base(10) -> (0111)base(2) => means 7 in binary is 0111. and it has 4 digits.
public class baseb {
    public static void main(String[] args) {
        int n = 332;
        int base = 2;
        System.out.println(Integer.toBinaryString(n)); //to confirm the number of digits
        int ans = (int)((Math.log(n)/Math.log(base)) + 1);
        System.out.println(ans);
    }
}
