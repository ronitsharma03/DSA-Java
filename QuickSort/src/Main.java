import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        QuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void QuickSort(int[] nums, int l, int h){
        if(l >= h){
            return;
        }
        int s = l;
        int e = h;
        int mid = s + (e - s)/2;
        int pivot = nums[mid];

        while(s <= e){

            //also a reason why quick sort is preferred over merge sort is it will not swap if the array is already sorted

            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        //Now my pivot is at correct index please sort the two halves
        // - [low, end] & [start, high]
        QuickSort(nums, l, e);
        QuickSort(nums, s, h);

    }
}