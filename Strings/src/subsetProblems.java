import java.lang.reflect.Array;
import java.util.ArrayList;

public class subsetProblems {
    public static void main(String[] args) {
        System.out.println(subSeqReturnList("", "abcd"));
    }

    // Simple method
    static void SubSeq(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + ", ");
            return;
        }

    char firstChar = up.charAt(0);
        SubSeq(p + firstChar, up.substring(1));
        SubSeq(p, up.substring(1));
    }


    // Using ArrayList int the function body
    static ArrayList<String> subSeqReturnList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char firstChar = up.charAt(0);

        ArrayList<String> left = subSeqReturnList(p + firstChar, up.substring(1));
        ArrayList<String> right = subSeqReturnList(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
