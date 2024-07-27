import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 10, 1, 1, 2, 3, 6};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr){
        if(arr == null || arr.length <= 1){
            return;
        }

        int max = arr[0];
        for(int num: arr){
            if(num > max){
                max = num;
            }
        }

        int[] freqArray = new int[max+1];
        for (int num: arr){
            freqArray[num]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while(freqArray[i] > 0){
                arr[index] = i;
                index++;
                freqArray[i]--;
            }
        }
    }
}