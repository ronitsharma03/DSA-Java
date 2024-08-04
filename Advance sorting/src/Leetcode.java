import java.util.Arrays;

public class Leetcode {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int ans = rangeSum(arr, 4, 1, 5);
        System.out.println(ans);
    }
    public static int rangeSum(int[] nums, int n, int left, int right) {
        int m = n * (n+1)/2;
        int[] arr = new int[m];

        int k = 0;
        for(int i = 0; i < n; i++){
            int sumSubarray = 0;
            for(int j = i; j < n; j++){
                sumSubarray += nums[j];
                if(k <= m){
                    arr[k] = sumSubarray;
                    k++;
                }
            }
        }

        Arrays.sort(arr);

        long ans = 0;
        final int mod = (int)1e9 + 7;
        for(int i = left - 1; i < right; i++){
            ans = (ans + arr[i]) % mod;
        }

        return (int)ans;
    }
}
