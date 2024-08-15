public class Main {
    public static void main(String[] args) throws Exception {
        String message = "Hello bhai";
        HuffmanEncoder hf = new HuffmanEncoder(message);
        String coded = hf.encode(message);
        System.out.println("Coded message is: "+coded);
        String decoded = hf.decode(coded);
        System.out.println("Decoded message is: "+ decoded);
    }
}