public class Main {
    public static void main(String[] args) {
        funRev(5);
    }

    // function to print from n to 1
    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }


    // Function to print from 1 to n
    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n - 1);
        System.out.println(n);
    }

}

}