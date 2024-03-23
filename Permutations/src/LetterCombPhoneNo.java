import java.util.ArrayList;

public class LetterCombPhoneNo {
    public static void main(String[] args) {
        System.out.println(phonepadCount("", "01"));
    }

    static void phonepad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char)('a' + i);
            phonepad(p + ch, up.substring(1));
        }
    }
    static ArrayList<String> phonepadList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char)('a' + i);
            ans.addAll(phonepadList(p + ch, up.substring(1)));
        }
        return ans;
    }

    static int phonepadCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int digit = up.charAt(0) - '0';
        int count = 0;
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char)('a' + i);
            count += phonepadCount(p + ch, up.substring(1));
        }
        return count;
    }

}
