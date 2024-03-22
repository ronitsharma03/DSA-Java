public class Main {
    public static void main(String[] args) {
        System.out.println(skip("Hola Amigos")); // with new string answer in every function call
        skip2("", "bela ciao"); // with new answer string as an argument in function call
        System.out.println(skipString("bcaaapplehad"));
        System.out.println(skipAppNotApple("bcaaapplhad"));
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
            skip2(answer, original.substring(1));
        }
        else {
            skip2(answer + ch, original.substring(1));
        }
    }

    static String skipString(String original){
        if(original.isEmpty()){
            return "";
        }

        if(original.startsWith("apple")){
            return skipString(original.substring(5));
        }
        else {
            return original.charAt(0) + skipString(original.substring(1));
        }
    }

    //skip a string if it's not the required string
    static String skipAppNotApple(String original){
        if(original.isEmpty()){
            return "";
        }

        if(original.startsWith("app") && !original.startsWith("apple")){
            return skipAppNotApple(original.substring(3));
        }
        else {
            return original.charAt(0) + skipAppNotApple(original.substring(1));
        }
    }
}