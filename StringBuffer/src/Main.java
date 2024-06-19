public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.insert(2, "Ronit");
        sb.replace(2, 7, "oooo");
        sb.delete(2, 6);
        sb.reverse();
        String str = sb.toString();
        System.out.println(str);
    }
}