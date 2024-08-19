
public class Main {
    public static void main(String[] args) throws Exception {
//        String message = "Hello bhai";
//        HuffmanEncoder hf = new HuffmanEncoder(message);
//        String coded = hf.encode(message);
//        System.out.println("Coded message is: "+coded);
//        String decoded = hf.decode(coded);
//        System.out.println("Decoded message is: "+ decoded);
        boolean ans = rotateString("abcde", "cdeab");
        System.out.println(ans);

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