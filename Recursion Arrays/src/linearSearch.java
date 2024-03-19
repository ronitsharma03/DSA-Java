
import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 23, 5, 2, 55, 5, 7, 876};
//        System.out.println(linearSearchRecursion(arr, 0, 5));
//        ArrayList<Integer> ans = findAllIndex(arr, 0, 5, new ArrayList<>());
//        System.out.println(ans);

        ArrayList<Integer> ans2 = findAllIndex2(arr, 0, 5);
        System.out.println(ans2);
    }

    static int linearSearchRecursion(int[] arr, int index, int target){
        if(index == arr.length){
//            System.out.println(arr.length - 1);
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return linearSearchRecursion(arr, index + 1, target);
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

    static ArrayList<Integer> findAllIndex2(int[] arr, int index, int target){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromReturningCalls = findAllIndex2(arr, index + 1, target);
        list.addAll(ansFromReturningCalls);
        return list;
    }
}
