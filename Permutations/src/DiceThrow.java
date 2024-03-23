import java.util.ArrayList;
import java.util.Stack;

public class DiceThrow {
    public static void main(String[] args) {
        Dice("", 6);
        System.out.println();
        System.out.println(DiceList("", 6));
        System.out.println();
        System.out.println(DiceFaceList("", 7, 7));
    }

    static void Dice(String p, int target){
        if(target == 0){
            System.out.print(p+", ");
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            Dice(p + i, target - i);
        }
    }

    static ArrayList<String> DiceList(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(DiceList(p + i, target - i));
        }
        return ans;
    }

    static ArrayList<String> DiceFaceList(String p, int target, int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            ans.addAll(DiceFaceList(p + i, target - i, face));
        }
        return ans;
    }
}
