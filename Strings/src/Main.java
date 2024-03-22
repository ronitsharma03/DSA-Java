public class Main {
    public static void main(String[] args) {
        System.out.println(skip("Hola Amigos")); // with new string answer in every function call
        skip2("", "bela ciao"); // with new answer string as an argument in function call
    }

    static String skip(String original){
        if(original.isEmpty()){
            return "";
        }

        char ch = original.charAt(0);
        if(ch == 'a' || ch == 'A'){
            return skip(original.substring(1));
        }
        else {
            return ch + skip(original.substring(1));
        }
    }

    static void skip2(String answer, String original){
        if(original.isEmpty()){
            System.out.println(answer);
            return;
        }

        char ch = original.charAt(0);
        if(ch == 'a' || ch == 'A'){
            skip2(answer + "", original.substring(1));
        }
        else {
            skip2(answer + ch, original.substring(1));
        }
    }
}