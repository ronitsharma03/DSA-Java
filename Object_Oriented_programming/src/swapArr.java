import java.util.Arrays;

public class swapArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(SwapArr(arr));
        System.out.println(Arrays.toString(arr));
        SwapArr(arr);
        System.out.println(Arrays.toString(arr));


    }


    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void SwapArr(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
