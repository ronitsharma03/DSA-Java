package LL;

public class New {
    public static void main(String[] args) {
        System.out.println(armstrongNumber(12345));
    }
    static String armstrongNumber(int n){
        // code here
        int temp = n;
        int digits = countDigits(n);
        int resultNum = 0;

        while(temp > 0){
            int rem = temp % 10;
            int powerRes = (int)(Math.pow(rem, digits));
            resultNum += powerRes;
            temp /= 10;
        }
        if(resultNum == n){
            return "Yes";
        }
        return "No";
    }

    static int countDigits(int num){
        int tem = num;
        int count = 0;
        while(tem > 0){
            int rem = tem % 10;
            count++;
            tem /= 10;
        }
        return count;
    }


}
