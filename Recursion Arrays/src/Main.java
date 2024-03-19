public class Main {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 3, 44, 99};
        System.out.println(checkArr(arr, 0));
    }

    static boolean checkArr(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }
        if(arr[index] < arr[index + 1]){
            return checkArr(arr, index + 1);
        }
        return false;
    }
}