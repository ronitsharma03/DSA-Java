import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
       // System.out.println(Arrays.toString(swap(a, b)));
//        swap(a, b);
        System.out.println(a + " " + b);
        swap1(a,b);
        System.out.println(a+" "+ b);
    }
    static void swap1(int p, int q)
    {
        int temp = p;
        p = q;
        q = temp;
    }
    static int[] swap(int a, int b){
        int[] arr = new int[2];
        int temp = a;
        a = b;
        b = temp;
        arr[0] = a;
        arr[1] = b;
        return arr;
    }
}
