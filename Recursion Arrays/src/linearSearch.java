import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 23, 5, 2, 55, 5, 7, 876};
        System.out.println(linearSearch(arr, 0, 5));
        ArrayList<Integer> ans = findAllIndex(arr, 0, 5, new ArrayList<>());
        System.out.println(ans);
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

    static ArrayList<Integer> findAllIndex(int[] arr, int index, int target, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, index + 1, target, list);
    }
}
