import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

//        int max = arr[0];
//        for(int num: arr){
//            if(num > max){
//                max = num;
//            }
//        }
        // collection framework methods
        int max = Arrays.stream(arr).max().getAsInt();

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

    public static void countSortHash(int[] arr){
        if(arr == null || arr.length <= 1){
            return;
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        Map<Integer, Integer> countMap = new HashMap<>();

        for(int num: arr){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int index = 0;
        for (int i = min; i <= max; i++) {
            int count = countMap.getOrDefault(i, 0);
            for (int j = 0; j < count; j++) {
                arr[index] = i;
                index++;
            }
        }
    }
}