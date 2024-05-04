public class uniqueInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 1, 2, 7, 0, 6, 6, 4, 7};
        //using the XOR operator to find the unique element
        System.out.println(unique(arr));
    }

    private static int unique(int[] arr) {
        int ans = 0;
        for(int n: arr){
            ans ^= n;
        }
        return ans;
    }
}
