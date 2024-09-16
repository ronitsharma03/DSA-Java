
public class Main {
    public static void main(String[] args) throws Exception {
//        String message = "Hello bhai";
//        HuffmanEncoder hf = new HuffmanEncoder(message);
//        String coded = hf.encode(message);
//        System.out.println("Coded message is: "+coded);
//        String decoded = hf.decode(coded);
//        System.out.println("Decoded message is: "+ decoded);
//        boolean ans = rotateString("abcde", "cdeab");
//        System.out.println(ans);
        String s = "   -042";
        s = s.trim();
        int n = s.length();
        if (n == 0) {
            return;
        }
        String temp = "";
        for (int i = 0; i < n; i++) {
            // if (s.charAt(i) == ' ') {
            //     continue;
            // } else
            if (s.charAt(i) == '-' && i == 0) {
                temp += s.charAt(i);
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                temp += s.charAt(i);
            } else {
                break;
            }
        }
        int ans = 0;
        if (temp.length() != 0) {
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == '-' && i == 0) {
                    continue;
                }
                    int offset = temp.charAt(i) - '0';
                    System.out.println(offset);
                    ans = ans * 10 + offset;

            }
        }
        System.out.println(ans);
//        System.out.println(temp.length() == 0 ? 0 : (temp.charAt(0) == '-' ? -(ans) : ans));

    }

        public static boolean rotateString(String s, String goal) {
            StringBuilder sb = new StringBuilder(s);
            for(int i = 0; i < s.length(); i++){
                sb.append(s.charAt(i));
            }
            int j = 0, i = 0;
            while(j < goal.length() && i < sb.capacity()){
                if(sb.charAt(i) == goal.charAt(j)){
                    i++;
                    j++;
                }else{
                    j = 0;
                    i++;

                }
            }
            return j == goal.length();
        }

}