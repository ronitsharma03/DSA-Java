public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 23, 5, 2, 55, 7, 876};
        System.out.println(linearSearch(arr, 0, 876));
    }

    static int linearSearch(int[] arr, int index, int target){
        if(index == arr.length){
//            System.out.println(arr.length - 1);
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return linearSearch(arr, index + 1, target);
    }
}
